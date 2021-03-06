package com.ht.scada.web.service;

import com.ht.scada.web.entity.AlarmHandle;
import com.ht.scada.web.entity.AlarmRecord;
import java.util.List;


public interface AlarmInfoService {

    List<AlarmRecord> getHistoryAlarmRecord(int status);

    void saveAlarmRecord(AlarmRecord alarmRecord);
    
    public AlarmRecord getAlarmByID(int id);

    AlarmRecord getAlarmByAlarmId(String alarmId);

    AlarmHandle saveAlarmHandle(AlarmHandle alarmHandle);
}
