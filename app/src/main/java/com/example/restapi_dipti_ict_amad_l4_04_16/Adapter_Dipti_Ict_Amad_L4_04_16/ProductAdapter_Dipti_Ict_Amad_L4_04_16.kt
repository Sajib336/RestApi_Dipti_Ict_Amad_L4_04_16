package com.example.restapi_dipti_ict_amad_l4_04_16.Adapter_Dipti_Ict_Amad_L4_04_16

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.restapi_dipti_ict_amad_l4_04_16.Product_Dipti_Ict_Amad_L4_04_16
import com.example.restapi_dipti_ict_amad_l4_04_16.R

class ProductAdapter_Dipti_Ict_Amad_L4_04_16 (private val product : List<Product_Dipti_Ict_Amad_L4_04_16>) : RecyclerView.Adapter<ProductAdapter_Dipti_Ict_Amad_L4_04_16.ProductViewHolder> (){
    inner class ProductViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        val productImg: ImageView = itemView.findViewById(R.id.productImage)
        val productTitle: TextView = itemView.findViewById(R.id.productTitletv)
        val productId: TextView = itemView.findViewById(R.id.productIdtv)
        val productPrice: TextView = itemView.findViewById(R.id.productPriceTv)
        val productDesc: TextView = itemView.findViewById(R.id.productDescTv)

        fun bind(product: Product_Dipti_Ict_Amad_L4_04_16){
            Glide.with(itemView)
                .load(product.images[0])
                .into(productImg)
            productTitle.text = product.title
            productId.text = product.Id.toString()
            productPrice.text = "$${product.price}"
            productDesc.text = product.Description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_list_dipti_ict_amad_l4_04_16,parent,false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return product.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = product[position]
        holder.bind (product)
    }
}