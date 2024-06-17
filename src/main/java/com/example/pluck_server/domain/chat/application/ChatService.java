package com.example.pluck_server.domain.chat.application;

import com.example.pluck_server.domain.chat.domain.ChatRoom;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Data
@Service
public class ChatService {
    private final ObjectMapper mapper;
    private Map<String, ChatRoom> chatRooms;
}
