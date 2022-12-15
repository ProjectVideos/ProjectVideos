package com.video.ProjectVideos.Video;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VideoController {

    @GetMapping("/video")
    public String video(){
        return "Video/video";
    }
}
