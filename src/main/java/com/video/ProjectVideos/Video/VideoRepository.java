package com.video.ProjectVideos.Video;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class VideoRepository {

    private final VideRepository videRepository;
}
