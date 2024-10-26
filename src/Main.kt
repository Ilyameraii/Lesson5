import kotlin.math.*
import java.util.*

data class Point (val x: Double, val y: Double){
}
class Treug(val a: Point, val b: Point, val c: Point) {
    fun isPointInside(point: Point): Boolean {
            val sABC = Streug(a, b, c)
        val sABP = Streug(a, b, point)
        val sBCP = Streug(b, c, point)
        val sCAP = Streug(c, a, point)
        return (sABP + sBCP + sCAP) == sABC
    }
    private fun Streug(a: Point, b: Point, c: Point): Double {
        return 0.5 * abs((b.x - a.x) * (c.y - a.y) - (c.x - a.x) * (b.y - a.y))
    }
}
fun main() {
    val scanner = Scanner(System.`in`)

    // Объявляем 6 переменных вещественного типа (Double)
    var ax: Double
    var ay: Double
    var bx: Double
    var by: Double
    var cx: Double
    var cy: Double
    var Px: Double
    var Py: Double

    // Вводим числа с клавиатуры
    print("Введите координату ax :")
    ax = scanner.nextDouble()

    print("Введите координату ay :")
    ay = scanner.nextDouble()

    print("Введите координату bx:")
    bx = scanner.nextDouble()

    print("Введите координату by:")
    by = scanner.nextDouble()

    print("Введите координату cx:")
    cx = scanner.nextDouble()

    print("Введите координату cy:")
    cy = scanner.nextDouble()
    print("Введите координату x точки:")
    Px = scanner.nextDouble()
    print("Введите координату y точки:")
    Py = scanner.nextDouble()
    val a = Point(ax, ay)
    val b = Point(bx, by)
    val c = Point(cx, cy)
    val treug = Treug(a, b, c)

    val P = Point(Px, Py)

    println("Точка ${P} ${if (treug.isPointInside(P)) "внутри" else "вне"} треугольника.")
}