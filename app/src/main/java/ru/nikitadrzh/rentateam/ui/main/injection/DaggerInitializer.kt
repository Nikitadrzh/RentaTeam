package ru.nikitadrzh.view.injection

import ru.nikitadrzh.rentateam.ui.main.injection.ActivityComponent
import ru.nikitadrzh.rentateam.ui.main.injection.DaggerActivityComponent
import ru.nikitadrzh.rentateam.ui.main.injection.modules.ContextModule
import ru.nikitadrzh.rentateam.ui.main.injection.modules.PresentersModule
import ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list.PizzaFragment

class DaggerInitializer {

    companion object {
        lateinit var activityComponent: ActivityComponent

        fun initActivityComponent(view: PizzaFragment): ActivityComponent {
            activityComponent = DaggerActivityComponent.builder()
                .presentersModule(PresentersModule(view))
                .contextModule(ContextModule(view))
                .build()
            return activityComponent
        }
    }
}