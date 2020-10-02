package ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list

import io.reactivex.Scheduler
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import ru.nikitadrzh.domain.interactor.GetPizzaInteractor
import ru.nikitadrzh.domain.model.Pizza
import javax.inject.Inject

class PizzaPresenter(private val view: PizzaContract.View) {
    private lateinit var findPizzasDisposable: Disposable

    @Inject
    lateinit var getPizzaInteractor: GetPizzaInteractor

    @Inject
    lateinit var androidScheduler: Scheduler

    fun findPizzas() {
        findPizzasDisposable = getPizzaInteractor.execute()
            .subscribeOn(Schedulers.io())
            .observeOn(androidScheduler)
            .subscribe(this::showPizzas, this::showError)
    }

    private fun showPizzas(pizzas: List<Pizza>) = view.showPizzas(pizzas)

    private fun showError(error: Throwable) = view.showError(error)
}