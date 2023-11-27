package com.hwacu.bustalk.domian.busschedule.entity

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BusSchedulesRepository : JpaRepository<BusSchedule, Long> {
}