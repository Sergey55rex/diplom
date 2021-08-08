package ru.netology.items

import com.squareup.picasso.Picasso
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_jobs.*
import ru.netology.R
import ru.netology.category.Job


class JobItem(val job: Job): Item() {


    override fun getLayout() = R.layout.item_jobs

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {

        viewHolder.text_jobs.text = job.author
        viewHolder.text_jobs.text = job.content





//        if (content.liked) {
//            viewHolder.imageLike.setImageResource(R.drawable.ic_baseline_favorite_border_24)
//        }
//        viewHolder.imageLike.setOnClickListener {
//            content.liked = !content.liked
//            viewHolder.imageLike.setImageResource(
//                if (content.liked) R.drawable.ic_liked_24 else R.drawable.ic_baseline_favorite_border_24
//            )

//            viewHolder.imageToSend.setOnClickListener {
//
//                content.toSends++
////                content.toSend.text  = ru.netology.utils.Calculator.calculator(content.toSends)
//            }
//
//            viewHolder.imageViewing.setOnClickListener {
//                content.viewings++
////                viewing.text = ru.netology.utils.Calculator.calculator(post.viewings)
//            }
       // }




//        if (content.liked) {
//            viewHolder.imageLike.setImageResource(R.drawable.ic_baseline_favorite_border_24)
//        }
//        viewHolder.imageLike.setOnClickListener {
//            content.liked = !content.liked
//            viewHolder.imageLike.setImageResource(
//                if (content.liked)R.drawable.ic_liked_24 else R.drawable.ic_baseline_favorite_border_24
//            )
//        }
        Picasso.get()
            .load(job.authorAvatar)
            .into(viewHolder.image_jobs)
//)

    }
}


