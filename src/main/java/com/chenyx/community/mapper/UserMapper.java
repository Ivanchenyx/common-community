package com.chenyx.community.mapper;

import com.chenyx.community.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Project: common-community
 * @Package: com.chenyx.community.mapper
 * @Author: chenyanxi
 * @Version: 1.0
 * @Description:
 */
@SuppressWarnings("all")
@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    /**
     *
     * @param user
     * @return 0-fail; 1-success
     */
    boolean addUser(User user);

    /**
     *
     * @param id
     * @param status
     * @return 0-fail; 1-success
     */
    boolean updateStatus(int id, int status);

    /**
     * 更新头像
     * @param id
     * @param headUrl
     * @return 0-fail; 1-success
     */
    boolean updateHeaderUrl(int id, String headUrl);

    /**
     *
     * @param id
     * @param password
     * @return 0-fail; 1-success
     */
    boolean updatePassword(int id, String password);
}
