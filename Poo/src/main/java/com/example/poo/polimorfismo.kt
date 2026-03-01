package com.example.poo

abstract class Vehiculo(val marca: String,val velocidadMax: Int){
    abstract fun tipoVehiculo(): String

    fun mostrarInfo(){
        println("${tipoVehiculo()},$marca -- Vel.Max: $velocidadMax km/h")
    }
}

class Auto(marca: String,velMax: Int): Vehiculo(marca, velMax){
    override fun tipoVehiculo(): String {
        return "Auto"
    }
}

class Camion(marca: String,velMax: Int): Vehiculo(marca,  velMax ){
    override fun tipoVehiculo(): String {
        return "Camion"
    }
}

class Moto(marca: String,velMax: Int): Vehiculo(marca, velMax){
    override fun tipoVehiculo(): String {
        return "Moto"
    }
}


fun main(){
    val vehiculos: List<Vehiculo> = listOf(
        Auto("Toyota",180),
        Moto("Honda",220),
        Camion("Volvo",120)
    )

    for (vehiculo in vehiculos){
        vehiculo.mostrarInfo()
    }
}