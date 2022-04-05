package com.reyy.recyclerviewkotlinreyy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                nameSuperhero = "Ant-Mant",
                descSuperhero = "Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum"

            ),
            Superhero(
                R.drawable.black,
                nameSuperhero = "Black Panter",
                descSuperhero = "Lorem LipsumLorem LipsumLorem LipsumLorem Lipsum"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "Captain Amerika",
                descSuperhero = "Lorem LipsumLorem LipsumLorem LipsumLorem Lipsum"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "Captain Amerika",
                descSuperhero = "Lorem LipsumLorem LipsumLorem LipsumLorem Lipsum"

            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "Captain Amerika",
                descSuperhero = "Lorem LipsumLorem LipsumLorem LipsumLorem Lipsum"

        ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "Captain Amerika",
                descSuperhero = "Lorem LipsumLorem LipsumLorem LipsumLorem Lipsum"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "Captain Amerika",
                descSuperhero = "Lorem LipsumLorem LipsumLorem LipsumLorem Lipsum"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperHeroAdapter (this,superheroList){

        }



    }
}