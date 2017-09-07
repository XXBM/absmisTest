package com.absmis.repository.enterprise;

import com.absmis.JpaRepository.MyRepository;
import com.absmis.domain.enterprise.ComponentEnIndustrialization;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ComponentEnIndustrializationRepository extends MyRepository<ComponentEnIndustrialization, Long> {
    List<ComponentEnIndustrialization> findByComponentEnId(Long id);
    ComponentEnIndustrialization getByComponentEnIdAndYearAndQuarter(Long id, Integer year, Integer quarter);
}
