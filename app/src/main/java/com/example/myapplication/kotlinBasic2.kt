package com.example.myapplication

fun main(){
    checkNum(1)
}

// 4. 조건식
// 파라메타 타입과 리턴타입 까먹지 말자!
// 이게 평소 알던 조건식
fun maxBy (a : Int, b : Int) : Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
// 자바에서는 return (a>b) ? a : b 같은 삼항연산자가 없는데 코틀린에서는 비슷하게 가능함
// 위와 같은 조건문임
fun maxBy2 (a : Int, b : Int) : Int = if (a>b) a else b

// when은 switch문과 비슷하다
fun checkNum(score : Int) : Unit{       // return 값이 없지만 Unit을 return
    // A. 복수선택 가능 + else문 생략가능
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
    }

    // B. 표현식으로도 가능하다. but, 표현식으로 할 경우 else문 필수@
    var b = when(score){
        1-> "1 return"
        2-> "2 return"
        else-> "nothing return"
    }

    println("b : ${b}")

    // C. in으로 범위표현 가능 + else문 생략가능
    when(score){
        in 90 .. 100 -> println("You are 천재")
        in 10 .. 80 -> println("soso 해요")
        else -> println("you are nothing babe ")
    }
}

// 5. Expression vs Statement
//  A. 어떤 과정을 거쳐 값이 생기고, 반환해주는 건 Expression
//  B. 그런 과정 없이 실행만 하는 (ex. 출력) 것은 Statement
//  C. Kotlin에서는 모든 게 Expression