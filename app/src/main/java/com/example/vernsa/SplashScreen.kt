package com.example.vernsa

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.vernsa.databinding.FragmentSplashScreenBinding


class SplashScreen : Fragment() {
    private var _binding: FragmentSplashScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        Handler().postDelayed({
            if (onboarding()) {
                Navigation.findNavController(view).navigate(R.id.action_splashScreen_to_landingPage2)
            } else {
                Navigation.findNavController(view).navigate(R.id.action_splashScreen_to_viewpager2)
            }

        }, 7000)

        return view
    }

    private fun onboarding(): Boolean {
        val sharedPref = requireActivity().getSharedPreferences("vernsa", Context.MODE_PRIVATE)

        return sharedPref.getBoolean("Finished", false)
    }


}
