package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsXLr01DaCaseMvw;
import texas.dot.hronline.repositories.PsXLr01DaCaseMvwRepository;

@Service
public class PsXLr01DaCaseMvwServiceImpl implements PsXLr01DaCaseMvwService{

	private PsXLr01DaCaseMvwRepository psXLr01DaCaseMvwRepository;

	@Autowired
	public PsXLr01DaCaseMvwServiceImpl(PsXLr01DaCaseMvwRepository psActnReasonTblVwRepository) {
		this.psXLr01DaCaseMvwRepository = psActnReasonTblVwRepository;
	}

	@Override
	public List<PsXLr01DaCaseMvw> findAllRecords() { 
		List<PsXLr01DaCaseMvw> psXLr01DaCaseMvws = new ArrayList<>();
		psXLr01DaCaseMvwRepository.findAllRecords().forEach(psXLr01DaCaseMvws::add); // fun with Java 8		
		psXLr01DaCaseMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psXLr01DaCaseMvws;
	}

	@Override
	public List<PsXLr01DaCaseMvw> findByEmplid(@Param("rep13employeeid") String empid) {
		List<PsXLr01DaCaseMvw> psXLr01DaCaseMvws = new ArrayList<>();
		psXLr01DaCaseMvwRepository.findByEmplid(empid).forEach(psXLr01DaCaseMvws::add); // fun with Java 8		
		psXLr01DaCaseMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psXLr01DaCaseMvws; 
	}
	
	
	
}

