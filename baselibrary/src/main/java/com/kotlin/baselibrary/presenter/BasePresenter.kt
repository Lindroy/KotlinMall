package com.kotlin.baselibrary.presenter

import com.kotlin.baselibrary.presenter.view.BaseView

/**
 * @author Lin
 * @date 2018/9/15
 * @function
 */
open class BasePresenter<T:BaseView> {
    lateinit var mView:T
}