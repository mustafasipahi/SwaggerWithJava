package com.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "First Entity Value", description = "First Entity Description")
public class Task {

    @ApiModelProperty(value = "Task Id")
    private Long id;

    @ApiModelProperty(value = "Task Name")
    private String name;

    @ApiModelProperty(value = "Task Create Date")
    private Date createDate;
}
