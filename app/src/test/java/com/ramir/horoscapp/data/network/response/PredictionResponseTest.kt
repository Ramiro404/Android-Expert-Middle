package com.ramir.horoscapp.data.network.response

import io.kotlintest.shouldBe
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class PredictionResponseTest{
    @Test
    fun `toDomain should return a correct PredictionModel`(){
        //Given
        val horoscopeResponse = HoroscopeMotherObject.anyResponse

        //when
        val predictionModel = horoscopeResponse.toDomain()

        //then
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope
    }
}