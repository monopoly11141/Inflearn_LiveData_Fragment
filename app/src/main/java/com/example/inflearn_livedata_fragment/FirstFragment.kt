package com.example.inflearn_livedata_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.inflearn_livedata_fragment.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        val viewModel : FirstFragmentViewModel by viewModels()

        binding.btnIncrementCount.setOnClickListener {
            viewModel.incrementCountValue()
        }

        viewModel.count.observe(viewLifecycleOwner, Observer {count ->
            binding.tvCount.text = count.toString()
        })

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}