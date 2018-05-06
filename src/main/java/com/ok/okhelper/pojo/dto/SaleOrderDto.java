package com.ok.okhelper.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Author: zc
 * Date: 2018/4/23
 * Description:
 */
@Data
public class SaleOrderDto {

    //    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "开始时间")
    private Date startDate;

    //    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "结束时间")
    private Date endDate;

    @ApiModelProperty(value = "查询范围(当指定这个值时另外两个值失效)&&(今天->today 三天内->threeDays 一周内->week 近30天->month)")
    private String range = "";

}
