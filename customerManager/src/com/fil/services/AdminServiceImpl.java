package com.fil.services;

import com.fil.models.Admin;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class AdminServiceImpl implements AdminsService {
    private static ArrayList<Admin> admins = new ArrayList<>();

    static {
        admins.add(new Admin("admin", "admin"));
    }

    @Override
    public boolean login(String name, String password) {
        boolean isExist = false;
        for (Admin item : admins) {
            if (item.getName().equals(name) && item.getPassword().equals(password)) {
                isExist = true;
                break;
            }

        }
        return isExist;
    }

    @Override
    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    @Override
    public void remove(String name) {
        for (Admin admin :
                admins) {
            if (admin.getName().equals(name)) {
                admins.remove(admin);
            }
        }
    }
}
