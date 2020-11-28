package cn.bob.wanandroid.tv.retrofit

import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {

    @GET("/article/list/{page}/json")
    fun getHomeArticleList(@Path("page") page: Int): Deferred<Any>{
        TODO()
    }
}