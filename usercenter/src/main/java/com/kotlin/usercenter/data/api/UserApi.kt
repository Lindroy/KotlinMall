package com.kotlin.usercenter.data.api

import com.kotlin.baselibrary.data.protocol.BaseResp
import com.kotlin.usercenter.data.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * @author Lin
 * @date 2018/9/15
 * @function 用户相关接口
 */
interface UserApi {

    @POST("userCenter/register")
    fun register(@Body req: RegisterReq): Observable<BaseResp<String>>
}