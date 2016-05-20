package com.aaron.kotlin.first_step.commons

import com.aaron.kotlin.first_step.commons.adapter.AdapterConstatns
import com.aaron.kotlin.first_step.commons.adapter.ViewType

data class RedditViewItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String) : ViewType {
    override fun getViewType() = AdapterConstatns.NEWS
}
