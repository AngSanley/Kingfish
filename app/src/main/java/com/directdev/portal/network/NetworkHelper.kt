package com.directdev.portal.network

import io.reactivex.Completable
import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.Response

/**-------------------------------------------------------------------------------------------------
 * Created by chris on 8/21/17.
 *------------------------------------------------------------------------------------------------*/
interface NetworkHelper {
    val bimayService: BimayService
    fun getIndexHtml(): Single<Response<ResponseBody>>
    fun getRandomizedFields(cookie: String, serial: String): Single<Response<ResponseBody>>
    fun authenticate(cookie: String, fieldMap: HashMap<String, String>): Single<Response<String>>
    fun switchRole(cookie: String): Completable
    fun getUserProfile(cookie: String): Single<ResponseBody>
}