/**
 * Tipe Number menampung balue berupa tipe data angka. Terdapat beberapa tipe data dengan kategori
 * number yaitu:
 * 1. Byte
 * 2. Short
 * 3. Int
 * 4. Long
 * 5. Float
 * 6. Double
 */

fun main() {

  /**
   * byte adalah salah satu tipe data yang panjang valuenya
   * adalah -128 hingga 127
   * penggunaan memori tipe data byte paling hemat diantara
   * tipe data kategori number lainnya (hanya 1 byte)
   */
  val tipeDataByte: Byte = 10
  println(tipeDataByte)

  /**
   * short adalah salah satu tipe data yang panjang valuenya
   * adalah -32768 hingga 32767
   * penggunaan memori tipe data short (2 byte) lebih banyak dari byte
   * tetapi lebih hemat daripada int
   */
  val tipeDataShort: Short = 10
  println(tipeDataShort)

  /**
   * int adalah salah satu tipe data number yang paling sering digunakan
   * valuenya adalah -2147483648  hingga 2147483648
   * penggunaan memori tipe data int (4 byte) lebih banyak dari byte dan short
   */
  val tipeDataInt: Int = 10
  println(tipeDataInt)

  /**
   * long adalah salah satu tipe data number dengan penggunaan
   * memori yang paling besar
   * valuenya adalah -9,223,372,036,854,775,808  hingga 9,223,372,036,854,775,807
   * penggunaan memori tipe data long (8 byte) lebih banyak int
   */
  val tipeDataLong: Long = 10L
  println(tipeDataLong)

  /**
   * float adalah salah satu tipe data number berupa desimal atau pecahan
   * valuenya adalah 3.4e−038  hingga 3.4e+038
   * penggunaan memori float (4 byte) lebih sediikit dari double
   */
  val tipeDataFloat: Float = 10F
  println(tipeDataFloat)

  /**
   * double adalah salah satu tipe data number dengan penggunaan
   * memori yang paling besar
   * valuenya adalah 1.7e−308  hingga 1.7e+308
   * penggunaan memori double (8 byte) lebih banyak flaot
   */
  val tipeDataDouble: Double = 10.0
  println(tipeDataDouble)
}