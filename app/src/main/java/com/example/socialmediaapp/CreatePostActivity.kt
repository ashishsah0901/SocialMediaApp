package com.example.socialmediaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.socialmediaapp.daos.PostDao
import kotlinx.android.synthetic.main.activity_create_post.*

class CreatePostActivity : AppCompatActivity() {
    private lateinit var postdao: PostDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)
        postdao= PostDao()
        postButton.setOnClickListener {
            val input = postInput.text.toString().trim()
            if(input.isNotEmpty()){
                postdao.addPost(input)
                finish()
            }
        }
        setRecyclerView()
    }

    private fun setRecyclerView() {

    }
}