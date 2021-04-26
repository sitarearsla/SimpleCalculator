package com.sitare.simplecalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.sitare.simplecalculator.databinding.FragmentResultBinding

class ResultFragment : Fragment() {
    private var _resultBinding : FragmentResultBinding? = null
    private val resultBinding get() = _resultBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _resultBinding = FragmentResultBinding.inflate(inflater, container, false)
        val bundle : ResultFragmentArgs by navArgs()
        val result = bundle.result
        resultBinding.resultTextView.text = result.toString()
        return resultBinding.root
    }
}