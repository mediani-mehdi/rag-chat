package com.medev.ragchat.config;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UploadProperties {

    private String uploadDir;
    private String allowedExtensions;
    private String maxSize;
}
