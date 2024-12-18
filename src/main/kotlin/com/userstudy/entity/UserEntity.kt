package com.userstudy.entity

import jakarta.persistence.*

@Entity
data class UserEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val password: String
)

data class UserRequest(
    val name: String,
    val password: String
)

data class UserResponse(
    val id: Long,
    val name: String
) {
    companion object {
        fun from(user: UserEntity): UserResponse {
            return UserResponse(
                id = user.id,
                name = user.name
            )
        }
    }
}

data class UserUpdateRequest(
    val id: Long,
    val name: String,
    val password: String
)