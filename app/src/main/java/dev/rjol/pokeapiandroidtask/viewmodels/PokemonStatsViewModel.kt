package dev.rjol.pokedexAndroid.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.rjol.pokedexAndroid.data.repositories.PokemonRepository
import dev.rjol.pokedexAndroid.utils.NetworkResource
import dev.rjol.pokedexAndroid.utils.extractId
import kotlinx.coroutines.flow.flow
import javax.inject.Inject





@HiltViewModel
class PokemonStatsViewModel @Inject constructor(private val pokemonRepository: PokemonRepository) :
    ViewModel() {

    suspend fun getSinglePokemon(url: String) = flow {
        val id = url.extractId()
        emit(NetworkResource.Loading)
        emit(pokemonRepository.getSinglePokemon(id))
    }

}