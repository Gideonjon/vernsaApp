package com.example.vernsa

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.vernsa.databinding.FragmentLoginPageBinding


class LoginPage : Fragment() {
    private var _binding: FragmentLoginPageBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginPageBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.signupHere.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginPage_to_personalAccount)
        }


        binding.login.setOnClickListener {
            if (binding.pswEt.text.toString().isEmpty()) {
                binding.password.error = "Password Field Required"
                binding.password.requestFocus()
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(binding.emailEt.text.toString()).matches()) {
               binding.email.error = "Enter A Valid Email"
            } else {
                val intent = Intent(requireContext(), MainScreen::class.java)
                activity?.startActivity(intent)

            }


        }
        binding.forgotPsw.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginPage_to_forgotPassword)
        }



        return view
    }


}