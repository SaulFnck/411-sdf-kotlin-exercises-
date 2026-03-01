package com.example.poo

open class Animal(val nombre: String, val edad: Int){
    open fun hacerSonido(){
        println("Sondio Genérico")
    }

    fun describirse(){
        println("Soy $nombre y tengo $edad años")
    }
}

class Perro(nombre:String,edad: Int): Animal(nombre,edad) {
    override fun hacerSonido() {
        println("GUAU")
    }
}

class Gato(nombre:String,edad: Int): Animal(nombre,edad) {
    override fun hacerSonido() {
        println("MIAU")
    }
}

class Vaca(nombre:String,edad: Int): Animal(nombre,edad) {
    override fun hacerSonido() {
        println("MUUUU")
    }
}


fun main(){
    val perro = Perro("Rex",3)
    val gato = Gato ("Wilson",10)
    val vaca = Vaca("Roberta",22)

    perro.hacerSonido()
    perro.describirse()

    gato.hacerSonido()
    gato.describirse()

    vaca.hacerSonido()
    vaca.describirse()
}