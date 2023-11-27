package com.hwacu.bustalk.domian.userselectbus.entity

import com.hwacu.bustalk.domian.busschedule.entity.BusSchedule
import com.hwacu.bustalk.domian.user.entity.User
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.time.ZonedDateTime

@Entity
class UserSelectBus(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,

    @ManyToOne
    @Column(name = "user", nullable = false)
    private val user: User,

    @ManyToOne
    @Column(name = "bus_schedule", nullable = false)
    private val busSchedule: BusSchedule,

    @Column(name = "create_at", nullable = false)
    private val createAt: ZonedDateTime
) {
}