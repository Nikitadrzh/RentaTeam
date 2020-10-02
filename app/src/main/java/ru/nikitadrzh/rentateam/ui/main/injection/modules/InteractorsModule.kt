package ru.nikitadrzh.rentateam.ui.main.injection.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.nikitadrzh.data.PizzaRepositoryImpl
import ru.nikitadrzh.domain.interactor.GetPizzaInteractor
import ru.nikitadrzh.domain.repository.PizzaRepository

@Module
class InteractorsModule {

    @Provides
    fun providePizzaRepository(context: Context): PizzaRepository = PizzaRepositoryImpl(context)

    @Provides
    fun provideGetPizzasInteractor(pizzaRepository: PizzaRepository) =
        GetPizzaInteractor(pizzaRepository)
}