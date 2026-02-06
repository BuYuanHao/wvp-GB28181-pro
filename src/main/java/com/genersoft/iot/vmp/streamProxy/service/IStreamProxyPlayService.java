package com.genersoft.iot.vmp.streamProxy.service;

import com.genersoft.iot.vmp.common.StreamInfo;
import com.genersoft.iot.vmp.service.bean.ErrorCallback;
import com.genersoft.iot.vmp.streamProxy.bean.StreamProxy;
import jakarta.validation.constraints.NotNull;


public interface IStreamProxyPlayService {

    void start(long id, Boolean record, ErrorCallback<StreamInfo> callback);

    void startProxy(@NotNull StreamProxy streamProxy, ErrorCallback<StreamInfo> callback);

    void stop(long id);

    void stopProxy(StreamProxy streamProxy);
}
