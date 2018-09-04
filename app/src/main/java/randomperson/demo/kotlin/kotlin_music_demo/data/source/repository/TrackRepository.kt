package randomperson.demo.kotlin.kotlin_music_demo.data.source.repository

import io.reactivex.Observable
import randomperson.demo.kotlin.kotlin_music_demo.data.model.Response
import randomperson.demo.kotlin.kotlin_music_demo.data.source.TrackDataSource

class TrackRepository(val remote: TrackDataSource.Remote) : TrackDataSource.Remote {
    override fun getTrackRemote(genre: String): Observable<Response> {
        return remote.getTrackRemote(genre)
    }
}
