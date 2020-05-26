package com.directdev.portal.models

import com.squareup.moshi.Json
import io.realm.RealmObject

open class VideoConferenceModel(
        @Json(name = "Date")
        open var date: String = "N/A", //May 11, 2020

        @Json(name = "Time")
        open var time: String = "N/A", //07:20:00 - 09:00:00

        @Json(name = "Meeting Number")
        open var meetingNumber: String = "N/A", //98801232046

        @Json(name = "Password")
        open var password: String = "N/A", //1920

        @Json(name = "Link")
        open var link: String = "N/A" ,

        open var classNumber : Int = 0
) : RealmObject()

