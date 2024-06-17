package com.example.pluck_server.domain.alarm.dao;

import com.example.pluck_server.domain.alarm.domain.Alarm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlarmRepository extends JpaRepository<Alarm, Long> {
}
