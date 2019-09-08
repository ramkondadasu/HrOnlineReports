package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsXDaLetterVw;
import texas.dot.hronline.repositories.PsXDaLetterVwRepository;

@Service
public class PsXDaLetterVwServiceImpl implements PsXDaLetterVwService{

	private PsXDaLetterVwRepository psXDaLetterVwRepository;

	@Autowired
	public PsXDaLetterVwServiceImpl(PsXDaLetterVwRepository psXDaLetterVwRepository) {
		this.psXDaLetterVwRepository = psXDaLetterVwRepository;
	}

	@Override
	public List<PsXDaLetterVw> findAllRecords() {
		List<PsXDaLetterVw> psXDaLetterVws = new ArrayList<>();
		psXDaLetterVwRepository.findAllRecords().forEach(psXDaLetterVws::add); // fun with Java 8	
		psXDaLetterVws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psXDaLetterVws;
	}
	@Override
	public List<PsXDaLetterVw> findByEmplid(String empid) {
		List<PsXDaLetterVw> psXDaLetterVws = new ArrayList<>();
		psXDaLetterVwRepository.findByEmplid(empid).forEach(psXDaLetterVws::add); // fun with Java 8	
		psXDaLetterVws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psXDaLetterVws; 
	}
}

