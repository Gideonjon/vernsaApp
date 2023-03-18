package com.example.vernsa.screens

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.vernsa.R
import com.example.vernsa.databinding.FragmentThirdScreenBinding


class ThirdScreen : Fragment() {
    private var _binding: FragmentThirdScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentThirdScreenBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.btnContinue.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_viewpager2_to_landingPage)
            checkingScreen()
        }
        return view
    }

    private fun checkingScreen() {
        val sharedPref = requireActivity().getSharedPreferences("vernsa", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()

    }

}