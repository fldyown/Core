package com.shixincube.core

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blankj.utilcode.util.LogUtils
import com.shixincube.stat.api.StatApi
import com.shixincube.update.api.UpdateApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * 检查更新；第二个参数为是否提示检查结果，默认true提示
         */
        try {
            StatApi.onStat("1", "3", 1, mutableMapOf())
            UpdateApi.check(this, true)
        } catch (e: Exception) {
            e.printStackTrace()
            LogUtils.i("fldy", "e:" + e.message)
        }
    }
}