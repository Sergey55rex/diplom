package ru.netology


import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder


import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_post.*
import ru.netology.category.Data



import ru.netology.category.Post

import ru.netology.category.Event
import ru.netology.category.Job
import ru.netology.databinding.ActivityMainBinding

import ru.netology.items.EventItem
import ru.netology.items.JobItem
import ru.netology.items.MainCardContainer
import ru.netology.items.PostItem
import ru.netology.viewmodel.PostViewModel

//private lateinit var postList: RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

//        postList = findViewById(R.id.items_container)
//
//        postList.apply {
//            layoutManager = LinearLayoutManager(this@MainActivity)
//            adapter = GroupAdapter<ViewHolder>().apply {
//                addAll(Data.posts.orEmpty().map { PostItem(it) })
//            }
//        }



            val movies = listOf(
                getPost(),
                getEvent(),
                getJobs()
            )

            items_container.adapter = GroupAdapter<GroupieViewHolder>().apply { addAll(movies) }

        }

        private fun getPost(): Item {
            return MainCardContainer(
                "Список постов", "посты", ::onItemClick,
                listOf(
                    PostItem(
                        Post(
                             0,
                              1,
                             "Нетологияю Университет интернет - профессий будущего",
                             "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
                              getString(R.string.sample_text),
                             2,
                             null,
                              null
                        )

                    ),
                    PostItem(
                        Post(
                              1,
                            1,
                            "Нетологияю Университет интернет - профессий будущего",
                            "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
                            getString(R.string.sample_text),
                            2,
                            null,
                            null

                        )
                    ),
                    PostItem(
                        Post(
                            2,
                            1,
                            "Нетологияю Университет интернет - профессий будущего",
                            "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg",
                            getString(R.string.sample_text),
                            2,
                            null,
                            null

                        )
                    ),
                    PostItem(
                        Post(
                             3,
                            1,
                            "Нетологияю Университет интернет - профессий будущего",
                            "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg",
                            getString(R.string.sample_text),
                            2,
                            null,
                            null

                        )
                    ),
                    PostItem(
                        Post(
                             4,
                            1,
                            "Нетологияю Университет интернет - профессий будущего",
                            "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg",
                            getString(R.string.sample_text),
                            2,
                            null,
                            null

                        )
                    )
                )
            )
        }

        private fun getEvent(): Item {
            return MainCardContainer(
                "Список событий", "Популярные события", ::onItemClick,
                listOf(
                    EventItem(
                        Event(

                            0,
                             1,
                            "Нетологияю Университет интернет - профессий будущего",
                            "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg",
                            getString(R.string.sample_text),
                            2,
                            "",
                            "",
                            "",
                             null


                        )


                        ),
                    EventItem(
                        Event(
                            1,
                            1,
                            "Нетологияю Университет интернет - профессий будущего",
                            "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
                            getString(R.string.sample_text),
                            2,
                            "",
                            "",
                            "",
                            null

                        )
                    ),
                    EventItem(
                        Event(
                            2,
                            1,
                            "Нетологияю Университет интернет - профессий будущего",
                            "https://upload.wikimedia.org/wikipedia/en/0/06/The_Gentlemen_poster.jpg",
                            getString(R.string.sample_text),
                            2,
                            "",
                            "",
                            "",
                            null
                        )
                    ),
                    EventItem(
                        Event(
                            3,
                            1,
                            "Нетологияю Университет интернет - профессий будущего",
                            "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg",
                            getString(R.string.sample_text),
                            2,
                            "",
                            "",
                            "",
                            null
                        )
                    ),
                    EventItem(
                        Event(
                            4,
                            1,
                            "Нетологияю Университет интернет - профессий будущего",
                            "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg",
                            getString(R.string.sample_text),
                            2,
                            "",
                            "",
                            "",
                            null
                        )
                    )
                )
            )
        }

    private fun getJobs(): Item {
        return MainCardContainer(
            "Список работ", "работа", ::onItemClick,
            listOf(
                JobItem(
                    Job(
                        0,
                        1,
                        "Нетологияю Университет интернет - профессий будущего",
                        "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
                        getString(R.string.sample_text),
                        2,
                        null,
                        null
                    )

                ),
                JobItem(
                    Job(
                        0,
                        1,
                        "Нетологияю Университет интернет - профессий будущего",
                        "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
                        getString(R.string.sample_text),
                        2,
                        null,
                        null
                    )

                ),
                JobItem(
                    Job(
                        0,
                        1,
                        "Нетологияю Университет интернет - профессий будущего",
                        "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg",
                        getString(R.string.sample_text),
                        2,
                        null,
                        null
                    )

                )
            )
        )
     }

        fun onItemClick(url: String) {

        }
    }









