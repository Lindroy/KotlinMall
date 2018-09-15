package com.kotlin.usercenter.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.editText
import org.jetbrains.anko.padding
import org.jetbrains.anko.toast
import org.jetbrains.anko.verticalLayout

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_test)
        toast(intent.getIntExtra("id",-1).toString())
        verticalLayout {
            padding = 30
            editText {
                hint = "请输入"
            }
        }

    }
}
