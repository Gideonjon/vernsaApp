package com.example.vernsa.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vernsa.R
import com.example.vernsa.databinding.FragmentViewpagerBinding
import com.example.vernsa.screens.FirstScreen
import com.example.vernsa.screens.SecondScreen
import com.example.vernsa.screens.ThirdScreen


class viewpager : Fragment() {
private var _binding : FragmentViewpagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     _binding = FragmentViewpagerBinding.inflate(inflater,container,false)
     val view = binding.root

        val fragmentList = arrayListOf<Fragment>(
FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = viewpagerAdapter(fragmentList,
requireActivity().supportFragmentManager, lifecycle
            )
        binding.viewpager.adapter = adapter
        return view
    }


}