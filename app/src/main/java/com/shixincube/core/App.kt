package com.shixincube.core

import android.app.Application
import com.shixincube.BaseApi
import com.shixincube.BaseConfig
import com.shixincube.stat.api.StatApi
import com.shixincube.update.api.UpdateApi

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        initCore()
    }

    fun initCore() {
        val config = BaseConfig("100001", "1")
        BaseApi.debug(true) //目前仅支持测试，具体接入需要商务以及后台对接协商
        BaseApi.init(this, config)
        StatApi.init(this)
        UpdateApi.map.put("appId", "33")
    }
}