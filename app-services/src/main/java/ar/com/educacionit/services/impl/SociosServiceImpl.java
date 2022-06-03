package ar.com.educacionit.services.impl;

import ar.com.educacionit.daos.impl.SocioDaoMysqlImpl;
import ar.com.educacionit.domain.Socio;
import ar.com.educacionit.services.SociosService;

public class SociosServiceImpl extends AbstractBaseService<Socio> implements SociosService {

	public SociosServiceImpl() {
		super(new SocioDaoMysqlImpl());
	}
}
