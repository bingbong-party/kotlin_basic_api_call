package com.kopring_basic_api_call.member.dto

import com.kopring_basic_api_call.common.status.Gender
import java.time.LocalDate

data class MemberDtoRequest (
    val id: Long?,
    val loginId: String,
    val password: String,
    val name: String,
    val birthDate: LocalDate,
    val gender: Gender,
    val email: String
)