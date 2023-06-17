package com.example.vernsa.onboarding

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.vernsa.R
import com.example.vernsa.databinding.FragmentViewpagerBinding
import com.example.vernsa.screens.FirstScreen
import com.example.vernsa.screens.SecondScreen
import com.example.vernsa.screens.ThirdScreen


class viewpager : Fragment() {
    private var _binding: FragmentViewpagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentViewpagerBinding.inflate(inflater, container, false)
        val view = binding.root


        var fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        binding.getStarted.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_viewpager2_to_landingPage2)

            checkingScreen()

        }


        val adapter = viewpagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager, lifecycle
        )
        binding.viewpager.adapter = adapter
        binding.springDotsIndicator.attachTo(binding.viewpager)

        return view
    }

    private fun checkingScreen() {
        val sharedPref = requireActivity().getSharedPreferences("vernsa", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()

    }

}