package com.kotlin.baselibrary.ext

import com.kotlin.baselibrary.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * @author Lin
 * @date 2018/9/15
 * @function 通用的扩展函数
 */

/**
 * Observable的扩展执行方法
 */
fun <T> Observable<T>.excute(subscriber: BaseSubscriber<T>) {
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())  //主线程监听
//            .compose(lifecycleProvider.bindToLifecycle())
            .subscribe(subscriber) //订阅
}
