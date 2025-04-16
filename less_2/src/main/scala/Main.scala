object home_task extends App {

  // Напишите программу на Scala, которая принимает имя пользователя с клавиатуры и выводит приветственное сообщение.
  println("Введите имя")
  var userName = scala.io.StdIn.readLine()
  println(s"Привет $userName!")

  // Напишите функцию, которая принимает два целых числа и возвращает их сумму.
  def sumNumbers(a:Int, b:Int): Int =
    a + b 
  // применение функции и вывод результата
  val res = sumNumbers(11, 4)
  println(res)

  // Создайте список из нескольких чисел (например, List(1, 2, 3, 4, 5)) 
  //и примените к нему функцию, которая увеличивает каждое число на 1. Выведите получившийся список на экран.
  
  // функция увеличивает эелент списка на 1
  def addOne(L:List[Int]): List[Int] = {
    L.map(_+1)
  } 
  val list_1=List(1, 4, 7)
  val new_list_1 = addOne(list_1) 
  println(new_list_1)

  // Напишите программу, которая принимает число с клавиатуры и выводит, является ли оно четным или нечетным.
  
  def isOddOrEven(x:String):Unit = {
    try {
      if (x.toInt % 2 == 0) {
        println(s"$x - четное число ")
      } else {
        println(s"$x - нечетное число ")
      }
    }
    catch {
      case e: Exception => println("Вы ввели не число")
    }
}

  println("Введите число")
  val num = scala.io.StdIn.readLine()
  isOddOrEven(num)

// Создайте программу, которая принимает строку и выводит её длину.
println("Введите строку")
val inputStr = scala.io.StdIn.readLine()
val ln = inputStr.length
println(s"Длина строки $ln")


// Напишите функцию, которая принимает список 
// строк и возвращает новую строку, состоящую из всех строк списка, разделенных пробелами.
def makeString(s:List[String]):String = {
  s.mkString(" ")
  }

val ls = List("dog", "cat", "house", "bag")
println(makeString(ls))
}