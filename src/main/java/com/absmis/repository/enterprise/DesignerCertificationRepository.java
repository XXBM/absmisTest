package com.absmis.repository.enterprise;

import com.absmis.JpaRepository.MyRepository;
import com.absmis.domain.enterprise.DesignerCertification;
import org.springframework.stereotype.Repository;


@Repository
public interface DesignerCertificationRepository extends MyRepository<DesignerCertification, Long> {
}
