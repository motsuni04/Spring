package com.spring.web;

import org.springframework.web.bind.annotation.*;
import lombok.*;
import com.spring.service.PostsService;
import com.spring.web.dto.PostsResponseDto;
import com.spring.web.dto.PostsSaveRequestDto;
import com.spring.web.dto.PostsUpdateRequestDto;

@RequiredArgsConstructor
@RestController
public class PostsAPIController {
    private final PostsService postsService;

    @PostMapping("api/v1/posts")
    public long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("api/v1/posts/{id}")
    public long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
