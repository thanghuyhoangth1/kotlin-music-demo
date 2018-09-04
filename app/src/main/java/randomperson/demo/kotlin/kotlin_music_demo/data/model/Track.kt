package randomperson.demo.kotlin.kotlin_music_demo.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class Track : Parcelable {
    @SerializedName("artwork_url")
    var mArtWork = ""
    @SerializedName("downloadable")
    var mDowloadable: Boolean = false
    @SerializedName("download_url")
    var mDowloadUrl: String = ""
    @SerializedName("duration")
    var mDuration = ""
    @SerializedName("uri")
    var mUri: String = ""
    @SerializedName("user")
    var mUser: User? = null
}
