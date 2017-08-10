package com.absmis.repository.enterprise;

import com.absmis.JpaRepository.MyRepository;
import com.absmis.domain.enterprise.RealEstateEnCertification;
import org.springframework.stereotype.Repository;


@Repository
public interface RealEstateEnCertificationRepository extends MyRepository<RealEstateEnCertification, Long> {
}
