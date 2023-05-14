package com.spring.web;

import com.spring.service.PostsService;
import com.spring.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsAPIController {
    private final PostsService postsService;

    @PostMapping("api/v1/posts")
    public long save(@RequestBody PostsSaveRequestDto requestDto) {
        return PostsService.save(requestDto);
    }
}
