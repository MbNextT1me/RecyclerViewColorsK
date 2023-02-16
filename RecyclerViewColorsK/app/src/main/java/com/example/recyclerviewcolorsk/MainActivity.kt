package com.example.recyclerviewcolorsk

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val planetsList = arrayListOf<String>("Mars", "Venus", "Earth")
    val colorsList = mutableListOf(Color.YELLOW, Color.RED, Color.GREEN, Color.MAGENTA)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // пример использования ListView
        val lv = findViewById<ListView>(R.id.list)
        val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, planetsList)
        lv.adapter = adapter

        // TODO: реализовать генерацию цветов определённой палитры
        val colorsList = mutableListOf(
            ResourcesCompat.getColor(resources, R.color.palitra1, null),
            ResourcesCompat.getColor(resources, R.color.palitra2, null),
            ResourcesCompat.getColor(resources, R.color.palitra3, null),
            ResourcesCompat.getColor(resources, R.color.palitra4, null),
            ResourcesCompat.getColor(resources, R.color.palitra5, null),
        )

        // пример использования RecyclerView с собственным адаптером
        val rv = findViewById<RecyclerView>(R.id.rview)
        val colorAdapter = ColorAdapter(LayoutInflater.from(this))
        // добавляем данные в список для отображения
        colorAdapter.submitList(colorsList)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = colorAdapter

    }
}