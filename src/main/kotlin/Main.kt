package example.myapp

fun buildAcuario() {
    // 1. Valores por defecto
    val acuario1 = Acuario()
    acuario1.printSize()

    // 2. Ancho personalizado
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
}