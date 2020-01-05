package com.github.ikfr.tank.wars.dsl.ext

import org.frice.obj.sub.ImageObject
import org.frice.resource.image.ImageResource

class DSLImageObject(res: ImageResource) : ImageObject(res) {
    var 左上角x
        get() = x
        set(值) {
            x = 值
        }

    var 左上角y
        get() = y
        set(值) {
            y = 值
        }
}