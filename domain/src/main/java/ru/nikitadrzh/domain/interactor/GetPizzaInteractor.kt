package ru.nikitadrzh.domain.interactor

import io.reactivex.Single
import ru.nikitadrzh.domain.model.Pizza
import ru.nikitadrzh.domain.repository.PizzaRepository

class GetPizzaInteractor(private val repository: PizzaRepository) {
    fun execute(): Single<List<Pizza>> = repository.getPizza()
}