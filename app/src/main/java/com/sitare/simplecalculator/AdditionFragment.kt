package com.sitare.simplecalculator

import android.os.Bundle
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
            //navigation action triggered
            Navigation.findNavController(it).navigate(R.id.additionToResult)
        }
        return additionBinding.root
    }

}