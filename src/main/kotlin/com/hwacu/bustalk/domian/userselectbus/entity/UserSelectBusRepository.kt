package com.hwacu.bustalk.domian.userselectbus.entity

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserSelectBusRepository : JpaRepository<UserSelectBus, Long> {
}