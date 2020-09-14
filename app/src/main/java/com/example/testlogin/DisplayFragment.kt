package com.example.testlogin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_display.view.*

private const val NAME = "param1"

class DisplayFragment : Fragment() {


    private var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(NAME)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_display, container, false)
        view.fragment_display_text_view.text = getString(R.string.welcome, name)
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            DisplayFragment().apply {
                arguments = Bundle().apply {
                    putString(NAME, param1)
                }
            }
    }
}