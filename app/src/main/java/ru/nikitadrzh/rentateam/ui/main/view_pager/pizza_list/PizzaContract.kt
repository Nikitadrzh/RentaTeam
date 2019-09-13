package ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list

import ru.nikitadrzh.domain.model.Pizza

interface PizzaContract {
    interface View {
        fun showPizzas(pizzas: List<Pizza>)

        fun showError(error: Throwable)
    }
}