package vip.zdd.ums.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.zdd.ums.mapper.AdminMapper;
import vip.zdd.ums.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminMapper adminMapper;

    @Autowired
    public AdminServiceImpl(AdminMapper adminMapper){
        this.adminMapper = adminMapper;
    }
}
