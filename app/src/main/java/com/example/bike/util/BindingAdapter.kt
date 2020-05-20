package com.example.bike.ui

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.bike.model.Product
import com.example.bike.ui.product.ProductAdapter

@BindingAdapter("productListData")
fun RecyclerView.bindRvProduct(data: List<Product>?) {
    val adapter = adapter as ProductAdapter
    adapter.submitList(data)
}