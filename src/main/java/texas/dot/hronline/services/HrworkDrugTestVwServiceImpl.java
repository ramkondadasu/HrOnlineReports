package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.HrworkDrugTestVw;
import texas.dot.hronline.repositories.HrworkDrugTestVwRepository;

@Service
public class HrworkDrugTestVwServiceImpl implements HrworkDrugTestVwService{
	
	private HrworkDrugTestVwRepository HrworkDrugTestVwRepository;

	@Autowired
	public HrworkDrugTestVwServiceImpl(HrworkDrugTestVwRepository HrworkDrugTestVwRepository) {
		this.HrworkDrugTestVwRepository = HrworkDrugTestVwRepository;
	}

	@Override
	public List<HrworkDrugTestVw> findAllRecords() {
		List<HrworkDrugTestVw> HrworkDrugTestVws = new ArrayList<>();
		HrworkDrugTestVwRepository.findAllRecords().forEach(HrworkDrugTestVws::add); // fun with Java 8																
		return HrworkDrugTestVws;
	}
	
	@Override
	public List<HrworkDrugTestVw> findBySsnNumber(@Param("ssnNumber") String ssnNumber) {
		List<HrworkDrugTestVw> HrworkDrugTestVws = new ArrayList<>();
		HrworkDrugTestVwRepository.findBySsnNumber(ssnNumber).forEach(HrworkDrugTestVws::add); // fun with Java 8																
		return HrworkDrugTestVws; 
	}

}


