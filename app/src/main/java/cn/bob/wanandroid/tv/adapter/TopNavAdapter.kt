package cn.bob.wanandroid.tv.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import cn.bob.wanandroid.tv.model.TopTab

class TopNavAdapter(fragmentManager: FragmentManager, behavior: Int, private var tabList: List<TopTab>? = null): FragmentStatePagerAdapter(fragmentManager, behavior) {

    override fun getPageTitle(position: Int): CharSequence? {
        tabList?.let {
            return it[position].name
        }
        return super.getPageTitle(position)
    }

    override fun getItem(position: Int): Fragment {
        return Fragment()
    }

    override fun getCount(): Int {
        return tabList?.size ?: 0
    }
}