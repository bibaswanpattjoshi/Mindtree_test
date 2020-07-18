package com.bibaswan.techmtest.view

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bibaswan.techmtest.BR
import com.bibaswan.techmtest.R
import com.bibaswan.techmtest.databinding.PostListItemBinding
import com.bibaswan.techmtest.model.PostInfo


class PostListAdapter(var context: Context) : RecyclerView.Adapter<PostListAdapter.ViewHolder>() {
    private  var list: List<PostInfo> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding: PostListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.post_list_item, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("ADapter","Info:::"+list.get(position).body)
        holder.bind(list.get(position))
    }

    fun setAdapterList(list: List<PostInfo> ){
     this.list = list

        notifyDataSetChanged()
    }
    override fun getItemCount(): Int = list.size

    class ViewHolder(val binding: PostListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Any) {
            binding.setVariable(BR.postmodel, data)
            binding.executePendingBindings()
        }
    }
}


