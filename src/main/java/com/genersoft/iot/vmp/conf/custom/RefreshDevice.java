package com.genersoft.iot.vmp.conf.custom;

import com.genersoft.iot.vmp.gb28181.bean.Device;
import com.genersoft.iot.vmp.gb28181.dao.DeviceMapper;
import com.genersoft.iot.vmp.gb28181.service.IDeviceService;
import com.genersoft.iot.vmp.storager.IRedisCatchStorage;
import com.genersoft.iot.vmp.utils.SystemInfoUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 获取系统信息写入redis
 */
@Slf4j
@Component
public class RefreshDevice {

    @Autowired
    private IDeviceService iDeviceService;
    @Autowired
    private DeviceMapper deviceMapper;

    @Scheduled(cron="0 0/2 * * * ?")   //每1秒执行一次
    public void execute(){
        try {
            Device device = deviceMapper.getDeviceByDeviceId("32081200002000000099");
            iDeviceService.sync(device);
            log.info("刷新通道成功");
        } catch (Exception e) {
            log.error("[刷新通道失败] {}", e.getMessage());
        }

    }


}
