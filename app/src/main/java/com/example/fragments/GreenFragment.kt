package com.example.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragments.databinding.FragmentGreenBinding

class GreenFragment : Fragment() {

    private lateinit var binding: FragmentGreenBinding

    private var listener: OnFragmentActionsListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_green, container, false)
        binding = FragmentGreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnPlus.setOnClickListener { listener?.onClickFragmentButton() }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentActionsListener)
            listener = context
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

}