package com.example.asjdsc.food

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asjdsc.R
import kotlinx.android.synthetic.main.item_food.view.*

class FoodAdapter(val foodOnClickListener: FoodOnClickListener) : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    private val data = mutableListOf<Food>()

    fun setData(newData: List<Food>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(food: Food) {
            itemView.iv_food.setImageResource(food.photo)
            itemView.tv_food_name.text = food.foodName
            itemView.setOnClickListener { foodOnClickListener.onClick(food) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(data[position])
    }

    override fun getItemCount(): Int = data.size

    interface FoodOnClickListener {
        fun onClick(food: Food)
    }

}