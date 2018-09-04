package randomperson.demo.kotlin.kotlin_music_demo.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class User : Parcelable {
    @SerializedName("username")
    var mUserName: String = ""
    @SerializedName("city")
    var mCity = ""
}
