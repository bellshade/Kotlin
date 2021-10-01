/**
 * - Variabel adalah lokasi penyimpanan suatu value(nilai) tertentu.
 * - Deklarasi variabel di kotlin 
 * 
 *  */ 

fun main(){

  // deklarasi variabel yang value-nya bersifat mutable (dapat berubah)
  var x = 10
  println(x) // output = 10
  
  // reassigned(mengisi ulang) value dari variabel x
  x = 1
  println(x) // output = 1

  // deklarasi variabel yang value-nya bersifat immutable (tidak dapat berubah)
  val y = 100
  println(y) // output = 100

  // y = 10  // error: val cannot be reassigned  
}