package com.switchfully.repository;

import com.switchfully.model.employee.Admin;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Repository
public class AdminRepository {

    private final Set<Admin> admins = new HashSet<>();

    public AdminRepository() {
        init();
    }

    private void init(){
        admins.add(new Admin(UUID.fromString("5e03adec-6d19-44a2-92b1-a16f9010dd53"),"admin@order.be"));
    }

    public boolean isAdmin(String id){
        return admins.stream().anyMatch(admin -> admin.getId().toString().equals(id));
    }
}
