package io.github.kelvao.animeschedule

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AnimeSchedule : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@AnimeSchedule)
            modules(applicationModules)
        }
    }
}
