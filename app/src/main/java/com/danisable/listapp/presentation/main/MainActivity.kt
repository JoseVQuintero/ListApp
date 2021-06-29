package com.danisable.listapp.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.danisable.listapp.R
import com.danisable.listapp.domain.model.Artist
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val names = arrayListOf<String>("Mango","Manzana","Pera","Piña","Melon","Sandia","Mango","Manzana","Pera","Piña","Melon","Sandia","Mango","Manzana","Pera","Piña","Melon","Sandia")
    val artist = arrayListOf<Artist>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*artist.add(Artist("Parm 1","Parm 2","Parm 3"))
        artist.forEach{it ->
            it.name

        }*/
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,names)
        listName.adapter = adapter


    }
}