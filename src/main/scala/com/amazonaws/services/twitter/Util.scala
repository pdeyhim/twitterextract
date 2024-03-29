package com.amazonaws.services.twitter
import twitter4j._

object Util {
  val config = new twitter4j.conf.ConfigurationBuilder()
     .setOAuthConsumerKey("")
    .setOAuthConsumerSecret("")
    .setOAuthAccessToken("")
    .setOAuthAccessTokenSecret("")
    .build
    
    def simpleStatusListener = new StatusListener() {
    def onStatus(status: Status) { println(status.getText) }
    def onDeletionNotice(statusDeletionNotice: StatusDeletionNotice) {}
    def onTrackLimitationNotice(numberOfLimitedStatuses: Int) {}
    def onException(ex: Exception) { ex.printStackTrace }
    def onScrubGeo(arg0: Long, arg1: Long) {}
    def onStallWarning(warning: StallWarning) {}
  }     
} 