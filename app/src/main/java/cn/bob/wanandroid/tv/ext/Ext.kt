package cn.bob.wanandroid.tv.ext

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import cn.bob.wanandroid.tv.constant.Constant

fun Context.showToast(content: String) {
    Constant.globalToast?.apply {
        setText(content)
        show()
    } ?: run {
        Toast.makeText(this.applicationContext, content, Toast.LENGTH_SHORT).apply {
            Constant.globalToast = this
        }.show()
    }
}

fun Context.showToast(@StringRes id: Int) {
    showToast(getString(id))
}

fun Context.inflater(@LayoutRes res: Int): View =
    LayoutInflater.from(this).inflate(res, null)