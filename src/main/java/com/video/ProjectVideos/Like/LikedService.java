package com.video.ProjectVideos.Like;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LikedService {

    private final LikedRepository likeRepository;
}
