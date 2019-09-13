package ru.nikitadrzh.data

import android.content.Context
import io.reactivex.Single
import ru.nikitadrzh.domain.model.Pizza
import ru.nikitadrzh.domain.repository.PizzaRepository

class PizzaRepositoryImpl(private val context: Context) : PizzaRepository {

    override fun getPizza(): Single<List<Pizza>> {
        val pizzas: MutableList<Pizza> = ArrayList()

        for (title in context.applicationContext.resources.getStringArray(R.array.pizza_titles).asList())
            pizzas.add(Pizza(title))
        return Single.just(pizzas)
    }
}