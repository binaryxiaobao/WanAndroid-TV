package cn.bob.wanandroid.tv.application

import android.content.ComponentCallbacks2
import androidx.multidex.MultiDexApplication
import com.bumptech.glide.Glide
import kotlinx.coroutines.selects.select
import me.jessyan.autosize.AutoSize

class WanApplication: MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        initAutoSize()
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)

        if (level == ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN) {
            Glide.get(this).clearMemory()
        }
        Glide.get(this).trimMemory(level)
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Glide.get(this).clearMemory()
    }

    private fun initAutoSize() {
        AutoSize.initCompatMultiProcess(this)
    }
}