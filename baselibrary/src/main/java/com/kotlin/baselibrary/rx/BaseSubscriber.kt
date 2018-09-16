package com.kotlin.baselibrary.rx

import android.util.Log
import com.kotlin.baselibrary.presenter.view.BaseView
import rx.Subscriber

/**
 * @author Lin
 * @date 2018/9/15
 * @function Rx订阅者默认实现，onNext和onComplete方法里面的内容是一样的，故可以封装在这里
 */
open class BaseSubscriber<T>(val baseView:BaseView):Subscriber<T>() {

    override fun onNext(t: T) {

    }

    override fun onCompleted() {
        baseView.hideLoading()
    }

    override fun onError(e: Throwable?) {
        baseView.hideLoading()
        if (e is BaseException){
//            baseView.onError(e.msg)
        }
        Log.e("Tag",e.toString())

    }
}