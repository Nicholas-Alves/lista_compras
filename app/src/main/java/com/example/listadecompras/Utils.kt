package com.example.listadecompras

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.io.ByteArrayOutputStream

val produtosGlobal = mutableListOf<Produto>()

fun Bitmap.toBYteArray(): ByteArray {
    val stream = ByteArrayOutputStream()

    //comprimindo a imagem
    this.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, stream)

    //transformando um array em caracteres
    return stream.toByteArray()
}

fun ByteArray.toBitmap(): Bitmap {
    return BitmapFactory.decodeByteArray(this, 0, this.size)
}