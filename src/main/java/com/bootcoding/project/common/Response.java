package com.bootcoding.project.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private String message;
    @Builder.Default
    @JsonIgnore
    private int status = 200;
    private Object data;
}
