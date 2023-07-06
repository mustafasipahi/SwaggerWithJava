package com.swagger.model;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Nullable
    private Long id;

    @Size(min = 0, max = 20)
    private String name;

    @NotNull
    private Date createDate;
}
