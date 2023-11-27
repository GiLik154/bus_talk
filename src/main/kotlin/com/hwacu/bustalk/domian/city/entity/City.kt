package com.hwacu.bustalk.domian.city.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "city")
class City(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,
    @Column(name = "name", length = 10, nullable = false)
    private val name: String,
    @Column(name = "code", length = 3, nullable = false)
    private val code: String
) {
}