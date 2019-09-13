package ru.nikitadrzh.rentateam.ui.main.injection.modules

import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers

@Module
class SchedulersModule {

    @Provides
    fun provideAndroidSchedulers(): Scheduler {
        return AndroidSchedulers.mainThread()
    }
}