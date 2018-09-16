package com.kotlin.baselibrary.data.net

import com.kotlin.baselibrary.common.BaseConstant
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author Lin
 * @date 2018/9/15
 * @function Retrofit工厂类单例
 */
class RetrofitFactory private constructor(){
    companion object {
        //知识点：by lazy 可以对val变量延迟初始化，本身是线程安全的，不必加锁
        val instance:RetrofitFactory by lazy { RetrofitFactory() }
    }
    private val interceptor: Interceptor
    private val retrofit:Retrofit

    init {
        //通用拦截，可以用于添加编码方式和token
        interceptor = Interceptor {
            chain -> val request = chain.request()
                .newBuilder()
                .addHeader("Content_Type","application/json")
                .addHeader("charset","UTF-8")
//                .addHeader("token",AppPrefsUtils.getString(BaseConstant.KEY_SP_TOKEN))
                .build()

            chain.proceed(request)
        }
        retrofit = Retrofit.Builder()
                .baseUrl(BaseConstant.SERVER_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(initClient())
                .build()
    }

    private fun initClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(initLogInterceptor())
                .addInterceptor(interceptor)
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .build()

    }

    /**
     * 日志拦截器
     */
    private fun initLogInterceptor(): HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    /**
     * 实例化具体服务
     */
    fun <T> create(service:Class<T>):T{
        return retrofit.create(service)
    }
}