package com.example.carrot_market.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carrot_market.R
import com.example.carrot_market.data.homelistdata

class HomeListAdapter(private val List : ArrayList<homelistdata>) : RecyclerView.Adapter<HomeListAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_list_item, parent,false)
        return HomeViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return List.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val currentItem = List[position]
        holder.title.text = currentItem.title
        holder.txt.text = currentItem.text
        holder.price.text = currentItem.price
    }
    class HomeViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val title : TextView = itemView.findViewById(R.id.homelisttitle)
        val txt : TextView = itemView.findViewById(R.id.homelisttxt)
        val price : TextView = itemView.findViewById(R.id.homelistprice)
    }
}