package randomperson.demo.kotlin.kotlin_music_demo.data.source

import io.reactivex.Observable
import randomperson.demo.kotlin.kotlin_music_demo.data.model.Response

interface TrackDataSource {
    interface Local {

    }

    interface Remote {
        fun getTrackRemote(genre:String):Observable<Response>
    }
}
