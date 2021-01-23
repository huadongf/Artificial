package com.itboyst.facedemo.entity;


import com.itboyst.facedemo.util.UserRamCache;
import lombok.Data;
@Data
public class UserCompareInfo extends UserRamCache.UserInfo {
    private Float similar;
}
