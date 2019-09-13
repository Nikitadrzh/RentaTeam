package ru.nikitadrzh.rentateam.ui.main.injection.modules

import dagger.Module
import dagger.Provides
import ru.nikitadrzh.rentateam.ui.main.view_pager.ComboFragment
import ru.nikitadrzh.rentateam.ui.main.view_pager.DrinksFragment
import ru.nikitadrzh.rentateam.ui.main.view_pager.RefreshmentsFragment

@Module
class FragmentsModule {

    @Provides
    fun provideComboFragment(): ComboFragment {
        return ComboFragment()
    }

    @Provides
    fun provideDrinksFragment(): DrinksFragment {
        return DrinksFragment()
    }

    @Provides
    fun provideRefreshmentsFragment(): RefreshmentsFragment {
        return RefreshmentsFragment()
    }
}