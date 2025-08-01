package com.ramir.horoscapp.data.network.response

import com.ramir.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.ramir.horoscapp.domain.model.HoroscopeInfo.Aries
import com.ramir.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.ramir.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.ramir.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.ramir.horoscapp.domain.model.HoroscopeInfo.Leo
import com.ramir.horoscapp.domain.model.HoroscopeInfo.Libra
import com.ramir.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.ramir.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.ramir.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.ramir.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.ramir.horoscapp.domain.model.HoroscopeInfo.Virgo

object HoroscopeMotherObject {
    val anyResponse = PredictionResponse("date", "predic", "taurus")
    val horoscopeInfoList =  listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}