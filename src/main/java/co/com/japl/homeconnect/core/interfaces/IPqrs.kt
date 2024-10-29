package co.com.japl.homeconnect.core.interfaces

interface IPqrs {

    suspend fun getUrlBilling(): String?

    suspend fun getUrlGeneral(): String?
}