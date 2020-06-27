package com.github.instagram4j.Instagram4J.responses.feed;

import java.util.List;

import com.github.instagram4j.Instagram4J.models.media.reel.IGReelMedia;
import com.github.instagram4j.Instagram4J.models.user.IGUser;
import com.github.instagram4j.Instagram4J.responses.IGResponse;

import lombok.Data;

@Data
public class IGFeedUserReelsMediaResponse extends IGResponse {
    private String id;
    private String latest_reel_media;
    private String seen;
    private List<IGReelMedia> items;
    private IGUser user;
    private Object broadcast;
}
