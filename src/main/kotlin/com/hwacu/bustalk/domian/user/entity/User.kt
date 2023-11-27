package com.hwacu.bustalk.domian.user.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.ZonedDateTime

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long?,

    @Column(name = "ip", length = 15, nullable = false)
    private val ip: String,

    @Column(name = "last_visit_time", nullable = false)
    private val listVisitTime: ZonedDateTime,

    @Column(name = "expiration", nullable = false)
    private val expiration: Boolean
) {
}