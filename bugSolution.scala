```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct usage of foldLeft
  val sum = list.foldLeft(0)((acc, elem) => acc + elem)

  println(sum) // Correct result: 15
}
```