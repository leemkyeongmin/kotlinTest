package com.example.myapplication
fun main(){
    array()
}
//6. Array and List
// Array는 이미 메모리가 할당되어 있기 때문에 사이즈가 정해져있다. 하지만 값은 변경 가능
// List는 a. inMutableList(수정X) b. MutableList(수정O) 가 있음

fun array(){

    // arrayOf는 특정타입 지정없이 값 들어갈 수 있음
    // 특정타입을 정하려면 제네릭 or 코틀린 제공함수 사용
    // 사이즈 변경만 아니면, 값 변경은 가능

    // array 생성방법 10가지
    val array8 = Array(10,{0})  //사이즈는 10이고, 각 요소마다 0으로 초기화
    val array9 = Array(10, {i -> i*5})  // 사이즈는 10, 각 자리에 index * 5의 값이 들어감
    val array10 = Array(5, {})          // 사이즈는 10, 각 자리에는 공백 들어감

    val array = arrayOf(1,2,3)
    val array2 : Array<Int> = arrayOf(1,2,3) // 1,2 와 같은 방식
    val array3 = arrayOf(1,"임경민",179.7)    // 여러타입 가능
    val array4 = arrayOf<Int>(1,2,3)        // <제네릭> 방식
    val array5 = intArrayOf(1,2,3)          // 코틀린제공 intArray
    val array6 = charArrayOf('A','B','C')   // 코틀린제공 charArray
    val array7 = booleanArrayOf(true, false) // 코틀린제공 booleanArray

    //  array의 값 변경
    array[0] = 3        // array[인덱스] = 변경할 값(넣을값)
    array.set(0,4)      // array.set(인덱스, 넣을값)
    println(array[0])
    
    // array의 값 불러오기
    array[1]            // array[불러올인덱스]
    array.get(1)        // array.get(인덱스)

    // List는  Array와 다르게 Interface다
    // InMutableList는 읽기 전용, MutableList는 읽기쓰기 모두 가능
    // MutableList의 대표적인 예가 ArrayList. MutableList는 add와 remove 속성을 가짐
    // list[0] = 3          //리스트의 원소를 바꿀 수 없다
    val list = listOf(1,2,3)
    val  result = list.get(0)       // 리스트의 값을 .get()으로 가져오기는 가능
    
    // 얘는 var 비추. 값이 추가되어서 유동적인 것 같지만. arrayList 고유의 주소값은 바뀌지 않기 때문에 val을 써도 상관없다.
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(10)

}