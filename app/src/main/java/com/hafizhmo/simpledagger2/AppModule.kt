package com.hafizhmo.simpledagger2

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val context: Context) {

    @Provides
    fun provideContext(): Context = context

    @Provides
    fun provideRepository(context: Context): PrisonRepository = PrisonRepository(context)

}