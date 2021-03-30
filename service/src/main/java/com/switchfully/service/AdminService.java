package com.switchfully.service;

import com.switchfully.repository.AdminRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public boolean isAdmin(String id){
        return adminRepository.isAdmin(id);
    }
}
