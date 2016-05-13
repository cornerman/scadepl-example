import scadepl.Debug._

object Main extends App {
  println("started")

  val integers = List(1,2)
  val name = "a name"

  val foo: Int = repl("integers" -> integers, "name" -> name).get
  log("foo" -> foo)

  println("finished")
}
