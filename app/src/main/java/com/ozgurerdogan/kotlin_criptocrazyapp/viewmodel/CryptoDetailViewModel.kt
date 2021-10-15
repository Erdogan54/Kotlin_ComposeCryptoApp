package com.ozgurerdogan.kotlin_criptocrazyapp.viewmodel
import androidx.lifecycle.ViewModel
import com.ozgurerdogan.kotlin_criptocrazyapp.model.Crypto
import com.ozgurerdogan.kotlin_criptocrazyapp.model.CryptoItem
import com.ozgurerdogan.kotlin_criptocrazyapp.repository.CryptoRepository
import com.ozgurerdogan.kotlin_criptocrazyapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
    ):ViewModel() {

        suspend fun getCrypto(id:String): Resource<Crypto>{
            return repository.getCrypto(id)
        }
}