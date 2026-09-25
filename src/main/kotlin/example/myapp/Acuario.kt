package example.myapp

class Acuario(
    var length: Int = 100,
    var width: Int = 20,
    var height: Int = 40) {
    init {
        println("Iniciando Acuario")
    }

    init {
        // 1 Litro = 1000 cm^3
        println("Volume: ${width * length * height / 1000} l")
    }

    fun printSize() {
        println("Ancho: $width cm, Largo: $length cm, Alto: $height cm")
        //1 l = 1000 cm^3
        println("Volumen: $volume l")
    }

    constructor (numeroDePeces: Int) : this() {
        // 2000 cm³ por pez + espacio extra para que no se derrame el agua
        val tanque = numeroDePeces * 2000 * 1.1
        // calcular la altura necesaria
        height = (tanque / (length * width)).toInt()
    }

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
}