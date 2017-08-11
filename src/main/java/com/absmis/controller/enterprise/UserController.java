package com.absmis.controller.enterprise;

import com.absmis.domain.authority.User;
import com.absmis.service.authority.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*   */
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
}
