package com.ramir.horoscapp.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ramir.horoscapp.domain.model.HoroscopeModel
import com.ramir.horoscapp.domain.model.PredictionModel
import com.ramir.horoscapp.domain.usecase.GetPredictionUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HoroscopeDetailViewModel @Inject constructor(
    private  val getPredictionUseCase: GetPredictionUseCase):ViewModel(){

    private var _state = MutableStateFlow<HoroscopeDetailState>(HoroscopeDetailState.Loading)
    val state: StateFlow<HoroscopeDetailState> = _state
    private lateinit var horoscope:HoroscopeModel

    fun getHoroscope(sign: HoroscopeModel){
        horoscope = sign
        viewModelScope.launch {
            //primary thread
            _state.value = HoroscopeDetailState.Loading
            val result:PredictionModel? = withContext(Dispatchers.IO){ getPredictionUseCase(horoscope.name)} // secondary thread
            if(result != null){
                _state.value = HoroscopeDetailState.Success(result.horoscope, result.sign, horoscope)
            }else{
                _state.value = HoroscopeDetailState.Error("Ha ocurrido un error, ")
            }

        }
    }
}