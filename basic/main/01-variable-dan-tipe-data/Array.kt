fun main(){
  /**
   * Tipe data array dideklarasikan dengan keyword `Array<TipeData>`. 
   */
  val numberArray: Array<Number> = arrayOf(1, 2L, 3f)
  
  // Untuk mengakses value dari array, kita memanggil nama variabel 
  // beserta indexnya, dimulai dari 0
  println(numberArray[0])
  println(numberArray[1])
  println(numberArray[2])
  // println(numberArray[3]) //error: IndexOutofBounds
  

  /**
   * Array di kotlin bisa menampung semua value(*)
   */
  val arrayRandom1: Array<*> = arrayOf(1, "Bellshade", 3f, 'B', true)
  println(arrayRandom1[0])
  println(arrayRandom1[1])
  
  // atau bisa hanya dengan
  val arrayRandom2 = arrayOf(1, "Bellshade", 3f, 'B', true)
  println(arrayRandom2[2])
  println(arrayRandom2[3])
  println(arrayRandom2[4])
}