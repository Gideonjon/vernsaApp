package com.example.vernsa

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.vernsa.databinding.FragmentPersonalAccountBinding


class PersonalAccount : Fragment() {
    private var _binding: FragmentPersonalAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentPersonalAccountBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.loginHere.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_personalAccount_to_loginPage)
        }

        binding.signup.setOnClickListener {

            if (binding.pswEt.text.toString().isEmpty()) {
                binding.password.error = "This Field Cant Be Empty"
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(binding.emailEt.text.toString()).matches()) {
                binding.email.error = "Wrong Email Address"
            }
            if (binding.confirmPswEt.text.toString().isEmpty() == binding.pswEt.text.toString().isEmpty()){
                binding.confirmPassword.error = "Password Doesn't Match"
           } else {
                val intent = Intent(requireContext(), MainScreen::class.java)
                activity?.startActivity(intent)
            }
        }

        return view
    }
    }


