package co.com.japl.homeconnect.core.usercase.interfaces

import co.com.japl.homeconnect.core.model.Carousel
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

interface ICarousel {

    suspend fun getCarousel():List<Carousel>
}