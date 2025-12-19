package com.Tanseeq.Tanseeq5.Repository;

import com.Tanseeq.Tanseeq5.model.Hypothesis;
import com.Tanseeq.Tanseeq5.model.Square;
import com.Tanseeq.Tanseeq5.model.WaterHypothesis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WaterHypothesisRepository  extends JpaRepository<WaterHypothesis, Long> , JpaSpecificationExecutor<WaterHypothesis> {

    @Query("select h from hypothesis where hypothesisType = 2")
List<Hypothesis> gellAllHypothesiswithhypothesistypequalwater();
    @Query("select s from Square s" +
    "Join s.Camp where  c.CompanyId=:Id ")
    List<Square> getAllSquareByCopmanyId(@Param("Id") long Companyid);

}
