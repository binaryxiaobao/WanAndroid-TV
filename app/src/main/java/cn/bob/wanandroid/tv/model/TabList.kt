package cn.bob.wanandroid.tv.model

object TabList {

    object IDS {
        /**首页*/
        const val ARTICLE = 1L

        /**广场*/
        const val SQUARE = 2L

        /**导航*/
        const val NAVI    = 3L

        /**问答*/
        const val WENDA = 4L

        /**体系*/
        const val TREE    = 5L

        /**项目*/
        const val PROJECT = 6L

        /**公众号*/
        const val WX_ARTICLES = 7L

        /**搜索*/
        const val PROJECT_TYPE = 8L

        /**工具*/
        const val TOOLS = 9L
    }

    val list: List<TopTab> by lazy {
        setupTabs()
    }

    private fun setupTabs(): List<TopTab> {
        val ids = arrayOf (
            IDS.ARTICLE,
            IDS.SQUARE,
            IDS.NAVI,
            IDS.WENDA,
            IDS.TREE,
            IDS.PROJECT,
            IDS.WX_ARTICLES,
            IDS.PROJECT_TYPE,
            IDS.TOOLS
        )

        val names = arrayOf(
            "首页",
            "广场",
            "导航",
            "问答",
            "体系",
            "项目",
            "公众号",
            "项目分类",
            "工具"
        )

        val urls = arrayOf(
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        )


        val list = ids.indices.map {
            buildTab(ids[it], names[it], urls[it])
        }

        return list
    }


    private fun buildTab(
        id: Long,
        name: String,
        url: String
    ) : TopTab {
        val tab = TopTab()
        tab.id = id
        tab.name = name
        tab.tabUrl = url

        return tab
    }


}