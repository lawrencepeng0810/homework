package com.box.kotlin

import java.util.*

fun main(args: Array<String>) {
    var box3 = Box3(23f,24f,13)
    var box5 = Box5(39.5f,27.5f,23)
    //box3.print();
    val scanner = Scanner(System.`in`);

        println("請輸入寄送物品\"長度\"");
    val length = scanner.nextFloat();

        println("請輸入寄送物品\"寬度\"");
    val width = scanner.nextFloat();

        println("請輸入寄送物品\"高度\"");
    val height = scanner.nextInt();

    if (box5.validate(length, width, height))
        if (box3.validate(length, width, height)) {
            println("可放入Box3盒子");
        } else {
            println("可放入Box5盒子");
        }
    else {
        println("沒有合適的盒子!");
    }
}

class Box3(_length:Float, _width:Float, _height:Int) : Box(_length, _width, _height) {
    override fun validate(length:Float, width:Float, height:Int) : Boolean =
        (_length >= length && _width >= width && _height >= height)
}

class Box5(_length:Float, _width:Float, _height:Int) : Box(_length, _width, _height) {
    override fun validate(length:Float, width:Float, height:Int): Boolean =
        (_length >= length && _width >= width && _height >= height)
}



open class Box(var _length:Float,  var _width:Float,  var _height:Int) {
    open fun validate(length:Float, width:Float, height:Int): Boolean = true
}



