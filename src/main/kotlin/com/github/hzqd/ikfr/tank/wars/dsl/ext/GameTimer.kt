package com.github.hzqd.ikfr.tank.wars.dsl.ext

/**
 * 代码写的太糟糕啦。不过我反正会给你封装的好好的，才不会让别人看见我家丰恺写的东西呢。 ——ice1000
 * Created by liufengkai on 15/11/27.
 *
 * @author liufengkai
 */
open class GameTimer {
    protected var e_start: Double = System.currentTimeMillis().toDouble()
    private var e_stopWatchStart: Double = 0.0
    val elapsed: Double
        get() = System.currentTimeMillis() - e_start

    fun resetStop() {
        e_stopWatchStart = elapsed
    }

    fun stopWatch(ms: Long) = if (elapsed > e_stopWatchStart + ms) {
        resetStop()
        true
    } else false
}