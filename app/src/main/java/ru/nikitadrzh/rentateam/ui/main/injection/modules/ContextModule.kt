package ru.nikitadrzh.rentateam.ui.main.injection.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list.PizzaFragment

@Module
class ContextModule(val view: PizzaFragment) {

    @Provides
    fun provideContext(): Context {
        return view.context!!
    }
}