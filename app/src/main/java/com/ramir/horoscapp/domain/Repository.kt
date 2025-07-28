package com.ramir.horoscapp.domain

import com.ramir.horoscapp.data.network.response.PredictionResponse
import com.ramir.horoscapp.domain.model.PredictionModel


interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}