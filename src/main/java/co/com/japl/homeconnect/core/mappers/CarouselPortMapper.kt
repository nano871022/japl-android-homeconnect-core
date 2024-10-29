package co.com.japl.homeconnect.core.mappers

import co.japl.android.homeconnect.model.models.Carousel
import co.japl.android.homeconnect.model.models.CarouselDTO

object CarouselPortMapper {

    fun mapper(input: CarouselDTO): Carousel {
        return Carousel(input.id,input.name,input.description,input.url,input.order,input.drawable,input.active)
    }
}