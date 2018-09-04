package randomperson.demo.kotlin.kotlin_music_demo.data.source.server

import io.reactivex.Observable
import randomperson.demo.kotlin.kotlin_music_demo.data.model.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("/charts?kind=top&client_id=a7Ucuq0KY8Ksn8WzBG6wj4x6pcId6BpU&limit=20&offset=20")
    fun getAllMusic(@Query("genre") genre:String):Observable<Response>
    companion object {
        val BASE_URL:String="api-v2.soundcloud.com"
    }
}
