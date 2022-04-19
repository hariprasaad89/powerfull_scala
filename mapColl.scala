package main

import scala.io.StdIn._
import scala.collection.mutable.{Map => MMap}


object mapColl {
  
  def main (args:Array[String]){
  
  val m = MMap(1 -> 'a')
  m +=(2 -> 'b')
 for((k,v) <- m) println(s"$k, $v")
  }
  
}