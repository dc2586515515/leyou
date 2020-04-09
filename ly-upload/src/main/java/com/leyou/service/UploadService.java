package com.leyou.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Description
 * @Author DC
 * @Date 2020-04-09
 */
public interface UploadService {
    public String upload(MultipartFile file);
}
