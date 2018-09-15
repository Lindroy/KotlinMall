package com.kotlin.usercenter.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.usercenter.R
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btnRegister.setOnClickListener {
//            startActivity(intentFor<TestActivity>("id" to 5))
            startActivity<TestActivity>("id" to 5)
            toast("点击了按钮")
        }
    }
}
