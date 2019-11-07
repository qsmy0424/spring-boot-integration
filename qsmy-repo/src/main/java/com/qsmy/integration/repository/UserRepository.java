package com.qsmy.integration.repository;

import com.qsmy.integration.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qsmy
 * @date 2019/11/5
 */
public interface UserRepository extends JpaRepository<User, String> {
}
