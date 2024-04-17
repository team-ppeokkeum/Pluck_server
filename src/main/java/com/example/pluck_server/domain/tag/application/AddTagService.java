package com.example.pluck_server.domain.tag.application;

import com.example.pluck_server.domain.tag.dao.TagRepository;
import com.example.pluck_server.domain.tag.domain.Tag;
import com.example.pluck_server.domain.tag.dto.request.AddTagRequest;
import com.example.pluck_server.domain.tag.exception.DuplicatedTagException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddTagService {

    private final TagRepository tagRepository;

    public void addTag(AddTagRequest request) {
        if(tagRepository.existsByTagName(request.getTagName())) throw DuplicatedTagException.EXCEPTION;

        tagRepository.save(new Tag(request.getTagName()));
    }
}
