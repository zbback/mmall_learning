package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2019/5/20.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
