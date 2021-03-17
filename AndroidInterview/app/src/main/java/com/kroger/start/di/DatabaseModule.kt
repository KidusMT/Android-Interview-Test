package com.kroger.start.di

import android.content.Context
import com.kroger.start.db.ComicDao
import com.kroger.start.db.ComicsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    fun provideComicDao(@ApplicationContext context: Context): ComicDao {
        return ComicsDatabase.getDatabase(context).comicDao()
    }

}