package dev.rjol.pokedexAndroid.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.rjol.pokedexAndroid.data.repositories.DataStoreRepository
import kotlinx.coroutines.launch
import javax.inject.Inject



@HiltViewModel
class ThankYouViewModel @Inject constructor(private val dataStoreRepository: DataStoreRepository) :
    ViewModel() {

    fun saveDialogShown() = viewModelScope.launch {
        dataStoreRepository.saveDialogShown()

    }
}