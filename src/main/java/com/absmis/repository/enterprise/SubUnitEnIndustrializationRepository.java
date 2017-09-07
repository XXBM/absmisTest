package com.absmis.repository.enterprise;

import com.absmis.JpaRepository.MyRepository;
import com.absmis.domain.enterprise.SubUnitEnIndustrialization;
import org.springframework.stereotype.Repository;


@Repository
public interface SubUnitEnIndustrializationRepository extends MyRepository<SubUnitEnIndustrialization, Long> {
    SubUnitEnIndustrialization getBySubUnitEnIdAndYearAndQuarter(Long id, Integer year, Integer quarter);
}
