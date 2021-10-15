package com.ozgurerdogan.kotlin_criptocrazyapp.dependencyinjection

import com.ozgurerdogan.kotlin_criptocrazyapp.repository.CryptoRepository
import com.ozgurerdogan.kotlin_criptocrazyapp.service.CryptoAPI
import com.ozgurerdogan.kotlin_criptocrazyapp.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideCryptoRepository(api:CryptoAPI):CryptoRepository{
        return CryptoRepository(api)
    }

    @Singleton
    @Provides
    fun provideCryptoAPI():CryptoAPI{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(CryptoAPI::class.java)
    }
}