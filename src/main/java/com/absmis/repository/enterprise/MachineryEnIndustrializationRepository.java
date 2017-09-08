package com.absmis.repository.enterprise;

import com.absmis.JpaRepository.MyRepository;
import com.absmis.domain.enterprise.MachineryEnIndustrialization;
import org.springframework.stereotype.Repository;


@Repository
public interface MachineryEnIndustrializationRepository extends MyRepository<MachineryEnIndustrialization, Long> {
    MachineryEnIndustrialization getByMachineryEnIdAndYearAndQuarter(Long id,Integer year,Integer quarter);
    MachineryEnIndustrialization getByYearAndQuarter(Integer year,Integer quarter);

}
