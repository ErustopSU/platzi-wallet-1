package com.cristianvillamil.platziwallet.ui.home.view

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cristianvillamil.platziwallet.R
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer

class FavoriteTransferAdapter : RecyclerView.Adapter<FavoriteTransferViewHolder>() {

    private var favoriteTransferItems: List<FavoriteTransfer>? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteTransferViewHolder =
        FavoriteTransferViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.favorite_transfer_row,
                parent,
                false
            )
        )


    override fun getItemCount(): Int{
        return favoriteTransferItems?.size ?: 0
    }

    override fun onBindViewHolder(holder: FavoriteTransferViewHolder, position: Int) {
        // holder.bind(favoriteTransferItems?.get(position)!!)
        favoriteTransferItems?.get(position)?.let { holder.bind(it) }
    }

    fun setData(favoriteTransferItems: List<FavoriteTransfer>) {
        this.favoriteTransferItems = favoriteTransferItems
        notifyDataSetChanged()
    }


}