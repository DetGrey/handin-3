package com.example.handin_3

fun main() {
    val articles: ArrayList<Article> = arrayListOf(
        Article("Alice","The Art of Programming"),
        Article("Bob","Design Patterns Unleashed"),
        Article("Charlie", "Data Science Essentials"),
        Article("David", "Writing Effective Documentation"),
        Article("Eve", "Exploring Quantum Computing")
    )
    articles.forEach { article -> println(article.toString()) }

}

/* 1.
Write a class: Article
An article has an author and a title
Create 5 articles, add them into an ArrayList and print them by overriding the .toString() method
 */

class Article(val author: String, var title: String) {
    override fun toString(): String {
        return "Article: '$title' by the author $author"
    }
}