package com.example.ka_1week

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PuppyInfoActivity : AppCompatActivity() {



    private lateinit var rvResult : RecyclerView
    private lateinit var rvAdapter: PuppyAdapter
    private val repository = PuppyRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puppy_info)

        rvResult = findViewById(R.id.puppy_list)
        rvAdapter = PuppyAdapter(this)
        rvResult.adapter = rvAdapter
        rvResult.layoutManager = GridLayoutManager(this,2)

        rvAdapter.data = repository.getRepoList()

        rvAdapter.notifyDataSetChanged()


    }
}
