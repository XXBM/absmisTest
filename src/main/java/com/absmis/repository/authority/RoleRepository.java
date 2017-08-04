package com.absmis.repository.authority;

import com.absmis.JpaRepository.MyRepository;
import com.absmis.domain.authority.Role;
import org.springframework.stereotype.Repository;


/**
 * Created by dell on 2016/10/16.
 */

@Repository
public interface RoleRepository extends MyRepository<Role,Integer> {

}
