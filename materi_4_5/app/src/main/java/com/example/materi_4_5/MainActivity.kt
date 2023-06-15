package com.example.materi_4_5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter
    private lateinit var dataList: List<Data>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataList = createDataList() // Buat data list

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MyAdapter(dataList)
        recyclerView.adapter = adapter
    }

    private fun createDataList(): List<Data> {
        val dataList = ArrayList<Data>()
        dataList.add(Data("Judul pertama", "Deskripsi 1 yang lebih detail dan informatif. Lorem ipsum dolor sit amet, consectetur adipiscing elit."))
        dataList.add(Data("Judul kedua", "Deskripsi 2 dengan beberapa poin penting yang perlu diperhatikan. Sed ut perspiciatis unde omnis iste natus error sit voluptatem."))
        dataList.add(Data("Judul ketiga", "Deskripsi 3 yang menjelaskan tentang fitur dan fungsi dari aplikasi ini. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit."))

        return dataList
    }
}


data class Data(val title: String, val description: String)