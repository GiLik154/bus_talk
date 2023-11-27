package com.hwacu.bustalk.domian.busschedule.dto

import com.hwacu.bustalk.domian.city.entity.City
import java.time.ZonedDateTime

data class BusScheduleCommend(
    private val departureCity: City,
    private val arriveCity: City,
    private val date: ZonedDateTime,
    private val time: ZonedDateTime
)