  /** 
   * Tipe data string dideklarasikan dengan keyword `String`. 
   * String terbagi menjadi 2 tipe. `Escaped String` dan `Raw String`
  */

fun main() {

  /**
   * 1. Escaped String
   * Escaped string di deklarasikan menggunakan double qoute (" ") 
   * dan boleh mengandung escaped characters (contoh: \n, \t, \b, dll).
   */
  val escapedString1: String = "Hello, Bellshade!"
  println(escapedString1)
  val escapedString2: String = "Hello, \nBellshade!"
  println(escapedString2)

  /**
   * 2. Raw String
   * Raw string di deklarasikan menggunakan triple double-quote (""" """) 
   * dan menyediakan fasilitas multiple lines.
   *  Raw string tidak boleh mengandung escaped characters.
   */
  val rawString: String = """
  Selamat Datang, 
  di
  Bellshade!
  """
  println(rawString)

}
