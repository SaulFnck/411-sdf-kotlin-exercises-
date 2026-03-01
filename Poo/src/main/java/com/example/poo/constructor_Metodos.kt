package com.example.poo

class CuentaBancaria(val titular: String){
    var saldo: Double = 0.0

    fun depositar( cantidad: Double){
        saldo = saldo + cantidad
        println("Se deposito la cantidad de $cantidad correctamente")
    }

    fun retirar(cantidad: Double){
        if(saldo > cantidad){
            saldo = saldo - cantidad
            println("Se hizo el retiro de $cantidad correctamente")
        }else{
            println("Error,no se pudo retirar la cantidad de $cantidad, no hay saldo suficiente")
        }
    }

    fun mostrarSaldo(){
        println("El saldo actual es de $$saldo")
    }
}


fun main(){
    val cuenta = CuentaBancaria("María García")
    cuenta.mostrarSaldo()
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0)
    cuenta.mostrarSaldo()

}