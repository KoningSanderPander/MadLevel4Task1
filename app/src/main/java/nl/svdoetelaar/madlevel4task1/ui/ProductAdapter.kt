package nl.svdoetelaar.madlevel4task1.ui

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nl.svdoetelaar.madlevel4task1.R
import nl.svdoetelaar.madlevel4task1.databinding.FragmentProductBinding
import nl.svdoetelaar.madlevel4task1.model.Product

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ProductAdapter (private val products: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = FragmentProductBinding.bind(itemView)

        fun dataBind(product: Product) {
            binding.tvProductName.text = product.productName
            binding.tvQuantity.text = product.quantity.toString()
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_product, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataBind(products[position])
    }

    override fun getItemCount(): Int {
        return products.size
    }
}