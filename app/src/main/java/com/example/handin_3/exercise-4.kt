package com.example.handin_3

import java.sql.Timestamp
import java.util.Date

fun main() {
    val post = RedditPost("me", "title")

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

class RedditPost(val author: String, val title: String): Comparable<RedditPost> {
    val datePosted: Timestamp = Timestamp(System.currentTimeMillis())
    var votes: Int = 1 // Why not 0?

    fun upVote() {
        votes++
    }
    fun downVote() {
        votes--
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