package com.example.myapplication

fun main(){
    helloworld()
    println(add(3,5))
    stringTemp();
}

// 1. 함수 선언
// Unit은 리턴형이 없을 때 쓴다 + 리턴타입이 없으면 생략도 가능!
fun helloworld() : Unit {
    println("경민이의 첫 코틀린 ")
}

// 2. 파라메타가 있을 경우
// (변수명 : 변수타입)으로 선언 및 "리턴타입" 꼭 써줄 것
fun add (a : Int, b : Int) : Int {
    return a+b;
}

// 3. val과 var의 차이
// val은 value의 약자. 변하지 않는 값 즉, 상수다. 재할당 X

fun value() {
    val a : Int = 10
    var b : Int = 5

    // var은 변할 수 있는 값 + 재할당 O
    // a = 100
    b = 100

    // 알아서 변수 타입을 찾아가기 때문에 굳이 선언 안 해도 됨
    val c = 100
    var d = 100
    var name = "임경민"
    var sex : String = "남자"

    // 선언해놓고 초기화하지 않을때는, 변수타입까지 써놓는다
    var e : String
}

fun stringTemp() {
    // 4. String Template
    // 문자열 출력방식
    val name : String = "경민"
    val lastName = "임"
    // $표시 뒤에 변수명을 입력한다 (JSP와 비슷한듯?)
    // $뒤에 { } 을 생략해도 되지만 써줘서, 문자간 혼동을 방지하자
    // $를 문자열에 쓰고 싶다면 \ 역슬래쉬를 함께 사용해주기
    println("my name is ${lastName + name}, i'm 25 ")
    println("this is 2\$a")
    println("is this true? ${1==0}")
}



