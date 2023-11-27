package com.hwacu.bustalk.domian.busschedule.entity

import com.hwacu.bustalk.domian.city.entity.City
import jakarta.persistence.*
import java.time.ZonedDateTime

@Entity
@Table(name = "bus_schedules")
class BusSchedule(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long?,

    @ManyToOne
    @Column(name = "departure_city", nullable = false)
    private val departureCity: City,

    @ManyToOne
    @Column(name = "arrive_city", nullable = false)
    private val arriveCity: City,

    @Column(name = "date", length = 10, nullable = false)
    private val date: ZonedDateTime,

    @Column(name = "time", length = 5, nullable = false)
    private val time: ZonedDateTime

) {
}