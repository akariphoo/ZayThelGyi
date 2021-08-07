package com.example.zaythelgyi.activity

import android.content.Context
import android.os.Build
import android.os.LocaleList
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.zaythelgyi.utils.getLanguage
import java.util.*

open class BaseActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun attachBaseContext(newBase: Context?) {
        Log.d("test_data", "attachBaseContext in BaseActivity")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            val localeList = LocaleList(Locale(getLanguage(newBase!!)))
            LocaleList.setDefault(localeList)
            newBase!!.resources.configuration.setLocales(localeList)
            val context = newBase!!.createConfigurationContext(newBase!!.resources.configuration)
            super.attachBaseContext(context)
            return
        } else {
            newBase!!.resources.configuration.setLocale(Locale(getLanguage(newBase!!)))
            newBase.resources.updateConfiguration(newBase.resources.configuration, newBase.resources.displayMetrics)
        }
        super.attachBaseContext(newBase)
    }

}