package com.shytong.modules.mgr.dao;

import com.shytong.common.model.SyMap;

/**
 * @Author: CL
 * @Date: 2019/11/29 22:26
 */
public interface IMgrDao {

    /**
     * 用户登录
     *
     * @param params
     * @return
     */
    Integer login(SyMap params);
}