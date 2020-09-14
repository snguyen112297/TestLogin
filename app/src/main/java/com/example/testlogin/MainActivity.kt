package com.example.testlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), LoginFragment.OnFragmentInteraction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        enter_button.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, LoginFragment()).commit()
        }
    }

    override fun onButtonClicked(username: String) {
        var displayFragment = DisplayFragment.newInstance(username)
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, displayFragment).commit()
    }
}