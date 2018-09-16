package com.kotlin.usercenter.data.repository

import com.kotlin.baselibrary.data.net.RetrofitFactory
import com.kotlin.baselibrary.data.protocol.BaseResp
import com.kotlin.usercenter.data.api.UserApi
import com.kotlin.usercenter.data.protocol.RegisterReq
import rx.Observable

/**
 * @author Lin
 * @date 2018/9/15
 * @function 用户相关数据层
 */
class UserRepository {
    /**用户注册**/
    fun register(mobile:String,pwd:String,verifyCode:String): Observable<BaseResp<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java).register(RegisterReq(mobile,pwd,verifyCode))
    }
}