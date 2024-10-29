package co.com.japl.homeconnect.core.interfaces

import co.japl.android.homeconnect.model.models.Carousel

interface ICarousel {

    suspend fun getCarousel():List<Carousel>
}