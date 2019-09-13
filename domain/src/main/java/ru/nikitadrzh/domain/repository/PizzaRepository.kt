package ru.nikitadrzh.domain.repository

import io.reactivex.Single
import ru.nikitadrzh.domain.model.Pizza

interface PizzaRepository {
    fun getPizza(): Single<List<Pizza>>
}