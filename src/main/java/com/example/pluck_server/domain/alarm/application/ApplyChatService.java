package com.example.pluck_server.domain.alarm.application;

import com.example.pluck_server.domain.alarm.dao.AlarmRepository;
import com.example.pluck_server.domain.user.application.facade.UserFacade;
import com.example.pluck_server.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplyChatService {

    private final UserFacade userFacade;

    private final AlarmRepository alarmRepository;

    public void applyChat() {
        User user = userFacade.currentUser();
    }
}
