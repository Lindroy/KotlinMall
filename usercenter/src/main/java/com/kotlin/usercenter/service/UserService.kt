package com.kotlin.usercenter.service

import rx.Observable

/**
 * @author Lin
 * @date 2018/9/15
 * @function
 */
interface UserService {
    fun register(mobile:String,verifyCode:String,pwd:String):Observable<Boolean>
}