package com.example.vernsa

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.vernsa.databinding.FragmentDashboardBinding
import com.example.vernsa.databinding.FragmentFundAccountBinding
import com.flutterwave.raveandroid.RaveConstants
import com.flutterwave.raveandroid.RavePayActivity
import com.flutterwave.raveandroid.RavePayManager
import java.util.UUID

class FundAccount : Fragment() {
    private var _binding: FragmentFundAccountBinding? = null
    private val binding get() = _binding!!
    private var publicKey = "FLWPUBK_TEST-42e6dfe2e63c701924823774fd06c145-X"
    private var encryptionKey = "FLWSECK_TEST-bfb37eeec9f678e0f73652116dad10ec-X"
    private var amount = 400
    private var email = "vernsa@gmail.com"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentFundAccountBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.arrrowBack.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fundAccount_to_dashboard)
        }

        binding.confirm.setOnClickListener {

            if (binding.vernseedEt.text.toString().isEmpty()) {
                binding.vernseed.error = "Field Is Empty"
            }
            if (binding.vernseedEt.text.toString().toDouble().isNaN()) {
                Toast.makeText(requireContext(), "If You Dont Have Money Ask", Toast.LENGTH_SHORT)
                    .show()
            } else {

                makepayment()
            }
        }


        return view

    }

    private fun makepayment() {

        val tref = email + " " + UUID.randomUUID().toString()
        RavePayManager(requireActivity())
            .acceptSaBankPayments(true)
            .acceptUssdPayments(true)
            .acceptAccountPayments(true)
            .allowSaveCardFeature(true)
            .setEncryptionKey(encryptionKey)
            .setPublicKey(publicKey)
            .acceptAccountPayments(true)
            .acceptCardPayments(true)
            .setAmount(amount.toDouble())
            .setEmail(email)
            .setTxRef(tref)
            .acceptBarterPayments(true)
            .setCurrency("N")
            .setCountry("NGN")
            .acceptMpesaPayments(true)
            .shouldDisplayFee(true)
            .acceptMpesaPayments(true)
            .acceptSaBankPayments(true)
            .acceptUssdPayments(true)
            .onStagingEnv(false)
            .acceptGHMobileMoneyPayments(false)
            .withTheme(com.flutterwave.raveandroid.R.style.DefaultTheme)
            .initialize()

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RaveConstants.RAVE_REQUEST_CODE && data != null) {
            val message = data.getStringExtra("response")
        }
        if (resultCode == RavePayActivity.RESULT_SUCCESS) {
            Toast.makeText(requireActivity(), "Successfull", Toast.LENGTH_SHORT).show()
        } else if (resultCode == RavePayActivity.RESULT_ERROR) {
            Toast.makeText(requireActivity(), "Error", Toast.LENGTH_SHORT).show()
        } else if (resultCode == RavePayActivity.RESULT_CANCELED) {
            Toast.makeText(requireActivity(), "Cancelled", Toast.LENGTH_SHORT).show()
        }


    }


}