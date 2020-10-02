package ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.pizza_cardview.view.*
import ru.nikitadrzh.domain.model.Pizza
import ru.nikitadrzh.rentateam.R

class PizzaRecyclerAdapter :
    RecyclerView.Adapter<PizzaRecyclerAdapter.ItemViewHolder>() {

    private var pizzaList: MutableList<Pizza> = ArrayList()

    override fun getItemCount() = pizzaList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) =
        holder.setItem(pizzaList[position])

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.pizza_cardview, parent, false)
        )
    }

    fun onPizzaListUpdates(pizzaList: List<Pizza>) {
        this.pizzaList.clear()
        this.pizzaList.addAll(pizzaList)
        notifyDataSetChanged()
    }

    /**
     * ViewHolder
     */
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var pizzaTitle: String

        fun setItem(pizza: Pizza) {
            this.pizzaTitle = pizza.pizzaTitle

            itemView.pizza_title.text = pizzaTitle
            itemView.pizza_image.setImageResource(R.drawable.pizza)
        }
    }
}