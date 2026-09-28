package example.myapp

import example.myapp.decor.Decoration
import example.myapp.decor.Decoration2

fun buildAcuario() {
    // 1. Valores por defecto
    val acuario1 = Acuario()
    acuario1.printSize()

    // 2. Ancho personalizado, creacion de objeto despues de =, sin new.
    val acuario2 = Acuario(width = 25)
    acuario2.printSize()

    // 3. Alto y largo personalizados
    val acuario3 = Acuario(height = 35, length = 110)
    acuario3.printSize()

    val acuario4 = Acuario(width = 25, height = 35, length = 110)
    acuario4.printSize()

    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.printSize()
    acuario6.volume = 70
    acuario6.printSize()
}

fun main() {
    buildAcuario()
    makeDecorations()
}
fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))

    val d5 = Decoration2(rocks = "crystal", wood = "wood", diver = "diver")
    println(d5)
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}