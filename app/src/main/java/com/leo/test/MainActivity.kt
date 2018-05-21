package com.leo.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.leo.tools.Misc

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Misc.toast(this, "are you ready?")
    }
}
