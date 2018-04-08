//test for constructors

// this is default constructor
//class Box

//this is primary constructor has getter and setter
class Box( var width : Int , var height :Int , var depth :Int ) {

  //these two auxiliary constructors
  def this() = {this (1,1,1)}
  def this(w:Int , h:Int) {this (w,h,1)}
  def showBox = println(s"width of box is $width height of box is $height depth of box is $depth")
  def getVolumeOfCube = width * height * depth
}

object TestConstructors {
  def main(args: Array[String]): Unit = {
    var box1 = new Box()
    box1.showBox
    var box2= new Box(2,4)
    box2.showBox
    var box3 = new Box(3,4,5)
    box3.showBox
    println()
    println("The volume of box 3 with width,height ,depth  "+ box3.width +","  + box3.height+ ","+ box3.depth  +"  is  "+ box3.getVolumeOfCube)

  }
}
