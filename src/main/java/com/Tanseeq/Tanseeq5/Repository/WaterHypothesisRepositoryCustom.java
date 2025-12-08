// repository/custom/WaterHypothesisRepositoryCustom.java
package com.Tanseeq.Tanseeq5.Repository;

import com.Tanseeq.Tanseeq5.Filters.*;
import com.Tanseeq.Tanseeq5.dto.BaseDropDownDto;
import com.Tanseeq.Tanseeq5.dto.NoteSubTypeCountModel;
import com.Tanseeq.Tanseeq5.dto.PaginatedResult;
import com.Tanseeq.Tanseeq5.model.Hypothesis;
import com.Tanseeq.Tanseeq5.model.WaterHypothesis;
import com.Tanseeq.Tanseeq5.model.WaterNote;
import java.util.List;
import java.util.Optional;

public interface WaterHypothesisRepositoryCustom {

    List<BaseDropDownDto> getAllCamps();

    List<BaseDropDownDto> getAllZones();

    List<BaseDropDownDto> getAllSquares();

    List<BaseDropDownDto> getAllPhasesHypothesis();

    List<BaseDropDownDto> getAllSquaresByCompanyId();

    List<BaseDropDownDto> getAllCampsByCompanyId(CampFilterDto filter);

    PaginatedResult<CompanyWithCompletionRateModel> getAllCompanyWithCompletionRate(CompanyHypothesisFilterDto filter);

    PaginatedResult<CompanyWithCompletionRateModel> getAllCompanyWithCompletionRateWithoutHypothesis(CompanyHypothesisFilterDto filter);

    StatisticsWaterHypothesisTotalNumberModel getAllStatisticsTotalNumber(StatisticsFilterDto filter);

    WaterHypothesisStatisticsResponseModel getWaterHypothesisStatsPerZone(StatisticsFilterWithHypotheisDto dto);

    List<PercentageOfHypothesisWithAndWithoutNotes> getAllPercentageOfHypothesisWithAndWithoutNotes(StatisticsFilterDto filter);

    List<PercentageOfHypothesisWithNotesOnly> getAllPercentageOfHypothesisWithNotesOnly(StatisticsFilterDto filter);

    List<NoteSubTypeCountModel> getNoteSubTypeCounts(StatisticsFilterDto filter);

    List<ObservedNotes> getAllObservedNotes(StatisticsFilterDto filter);

    WaterHypothesis getWaterHypothesisModelById(Long id);

    Optional<WaterHypothesis> getWaterHypothesisById(Long id);

    Optional<Hypothesis> findMatchingGeneralHypothesis(); // adapt return type

    String getRevisionByNoteId(Long noteId);

    Optional<WaterNote> getNoteById(Long noteId);

    void addHypothesis(WaterHypothesis hypothesis);

    void updateNoteRevision(WaterNote note);

    void updateWaterHypothesisRevision(WaterHypothesis waterHypothesis);

    // ... add other methods necessary
}
