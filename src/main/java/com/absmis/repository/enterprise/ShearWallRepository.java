package com.absmis.repository.enterprise;

import com.absmis.JpaRepository.MyRepository;
import com.absmis.domain.enterprise.ShearWall;
import org.springframework.stereotype.Repository;


@Repository
public interface ShearWallRepository extends MyRepository<ShearWall, Long> {
}
