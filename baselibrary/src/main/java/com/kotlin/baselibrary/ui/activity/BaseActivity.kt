package com.kotlin.baselibrary.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.baselibrary.common.AppManager

/**
 * @author Lin
 * @date 2018/9/15
 * @function Activity基类
 */
open class BaseActivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppManager.instance.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        AppManager.instance.finishActivity(this)
    }
}