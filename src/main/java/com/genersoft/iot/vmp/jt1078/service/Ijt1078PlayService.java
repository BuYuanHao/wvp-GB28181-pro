package com.genersoft.iot.vmp.jt1078.service;

import com.genersoft.iot.vmp.common.CommonCallback;
import com.genersoft.iot.vmp.common.StreamInfo;
import com.genersoft.iot.vmp.gb28181.bean.CommonGBChannel;
import com.genersoft.iot.vmp.jt1078.bean.*;
import com.genersoft.iot.vmp.jt1078.proc.request.J1205;
import com.genersoft.iot.vmp.service.bean.ErrorCallback;
import com.genersoft.iot.vmp.vmanager.bean.WVPResult;

import java.util.List;

public interface Ijt1078PlayService {

    JTMediaStreamType checkStreamFromJt(String stream);

    void play(String phoneNumber, Long channelId, int type, CommonCallback<WVPResult<StreamInfo>> callback);

    void playback(String phoneNumber, Long channelId, String startTime, String endTime, Integer type,
                  Integer rate, Integer playbackType, Integer playbackSpeed, CommonCallback<WVPResult<StreamInfo>> callback);

    void stopPlay(String phoneNumber, Long channelId);

    void pausePlay(String phoneNumber, Long channelId);

    void continueLivePlay(String phoneNumber, Long channelId);

    List<J1205.JRecordItem> getRecordList(String phoneNumber, Long channelId, String startTime, String endTime);

    void stopPlayback(String phoneNumber, Long channelId);

    StreamInfo startTalk(String phoneNumber, Long channelId);

    void stopTalk(String phoneNumber, Long channelId);

    void playbackControl(String phoneNumber, Long channelId, Integer command, Integer playbackSpeed, String time);

    void start(Long channelId, Boolean record, ErrorCallback<StreamInfo> callback);

    void stop(Long channelId);

    void playBack(Long channelId, Long startTime, Long stopTime, ErrorCallback<StreamInfo> callback);
}
