package com.spacex.tracker.view.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Links implements Serializable {

    private String mission_patch;
    private String mission_patch_small;
    private String reddit_campaign;
    private String reddit_launch;
    private String reddit_recovery;
    private String reddit_media;
    private String presskit;
    private String article_link;
    private String wikipedia;
    private String video_link;
    private String youtube_id;

    private ArrayList<String> flickr_images;

    public Links(String mission_patch, String mission_patch_small, String reddit_campaign, String reddit_launch, String reddit_recovery, String reddit_media, String presskit, String article_link, String wikipedia, String video_link, String youtube_id, ArrayList<String> flickr_images) {
        this.mission_patch = mission_patch;
        this.mission_patch_small = mission_patch_small;
        this.reddit_campaign = reddit_campaign;
        this.reddit_launch = reddit_launch;
        this.reddit_recovery = reddit_recovery;
        this.reddit_media = reddit_media;
        this.presskit = presskit;
        this.article_link = article_link;
        this.wikipedia = wikipedia;
        this.video_link = video_link;
        this.youtube_id = youtube_id;
        this.flickr_images = flickr_images;
    }

    public String getMission_patch() {
        return mission_patch;
    }

    public void setMission_patch(String mission_patch) {
        this.mission_patch = mission_patch;
    }

    public String getMission_patch_small() {
        return mission_patch_small;
    }

    public void setMission_patch_small(String mission_patch_small) {
        this.mission_patch_small = mission_patch_small;
    }

    public String getReddit_campaign() {
        return reddit_campaign;
    }

    public void setReddit_campaign(String reddit_campaign) {
        this.reddit_campaign = reddit_campaign;
    }

    public String getReddit_launch() {
        return reddit_launch;
    }

    public void setReddit_launch(String reddit_launch) {
        this.reddit_launch = reddit_launch;
    }

    public String getReddit_recovery() {
        return reddit_recovery;
    }

    public void setReddit_recovery(String reddit_recovery) {
        this.reddit_recovery = reddit_recovery;
    }

    public String getReddit_media() {
        return reddit_media;
    }

    public void setReddit_media(String reddit_media) {
        this.reddit_media = reddit_media;
    }

    public String getPresskit() {
        return presskit;
    }

    public void setPresskit(String presskit) {
        this.presskit = presskit;
    }

    public String getArticle_link() {
        return article_link;
    }

    public void setArticle_link(String article_link) {
        this.article_link = article_link;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getVideo_link() {
        return video_link;
    }

    public void setVideo_link(String video_link) {
        this.video_link = video_link;
    }

    public String getYoutube_id() {
        return youtube_id;
    }

    public void setYoutube_id(String youtube_id) {
        this.youtube_id = youtube_id;
    }

    public ArrayList<String> getFlickr_images() {
        return flickr_images;
    }

    public void setFlickr_images(ArrayList<String> flickr_images) {
        this.flickr_images = flickr_images;
    }
}
