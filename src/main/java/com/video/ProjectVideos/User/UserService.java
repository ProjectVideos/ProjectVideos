package com.video.ProjectVideos.User;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
 //   private final PasswordEncoder passwordEncoder;

//    public void create(User user, MultipartFile file) throws Exception {
//        User q = new User();
//        String projectPath = System.getProperty("user.dir") + "/src/main/resources/static/files";   //경로 지정
//
//        UUID uuid = UUID.randomUUID();      //익명 생성
//
//        String fileName = uuid + "_" + file.getOriginalFilename();  //익명+파일이름 자동으로 연결 해서 생성
//
//        File saveFile = new File(projectPath, fileName);
//
//        file.transferTo(saveFile);
//
//        q.setName(user.getName());
//        q.setPassword(passwordEncoder.encode(user.getPassword()));
//        q.setFilename(fileName);
//        q.setFilepath("/files/" + fileName);
//        q.setNickName(user.getNickName());
//        q.setComment(user.getComment());
//        this.userRepository.save(q);
//
//    }
}