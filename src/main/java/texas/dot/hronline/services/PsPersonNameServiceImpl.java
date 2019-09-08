package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsPersonName;
import texas.dot.hronline.domain.PsXTrnhistMvw;
import texas.dot.hronline.repositories.PsPersonNameRepository;

@Service
public class PsPersonNameServiceImpl implements PsPersonNameService{

	private PsPersonNameRepository psPersonNameRepository;

	@Autowired
	public PsPersonNameServiceImpl(PsPersonNameRepository psPersonNameRepository) {
		this.psPersonNameRepository = psPersonNameRepository;
	}

	@Override
	public List<PsPersonName> findAllRecords() {
		List<PsPersonName> psPersonNames = new ArrayList<>();
		psPersonNameRepository.findAllRecords().forEach(psPersonNames::add); // fun with Java 8																
		return psPersonNames;
	}
	@Override
	public List<PsPersonName> findByEmplid(String empid) {
		List<PsPersonName> psPersonNames = new ArrayList<>();
		psPersonNameRepository.findByEmplid(empid).forEach(psPersonNames::add); // fun with Java 8																
		return psPersonNames; 
	}
}
