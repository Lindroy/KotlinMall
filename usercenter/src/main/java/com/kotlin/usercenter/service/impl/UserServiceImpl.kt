package com.kotlin.usercenter.service.impl

import com.kotlin.baselibrary.data.protocol.BaseResp
import com.kotlin.baselibrary.rx.BaseException
import com.kotlin.usercenter.data.repository.UserRepository
import com.kotlin.usercenter.service.UserService
import rx.Observable
import rx.functions.Func1

/**
 * @author Lin
 * @date 2018/9/15
 * @function
 */
class UserServiceImpl: UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        val repository = UserRepository()
        return repository.register(mobile,pwd,verifyCode).flatMap(object:Func1<BaseResp<String>,Observable<Boolean>>{
            override fun call(t: BaseResp<String>): Observable<Boolean> {
                if (t.status == 0){
                    return Observable.error(BaseException(t.status,t.message))
                }
                return Observable.just(true)
            }

        })
    }
}