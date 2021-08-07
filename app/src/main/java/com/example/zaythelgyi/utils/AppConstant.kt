package com.example.zaythelgyi.utils

import android.content.Context

const val LANGUAGE_MM = "my"
const val LANGUAGE_EN = "en"
const val PREFERENCE_LANGUAGE_DB = "pyidaungsu_library_language_db"
const val PREFERENCE_LANGUAGE_DATA = "language"
const val PREFERENCE_USER_DB = "pyidaungsu_library_user_db"
const val PREFERENCE_USER_DATA = "user"

fun getLanguage(context: Context): String {
    val sp = context.getSharedPreferences(PREFERENCE_LANGUAGE_DB, Context.MODE_PRIVATE)
    return sp.getString(PREFERENCE_LANGUAGE_DATA, LANGUAGE_MM) as String
}

fun saveLanguage(context: Context, language: String) {
    val sp = context.getSharedPreferences(PREFERENCE_LANGUAGE_DB, Context.MODE_PRIVATE)
    sp.edit().putString(PREFERENCE_LANGUAGE_DATA, language).apply()
}
