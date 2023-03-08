package com.example.aservice.configuration;

import com.example.aservice.Repo.RoleRepo;
import com.example.aservice.model.Role;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoleStartUp {
    private final RoleRepo roleRepo;

    public RoleStartUp(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }
    @PostConstruct
    public List<Role> save()
    {
        List<Role> roles = roleRepo.findAll();
        if(roles.isEmpty())
        {
            List<Role> roleList = new ArrayList<>();
            roleList.add(new Role("admin"));
            roleList.add(new Role("patient"));
            roleList.add(new Role("ambulance"));
            return roleRepo.saveAll(roleList);
        }
        return  null;
    }
}
