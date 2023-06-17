package com.example.vernsa

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.vernsa.databinding.FragmentForgotPasswordBinding


class ForgotPassword : Fragment() {
    private var _binding: FragmentForgotPasswordBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentForgotPasswordBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.forget.setOnClickListener {
            if (!Patterns.EMAIL_ADDRESS.matcher(binding.confirmPswEt.text.toString()).matches()) {
                binding.confirmPassword.error = "Invalid Email"
            } else {
                Navigation.findNavController(view)
                    .navigate(R.id.action_forgotPassword_to_verifyPassword)
            }


        }


        binding.arrrowBack.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_forgotPassword_to_loginPage2)
        }


        return view
    }

}