package com.genersoft.iot.vmp.service.redisMsg;

import com.genersoft.iot.vmp.common.InviteSessionType;
import com.genersoft.iot.vmp.common.StreamInfo;
import com.genersoft.iot.vmp.gb28181.bean.RecordInfo;
import com.genersoft.iot.vmp.service.bean.DownloadFileInfo;
import com.genersoft.iot.vmp.service.bean.ErrorCallback;
import com.genersoft.iot.vmp.vmanager.bean.AudioBroadcastResult;

public interface IRedisRpcPlayService {


    void play(String serverId, Long channelId, ErrorCallback<StreamInfo> callback);

    void stop(String serverId, InviteSessionType type, long channelId, String stream);

    void playback(String serverId, Long channelId, String startTime, String endTime, ErrorCallback<StreamInfo> callback);

    void playbackPause(String serverId, String streamId);

    void playbackResume(String serverId, String streamId);

    void download(String serverId, Long channelId, String startTime, String endTime, int downloadSpeed, ErrorCallback<StreamInfo> callback);

    void queryRecordInfo(String serverId, Long channelId, String startTime, String endTime, ErrorCallback<RecordInfo> callback);

    String frontEndCommand(String serverId, Long channelId, int cmdCode, int parameter1, int parameter2, int combindCode2);

    void playPush(String serverId, Long id, ErrorCallback<StreamInfo> callback);

    void playProxy(String serverId, long id, ErrorCallback<StreamInfo> callback);

    void stopProxy(String serverId, long id);

    DownloadFileInfo getRecordPlayUrl(String serverId, Integer recordId);

    AudioBroadcastResult audioBroadcast(String serverId, String deviceId, String channelDeviceId, Boolean broadcastMode);
}
