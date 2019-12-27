package com.github.ikfr.tank.wars

import org.frice.Game
import org.frice.launch

class MyGame : Game()

fun main() {
    launch(MyGame::class.java)
}
