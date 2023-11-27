package com.hwacu.bustalk.applicataion.dto

import com.hwacu.bustalk.domian.busschedule.dto.BusScheduleCommend
import com.hwacu.bustalk.domian.city.entity.City
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

data class CrawlingResponse(
    private val departureCity: City,
    private val arriveCity: City,
    private val date: String,
    private val time: String
) {
    fun convert(): BusScheduleCommend {
        return BusScheduleCommend(departureCity, arriveCity, transferDate(), transferTime())
    }

    private fun transferDate(): ZonedDateTime {
        val dateFormatter = DateTimeFormatter.ofPattern("yy-MM-dd")
        val localDate = LocalDateTime.parse("$date", dateFormatter)
        return ZonedDateTime.of(localDate, ZoneId.systemDefault())
    }

    private fun transferTime(): ZonedDateTime {
        val timeFormatter = DateTimeFormatter.ofPattern("HH-mm")
        val localTime = LocalDateTime.parse("$time", timeFormatter)
        return ZonedDateTime.of(localTime, ZoneId.systemDefault())
    }
}

data class BusInfo(
    val deprCd: String,    // 출발지 코드
    val arvlCd: String,    // 도착지 코드
    val pathDvs: String? = "snql",   // 경로 구분 (직통: sngl, 환승: trtr, 왕복: rtrp)
    val pathStep: String? = "1",  // 경로 단계 (왕복, 환승 가는 편 순번)
    val deprDtm: String,   // 출발 일시 (가는날: 편도, 왕복)
    val busClsCd: String? = "0"   // 버스 등급
)
