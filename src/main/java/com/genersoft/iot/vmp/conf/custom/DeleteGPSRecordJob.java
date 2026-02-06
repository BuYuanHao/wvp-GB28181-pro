package com.genersoft.iot.vmp.conf.custom;


import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import com.genersoft.iot.vmp.gb28181.dao.DeviceMobilePositionMapper;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


import java.util.Date;


/**
 * @author: byh
 * @create: 2023/2/9
 * @Description: 定时删除gps数据
 * @ClassName: DeleteGPSRecordJob
 */
@Component("deleteGPSRecordJob")
public class DeleteGPSRecordJob {
    protected final Logger logger = LoggerFactory.getLogger(DeleteGPSRecordJob.class);


    @Resource
    private DeviceMobilePositionMapper deviceMobilePositionMapper;


    public void execute()  {
        Date date = new Date();
        logger.info("批量删除gps信息，执行时间{}",date);
        deleteRecorder(date);

    }



    //记录仪 保留14天
    public void deleteRecorder(Date date){
        DateTime dateTime = DateUtil.offsetDay(date, -14);
        DateTime dateTimeEnd= DateUtil.beginOfDay(dateTime);
        int i = deviceMobilePositionMapper.deleteByTimeLessThanOrEqualTo(DateUtil.format(dateTimeEnd, DateUtil.newSimpleFormat("yyyy-MM-dd'T'HH:mm:ss")));
        logger.debug("批量删除gps信息，删除{}条数据",i);
    }
}
