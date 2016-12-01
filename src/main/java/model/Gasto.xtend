package model

import java.util.Date
import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors

@Observable
@Accessors
class Gasto {
	String descripcion
	Integer monto
	Date fecha
	
	new() {
		this.fecha = new Date()
	}
	
	new(String unaDescripcion, Integer unMonto) {
		this.descripcion = unaDescripcion
		this.monto = unMonto
		this.fecha = new Date()
	}
}