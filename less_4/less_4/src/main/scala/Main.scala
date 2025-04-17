object home_task_4 extends App {

/*
Создайте переменные следующих типов:
Целое число (Int) для хранения возраста.
Дробное число (Double) для хранения веса.
Строку (String) для хранения имени.
Логическое значение (Boolean) для хранения статуса (студент или не студент).
Выведите значения всех переменных на экран с помощью функции println.
*/

val Age:Int = 27
val Weight:Double = 51.5
val Name:String = "Ann"
val isStudent:Boolean = false

def studInfo(Age:Int, Weight:Double, Name:String, isStudent:Boolean) : Unit = {
  val st = if (isStudent) "Студент"  else "Не студент"
  println(s"имя $Name, возраст $Age, вес $Weight, $st")
}

studInfo(Age, Weight, Name,isStudent)

/*
Напишите функцию, которая принимает два целых числа и возвращает их сумму.
Вызовите эту функцию с любыми двумя числами и выведите результат на экран.
*/

  def sumNumbers(a:Int, b:Int): Int =
    a + b 
  // применение функции и вывод результата
  val res = sumNumbers(11, 4)
  println(res)
  
 /*
Напишите функцию, которая принимает возраст и возвращает строку "Молодой", 
если возраст меньше 30, и "Взрослый", если возраст 30 или больше.
Вызовите эту функцию с вашей переменной возраста и выведите результат на экран.
 */
 
 def ageGroup(a:Int):String = {
   if (a < 30){
   "Молодой"
   }
   else {
   "Взрослый"
   }
 }

  val ageGr = ageGroup(Age) 
  println(ageGr)
  
// Напишите цикл, который выводит на экран числа от 1 до 10.
for (i <- 1 to 10) {
  println(i)
}  

/*
Создайте список имен студентов и выведите каждое имя на экран с помощью цикла.
*/
val students = List("Аня", "Ира", "Олег", "Коля")
for (i <- students) {
  println(i)
}

/*
Напишите программу, которая выполняет следующие действия:
Запрашивает у пользователя ввод имени, возраста и статуса (студент или нет).
Использует написанные выше функции и выводит на экран информацию о пользователе и его возрастную категорию.
*/
println("Введите имя")
var userName = scala.io.StdIn.readLine()

println("Введите возраст")
val Age_1 = scala.io.StdIn.readLine().toIntOption.get     

println("Если студент укажите true, если не студент - false")
val isStudent_1 = scala.io.StdIn.readLine().toBooleanOption.get  

println("Введите вес")
val Weight_1 = scala.io.StdIn.readLine().toDoubleOption.get    

studInfo(Age_1, Weight_1, Name, isStudent_1)

val st_prop = ageGroup(Age_1)
println(s"$Name $st_prop")

/*
Создайте список чисел от 1 до 10.
Используйте for comprehension, чтобы создать новый список, содержащий квадраты чисел из исходного списка.
*/

val list_2 = List.range(1,11)

val list_3 = 
  for {
    a <- list_2
    } yield a*a
println(list_3)

/*
Создайте список чисел от 1 до 10.
Используйте for comprehension, чтобы создать новый список, содержащий только четные числа из исходного списка.
*/

val list_4 = 
  for {
    a <- list_2
    if a % 2 == 0
    } yield a
print(list_4)


}
