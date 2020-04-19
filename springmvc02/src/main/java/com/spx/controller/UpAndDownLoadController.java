package com.spx.controller;

import com.sun.xml.internal.ws.api.message.Header;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * create by Shipeixin on 2020/4/19 11:51
 */
@Controller
public class UpAndDownLoadController {

    @RequestMapping("/upload")
    public String upload(@RequestParam("file")CommonsMultipartFile file, HttpSession session) throws IOException {
       /* System.out.println(file.getContentType());
        System.out.println(file.getOriginalFilename());  //  获取文件名
        System.out.println(file.getSize());
        System.out.println(file.getName());     //  获取文件属性名称*/


        System.out.println(file.getOriginalFilename()
        );
       //确定上传路径       上传的文件夹    /upload
       // ServletContext servletContext = session.getServletContext();

        //String realPath = servletContext.getRealPath("/upload");
        String realPath = "E:\\Spring&SpringMVC\\springmvc02\\src\\main\\webapp\\upload";
        
        //  变成程序当中的路径      工程名/upload
        File uploadPath = new File(realPath);
        if (!uploadPath.exists()){
            uploadPath.mkdirs();   //不存在则创建
        }

        // 确认最终路径  工程名/upload/文件名
        uploadPath = new File(uploadPath + "/"+file.getOriginalFilename());


        //上传
        file.transferTo(uploadPath);
        return "success";
    }


    @RequestMapping("/download/{filename:.+}")
    public ResponseEntity<byte[]> download(@PathVariable("filename")String filename,HttpSession session) throws IOException {

        String path = "E:\\Spring&SpringMVC\\springmvc02\\src\\main\\webapp\\upload\\"+filename;

        // 读取文件
        FileInputStream io = new FileInputStream(path);
        //  根据文件io的大小  创建一个byte数组
        byte[] body = new byte[io.available()];
       //  将文件内容读到byte数组中
        io.read(body);

        //  设置响应头
        HttpHeaders httpHeaders = new HttpHeaders();

        // 文件名为中文   进行转码
        filename = URLEncoder.encode(filename,"UTF-8");
        httpHeaders.add("Content-Disposition","attachment;filename="+filename);
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(body, httpHeaders, HttpStatus.OK);
        return responseEntity;

    }
}
