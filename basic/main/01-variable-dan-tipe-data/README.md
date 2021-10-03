# Variabel
- [Variabel](Variabel.kt) adalah lokasi penyimpanan suatu value(nilai) tertentu yang di pasangkan dengan nama atau simbol tertentu.
- Di kotlin, kita tidak wajib menuliskan tipe data saat mendeklarasikan variabel. Hal ini karena kotlin memiliki kemampuan `static typing` yang menyebabkan compiler akan mengetahui secara pasti tipe data dari sebuah variabel.

```kotlin
var variabelString1 : String = "Hello, Bellshade!"
//bisa di deklarasikan hanya dengan
var variabelString = "Hello, Bellshade!"
```

# Tipe Data
Tipe data adalah atribut berupa identitas suatu data atau value yang digunakan untuk memberitahu compiler tentang tujuan dari penggunaan data atau value tersebut. 

Tipe data di kotlin:
1. [Number](Number.kt)
2. [Character](Char.kt)
3. [Boolean](Boolean.kt)
4. [Array](Array.kt)
5. [String](String.kt)

## [1. Number](Number.kt)

| Tipe Data     | Ukuran | Panjang Value                             |
|:--            | -----  |:--                                        |
| [`byte`](Number.kt)| 1 byte  | -128 ke 127                               |
| [`short`](Number.kt)| 2 byte | -32,768 ke 32,767                         |
| [`int`](Number.kt)| 4 byte | -2,147,583,684 ke 2,147,483,647           |
| [`long`](Number.kt)| 8 byte | -9,223,372,036,854,775,808 ke 9,223,372,036,854,775,807                                               |
| [`float`](Number.kt)| 4 byte | menyimpan bilangan pecahan, cukup untuk menyimpan 6 sampai 7 digit desimal                                   |
| [`double`](Number.kt)| 8 byte | menyimpan bilangan pecahan, cukup untuk menyimpan 15 digit desimal                                           |

## [2. Character](Char.kt)
Tipe data char dideklarasikan dengan keyword `char`. Char harus dideklarasikan dengan single quotes (' '). Kita juga bisa menggunakan unicode pada char. 
| Tipe Data     | Ukuran | Panjang Value                             |
|:--            | -----  |:--                                        |
| [`char`](Char.kt)| 1 byte  | -128 ke 127                               |

## [3. Boolean](Boolean.kt)
Tipe data boolean dideklarasikan dengan keyword `Boolean`. Valuenya hanya boleh `true` atau `false` 
| Tipe Data     | Ukuran | Data Value                             |
|:--            | -----  |:--                                        |
| [`bool`](Boolean.kt)| 1 bit (0.125 byte)  | `true` atau `false`|

## [4. String](String.kt)
Tipe data string dideklarasikan dengan keyword `String`. Di kotlin, string trebagi menjadi 2, yaitu `Escaped String` dan `Raw String`

**1. Escaped String**\
Escaped string di deklarasikan menggunakan double qoute (" ") dan boleh mengandung `escaped characters` (contoh: `\n`, `\t,` `\b`, dll).
```kotlin
val escapedString1 : String = "Hello, Bellshade!"
val escapedString2 : String = "Hello, \nBellshade!"
```

**2. Raw String**\
Raw string di deklarasikan menggunakan triple double-quote (""" """) dan menyediakan fasilitas multiple lines. Raw string tidak boleh mengandung `escaped characters`.
```kotlin
val rawString : String = """
Selamat Datang, 
di
Bellshade!
"""
```

## [5. Array](Array.kt)
Array adalah tipe data yang dapat menampung beberapa value sekaligus. Beberapa value tersebut diberikan index sesuai urutan deklarasinya, dimulai dari 0. Tipe data array di deklarasikan dengan keyword [`Array<TipeData>`](Array.kt).

```kotlin
  val numberArray: Array<Number> = arrayOf(1, 2L, 3f)
  println(numberArray[0])
  println(numberArray[1])
  println(numberArray[2])
  ```

