package com.bibaswan.techmtest.view


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bibaswan.techmtest.R


class EntryActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.entry_layout)
        replaceFragment()


    }



    fun replaceFragment(){
       supportFragmentManager
           .beginTransaction()
           .replace(R.id.container_retro_room, EntryFragment())
           .commit()
    }
}
