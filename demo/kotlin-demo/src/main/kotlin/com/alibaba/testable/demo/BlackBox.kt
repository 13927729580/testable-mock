package com.alibaba.testable.demo


class BlackBox(private val data: String) {

    fun callMe(): String {
        return data
    }

    fun trim(): String {
        return data.trim()
    }

    fun substring(from: Int, to: Int): String {
        return data.substring(from, to)
    }

    fun startsWith(prefix: String): Boolean {
        return data.startsWith(prefix)
    }

}