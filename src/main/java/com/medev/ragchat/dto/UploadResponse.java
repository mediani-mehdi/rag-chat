package com.medev.ragchat.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UploadResponse {

    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;
}
