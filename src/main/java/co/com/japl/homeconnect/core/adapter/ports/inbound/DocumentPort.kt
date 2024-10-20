package co.com.japl.homeconnect.core.adapter.ports.inbound

import co.com.japl.homeconnect.core.model.Document
import co.com.japl.homeconnect.core.usercase.interfaces.IDocument
import java.io.File
import javax.inject.Inject

class DocumentPort @Inject constructor(private val gdriveSvc: IDocument) {

    suspend fun getDocuments(): List<Document> {
        return gdriveSvc.getFiles()
    }

    fun getFile(idFile: String): File?{
        return gdriveSvc.getFile(idFile)
    }

}