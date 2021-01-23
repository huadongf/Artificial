package com.itboyst.facedemo.util;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class UserRamCache {

    private static final ConcurrentHashMap<String, UserInfo> userInfoMap = new ConcurrentHashMap<>();

    public static void addUser(UserInfo userInfo) {
        userInfoMap.put(userInfo.getFaceId(), userInfo);
    }

    public static void removeUser(String faceId) {
        userInfoMap.remove(faceId);
    }

    public static List<UserInfo> getUserList() {
        List<UserInfo> userInfoList = Lists.newLinkedList();
        userInfoList.addAll(userInfoMap.values());
        return userInfoList;
    }


    @Data
    public static class UserInfo {

        private String faceId;
        private String name;
        private byte[] faceFeature;

    }
}
