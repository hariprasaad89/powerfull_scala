package main



case class case3 (x:Double,y:Double,z:Double)

object cassa
{
  def dif (a:case3,b:case3):Unit = {
    val d1 = a.x-b.x
    val d2 = a.y-b.y
    val d3 = a.z-b.z   
     println(d1)
     println(d2)
     println(d3)
   
  }
  def main (args:Array[String]){
    val p = dif(case3(4,6,8),case3(2,3,4))
    
    
  }
}