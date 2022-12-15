package com.video.ProjectVideos.Like;

import com.video.ProjectVideos.User.User;
import com.video.ProjectVideos.Video.Video;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Liked {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private boolean liked;

    private boolean unliked;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "VIDEO_ID")
    private Video video;
}
