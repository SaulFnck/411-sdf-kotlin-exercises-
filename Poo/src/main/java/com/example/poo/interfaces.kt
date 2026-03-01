package com.example.poo

import kotlin.math.PI

interface Figura{
    fun calcularArea(): Double
    fun calcularPerimetro(): Double
}

class Rectangulo(val base: Double, val altura: Double): Figura{
    override fun calcularArea(): Double {
         return base * altura
    }

    override fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }
}

class Circulo(val radio:Double): Figura{
    override fun calcularArea(): Double {
        return PI * radio * radio
    }

    override fun calcularPerimetro(): Double {
        return 2 * PI * radio
    }
}

fun main(){
    val rect = Rectangulo(5.0,3.0)
    val circ = Circulo(4.0)

    //Dos maneras de imprimir:
    println("Rectangulo - Area: %.2f, Perimetro: %.2f".format(rect.calcularArea(), rect.calcularPerimetro()))
    println("Circulo - Area: ${circ.calcularArea()}, Perimetro: ${circ.calcularPerimetro()}")
}