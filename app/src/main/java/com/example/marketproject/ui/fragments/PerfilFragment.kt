package com.example.marketproject.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marketproject.R
import com.example.marketproject.databinding.FragmentPerfilBinding


class PerfilFragment : Fragment() {

    private var _binding: FragmentPerfilBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_perfil, container, false)
        _binding = FragmentPerfilBinding.inflate(inflater, container, false)
        return binding.root
    }
}