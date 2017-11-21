object Snail {

  def snail(xs: List[List[Int]]): List[Int] = {
    var x = xs.head.size
    println(x)
    val snailList = xs.head
    snailPath(xs.head)

    snailList

    def snailPath(path: List[Int]): List[Int] = path match {
      case Nil => Nil
      case x :: xs => println(x); snailPath(xs)
    }

    def snailHelper(x: Int) = ???

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

/*
(1,0)   (2,1)   (3,2)   (4,3)
(5,4)   (6,5)   (7,6)   (8,7)
(9,8)   (10,9)  (11,10) (12,11)
(13,12) (14,13) (15,14) (16,15)
zero indexed
0+1 until x-1
y = last mapped location
pop y + (x-1) until x^2 - 1
y-x until x^2-x
y-x until x
x+1 until 
*/


*/
