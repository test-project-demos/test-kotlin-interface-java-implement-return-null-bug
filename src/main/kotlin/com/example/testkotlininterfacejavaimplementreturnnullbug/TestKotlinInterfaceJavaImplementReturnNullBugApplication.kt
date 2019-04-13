package com.example.testkotlininterfacejavaimplementreturnnullbug

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestKotlinInterfaceJavaImplementReturnNullBugApplication : CommandLineRunner {
    private val logger = LoggerFactory.getLogger(TestKotlinInterfaceJavaImplementReturnNullBugApplication::class.java)

    @Autowired
    private lateinit var kotlinInterface: KotlinInterface

    override fun run(vararg args: String?) {
        val str = kotlinInterface.test()
//        str ?: throw NullPointerException("kotlinInterface.test() is null!!!")

        val test = KotlinInterfaceImplByJava().test()
    }
}

fun main(args: Array<String>) {
    runApplication<TestKotlinInterfaceJavaImplementReturnNullBugApplication>(*args)
}
