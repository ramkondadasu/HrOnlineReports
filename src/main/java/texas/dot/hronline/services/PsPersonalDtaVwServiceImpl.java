package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsPersonalDtaVw;
import texas.dot.hronline.repositories.PsPersonalDtaVwRepository;

@Service
public class PsPersonalDtaVwServiceImpl implements PsPersonalDtaVwService{
	private PsPersonalDtaVwRepository psPersonalDtaVwRepository;

	@Autowired
	public PsPersonalDtaVwServiceImpl(PsPersonalDtaVwRepository psPersonalDtaVwRepository) {
		this.psPersonalDtaVwRepository = psPersonalDtaVwRepository;
	}

	@Override
	public List<PsPersonalDtaVw> findBySearchFN(@Param("searchTerm") String searchTerm) {
		List<PsPersonalDtaVw> psPersonalDtaVws = new ArrayList<>();
		psPersonalDtaVwRepository.findBySearchFN(searchTerm).forEach(psPersonalDtaVws::add); // fun with Java 8		
		psPersonalDtaVws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psPersonalDtaVws;
	}
	@Override
	public List<PsPersonalDtaVw> findBySearchLN(@Param("searchTerm") String searchTerm) {
		List<PsPersonalDtaVw> psPersonalDtaVws = new ArrayList<>();
		psPersonalDtaVwRepository.findBySearchLN(searchTerm).forEach(psPersonalDtaVws::add); // fun with Java 8					
		psPersonalDtaVws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psPersonalDtaVws;
	}
	@Override
	public List<PsPersonalDtaVw> findBySearchFull(@Param("searchTerm") String searchTerm,@Param("searchTerm1") String searchTerm1) {
		List<PsPersonalDtaVw> psPersonalDtaVws = new ArrayList<>();
		psPersonalDtaVwRepository.findBySearchFull(searchTerm,searchTerm1).forEach(psPersonalDtaVws::add); // fun with Java 8
		psPersonalDtaVws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psPersonalDtaVws;
	}
	@Override
	public List<PsPersonalDtaVw> findBySearchFullName(@Param("searchTerm") String searchTerm) {
		List<PsPersonalDtaVw> psPersonalDtaVws = new ArrayList<>();
		psPersonalDtaVwRepository.findBySearchFullName(searchTerm).forEach(psPersonalDtaVws::add); // fun with Java 8			
		psPersonalDtaVws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psPersonalDtaVws;
	}
	
	
}
