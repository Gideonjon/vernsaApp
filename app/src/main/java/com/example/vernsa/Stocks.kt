package com.example.vernsa

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vernsa.databinding.FragmentStocksBinding



class Stocks : Fragment() {
    private var _binding: FragmentStocksBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentStocksBinding.inflate(inflater, container, false)
        val view = binding.root




        return view
    }


}