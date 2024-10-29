package co.com.japl.homeconnect.core.usercase

import co.com.japl.homeconnect.core.interfaces.IPqrs
import co.japl.android.homeconnect.model.interfaces.outbound.IPQRs
import javax.inject.Inject

class PqrsImpl @Inject constructor(private val pqrsSvc:IPQRs) : IPqrs{
    override suspend fun getUrlBilling(): String? {
        return pqrsSvc.getPqrsBilling()
    }

    override suspend fun getUrlGeneral(): String? {
        return pqrsSvc.getPqrsGeneral()
    }

}