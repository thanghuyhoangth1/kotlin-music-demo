package randomperson.demo.kotlin.kotlin_music_demo.data.source.server

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModule {
    private fun getRetrofit(): Retrofit = Retrofit.Builder()
            .baseUrl(Api.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    fun getApi(): Api = getRetrofit().create(Api::class.java)
    fun createGemre(genre: String): String {
        return "soundcloud%3Agenres%3A$genre"
    }
}
