package com.absmis.repository.enterprise;

import com.absmis.JpaRepository.MyRepository;
import com.absmis.domain.enterprise.UnitEngineering;
import org.springframework.stereotype.Repository;


@Repository
public interface UnitEngineeringRepository extends MyRepository<UnitEngineering, Long> {
}
