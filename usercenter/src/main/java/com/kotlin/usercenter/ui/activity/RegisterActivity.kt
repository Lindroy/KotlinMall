package com.kotlin.usercenter.ui.activity

import android.os.Bundle
import com.kotlin.baselibrary.ui.activity.BaseMvpActivity
import com.kotlin.usercenter.R
import com.kotlin.usercenter.presenter.RegisterPresenter
import com.kotlin.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView {
    override fun onRegiterResult(isSuccess: Boolean) {
        toast("注册成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        /*btnRegister.setOnClickListener {
//            startActivity(intentFor<TestActivity>("id" to 5))
            startActivity<TestActivity>("id" to 5)
            toast("点击了按钮")
        }*/

        //实例化
        mPresenter = RegisterPresenter()
        mPresenter.mView = this

        btnRegister.setOnClickListener {
            mPresenter.register("","","")
        }
    }
}
