package com.zhihu.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.*;

/**
 * @author Ontheway
 * @Date 2019/4/5
 **/
@CrossOrigin
@Controller
@RequestMapping("/upload")
@ResponseBody
@PropertySource("classpath:custom/config.properties")
public class Uploader {

    private Logger logger = LoggerFactory.getLogger(Uploader.class);

    // 文件夹类型
    private String dirType;

    // 个人主文件夹, 用户登录时进行初始化
    private static  String personalHomeDir = "/zhihu";

    // 静态服务在磁盘的路径
    @Value("staticServerDiskPath")
    private String staticServerDiskPath = "E:\\phpfind\\WWW";

    // 静态服务地址
    @Value("staticServerPath")
    private String staticServerPath = "http://127.0.0.1:80";


    @RequestMapping(value = "/video", method = RequestMethod.POST)
    public Map<String, Object> uploadVideo(MultipartFile file){
        System.out.println("upload video ...");
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getName());
        System.out.println(file.getSize());
        dirType = "/uploadVideo";
        List<String> allowExt = Arrays.asList("avi","mov","rmvb","rm","flv","mp4","3gp");
        return upload(file, allowExt);
    }

    @RequestMapping(value = "/image", method =  RequestMethod.POST)
    public Map<String, Object> uploadImage(MultipartFile file){
        System.out.println("upload image ...");
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getName());
        System.out.println(file.getSize());
        //BMP：Windows 位图
        //PCX：PC 画笔
        //PNG：可移植网络图形
        //JPEG：联合摄影专家组
        //GIF：图形交换格式
        //TIFF：标记图像文件格式
        dirType = "/uploadImage";
        List<String> allowExt = Arrays.asList("jpg","bmp","pcx","png","jpeg","gif","tiff");
        return upload(file, allowExt);
    }

    public Map<String, Object> upload(MultipartFile file,List<String> allowExt){
        Map<String, Object> data = new HashMap<>();
        try {
            // 获取文件原始名称
            String originName = file.getOriginalFilename();

            // 获取文件后缀名
            String suffix = originName.substring(originName.lastIndexOf(".") + 1);

            if(allowExt.contains(suffix)){
                System.out.println("E:\\phpfind\\WWW" + personalHomeDir + dirType + "/" + originName);
                file.transferTo(new File("E:\\phpfind\\WWW" + personalHomeDir + dirType + "/" + originName));
                data.put("code", 200);// UEDITOR的规则:不为SUCCESS则显示state的内容
                data.put("url","http://127.0.0.1:80" + personalHomeDir + dirType + "/" + originName);         //能访问到你现在图片的路径
                data.put("title", originName);
                data.put("original", originName);

                return data;
            }

            data.put("code", 300);// UEDITOR的规则:不为SUCCESS则显示state的内容
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage(),e);
            data.put("code",400); //在此处写上错误提示信息，这样当错误的时候就会显示此信息
        }
        data.put("url","");         //能访问到你现在图片的路径
        data.put("title", "");
        data.put("original", "");
        return data;
    }

}