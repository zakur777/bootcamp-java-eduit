package ar.com.educacionit.web.enums;

import java.io.Serializable;
import java.util.Collection;

public interface IExportable {

	String exportar(Collection<Serializable> datos);
}
