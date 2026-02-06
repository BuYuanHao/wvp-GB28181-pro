package com.genersoft.iot.vmp.gb28181.controller.bean;

import lombok.Data;

import java.util.List;

@Data
public class ChannelToGroupByGbDeviceParam {
    private List<Long> deviceIds;
    private String parentId;
    private String businessGroup;
}
