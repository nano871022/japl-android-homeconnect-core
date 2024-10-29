package co.com.japl.homeconnect.core.adapter.ports.outbound

import android.content.Context
import android.util.Log
import androidx.annotation.RequiresApi
import co.japl.android.homeconnect.model.models.CarouselDTO
import co.com.japl.interfaces.services.ICarouselHome
import co.com.japl.services.implement.CarouselDriveImpl
import co.com.japl.services.implement.CarouselImpl
import co.com.japl.services.implement.CarouselLocalImpl
import co.japl.android.homeconnect.model.interfaces.outbound.ICarousel
import co.japl.android.homeconnect.model.interfaces.outbound.IGDrive
import java.util.Collections
import javax.inject.Inject

@RequiresApi(34)
class CarouselPort @Inject constructor (var context: Context, var driveSvc: IGDrive) : ICarousel{

    lateinit var carouselHome:ICarouselHome
    lateinit var carouselHomeLocal:ICarouselHome
    lateinit var carouselHomeDrive:ICarouselHome
   private fun init(){
        carouselHome = CarouselImpl(context!!)
        carouselHomeLocal = CarouselLocalImpl(context!!)
        carouselHomeDrive = CarouselDriveImpl(context!!)
    }
   override suspend fun getCarousel():List<CarouselDTO>{
        try {
            init()
            val list = driveSvc.getImg().map {
                CarouselDTO(
                    id = it.id,
                    name = it.name,
                    url = it.url,
                    description = it.description,
                    active = it.active,
                    drawable = it.drawable,
                    order = it.order
                )
            } .toMutableList()
                //carouselHomeDrive.getCarouselHome().toMutableList()
            list.addAll(carouselHome.getCarouselHome())
            list.addAll(carouselHomeLocal.getCarouselHome())

            return list
        } catch (e: Exception) {
            Log.e("CarouselPort#getCarousel",e.message.toString())
        }
        return Collections.emptyList()
    }

}