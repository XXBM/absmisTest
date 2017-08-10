package com.absmis.repository.enterprise;

import com.absmis.JpaRepository.MyRepository;
import com.absmis.domain.enterprise.Framework;
import org.springframework.stereotype.Repository;


@Repository
public interface FrameworkRepository extends MyRepository<Framework, Long> {
}
