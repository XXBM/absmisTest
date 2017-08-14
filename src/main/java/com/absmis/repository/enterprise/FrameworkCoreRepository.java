package com.absmis.repository.enterprise;

import com.absmis.JpaRepository.MyRepository;
import com.absmis.domain.enterprise.FrameworkCore;
import org.springframework.stereotype.Repository;


@Repository
public interface FrameworkCoreRepository extends MyRepository<FrameworkCore, Long> {
}
