package com.example.vernsa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.vernsa.databinding.FragmentLandingPageBinding


class LandingPage : Fragment() {
    private var _binding: FragmentLandingPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLandingPageBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.login.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_landingPage_to_loginPage)
        }
        binding.signUp.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_landingPage_to_personalAccount)
        }

        return view
    }


}