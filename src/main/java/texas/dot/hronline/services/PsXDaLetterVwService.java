package texas.dot.hronline.services;

import java.util.List;

import texas.dot.hronline.domain.PsXDaLetterVw;

public interface PsXDaLetterVwService {
	List<PsXDaLetterVw> findAllRecords();
	List<PsXDaLetterVw> findByEmplid(String empid);


}
