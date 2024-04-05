package com.example.pluck_server.domain.alarm.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AlarmType {

    APPLY_CHAT("채팅신청");

    private final String name;
}
