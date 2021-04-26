package com.sitare.simplecalculator

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sitare.simplecalculator.databinding.FragmentAdditionBinding
import com.sitare.simplecalculator.databinding.FragmentMultiplicationBinding

class AdditionFragment : Fragment() {
    private var _additionBinding : FragmentAdditionBinding? = null
    private val additionBinding get() = _additionBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _additionBinding = FragmentAdditionBinding.inflate(inflater, container, false)
        additionBinding.addButton.setOnClickListener {
            //perform addition
            val firstOperand = additionBinding.firstOperatorAdditionEditText.text.toString()
            val secondOperand = additionBinding.secondOperatorAdditionEditText.text.toString()
            val result = firstOperand.toInt() + secondOperand.toInt()
            //add the argument to the navigation action
            val pass = AdditionFragmentDirections.additionToResult(result)
            //navigation action triggered
            Navigation.findNavController(it).navigate(pass)
        }
        return additionBinding.root
    }

}