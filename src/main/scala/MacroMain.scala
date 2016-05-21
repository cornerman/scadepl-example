import scadepl.Debug._

object MacroMain extends App {
  println("started")

  val integers = List(1,2)

  trait IBar {
    val inherited = "yep"
  }

  object Bar extends IBar {
    val field =  List(1)
    def func(arg: Int): String = {
      val local = 1
      log(_idents(arg, field): _*)

      import collection.mutable
      if (arg < local) {
        val unseeBlock = "one"
        unseeBlock
      } else {
        val seeBlock = "two"
        repl(_imports, (_thises ++ _locals): _*)
        seeBlock
      }
    }
  }

  Bar.func(2)

  println("finished")
}
