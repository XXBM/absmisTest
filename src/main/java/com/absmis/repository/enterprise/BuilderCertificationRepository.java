package com.absmis.repository.enterprise;

import com.absmis.JpaRepository.MyRepository;
import com.absmis.domain.enterprise.BuilderCertification;
import org.springframework.stereotype.Repository;


@Repository
public interface BuilderCertificationRepository extends MyRepository<BuilderCertification, Long> {
}
