package model

import java.util.List
import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList

@Observable
@Accessors
class Usuario {
	String nombre
	String password
	List<Gasto> gastos
	
	new() {
	}
	
	//Constructor.
	new(String unNombre, String unPassword) {
		this.nombre = unNombre
		this.password = unPassword
		this.gastos = new ArrayList<Gasto>
	}
	
	def agregarGastos(Gasto gasto) {
		this.gastos.add(gasto)
	}
	
	//Retorna el total de los gastos.
	def totalDeGastos(){
		var res = 0
		for(gasto: gastos){
			res = res + gasto.monto
		}
	 	res
	}
}