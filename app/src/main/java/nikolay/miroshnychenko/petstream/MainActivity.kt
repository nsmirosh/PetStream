package nikolay.miroshnychenko.petstream

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Retrofit


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buildRetrofit()
    }
}



private fun buildRetrofit() {
    val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build()

    val service = retrofit.create<DailyMotionService>(DailyMotionService::class.java)


}