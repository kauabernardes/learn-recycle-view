package com.example.recycleview.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.data.model.Post
import com.example.recycleview.databinding.PostItemBinding

class PostAdapter ( var postList: List<Post>) : RecyclerView.Adapter<PostAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: PostItemBinding) : RecyclerView.ViewHolder(binding.root)
}