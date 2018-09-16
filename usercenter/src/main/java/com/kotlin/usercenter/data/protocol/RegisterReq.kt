package com.kotlin.usercenter.data.protocol

/**
 * @author Lin
 * @date 2018/9/15
 * @function 注册请求
 */
data class RegisterReq(val mobile:String,val pwd:String,val verifyCode:String)