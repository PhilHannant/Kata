object Snail {

  def snail(xs: List[List[Int]]): List[Int] = {
    var x = xs.head.size
    println(x)
    val snailList = xs.head
    snailPath(xs.head)
    snailList
  }

  def snailPath(path: List[Int]): List[Int] = path match {
    case Nil => Nil
    case x :: xs => println(x); snailPath(xs)
  }

}

object test extends App {
  val input = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
  Snail.snail(input)

}

//import org.junit.runner.RunWith
//import org.scalatest.junit.JUnitRunner
//import org.scalatest._
//import org.scalatest.Assertions._
//
//@RunWith(classOf[JUnitRunner])
//class SnailTest extends FlatSpec {
//
//
//
//  "First example" should "work" in {
//    val input = List(
//      List(1, 2, 3),
//      List(4, 5, 6),
//      List(7, 8, 9))
//    val res = List(1, 2, 3, 6, 9, 8, 7, 4, 5)
//    assert(Snail.snail(input) == res)
//  }
//
//  "Second example" should "work" in {
//    val input = List(
//      List(1, 2, 3),
//      List(8, 9, 4),
//      List(7, 6, 5))
//    val res = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
//    assert(Snail.snail(input) == res)
//  }
//}