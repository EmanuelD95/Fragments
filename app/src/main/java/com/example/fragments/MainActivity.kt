package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnFragmentActionsListener {
    private lateinit var binding: ActivityMainBinding

    override fun onClickFragmentButton() {
        Toast.makeText(this, "El botón ha sido pulsado", Toast.LENGTH_SHORT).show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRed.setOnClickListener { replaceFragment(RedFragment())}
        binding.btnGreen.setOnClickListener { replaceFragment(GreenFragment())}
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContainer, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}
