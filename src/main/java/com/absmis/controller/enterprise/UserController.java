package com.absmis.controller.enterprise;

import com.absmis.domain.authority.User;
import com.absmis.domain.message.Result;
import com.absmis.service.authority.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*用户*/
@RestController
public class UserController {
    @Autowired
    UserService userService;
    //重置密码
    @RequestMapping(value = "/resetPsd", method = RequestMethod.POST)
    public User resetPsd(@RequestParam Long id)throws Exception {
        User user = userService.findById(id);
        user.setPassword(user.getUsername());
        userService.update(user);
        return user;
    }

    //用户修改密码
    @RequestMapping(value = "/changePsd", method = RequestMethod.POST)
    public Result changePsd(@RequestParam(value = "oldPassword") String oldPassword,
                            @RequestParam(value = "newPassword") String newPassword)throws Exception {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User storedUser = userService.findByUsername(username);
        Result result = new Result();
        if(oldPassword.equals(storedUser.getPassword())){
            storedUser.setPassword(newPassword);
            userService.update(storedUser);
            result.setMsg("密码修改成功！");
        }else{
            result.setMsg("原密码错误！");
        }
        return result;
    }
}
