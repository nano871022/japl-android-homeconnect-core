package co.com.japl.homeconnect.core.adapter.ports.outbound

import co.com.japl.interfaces.services.IMessage
import co.japl.android.homeconnect.model.models.Message
import javax.inject.Inject
import co.japl.android.homeconnect.model.interfaces.outbound.IMessage  as IMessageOutbound

class MessagePort @Inject constructor(private val messageSvc:IMessage) : IMessageOutbound {

    override fun getMessages(): List<Message> {
        return messageSvc.getMessages()
    }

    override fun addMessage(message: Message): Boolean {
        return messageSvc.addMessage(message)
    }
}