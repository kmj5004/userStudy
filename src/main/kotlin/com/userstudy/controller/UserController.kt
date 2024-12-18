package com.userstudy.controller

import com.userstudy.entity.UserEntity
import com.userstudy.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/save")
class SaveUserController(private val userService: UserService) {

    @PostMapping("/createUser")
    fun createUser(@RequestBody user: UserEntity) = userService.createUser(user)

    @DeleteMapping("/deleteUser")
    fun deleteUser(@RequestParam id: Long) = userService.deleteUser(id)

    @DeleteMapping("/deleteAll")
    fun deleteAll() = userService.deleteAllUser()

    @PatchMapping("/changeUser")
    fun changeUser(@RequestBody user: UserEntity) = userService.editUser(user)

    @GetMapping("/getUser")
    fun getUser(@RequestParam id: Long) = userService.getUser(id)

    @GetMapping("/getAllUser")
    fun getAllUser() = userService.getAllUser()

}