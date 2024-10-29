package co.com.japl.homeconnect.core.adapter.ports.inbound

import co.com.japl.homeconnect.core.interfaces.IMessage
import co.japl.android.homeconnect.model.interfaces.inbound.IMessage as IMassageInbound
import java.time.LocalDateTime
import javax.inject.Inject

class MessagePort @Inject constructor(private val svc:IMessage) : IMassageInbound{

    override fun getMessage() = svc.getMessages()

    override fun addMessage( message:String){
        require(message.isNotEmpty()){"message cannot be empty"}
        svc.addMessage(message,LocalDateTime.now())
    }
}