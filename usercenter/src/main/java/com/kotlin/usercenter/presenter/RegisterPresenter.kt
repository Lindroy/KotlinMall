package com.kotlin.usercenter.presenter

import com.kotlin.baselibrary.ext.excute
import com.kotlin.baselibrary.presenter.BasePresenter
import com.kotlin.baselibrary.rx.BaseSubscriber
import com.kotlin.usercenter.presenter.view.RegisterView
import com.kotlin.usercenter.service.impl.UserServiceImpl

/**
 * @author Lin
 * @date 2018/9/15
 * @function
 */
class RegisterPresenter:BasePresenter<RegisterView> (){
    fun register(mobile:String,verifyCode:String,pwd:String){

        /**
         * 业务逻辑
         */
        val userService = UserServiceImpl()
        userService.register(mobile,verifyCode,pwd)
                .excute(object :BaseSubscriber<Boolean>(mView){
                    override fun onNext(t: Boolean) {
//                        super.onNext(t)
                        mView.onRegisterResult(t)
                    }
                })
    }
}