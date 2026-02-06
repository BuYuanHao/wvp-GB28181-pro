package com.genersoft.iot.vmp.gb28181.service;

import com.genersoft.iot.vmp.gb28181.bean.*;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 平台关联通道管理
 * @author lin
 */
public interface IPlatformChannelService {

    PageInfo<PlatformChannel> queryChannelList(int page, int count, String query, Integer channelType, Boolean online, Integer platformId, Boolean hasShare);

    int addAllChannel(Integer platformId);

    int removeAllChannel(Integer platformId);

    int addChannels(Integer platformId, List<Long> channelIds);

    int removeChannels(Integer platformId, List<Long> channelIds);

    void removeChannels(List<Long> ids);

    void removeChannel(long gbId);

    List<CommonGBChannel> queryByPlatform(Platform platform);

    void pushChannel(Integer platformId);

    void addChannelByDevice(Integer platformId, List<Integer> deviceIds);

    void removeChannelByDevice(Integer platformId, List<Integer> deviceIds);

    void updateCustomChannel(PlatformChannel channel);

    void checkGroupRemove(List<CommonGBChannel> channelList, List<Group> groups);

    void checkGroupAdd(List<CommonGBChannel> channelList);

    List<Platform> queryPlatFormListByChannelDeviceId(Long channelId, List<String> platforms);

    CommonGBChannel queryChannelByPlatformIdAndChannelId(Integer platformId, Long channelId);

    List<CommonGBChannel> queryChannelByPlatformIdAndChannelIds(Integer platformId, List<Long> channelIds);

    void checkRegionAdd(List<CommonGBChannel> channelList);

    void checkRegionRemove(List<CommonGBChannel> channelList, List<Region> regionList);

    List<Platform> queryByPlatformBySharChannelId(String gbId);
}
