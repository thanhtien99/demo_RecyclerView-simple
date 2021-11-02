package com.example.demo_recycview2

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = arrayOf("Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4", "Chapter 5", "Chapter 6","Chapter 7", "Chapter 8")

    private var details = arrayOf("Item 1 dails", "Item 2 dails","Item 3 dails","Item 4 dails","Item 5 dails","Item 6 dails",
        "Item 7 dails","Item 8 dails",)

    private var images = intArrayOf(R.drawable.avartar, R.drawable.avartar,R.drawable.avartar,R.drawable.avartar,R.drawable.avartar,R.drawable.avartar,
        R.drawable.avartar,R.drawable.avartar   ,)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.car_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

            itemView.setOnClickListener {
                val position : Int = adapterPosition

                Toast.makeText(itemView.context, "Bạn đã chọn ${titles[position]}", Toast.LENGTH_LONG).show()
            }
        }
    }
}