package com.example.restapi_dipti_ict_amad_l4_04_16

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.restapi_dipti_ict_amad_l4_04_16.Adapter_Dipti_Ict_Amad_L4_04_16.ProductAdapter_Dipti_Ict_Amad_L4_04_16
import com.example.restapi_dipti_ict_amad_l4_04_16.ViewModel_Dipti_Ict_Amad_L4_04_16.ProductViewModel_Dipti_Ict_Amad_L4_04_16
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductActivity_Dipti_Ict_Amad_L4_04_16 : AppCompatActivity() {
    private lateinit var productViewModel: ProductViewModel_Dipti_Ict_Amad_L4_04_16
    private lateinit var productAdapter: ProductAdapter_Dipti_Ict_Amad_L4_04_16
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_dipti_ict_amad_l4_04_16)

        productViewModel = ViewModelProvider(this).get(ProductViewModel_Dipti_Ict_Amad_L4_04_16::class.java)
        productAdapter = ProductAdapter_Dipti_Ict_Amad_L4_04_16(emptyList())

        val refreshbtn: FloatingActionButton = findViewById(R.id.refreshBtn)
        refreshbtn.setOnClickListener{
            startActivity(Intent(this@ProductActivity_Dipti_Ict_Amad_L4_04_16,ProductActivity_Dipti_Ict_Amad_L4_04_16::class.java))
            finish()
        }
        val recyclerView : RecyclerView = findViewById(R.id.productRV)
        recyclerView.layoutManager = LinearLayoutManager(this)

        productViewModel.product.observe(this, Observer { product ->
            productAdapter = ProductAdapter_Dipti_Ict_Amad_L4_04_16(product)
            recyclerView.adapter = productAdapter
        })
    }
}