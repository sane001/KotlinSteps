package com.aaron.kotlin.first_step.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.aaron.kotlin.first_step.R
import com.aaron.kotlin.first_step.commons.RedditNewsITem
import com.aaron.kotlin.first_step.commons.extensions.inflate
import com.aaron.kotlin.first_step.commons.extensions.loadImg
import com.droidcba.kedditbysteps.commons.extensions.getFriendlyTime
import kotlinx.android.synthetic.main.news_item.view.*

class NewsDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsITem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {
            fun bind(item: RedditNewsITem) = with(itemView) {
                img_thumbnail.loadImg(item.thumbnail)
                description.text = item.title
                author.text = item.title
                comments.text = "${item.numComment} comments"
                time.text = item.created.getFriendlyTime()
            }
    }
}
