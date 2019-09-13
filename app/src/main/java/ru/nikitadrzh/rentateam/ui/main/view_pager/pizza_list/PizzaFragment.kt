package ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_pizza.*
import ru.nikitadrzh.domain.model.Pizza
import ru.nikitadrzh.rentateam.R
import ru.nikitadrzh.view.injection.DaggerInitializer
import javax.inject.Inject

class PizzaFragment : Fragment(), PizzaContract.View {
    @Inject
    lateinit var pizzaRecyclerAdapter: PizzaRecyclerAdapter

    @Inject
    lateinit var presenter: PizzaPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerInitializer.initActivityComponent(this).inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        presenter.findPizzas()
    }

    override fun showPizzas(pizzas: List<Pizza>) {
        pizzaRecyclerAdapter.onPizzaListUpdates(pizzas)
    }

    override fun showError(error: Throwable) {
        Toast.makeText(context, error.toString(), Toast.LENGTH_SHORT).show()
    }

    private fun initRecyclerView() {
        if (pizza_recycler.adapter == null) {
            pizza_recycler.adapter = pizzaRecyclerAdapter
        } else {
            pizzaRecyclerAdapter = pizza_recycler.adapter as PizzaRecyclerAdapter
        }
        if (pizza_recycler.resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT)
            pizza_recycler.layoutManager = LinearLayoutManager(context)
        else if (pizza_recycler.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
            pizza_recycler.layoutManager = GridLayoutManager(context, 2)
    }
}