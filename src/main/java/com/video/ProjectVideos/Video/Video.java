package com.video.ProjectVideos.Video;

import com.video.ProjectVideos.Like.Liked;
import com.video.ProjectVideos.Reply.Reply;
import com.video.ProjectVideos.User.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Video {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String hashTag;

    private LocalDateTime createDateTime;

    @Column(nullable = false)
    private String filename;

    @Column(nullable = false)
    private String filepath;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToMany(mappedBy = "video")
    private List<Reply> replys;

    @OneToMany(mappedBy = "video")
    private List<Liked> likes;
}
