package com.example.pluck_server.domain.tag.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class AddTagRequest {

    @NotBlank
    private String tagName;
}
