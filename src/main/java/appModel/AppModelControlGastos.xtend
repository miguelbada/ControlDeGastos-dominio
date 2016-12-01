package appModel

import model.Gasto
import model.Usuario
import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import static org.uqbar.commons.model.ObservableUtils.*

@Observable
@Accessors
class AppModelControlGastos {
	Gasto gastoSeleccionado
	Usuario usuario
	String nuevaDescripcion
	String busquedaDescripcion
	Integer nuevoMonto
	
	new() {
	}
	
	def agregarNuevaCalificacion() {
		var Gasto gasto = new Gasto(nuevaDescripcion, nuevoMonto)
		this.usuario.agregarGastos(gasto)
		firePropertyChanged(this,"buscarDescripcion")
		firePropertyChanged(this,"totalDeDescripcionBuscada")
		firePropertyChanged(this,"totalDeGastos")
	}
	
	def void setbusquedaDescripcion(String unaDescripcion){
		this.busquedaDescripcion = unaDescripcion
		firePropertyChanged(this,"buscarDescripcion")
	}
	
	def buscarDescripcion() {
		usuario.gastos.filter[gasto | this.compararDescripcion(busquedaDescripcion, gasto.descripcion)].toList
		
	}
	
	def compararDescripcion(String descripcionEsperada, String descripcionObtenida) {
		if (descripcionEsperada == null) {
			return true
		}
		descripcionObtenida.toLowerCase().contains(descripcionEsperada.toLowerCase())
	}
	
	def Integer totalDeDescripcionBuscada() {
		usuario.totalDeGastos
	}
	
	def Integer totalDeGastos() {
		usuario.totalDeGastos
	}
	
	
}