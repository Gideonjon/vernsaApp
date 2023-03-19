package com.example.vernsa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vernsa.databinding.FragmentPersonalAccountBinding


class PersonalAccount : Fragment() {
  private var _binding : FragmentPersonalAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

     _binding = FragmentPersonalAccountBinding.inflate(inflater,container,false)
     val view = binding.root




     return view
    }


}