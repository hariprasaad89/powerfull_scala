package main


import scala.io.StdIn._
import scala.collection.mutable._
  

object listSamp {
  def inpList(n:List[Int]) = {
   
    // prining the values in List
   println(n)
   // drop function 
   println(n.drop(2))
   // tail function
   println(n.tail)
   //take function
   println(n.take(4))
   // head function
   println(n.head)
   // last function
   println(n.last)
   //contains function
   println(n.contains(10))
   //spliatAt function
   println(n.splitAt(2))
   //reverse function
   println(n.reverse)
        
}
  
  def main (args:Array[String])
  {
    val lst = inpList(List(1,2,3,4,5,6,7,8))
  }
}