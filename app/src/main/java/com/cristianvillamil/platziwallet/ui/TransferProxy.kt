package com.cristianvillamil.platziwallet.ui

class TransferProxy {
    val MAX_TRANSFER_AMOUNT = 1000000
    val MIN_TRANSFER_AMOUNT = 100

    fun checkTransfer(amount: Double) : String{
        return when{
            amount > MAX_TRANSFER_AMOUNT -> {
                "La transaccion excede el monto"
            }
            amount < MIN_TRANSFER_AMOUNT -> {
                "La transaccion debe ser mayor de $MIN_TRANSFER_AMOUNT"
            }
            else -> {
                doTransfer(amount)
                "La transferencia se hizo correctamente"
            }
        }
    }

    private fun doTransfer(amount: Double){

    }
}