package co.com.japl.homeconnect.core.usercase

import androidx.annotation.RequiresApi
import co.com.japl.homeconnect.core.adapter.ports.outbound.CarouselPort
import co.com.japl.homeconnect.core.mappers.CarouselPortMapper
import co.japl.android.homeconnect.model.models.Carousel
import co.com.japl.homeconnect.core.interfaces.ICarousel
import java.util.Collections
import javax.inject.Inject

class CarouselImpl @Inject constructor(private var carouselOutBout: CarouselPort) : ICarousel {

    @RequiresApi(34)
    override suspend fun getCarousel():List<Carousel>{
        return carouselOutBout?.getCarousel()?.map ( CarouselPortMapper::mapper ) ?: Collections.emptyList()
    }

}