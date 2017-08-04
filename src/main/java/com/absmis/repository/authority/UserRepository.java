package com.absmis.repository.authority;

import com.absmis.JpaRepository.MyRepository;
import com.absmis.domain.authority.User;
import org.springframework.stereotype.Repository;

/**
 * Created by xuling on 2016/10/11.
 */


@Repository
public interface UserRepository extends MyRepository<User, Integer> {
    User findByUsername(String username);
    User findById(Integer id);

}
