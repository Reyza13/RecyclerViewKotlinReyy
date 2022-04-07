package com.reyy.recyclerviewkotlinreyy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                nameSuperhero = "Ant-Man",
                descSuperhero = "Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum"

            ),
            Superhero(
                R.drawable.black,
                nameSuperhero = "Black",
                descSuperhero = "Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "Captain Amerika",
                descSuperhero = "Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum"
            ),
            Superhero(
                R.drawable.doctor,
                nameSuperhero = "Doctor Stranger",
                descSuperhero = "Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum"

            ),
            Superhero(
                R.drawable.gamora,
                nameSuperhero = "Gamora",
                descSuperhero = "Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum"

            ),
            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk",
                descSuperhero = "Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum"
            ),
            Superhero(
                R.drawable.iron,
                nameSuperhero = "Iron Man",
                descSuperhero = "Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum"
            ),
            Superhero(
                R.drawable.loki,
                nameSuperhero = "Loki",
                descSuperhero = "Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum"

            ),
            Superhero(
                R.drawable.marvel,
                nameSuperhero = "Captain Marvel",
                descSuperhero = "Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum"

            ),
            Superhero(
                R.drawable.nebula,
                nameSuperhero = "Nebula",
                descSuperhero = "Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum"
            ),
            Superhero(
                R.drawable.panter,
                nameSuperhero = "Black Panter",
                descSuperhero = "Lorem Lipsum Lorem Lipsum Lorem Lipsum Lorem Lipsum"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperHeroAdapter (this,superheroList){
            val intent = Intent (this,DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)

        }
    }
}