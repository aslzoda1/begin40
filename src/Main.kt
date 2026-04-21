import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    println("Chiziqli tenglamalar sistemasi:")
    println("A1*x + B1*y = C1")
    println("A2*x + B2*y = C2")

    print("A1 = "); val a1 = reader.nextDouble()
    print("B1 = "); val b1 = reader.nextDouble()
    print("C1 = "); val c1 = reader.nextDouble()

    print("A2 = "); val a2 = reader.nextDouble()
    print("B2 = "); val b2 = reader.nextDouble()
    print("C2 = "); val c2 = reader.nextDouble()

    // Determinant (D)
    val d = a1 * b2 - a2 * b1

    if (d != 0.0) {
        val x = (c1 * b2 - c2 * b1) / d
        val y = (a1 * c2 - a2 * c1) / d
        println("Yechimlar: x = $x, y = $y")
    } else {
        println("Sistemaning yagona yechimi mavjud emas (D = 0).")
    }
}