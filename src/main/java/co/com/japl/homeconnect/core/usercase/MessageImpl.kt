package co.com.japl.homeconnect.core.usercase

import co.com.japl.homeconnect.core.interfaces.IMessage
import co.japl.android.homeconnect.model.interfaces.outbound.IMessage as IMessageOutput
import co.japl.android.homeconnect.model.models.Message
import java.time.LocalDateTime
import javax.inject.Inject

class MessageImpl @Inject constructor(private val svc:IMessageOutput): IMessage {

    override fun getMessages(): List<Message> {
        return svc.getMessages()
    }

    override fun addMessage(message: String, date: LocalDateTime) {
        val message = Message(0, message, date)
        if(!svc.addMessage(message)){
            throw RuntimeException("message not added")
        }
    }
}