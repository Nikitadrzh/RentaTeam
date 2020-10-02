package ru.nikitadrzh.data

import android.content.Context
import io.reactivex.Single
import ru.nikitadrzh.domain.model.Pizza
import ru.nikitadrzh.domain.repository.PizzaRepository

class PizzaRepositoryImpl(private val context: Context) : PizzaRepository {

    override fun getPizza(): Single<List<Pizza>> {
        val titles = context.resources.getStringArray(R.array.pizza_titles)
        return Single.just(titles.map { Pizza(it) })
    }
}