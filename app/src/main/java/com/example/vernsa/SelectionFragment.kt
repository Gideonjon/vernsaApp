package com.example.vernsa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.vernsa.databinding.FragmentSelectionBinding

class SelectionFragment : Fragment() {
    private var _binding: FragmentSelectionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentSelectionBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.businessAccount.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_selectionFragment_to_businessAccount)
        }
        binding.personalAccount.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_selectionFragment_to_personalAccount)
        }
        binding.arrow.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_selectionFragment_to_landingPage)
        }
        return view
    }


}