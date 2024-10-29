package co.com.japl.homeconnect.core.adapter.ports.inbound

import co.com.japl.homeconnect.core.interfaces.IPqrs
import co.japl.android.homeconnect.model.interfaces.inbound.IPQRs
import javax.inject.Inject

class PqrsPort @Inject constructor(private val pqrsSvc:IPqrs): IPQRs{

     override suspend fun getUrlBilling():String? = pqrsSvc.getUrlBilling()

     override suspend fun getUrlGeneral():String? = pqrsSvc.getUrlGeneral()

}