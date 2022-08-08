package com.mrg.chatapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mrg.chatapp.databinding.FragmentMessagesBinding

class MessagesFragment : Fragment() {
    private lateinit var MessagesBinding : FragmentMessagesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        MessagesBinding = FragmentMessagesBinding.inflate(layoutInflater)

        return MessagesBinding.root
    }

}