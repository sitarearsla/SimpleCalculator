package com.sitare.simplecalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sitare.simplecalculator.databinding.FragmentMultiplicationBinding

class MultiplicationFragment : Fragment() {
    private var _multiplyBinding : FragmentMultiplicationBinding? = null
    private val multiplyBinding get() = _multiplyBinding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _multiplyBinding = FragmentMultiplicationBinding.inflate(inflater, container, false)
        multiplyBinding.multiplicationButton.setOnClickListener {
            val firstOperand = multiplyBinding.firstOperatorMultiplicationEditText.text.toString()
            val secondOperand = multiplyBinding.secondOperatorMultiplicationEditText.text.toString()
            val result = firstOperand.toInt() * secondOperand.toInt()
            val pass = MultiplicationFragmentDirections.multiplicationToResult(result)
            Navigation.findNavController(it).navigate(pass)

        }
        return multiplyBinding.root
    }
}