package com.Tanseeq.Tanseeq5.Repository;

import com.Tanseeq.Tanseeq5.Filters.*;
import com.Tanseeq.Tanseeq5.dto.BaseDropDownDto;
import com.Tanseeq.Tanseeq5.dto.NoteSubTypeCountModel;
import com.Tanseeq.Tanseeq5.dto.PaginatedResult;
import com.Tanseeq.Tanseeq5.model.Company;
import com.Tanseeq.Tanseeq5.model.Hypothesis;
import com.Tanseeq.Tanseeq5.model.WaterHypothesis;
import com.Tanseeq.Tanseeq5.model.WaterNote;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
@Repository
@Transactional
public class WaterHypothesisRepositoryImpl implements WaterHypothesisRepositoryCustom{
   @PersistenceContext
   private EntityManager entityManager;
    @Override
    public List<BaseDropDownDto> getAllCamps() {
        return List.of();
    }

    @Override
    public List<BaseDropDownDto> getAllZones() {
        return List.of();
    }

    @Override
    public List<BaseDropDownDto> getAllSquares() {
        return List.of();
    }

    @Override
    public List<BaseDropDownDto> getAllPhasesHypothesis() {
        return List.of();
    }

    @Override
    public List<BaseDropDownDto> getAllSquaresByCompanyId() {
    Long companyId = 1L;
        // Step 1: Get distinct square IDs from camps owned by this company
        List<Long> squareIds = entityManager.createQuery("""
                SELECT DISTINCT c.square.id
                FROM Camp c
                WHERE c.isDeleted <> true
                  AND c.company.id = :companyId
                """, Long.class)
                .setParameter("companyId", companyId)
                .getResultList();

        if (squareIds.isEmpty()) {
            return Collections.emptyList();
        }

        // Step 2: Fetch squares and map to dropdown DTO
        return entityManager.createQuery("""
                SELECT new com.tanseeq.tanseeq5.dto.BaseDropDownDto(
                    s.id,
                    s.name
                )
                FROM Square s
                WHERE s.isDeleted <> true
                  AND s.id IN :squareIds
                """, BaseDropDownDto.class)
                .setParameter("squareIds", squareIds)
                .getResultList();
    }

    @Override
    public List<BaseDropDownDto> getAllCampsByCompanyId(CampFilterDto filter) {
        long companyId = 1L;
        StringBuilder jpql = new StringBuilder("""
                SELECT new com.tanseeq.tanseeq5.dto.BaseDropDownDto(c.id , c.name)
                From Camp c 
                WHERE c.isDeleted <> true AND c.company.id = :companyId
                """);
        if(filter.getZoneId()!= null && filter.getZoneId()>0)
            jpql.append("AND c.zone.id = :zoneId");
        if (filter.getSquareId()!= null && filter.getSquareId() > 0)
            jpql.append("AND c.square.id = :squareId");

        TypedQuery<BaseDropDownDto> query = entityManager.createQuery(jpql.toString() , BaseDropDownDto.class)
                .setParameter("companyId" , companyId);
        if (filter.getZoneId() != null && filter.getZoneId() > 0) {
            query.setParameter("zoneId", filter.getZoneId());
        }

        if (filter.getSquareId() != null && filter.getSquareId() > 0) {
            query.setParameter("squareId", filter.getSquareId());
        }

        return query.getResultList();
    }

    @Override
    public PaginatedResult<CompanyWithCompletionRateModel> getAllCompanyWithCompletionRate(CompanyHypothesisFilterDto filter) {
         StringBuilder jpql = new StringBuilder("""
                 SELECT c Company 
                 FROM Company c 
                 JOIN c.Camp ca
                 JOIN ca.WaterHypothesis W
                 JOIN w.Notes
                 """);
         if(filter.getZoneId() != null && filter.getZoneId()>0)
             jpql.append("""
                     WHERE C.camp exsist(
                     """)
    }

    @Override
    public PaginatedResult<CompanyWithCompletionRateModel> getAllCompanyWithCompletionRateWithoutHypothesis(CompanyHypothesisFilterDto filter) {
        return null;
    }

    @Override
    public StatisticsWaterHypothesisTotalNumberModel getAllStatisticsTotalNumber(StatisticsFilterDto filter) {
        return null;
    }

    @Override
    public WaterHypothesisStatisticsResponseModel getWaterHypothesisStatsPerZone(StatisticsFilterWithHypotheisDto dto) {
        return null;
    }

    @Override
    public List<PercentageOfHypothesisWithAndWithoutNotes> getAllPercentageOfHypothesisWithAndWithoutNotes(StatisticsFilterDto filter) {
        return List.of();
    }

    @Override
    public List<PercentageOfHypothesisWithNotesOnly> getAllPercentageOfHypothesisWithNotesOnly(StatisticsFilterDto filter) {
        return List.of();
    }

    @Override
    public List<NoteSubTypeCountModel> getNoteSubTypeCounts(StatisticsFilterDto filter) {
        return List.of();
    }

    @Override
    public List<ObservedNotes> getAllObservedNotes(StatisticsFilterDto filter) {
        return List.of();
    }

    @Override
    public WaterHypothesis getWaterHypothesisModelById(Long id) {
        return null;
    }

    @Override
    public Optional<WaterHypothesis> getWaterHypothesisById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Hypothesis> findMatchingGeneralHypothesis() {
        return Optional.empty();
    }

    @Override
    public String getRevisionByNoteId(Long noteId) {
        return "";
    }

    @Override
    public Optional<WaterNote> getNoteById(Long noteId) {
        return Optional.empty();
    }

    @Override
    public void addHypothesis(WaterHypothesis hypothesis) {

    }

    @Override
    public void updateNoteRevision(WaterNote note) {

    }

    @Override
    public void updateWaterHypothesisRevision(WaterHypothesis waterHypothesis) {

    }
}
