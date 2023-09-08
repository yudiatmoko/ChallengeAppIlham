package com.jaws.challengeappilham

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var recyclerViewMenuAdapter: RecyclerViewMenuAdapter? = null
    private var menuList = mutableListOf<Menu>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuList = ArrayList()

        recyclerView = findViewById<View>(R.id.rv_menu) as RecyclerView
        recyclerViewMenuAdapter = RecyclerViewMenuAdapter(this@MainActivity, menuList)

        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = recyclerViewMenuAdapter

        MenuListData()
    }
    private fun MenuListData(){
        var menu = Menu("Ayam Bakar", R.drawable.img_grilled_chicken, "Rp 50.000")
        menuList.add(menu)

        menu = Menu("Ayam Goreng", R.drawable.img_fried_chicken, "Rp 40.000")
        menuList.add(menu)

        menu = Menu("Ayam Geprek", R.drawable.img_smashed_chicken, "Rp 40.000")
        menuList.add(menu)

        menu = Menu("Sate Ayam", R.drawable.img_chicken_satay, "Rp 40.000")
        menuList.add(menu)

        recyclerViewMenuAdapter?.notifyDataSetChanged()
    }
}