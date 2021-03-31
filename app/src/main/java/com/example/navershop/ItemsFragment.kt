package com.example.navershop

import android.icu.lang.UCharacter
import android.os.Bundle
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navershop.viewmodel.ItemViewModel
import kotlinx.android.synthetic.main.fragment_items.view.*

class ItemsFragment : Fragment() {
    private val viewModel : ItemViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_items, container, false)

        view.recycler_item.adapter = itemRecyclerview()
        view.recycler_item.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        return view
    }

    inner class itemRecyclerview() : RecyclerView.Adapter<itemRecyclerview.ViewHolder>() {

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemRecyclerview.ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        }

        override fun getItemCount(): Int {
        }
    }
}