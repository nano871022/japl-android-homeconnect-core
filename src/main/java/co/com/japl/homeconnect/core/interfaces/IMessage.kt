package co.com.japl.homeconnect.core.interfaces

import co.japl.android.homeconnect.model.models.Message
import java.time.LocalDateTime

interface IMessage {

    fun getMessages():List<Message>

    fun addMessage(message:String,date:LocalDateTime)
}