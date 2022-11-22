package com.ruoyi.common.utils;

import org.junit.jupiter.api.Test;

class SecurityUtilsTest {

    @Test
    void encryptPassword() {
        String password = SecurityUtils.encryptPassword("");
        System.out.println(password);
    }
}
