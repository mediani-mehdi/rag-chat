package com.medev.ragchat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class ErrorResponse {

    private String message;
    private String status;
    private String path;
    private String error;
    private LocalDateTime timestamp;


}
