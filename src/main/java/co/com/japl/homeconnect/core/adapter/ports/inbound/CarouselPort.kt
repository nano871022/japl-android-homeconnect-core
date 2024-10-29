package co.com.japl.homeconnect.core.adapter.ports.inbound

import androidx.annotation.RequiresApi
import co.japl.android.homeconnect.model.interfaces.inbound.ICarousel as ICarouselInbound
import co.com.japl.homeconnect.core.interfaces.ICarousel
import co.japl.android.homeconnect.model.models.Carousel
import java.util.Collections
import javax.inject.Inject


class CarouselPort @Inject constructor(private var carouselUserCase: ICarousel) :ICarouselInbound {

    @RequiresApi(34)
    override suspend fun getList(): List<Carousel> {
        return carouselUserCase.getCarousel() ?: Collections.emptyList()
    }
}