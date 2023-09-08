package com.jaws.challengeappilham

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewMenuAdapter(
    private val getActivity: MainActivity,
    private val menuList: List<Menu>
) :
    RecyclerView.Adapter<RecyclerViewMenuAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.template_rv_list_menu, parent, false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return menuList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvMenuName.text = menuList[position].menuName
        holder.tvMenuPrice.text = menuList[position].menuPrice
        holder.ivMenuImg.setImageResource(menuList[position].menuImg)
        holder.llMenu.setOnClickListener {
            Toast.makeText(getActivity, menuList[position].menuName, Toast.LENGTH_LONG).show()
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvMenuName: TextView = itemView.findViewById(R.id.tv_menu_name)
        val tvMenuPrice: TextView = itemView.findViewById(R.id.tv_menu_price)
        val ivMenuImg: ImageView = itemView.findViewById(R.id.iv_menu_img)
        val llMenu: LinearLayout = itemView.findViewById(R.id.ll_template_menu)
    }
}