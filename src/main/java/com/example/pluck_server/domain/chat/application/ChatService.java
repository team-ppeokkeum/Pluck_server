package com.example.pluck_server.domain.chat.application;

import com.example.pluck_server.domain.chat.domain.ChatRoom;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Slf4j
@Data
@Service
public class ChatService {
    private final ObjectMapper mapper;
    private Map<String, ChatRoom> chatRooms;
}
