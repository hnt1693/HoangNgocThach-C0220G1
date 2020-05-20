package com.fil.services;

import com.fil.models.Admin;

import java.util.concurrent.atomic.AtomicBoolean;

public interface AdminsService {
boolean login(String name, String password);
void addAdmin(Admin admin);
void remove(String name);
}
