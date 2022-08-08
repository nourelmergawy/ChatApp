package com.mrg.chatapp.Adpters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mrg.chatapp.Model.Messages
import com.mrg.chatapp.R
import com.mrg.chatapp.databinding.MessageItemBinding

class MessageAdapter(
    private var list: List<Messages>,
    private var context: Context
) : RecyclerView.Adapter<MessageAdapter.ViewHolder>() {

    private lateinit var binding :MessageItemBinding

    class ViewHolder(itemView: MessageItemBinding) : RecyclerView.ViewHolder(itemView.root) {
        var profileImage : ImageView
        var senderName : TextView
        var lastMessage :TextView
        var cardView :CardView
        init {
            profileImage = itemView.profileImage
            senderName = itemView.senderName
            lastMessage =itemView.lastMsg
            cardView =itemView.cardView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding =MessageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            lastMessage.setText(list.get(position).lastMssage)
            senderName.setText(list.get(position).senderName)
            Glide
                .with(context)
                .load(list.get(position).imageUrl)
                .centerCrop()
                .placeholder(R.drawable.loading_spinner)
                .into(profileImage);
            cardView.setOnClickListener(View.OnClickListener {

            })
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}