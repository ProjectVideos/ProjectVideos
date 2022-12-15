package com.video.ProjectVideos.User;

import com.video.ProjectVideos.Like.Liked;
import com.video.ProjectVideos.Reply.Reply;
import com.video.ProjectVideos.Video.Video;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class User {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(unique = true , nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false , unique = true)
    private String nickName;

    @Column(nullable = false)
    private String filename;

    @Column(nullable = false)
    private String filepath;

    @Column(nullable = false)
    private String comment;

    @OneToMany(mappedBy = "user")
    private List<Video> videos;

    @OneToMany(mappedBy = "user")
    private List<Reply> replys;

    @OneToMany(mappedBy = "user")
    private List<Liked> likes;
}
