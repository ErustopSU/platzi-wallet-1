package com.cristianvillamil.platziwallet.ui.commands

import android.content.Context
import android.util.Log
import java.io.IOException
import java.io.OutputStreamWriter

class SaveCommands : FileCommand {
    override fun execute(context: Context, filename: String, vararg arguments: String) {
        try {
            var argumentsString = ""
            arguments.forEach { argumentsString = argumentsString + "\n"+it }
            val outputStreaWritter = OutputStreamWriter(context.openFileOutput(filename, Context.MODE_PRIVATE))
            outputStreaWritter.write(argumentsString)
            outputStreaWritter.close()
        }catch (exception: IOException){
            Log.e("SaveCommand","File write failed: $exception")
        }

    }
}