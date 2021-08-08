package ru.netology.items

import com.squareup.picasso.Picasso
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item

import kotlinx.android.synthetic.main.item_post.*
import ru.netology.R
import ru.netology.category.Post


class PostItem(val post: Post): Item() {

    override fun getLayout() = R.layout.item_post

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {

        viewHolder.text_post.text = post.author
        viewHolder.text_post2.text = post.content

        Picasso.get()
            .load(post.authorAvatar)
            .into(viewHolder.image_post)
    }
}


