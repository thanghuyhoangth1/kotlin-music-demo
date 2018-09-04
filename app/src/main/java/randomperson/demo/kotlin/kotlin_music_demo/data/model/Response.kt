package randomperson.demo.kotlin.kotlin_music_demo.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Response : Parcelable {
    var mListWrapTrack: List<WrapTrack>? = null
}
