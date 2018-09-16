package com.kotlin.baselibrary.rx

/**
 * @author Lin
 * @date 2018/9/16
 * @function 通用异常类
 */
class BaseException (val status:Int,val msg:String):Throwable()