package com.example.bike


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bike.databinding.FragmentProductBinding
import com.example.bike.ui.ProductAdapter
import com.example.bike.ui.ProductListener
import kotlinx.android.synthetic.main.fragment_product.*


class ProductFragment : Fragment() {
    private lateinit var binding: FragmentProductBinding
    private var viewFragment: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductBinding().inflate(inflater, container, false)
        binding.lifecycleOwner = this
        setupRecyclerView()
        if (viewFragment == null) {
            viewFragment = binding.root
        }
        return viewFragment
    }

    private fun setupRecyclerView() {
        binding.apply {
            rv_product.adapter =
                ProductAdapter(ProductListener { product ->
                    val action = ProductFragmentDirections.actionDetailProduct(product)
                    findNavController().navigate(action)
                })
        }
    }


}
