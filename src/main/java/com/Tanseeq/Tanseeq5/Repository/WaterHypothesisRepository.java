package com.Tanseeq.Tanseeq5.Repository;

import com.Tanseeq.Tanseeq5.model.WaterHypothesis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaterHypothesisRepository  extends JpaRepository<WaterHypothesis, Long> {
}
