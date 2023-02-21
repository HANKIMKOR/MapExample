package com.example.practice17_map

import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.practice17_map.databinding.ViewholderSearchResultItemBinding

class SearchRecyclerAdapter : RecyclerView.Adapter<> {

    class SearchResultItemViewHolder(itemView: View, val searchResultClickListener: (Any) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        fun bindData(data: Any) = with(itemView) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchResultItemViewHolder {
        val view = ViewholderSearchResultItemBinding.bind(parent)
        return SearchResultItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ???, position: Int) {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }




}