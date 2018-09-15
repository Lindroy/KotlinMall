package com.kotlin.usercenter.presenter.view

import com.kotlin.baselibrary.presenter.view.BaseView

/**
 * @author Lin
 * @date 2018/9/15
 * @function
 */
interface RegisterView:BaseView {

    fun onRegiterResult(isSuccess:Boolean)
}