package com.whkj.project.controller;

import com.github.pagehelper.PageInfo;
import com.whkj.project.entity.User;
import com.whkj.project.service.UserService;
import com.whkj.project.utils.ExcelUtil;
import com.whkj.project.utils.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping(value = "/User/Api")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查询用户分页附带模糊查询接口
     * @param user
     * @param pageInfo
     * @return
     */
    @GetMapping(value = "/findUserPage")
    public RestResult findUserPage(User user, PageInfo pageInfo){
        return RestResult.ok(userService.findUserPage(user,pageInfo));

    }

    @PostMapping(value = "Excelexport")
    public RestResult Excelexport(){
        User user = userService.selectByPrimaryKey("1", "1");


        ExcelUtil.importDataFromExcel(user,"","你好文件");
        return RestResult.ok();
    }

}
