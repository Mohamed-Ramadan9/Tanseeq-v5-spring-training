package com.Tanseeq.Tanseeq5.CustomSpecification;

import com.Tanseeq.Tanseeq5.Filters.CompanyHypothesisFilterDto;
import com.Tanseeq.Tanseeq5.model.Company;
import com.Tanseeq.Tanseeq5.model.WaterHypothesis;
import jakarta.persistence.criteria.*;
import org.jspecify.annotations.Nullable;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class WaterHypothesisSpecification implements Specification<WaterHypothesis> {

    @Override
    public @Nullable Predicate toPredicate(Root<WaterHypothesis> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return null;
    }

    public static  Specification<Company> withFilter(CompanyHypothesisFilterDto filter)
    {
        return (root, query, criteriaBuilder) ->
        {
            root.join("camp" , JoinType.LEFT)
                    .join("waterHypothesis")
                    .join("notes");
            query.distinct(true);
         List<Predicate> predicates = new ArrayList<>()   ;
         if(filter.getHypothesisId() !=null)
             predicates.add(criteriaBuilder.equal(root.join("camp").get("waterhypothesis") ,filter.getHypothesisId()));
         if(filter.getZoneId() != null)
             predicates.add(criteriaBuilder.equal( root.join("camp").get("zoneId") , filter.getZoneId()));
         return  criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
