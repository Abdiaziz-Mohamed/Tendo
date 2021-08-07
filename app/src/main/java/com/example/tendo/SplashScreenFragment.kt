package com.example.tendo

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.tendo.databinding.FragmentSplashScreenBinding


class SplashScreenFragment : Fragment() {

    lateinit var binding:FragmentSplashScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler(Looper.getMainLooper()).postDelayed(
            { findNavController().navigate(R.id.action_splashScreenFragment_to_viewPagerFragment) },
            3000
        )

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_splash_screen, container, false)

        return binding.root
    }

}