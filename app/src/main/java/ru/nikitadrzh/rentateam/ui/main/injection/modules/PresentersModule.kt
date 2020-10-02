package ru.nikitadrzh.rentateam.ui.main.injection.modules

import dagger.Module
import dagger.Provides
import ru.nikitadrzh.rentateam.ui.main.injection.DaggerInitializer
import ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list.PizzaContract
import ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list.PizzaPresenter

@Module
class PresentersModule(private val pizzaView: PizzaContract.View) {

    @Provides
    fun providePizzaPresenter(): PizzaPresenter {
        val presenter = PizzaPresenter(pizzaView)
        DaggerInitializer.activityComponent.inject(presenter)
        return presenter
    }
}