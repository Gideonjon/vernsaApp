package com.example.vernsa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vernsa.databinding.FragmentMeBinding
import java.util.Objects


class Me : Fragment() {
    private var _binding: FragmentMeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentMeBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.switch1.setOnClickListener {

        }


        return view
    }

}