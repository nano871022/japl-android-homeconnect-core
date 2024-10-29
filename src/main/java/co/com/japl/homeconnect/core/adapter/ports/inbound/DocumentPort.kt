package co.com.japl.homeconnect.core.adapter.ports.inbound

import co.japl.android.homeconnect.model.models.Document
import co.com.japl.homeconnect.core.interfaces.IDocument
import co.japl.android.homeconnect.model.interfaces.inbound.IDocument as IDocumentInbound
import java.io.File
import javax.inject.Inject

class DocumentPort @Inject constructor(private val gdriveSvc: IDocument) : IDocumentInbound {

    override suspend fun getDocuments(): List<Document> {
        return gdriveSvc.getFiles()
    }

    override fun getFile(idFile: String): File?{
        return gdriveSvc.getFile(idFile)
    }

}