package com.ozgurerdogan.kotlin_criptocrazyapp.service

import com.ozgurerdogan.kotlin_criptocrazyapp.model.Crypto
import com.ozgurerdogan.kotlin_criptocrazyapp.model.CryptoItem
import com.ozgurerdogan.kotlin_criptocrazyapp.model.CryptoList
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoAPI {

    // prices?key=3ef8f17b41faded2cce9857683f470df95975ae8

    @GET("prices")
    suspend fun getCryptoList(
        @Query("key") key:String
    ):CryptoList

    //currencies?key=3ef8f17b41faded2cce9857683f470df95975ae8&ids=BTC,ETH,XRP&attributes=id,name,logo_url
    @GET("currencies")
    suspend fun getCrypto(
        @Query("key") key:String,
        @Query("ids") id:String,
        @Query("attributes") attributes:String
    ):Crypto
}