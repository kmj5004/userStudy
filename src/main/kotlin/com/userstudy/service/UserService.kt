package com.userstudy.service

import com.userstudy.entity.UserEntity
import com.userstudy.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun createUser(user: UserEntity) = userRepository.save(user)

    fun deleteUser(id: Long) = userRepository.deleteById(id)

    fun deleteAllUser() = userRepository.deleteAll()

    fun editUser(user: UserEntity): UserEntity = userRepository.save(user)

    fun getUser(id: Long): UserEntity = userRepository
        .findById(id)
        .orElseThrow { NoSuchElementException("User Not Found") }

    fun getAllUser(): List<UserEntity> = userRepository.findAll()

}