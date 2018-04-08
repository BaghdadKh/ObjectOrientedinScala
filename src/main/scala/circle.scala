
class Circle {
  //scala generates  public reader and public writer for this
  //  var raduis = 0

  //scala generates just public reader for this
  val raduis_const = 0

  //scala generates  private reader and private writer for this and can implement public one
  private var p_raduis = 0

  // implement the getter for private field
  def raduis = p_raduis

  def draw = {
    println("Draw the circle of raduis " + raduis)
  }

  // implement the setter  for private field
  def raduis_=(x: Int) = {
    if (x < 0) throw new Exception("-i ve not allowed ") else p_raduis = x
  }
}
object TestFields {
  def main(args: Array[String]): Unit = {
    val c = new Circle()
    println("This is raduis before setting " + c.raduis)
    c.raduis_=(5)
    println("This is raduis after setting " + c.raduis)

    //Get an excption
//        c.raduis_=(-9)
//        println("This is raduis after setting but it's negative  " + c.raduis)
  }

}