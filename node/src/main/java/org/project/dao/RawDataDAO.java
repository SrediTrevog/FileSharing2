package org.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.project.entity.RawData;

public interface RawDataDAO extends JpaRepository<RawData, Long> {
}
