package nikolay.miroshnychenko.petstream

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DailyMotionService {

    @GET("users/{user}/repos")
    fun echo(@Path("message") message: String?): Call<String?>?

}