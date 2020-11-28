package cn.bob.wanandroid.tv.view

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import cn.bob.wanandroid.tv.R
import cn.bob.wanandroid.tv.adapter.TopNavAdapter
import cn.bob.wanandroid.tv.model.TabList
import kotlinx.android.synthetic.main.activity_top_tab_navigation.*
import java.io.File

class TopTabNavActivity: FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_tab_navigation)
        initView()

        intent.extras?.let {
            it.getString("")
            it.getInt("")
            it.getLong("")
        }
    }

    private fun initView() {
        val adapter = TopNavAdapter(supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, TabList.list)
        view_pager.adapter = adapter
        tab_layout.setupWithViewPager(view_pager)
    }
}