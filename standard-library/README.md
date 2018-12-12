## Using and showing Binary Tree's, which is a specific data structure in Scala
* By only using **standard** libraries

## Other examples of Purely Functional Data Structures 

* **Singly-Linked List**
```scala
sealed trait ConsInterface[+A] {
    def value: A
    def next: ConsInterface[A]
}

case class Cons[+A] (val value: A, val next: ConsInterface[A]) extends ConsInterface[A] {
    override def toString = s"head: $value, next: $next"
}

object NilCons extends ConsInterface[Nothing] {
    def value = throw new NoSuchElementException("head of empty list")
    def next = throw new UnsupportedOperationException("tail of empty list")
}

object ConsTutorialDriver extends App {
    val c1 = Cons(1, NilCons)
    val c2 = Cons(2, c1)
    val c3 = Cons(3, c2)
    println(c1)
    println(c2)
    println(c3)
}
```
* **Implementation of Bankers Queue**
```scala
import scala.collection.{generic, immutable, mutable, LinearSeqLike}
import generic.{CanBuildFrom, GenericCompanion, GenericTraversableTemplate, SeqFactory}
import immutable.LinearSeq
import mutable.{Builder, ListBuffer}
class BankersQueue[+A] private (private val fsize: Int, private val front: Stream[A], private val rsize: Int, private val rear: List[A])
    extends LinearSeq[A]
    with GenericTraversableTemplate[A, BankersQueue]
    with LinearSeqLike[A, BankersQueue[A]] {
      
  override val companion: GenericCompanion[BankersQueue] = BankersQueue
  
  val length: Int = fsize + rsize
  
  override def isEmpty = length == 0
  
  override def head: A = front match {
    case hd #:: _ => hd
    case _ => throw new NoSuchElementException("head on empty queue")
  }
  
  override def tail: BankersQueue[A] = front match {
    case _ #:: tail => check(new BankersQueue(fsize - 1, tail, rsize, rear))
    case _ => throw new NoSuchElementException("tail on empty queue")
  }
  
  def apply(i: Int) = {
    if (i < fsize)
      front(i)
    else if (i < fsize + rsize)
      rear(rsize - (i - fsize) - 1)
    else {
      assert(i > length)
      throw new NoSuchElementException("index out of range: " + i)
    }
  }
  
  def +[B >: A](b: B) = enqueue(b)
  
  def enqueue[B >: A](b: B) = check(new BankersQueue(fsize, front, rsize + 1, b :: rear))
  
  def dequeue: (A, BankersQueue[A]) = front match {
    case hd #:: tail => (hd, check(new BankersQueue(fsize - 1, tail, rsize, rear)))
    case _ => throw new NoSuchElementException("dequeue on empty queue")
  }
  
  override def iterator = (front ++ rear.reverse).iterator         // force for traversal
  
  private def check[B](q: BankersQueue[B]) = {
    if (q.rsize <= q.fsize)
      q
    else
      new BankersQueue(q.fsize + q.rsize, q.front ++ q.rear.reverse, 0, Nil)
  }
}

object BankersQueue extends SeqFactory[BankersQueue] {
  implicit def canBuildFrom[A]: CanBuildFrom[Coll, A, BankersQueue[A]] = new GenericCanBuildFrom[A]
  
  def newBuilder[A]: Builder[A, BankersQueue[A]] =
    new ListBuffer[A] mapResult { x => new BankersQueue[A](x.length, x.reverse.toStream, 0, Nil) }
  
  override def empty[A]: BankersQueue[A] = new BankersQueue[A](0, Stream(), 0, Nil)
  
  override def apply[A](xs: A*): BankersQueue[A] = new BankersQueue[A](xs.length, xs.reverse.toStream, 0, Nil)
}
```
* **Radix Tree**

```scala
import scala.annotation.tailrec
import scala.collection.mutable.Stack
import scala.collection.MapLike
import scala.collection.generic.CanBuildFrom
import scala.collection.generic.ImmutableMapFactory
import scala.collection.mutable.Builder
object RadixTree {

  def apply[V](pairs: (String, V)*): RadixTree[V] = pairs.foldLeft(empty[V])((a, b) => a.insert(b._1, b._2))

  def empty[V]: RadixTree[V] = new RadixTree(MiddleNode[V](Array.empty))

  implicit def canBuildFrom[V]: CanBuildFrom[RadixTree[V], (String, V), RadixTree[V]] = new RadixTreeCanBuildFrom[V]

  class RadixTreeCanBuildFrom[V] extends CanBuildFrom[RadixTree[V], (String, V), RadixTree[V]] {
    def apply(): Builder[(String, V), RadixTree[V]] = new RadixTreeBuilder[V](empty)
    def apply(from: RadixTree[V]): Builder[(String, V), RadixTree[V]] = new RadixTreeBuilder(from)
  }

  class RadixTreeBuilder[V](var acc: RadixTree[V]) extends Builder[(String, V), RadixTree[V]] {
    def +=(elem: (String, V)) = {
      acc = acc + elem
      this
    }
    def clear(): Unit = { acc = empty }
    def result(): RadixTree[V] = acc
  }

}
```
