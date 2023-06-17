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
import com.flutterwave.raveandroid.RavePayInitializer
import com.flutterwave.raveandroid.RavePayManager
import java.util.UUID

class FundAccount : Fragment() {
    private var _binding: FragmentFundAccountBinding? = null
    private val binding get() = _binding!!
    private var publicKey = "FLWPUBK_TEST-42e6dfe2e63c701924823774fd06c145-X"
    private var encryptionKey = "FLWSECK_TEST-bfb37eeec9f678e0f73652116dad10ec-X"
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
        val amount = binding.vernseedEt.text.toString().toDouble()

        RavePayManager(requireActivity())
            .setEmail(email)
            .setCountry("NGN")
            .setCurrency("NGN")
            .setAmount(amount)
            .setfName("Licio")
            .setlName("Lentimo")
            .setPublicKey(publicKey)
            .setEncryptionKey(encryptionKey)
            .setTxRef(System.currentTimeMillis().toString() + "Ref")
            .acceptAccountPayments(true)
            .acceptCardPayments(true)
            .acceptMpesaPayments(true)
            .onStagingEnv(true)
            .shouldDisplayFee(true)
            .showStagingLabel(true)
            .acceptMpesaPayments(true)
            .acceptSaBankPayments(true)
            .acceptUssdPayments(true)
            .acceptGHMobileMoneyPayments(true)
            .acceptBankTransferPayments(true)
            .allowSaveCardFeature(true)
            .withTheme(com.flutterwave.raveandroid.R.style.DefaultTheme)
            .initialize()

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RaveConstants.RAVE_REQUEST_CODE && data != null) {
            val message = data.getStringExtra("response")
        }
        if (resultCode == RavePayActivity.RESULT_SUCCESS) {
            Toast.makeText(requireContext(), "Successfull", Toast.LENGTH_SHORT).show()
        } else if (resultCode == RavePayActivity.RESULT_ERROR) {
            Toast.makeText(requireContext(), "Error", Toast.LENGTH_SHORT).show()
        } else if (resultCode == RavePayActivity.RESULT_CANCELED) {
            Toast.makeText(requireContext(), "Cancelled", Toast.LENGTH_SHORT).show()
        }


    }


}