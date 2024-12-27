```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Incorrect usage of foldLeft with a mutable variable
  var sum = 0
  list.foldLeft(sum)((acc, elem) => {
    acc += elem // Modifying the accumulator directly
    acc
  })

  println(sum) // Incorrect result, sum will be 0
}
```