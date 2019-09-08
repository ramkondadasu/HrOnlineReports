package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsActnReasonTblVw;
import texas.dot.hronline.repositories.PsActnReasonTblVwRepository;

@Service
public class PsActnReasonTblVwServiceImpl implements PsActnReasonTblVwService{

	private PsActnReasonTblVwRepository psActnReasonTblVwRepository;

	@Autowired
	public PsActnReasonTblVwServiceImpl(PsActnReasonTblVwRepository psActnReasonTblVwRepository) {
		this.psActnReasonTblVwRepository = psActnReasonTblVwRepository;
	}

	@Override
	public List<PsActnReasonTblVw> findAllRecords() {
		List<PsActnReasonTblVw> psActnReasonTblVws = new ArrayList<>();
		psActnReasonTblVwRepository.findAllRecords().forEach(psActnReasonTblVws::add); // fun with Java 8																
		return psActnReasonTblVws;
	}
	
	
	
}
