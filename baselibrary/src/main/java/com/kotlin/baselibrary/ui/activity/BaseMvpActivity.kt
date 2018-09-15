package com.kotlin.baselibrary.ui.activity

import com.kotlin.baselibrary.presenter.BasePresenter
import com.kotlin.baselibrary.presenter.view.BaseView

/**
 * @author Lin
 * @date 2018/9/15
 * @function MVPActivity的基类
 */
open class BaseMvpActivity<T:BasePresenter<*>>:BaseActivity(),BaseView{
    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    lateinit var mPresenter:T

}