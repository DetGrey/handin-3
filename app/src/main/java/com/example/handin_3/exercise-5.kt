package com.example.handin_3

fun main() {
    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")
    wordFrequency(words)
}

/* 5.
Write a program that takes a list of words as input and prints the frequency of each word.
Hint: Use a MutableMap
val words = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")
 */

fun wordFrequency(list: List<String>): MutableMap<String, Int> {
    val frequencyMap: MutableMap<String, Int> = mutableMapOf()

    list.forEach { word ->
        if (frequencyMap.containsKey(word)) {
            frequencyMap[word] = frequencyMap[word]!! + 1
        }
        else {
            frequencyMap[word] = 1
        }
    }

    println("Word frequency:")
    frequencyMap.forEach{(key, value) -> println("'$key' appears $value times")}

    return frequencyMap
}