package com.example.handin_3

import java.sql.Timestamp

fun main() {
    val redditFrontPage = RedditFrontPage()

    val post1 = RedditPost("Amazing Cats", "catlover123")
    repeat(50) { post1.upVote() }
    repeat(10) { post1.downVote() }
    redditFrontPage.addPost(post1)

    val post2 = RedditPost("Funny Memes", "meme_master")
    repeat(30) { post2.upVote() }
    repeat(5) { post2.downVote() }
    redditFrontPage.addPost(post2)

    val post3 = RedditPost("Tech News", "geeky_guru")
    repeat(20) { post3.upVote() }
    repeat(15) { post3.downVote() }
    redditFrontPage.addPost(post3)

    println("Display vote scores")
    println(post1.displayVotes())
    println(post2.displayVotes())
    println(post3.displayVotes())
    println()

    val sortedPosts = redditFrontPage.redditPosts.sortedDescending()
    println("Sorted Reddit Posts:")
    sortedPosts.forEach { post ->
        println("The post '${post.getTitle()}' by ${post.getAuthor()} has a vote balance of ${post.displayVotes()}")
    }
}

/* 4.
Write a class: RedditPost
    A Redditpost has :
    A date of which is has been posted
    An author
    A balance of upvotes / downvotes
    A Title

When a new instance of RedditPost is instantiated:
    The current date will be generated.
    The balance of upvotes and downvotes starts at 1.
    The title and author has to be provided by the constructor.

Ensure all attributes are private, but accesible by getters & setters.

Implement functionality such that redditposts can be sorted by upvotes/downvotes
*/

class RedditPost(private val title: String, private val author: String): Comparable<RedditPost> {
    private val datePosted: Timestamp = Timestamp(System.currentTimeMillis())
    private var upVotes: Int = 1
    private var downVotes: Int = 1
    private val votes: Int
        get() = upVotes - downVotes

    fun upVote() {
        upVotes++
    }
    fun downVote() {
        downVotes++
    }

    fun getTitle(): String {
        return title
    }
    fun getAuthor(): String {
        return author
    }

    fun displayVotes(): Int {
//        println("The post '$title' has a vote balance of $votes")
        return votes
    }

    override fun compareTo(other: RedditPost): Int {
        return votes.compareTo(other.votes)
    }
}

/* 4.5
Write a class: RedditFrontPage
The RedditFrontPage has:
    A List of all RedditPosts
    A method in RedditFrontPage deletes a RedditPost from the list, by its index number
 */

class RedditFrontPage() {
    val redditPosts: MutableList<RedditPost> = mutableListOf()

    fun addPost(post: RedditPost) {
        redditPosts.add(post)
    }

    fun deletePost(index: Int) {
        redditPosts.removeAt(index)
    }
}