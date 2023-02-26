package com.example.practice17_map

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practice17_map.databinding.ViewholderSearchResultItemBinding

class SearchRecyclerAdapter :
    RecyclerView.Adapter<SearchRecyclerAdapter.SearchResultItemViewHolder>() {

    private val searchResultList: List<Any> = listOf()
    lateinit var searchResultClickListener: (Any) -> Unit

    class SearchResultItemViewHolder(
        private val binding: ViewholderSearchResultItemBinding,
        val searchResultClickListener: (Any) -> Unit
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(data: Any) = with(binding) {
            textTextView.text = "제목"
            subtextTextView.text = "부제목"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchResultItemViewHolder {
        val view = ViewholderSearchResultItemBinding.bind(parent)
        return SearchResultItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: SearchResultItemViewHolder, position: Int) {
        holder.bindData(searchResultList[position])
    }

    override fun getItemCount(): Int = 10

}