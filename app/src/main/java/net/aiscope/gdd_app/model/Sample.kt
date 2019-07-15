package net.aiscope.gdd_app.model

import com.google.gson.Gson

enum class Status() {
    Incomplete, ReadyToUpload, Uploaded
}

data class SampleMetadata(val bloodType: Long)

data class Sample(val id: String, val healthFacility: String, val disease: String? = null,
                  val imagePath: String? = null, val metadata: SampleMetadata? = null,
                  val status:Status = Status.Incomplete) {
    fun toJson():String = Gson().toJson(this)
}