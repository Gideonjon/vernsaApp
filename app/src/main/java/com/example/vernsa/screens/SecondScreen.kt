package com.example.vernsa.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.vernsa.R
import com.example.vernsa.databinding.FragmentSecondScreenBinding
import com.example.vernsa.onboarding.viewpager


class SecondScreen : Fragment() {
    private var _binding: FragmentSecondScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        val viewpager = activity?.findViewById<ViewPager2>(R.id.viewpager)

        binding.btnContinue.setOnClickListener {

            viewpager?.currentItem = 2
        }

        return view
    }


}