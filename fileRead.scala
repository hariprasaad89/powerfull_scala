import scala.io.Source

object fileRead {
  
  def main (args:Array[String])
  {  
  val a = Source.fromFile("D:/scala/collections/src/aa.txt")
  val nooflines = a.getLines()
  println(nooflines)
  
}
}