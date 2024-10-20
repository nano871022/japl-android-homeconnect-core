package co.com.japl.homeconnect.core.usercase.interfaces

import co.com.japl.homeconnect.core.model.Document
import java.io.File

interface IDocument {

    suspend fun getFiles():List<Document>

    fun getFile(idFile:String):File?
}