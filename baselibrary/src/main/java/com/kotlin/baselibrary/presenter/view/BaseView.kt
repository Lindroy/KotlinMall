package com.kotlin.baselibrary.presenter.view

/**
 * @author Lin
 * @date 2018/9/15
 * @function
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError()
}