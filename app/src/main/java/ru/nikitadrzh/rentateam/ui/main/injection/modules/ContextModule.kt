package ru.nikitadrzh.rentateam.ui.main.injection.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list.PizzaFragment

@Module
class ContextModule(private val view: PizzaFragment) {

    @Provides
    fun provideContext(): Context = view.requireContext()
}