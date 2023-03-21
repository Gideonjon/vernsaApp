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

        binding.arrow.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_personalAccount_to_landingPage)
        }

        binding.create.setOnClickListener {

            if (binding.businessnameEt.text.toString().isEmpty()) {
                binding.businessName.error = "This Field Cant Be Empty"
            }
            if (binding.usernameEt.text.toString().isEmpty()) {
                binding.userName.error = "This Field Cant Be Empty"
            }
            if (binding.passwordEt.text.toString().isEmpty()) {
                binding.password.error = "This Field Cant Be Empty"
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(binding.lastnameEt.text.toString()).matches()) {
                binding.lastname.error = "Wrong Email Address"
            }
            if (!Patterns.PHONE.matcher(binding.phonenumberEt.text.toString()).matches()) {
                binding.phonenumber.error = "Invalid Phone Number"
            } else {
                val intent = Intent(requireContext(), MainScreen::class.java)
                activity?.startActivity(intent)
            }
        }

        return view
    }


}