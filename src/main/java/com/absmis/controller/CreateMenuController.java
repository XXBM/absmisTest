package com.absmis.controller;

import com.absmis.domain.authority.Resource;
import com.absmis.domain.authority.Role;
import com.absmis.domain.authority.RoleAssResource;
import com.absmis.domain.authority.User;
import com.absmis.service.authority.RoleService;
import com.absmis.service.authority.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuling on 2016/11/19.
 */
@RestController
public class CreateMenuController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public List<Resource> treelist() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User storedUser = userService.findByUsername(username);
        Role role = roleService.findOne(storedUser.getRole().getId());
        List<RoleAssResource> roleAssResources = role.getRoleAssResource();
        List<Resource> resources = new ArrayList<>();
        for (RoleAssResource roleAssResource : roleAssResources) {
           resources.add(roleAssResource.getResource());
        }
        return resources;
    }
}
