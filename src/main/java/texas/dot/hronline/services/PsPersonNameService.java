package texas.dot.hronline.services;

import java.util.List;

import texas.dot.hronline.domain.PsPersonName;
import texas.dot.hronline.domain.PsXTrnhistMvw;

public interface PsPersonNameService {
	List<PsPersonName> findAllRecords();
	List<PsPersonName> findByEmplid(String empid);

}
