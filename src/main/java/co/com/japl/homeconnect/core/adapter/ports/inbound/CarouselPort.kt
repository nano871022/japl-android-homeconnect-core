package co.com.japl.homeconnect.core.adapter.ports.inbound

import androidx.annotation.RequiresApi
import co.com.japl.homeconnect.core.adapter.ports.inbound.interfaces.ICarousel
import co.com.japl.homeconnect.core.model.Carousel
import java.util.Collections
import javax.inject.Inject


class CarouselPort @Inject constructor(private var carouselUserCase:co.com.japl.homeconnect.core.usercase.interfaces.ICarousel) : ICarousel{
    @RequiresApi(34)
    override suspend fun getList(): List<Carousel> {
        return carouselUserCase.getCarousel() ?: Collections.emptyList()
    }
}