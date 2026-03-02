package com.genersoft.iot.vmp.gb28181.controller.bean;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author: byh
 * @create: 2023/5/15
 * @value:
 * @ClassName: ChannelVo1
 */
@Data
public class ChannelVo1 {

    /**
     * 数据库自增ID
     */
    @Schema(description = "数据库自增ID")
    private long id;

    /**
     * 通道国标编号
     */
    @Schema(description = "通道国标编号")
    private String channelid;

    private String parentName;

    /**
     * 设备国标编号
     */
    @Schema(description = "设备国标编号")
    private String deviceid;

    /**
     * 通道名
     */
    @Schema(description = "名称")
    private String name;


    /**
     * 是否有子设备 1有, 0没有
     */
    @Schema(description = "是否有子设备 1有, 0没有")
    private int parental;

    /**
     * 父级id
     */
    @Schema(description = "父级id")
    private String parentid;



    /**
     * IP地址
     */
    @Schema(description = "IP地址")
    private String ipaddress;



    /**
     * 云台类型
     */
    @Schema(description = "云台类型")
    private Integer PTZType;


    private int type;


    /**
     * 在线/离线
     * 1在线,0离线
     * 默认在线
     * 信令:
     * <Status>ON</Status>
     * <Status>OFF</Status>
     * 遇到过NVR下的IPC下发信令可以推流， 但是 Status 响应 OFF
     */
    @Schema(description = "在线/离线， 1在线,0离线")
    private int status;

    /**
     * 经度
     */
    @Schema(description = "经度")
    private Double longitude;

    /**
     * 纬度
     */
    @Schema(description = "纬度")
    private Double latitude;



    /**
     * 子设备数
     */
    @Schema(description = "子设备数")
    private int subcount;

    /**
     * 流唯一编号，存在表示正在直播
     */
    @Schema(description = "流唯一编号，存在表示正在直播")
    private String  streamId;

    /**
     *  是否含有音频
     */
    @Schema(description = "是否含有音频")
    private boolean hasAudio;

    /**
     * 标记通道的类型，0->国标通道 1->直播流通道 2->业务分组/虚拟组织/行政区划
     */
    @Schema(description = "标记通道的类型，0->国标通道 1->直播流通道 2->业务分组/虚拟组织/行政区划")
    private int channelType;

    /**
     * 业务分组
     */
    @Schema(description = "业务分组")
    private String businessGroupId;

    /**
     * GPS的更新时间
     */
    @Schema(description = "GPS的更新时间")
    private String gpsTime;
    
    
    
}
