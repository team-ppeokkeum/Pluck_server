package com.example.pluck_server.domain.tag.dao;

import com.example.pluck_server.domain.tag.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByTagName(String tagName);

    Boolean existsByTagName(String tagName);
}
