package com.example.lrn.test.ui.users.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lrn.test.data.model.User
import com.example.lrn.databinding.ItemUserBinding

class UserAdapter() : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    var userList:List<User>?=ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemUserBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return UserViewHolder(binding)

    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(userList!![position])
    }

    override fun getItemCount(): Int {
        return userList!!.size
    }

    fun setSource(list: List<User>){
        userList=list
    }

    class UserViewHolder(private val binding: ItemUserBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(user: User) {
            binding.itemUserNameTextView.text = user.name
            binding.itemUserPlaceTextView.text = user.place
        }
    }

}