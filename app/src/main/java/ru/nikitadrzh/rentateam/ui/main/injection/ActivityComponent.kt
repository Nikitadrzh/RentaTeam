package ru.nikitadrzh.rentateam.ui.main.injection

import dagger.Component
import ru.nikitadrzh.rentateam.ui.main.injection.modules.*
import ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list.PizzaFragment
import ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list.PizzaPresenter

@Component(
    modules = [ContextModule::class, FragmentsModule::class, InteractorsModule::class,
        PresentersModule::class, RecyclerModule::class, SchedulersModule::class]
)
interface ActivityComponent {
    fun inject(fragment: PizzaFragment)

    fun inject(presenter: PizzaPresenter)
}