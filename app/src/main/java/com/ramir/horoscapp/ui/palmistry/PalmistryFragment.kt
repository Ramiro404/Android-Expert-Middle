package com.ramir.horoscapp.ui.palmistry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ramir.horoscapp.R
import com.ramir.horoscapp.databinding.FragmentPalmistryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PalmistryFragment : Fragment() {
    private lateinit var _binding: FragmentPalmistryBinding
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPalmistryBinding.inflate(inflater, container, false)
        return binding.root
    }


}