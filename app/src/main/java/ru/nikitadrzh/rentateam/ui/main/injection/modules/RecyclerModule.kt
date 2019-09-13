package ru.nikitadrzh.rentateam.ui.main.injection.modules

import dagger.Module
import dagger.Provides
import ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list.PizzaRecyclerAdapter

@Module
class RecyclerModule {

    @Provides
    fun providePizzasRecyclerAdapter(): PizzaRecyclerAdapter {
        return PizzaRecyclerAdapter()
    }
}
