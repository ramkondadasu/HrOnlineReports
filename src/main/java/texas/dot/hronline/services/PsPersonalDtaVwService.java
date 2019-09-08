package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsPersonalDtaVw;

public interface PsPersonalDtaVwService {
	List<PsPersonalDtaVw> findBySearchFN(@Param("searchTerm") String searchTerm);
	List<PsPersonalDtaVw> findBySearchLN(@Param("searchTerm") String searchTerm);
	List<PsPersonalDtaVw> findBySearchFull(@Param("searchTerm") String searchTerm,@Param("searchTerm1") String searchTerm1);
	List<PsPersonalDtaVw> findBySearchFullName(@Param("searchTerm") String searchTerm);
}
