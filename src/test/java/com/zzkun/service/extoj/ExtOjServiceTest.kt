package com.zzkun.service.extoj

import com.zzkun.dao.UserRepo
import com.zzkun.service.ExtOjService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * Created by kun on 2016/9/30.
 */
@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration(locations = arrayOf("classpath*:springmvc-servlet.xml"))
class ExtOjServiceTest {

    @Autowired
    lateinit var extOjService: ExtOjService

    @Autowired
    lateinit var userRepo: UserRepo


    @Test
    fun flushACDB() {
        extOjService.flushACDB()
    }

    @Test
    fun getUserAC() {
        val user = userRepo.findByUsername("kun368")
        val list = extOjService.getUserAC(user)
        list.forEach(::println)
    }

    @Test
    fun flushPbInfoDB() {
        extOjService.flushPbInfoDB()
    }

    @Test
    fun test1() {
        extOjService.flushPbInfoOfCpt()
    }
}