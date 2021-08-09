package ru.netology





import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.activity_main.*
import ru.netology.category.DataEvent
import ru.netology.category.DataPost
import ru.netology.databinding.ActivityMainBinding

import ru.netology.items.*

private lateinit var  List: RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
         List = findViewById(R.id.items_container)
        List.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = GroupAdapter<GroupieViewHolder>().apply {
                addAll(DataPost.posts.orEmpty().map { PostItem(it) })
                addAll(DataEvent.events.orEmpty().map { EventItem(it) })

            }
        }
    }
}








