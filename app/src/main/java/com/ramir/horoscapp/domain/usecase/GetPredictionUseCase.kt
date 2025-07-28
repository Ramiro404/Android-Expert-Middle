package com.ramir.horoscapp.domain.usecase

import com.ramir.horoscapp.domain.Repository
import com.ramir.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository){
    suspend operator fun invoke(sign:String): PredictionModel?{
        return repository.getPrediction(sign)
    }
}