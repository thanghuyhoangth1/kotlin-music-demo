package randomperson.demo.kotlin.kotlin_music_demo.data.source.remote

import io.reactivex.Observable
import randomperson.demo.kotlin.kotlin_music_demo.data.model.Response
import randomperson.demo.kotlin.kotlin_music_demo.data.source.TrackDataSource
import randomperson.demo.kotlin.kotlin_music_demo.data.source.server.NetworkModule

class TrackRemoteDataSource() : TrackDataSource.Remote {

    override fun getTrackRemote(genre: String): Observable<Response> {
        return NetworkModule.getApi().getAllMusic(genre)
    }
}
