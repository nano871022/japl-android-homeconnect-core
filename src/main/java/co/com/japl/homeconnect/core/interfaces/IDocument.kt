package co.com.japl.homeconnect.core.interfaces

import co.japl.android.homeconnect.model.models.Document
import java.io.File

interface IDocument {

    suspend fun getFiles():List<Document>

    fun getFile(idFile:String):File?
}