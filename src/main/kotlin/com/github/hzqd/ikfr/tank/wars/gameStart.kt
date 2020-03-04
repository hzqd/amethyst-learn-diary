package com.github.hzqd.ikfr.tank.wars

import com.github.hzqd.ikfr.tank.wars.dsl.game
import org.frice.resource.image.ImageResource
import java.awt.Image

fun gameStart() = run {
    game {
        title = "坦克大战 v0.1"
        iconImage = ImageResource.fromPath("img/logo.jpg")
        setSize(gameWidth, gameHeight)

    }
}