package example.myapp

import example.myapp.example.myapp.Acuario

fun buildAcuario() {
    val miAcuario = Acuario()
    miAcuario.printSize()
    miAcuario.height = 60
    miAcuario.printSize()
}

fun main() {
    buildAcuario()

}