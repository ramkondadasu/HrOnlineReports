package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.HrworkPositiveHistoryVw;
import texas.dot.hronline.repositories.HrworkPositiveHistoryVwRepository;

@Service
public class HrworkPositiveHistoryVwServiceImpl implements HrworkPositiveHistoryVwService{
	
	private HrworkPositiveHistoryVwRepository HrworkPositiveHistoryVwRepository;

	@Autowired
	public HrworkPositiveHistoryVwServiceImpl(HrworkPositiveHistoryVwRepository HrworkPositiveHistoryVwRepository) {
		this.HrworkPositiveHistoryVwRepository = HrworkPositiveHistoryVwRepository;
	}

	@Override
	public List<HrworkPositiveHistoryVw> findAllRecords() {
		List<HrworkPositiveHistoryVw> HrworkPositiveHistoryVws = new ArrayList<>();
		HrworkPositiveHistoryVwRepository.findAllRecords().forEach(HrworkPositiveHistoryVws::add); // fun with Java 8																
		return HrworkPositiveHistoryVws;
	}
	
	@Override
	public List<HrworkPositiveHistoryVw> findBySsnNumber(String ssnNumber) {
		List<HrworkPositiveHistoryVw> HrworkPositiveHistoryVws = new ArrayList<>();
		HrworkPositiveHistoryVwRepository.findBySsnNumber(ssnNumber).forEach(HrworkPositiveHistoryVws::add); // fun with Java 8																
		return HrworkPositiveHistoryVws; 
	}

}




