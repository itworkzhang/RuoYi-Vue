package com.ruoyi.common.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecurityUtilsTest {

    @Test
    void encryptPassword() {
        String password = SecurityUtils.encryptPassword("");
        System.out.println(password);
    }
}
