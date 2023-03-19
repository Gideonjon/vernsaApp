package com.example.vernsa

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.vernsa.databinding.FragmentBusinessAccountBinding

class BusinessAccount : Fragment() {
    private var _binding: FragmentBusinessAccountBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentBusinessAccountBinding.inflate(inflater,container,false)
        val view = binding.root

        binding.create.setOnClickListener {

            if (binding.businessnameEt.text.toString().isEmpty()) {
                binding.businessName.error = "Field Empty"
                binding.businessName.requestFocus()
            }
            if (binding.firstNameEt.text.toString().isEmpty()) {
                binding.firstname.error = "Field Empty"
                binding.firstname.requestFocus()
            }
            if (binding.lastnameEt.text.toString().isEmpty()) {
                binding.lastname.error = "Field Empty"
                binding.lastname.requestFocus()
            }
            if (!Patterns.PHONE.matcher(binding.phonenumberEt.text.toString()).matches()) {
                binding.phonenumber.error = "Correct Phone Number"
                binding.phonenumber.requestFocus()
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(binding.websiteEt.text.toString()).matches()) {
                binding.website.error = "Correct Website"
                binding.website.requestFocus()
            }
            if (binding.usernameEt.text.toString().isEmpty()) {
                binding.userName.error = "Field Empty"
                binding.userName.requestFocus()
            }
            if (binding.pswEt.text.toString().isEmpty()) {
                binding.psw.error = "Field Empty"
                binding.psw.requestFocus()
            }
            if (!Patterns.WEB_URL.matcher(binding.websiteEt.text.toString()).matches()) {
                binding.website.error = "Field Empty"
                binding.website.requestFocus()
            }else{
                Toast.makeText(requireContext(), "Wha khee has registered You", Toast.LENGTH_SHORT).show()
            }
            
        }

        return view
    }

}