package com.amazonaws.services.twitter
import twitter4j._

object GetTweets extends App {
  val twitterStream = new TwitterStreamFactory(Util.config).getInstance
    twitterStream.addListener(Util.simpleStatusListener)
    twitterStream.sample()
}