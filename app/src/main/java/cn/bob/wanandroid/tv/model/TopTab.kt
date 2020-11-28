package cn.bob.wanandroid.tv.model

data class TopTab(
    /**顶部导航栏ID，方便区分*/
    var id: Long = 0,

    /**顶部导航栏名称*/
    var name: String? = null,

    /**顶部导航栏对应接口的地址*/
    var tabUrl: String? = null
)