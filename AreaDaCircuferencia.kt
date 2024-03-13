package funcoes

abstract class Forma {
    abstract fun calcularAreaCircuferencia(): Double
}

class Circulo(private val radius: Double) : Forma() {
    override fun calcularAreaCircuferencia(): Double {
        return Math.PI * radius * radius
    }
}

fun main(args: Array<String>) {
    val circulo = Circulo(2.0)
    val circuloArea = circulo.calcularAreaCircuferencia()
    println("A área da círculo é $circuloArea")
}