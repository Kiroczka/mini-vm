package com.experimental

import com.experimental.impl.MiniVMBuilder

fun main(args: Array<String>) {
    val fileReader = FileReader()
    val miniVM = MiniVMBuilder().build()
    val code = fileReader.readFromResources("sample-code.mvm")
    miniVM.execute(code)
}