package com.example.myapplication

fun main(){
    forAndwhile()
}

// 7. for + while 반복문

fun forAndwhile(){

    // arrayList 생성
    val students : ArrayList<String> = arrayListOf<String>("임경민", "장세원", "정지용", "최재욱")

    for (name in students){
        println("이름은 ${name}")
    }

}