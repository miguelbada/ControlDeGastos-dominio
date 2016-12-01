package usuarioDummy

import model.Usuario
import model.Gasto
import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import java.util.ArrayList

@Observable
@Accessors
class UsuarioDummy {
	Usuario usuario
	List<Gasto> gastos
	
	new() {
		usuario = new Usuario("Miguel", "1234")
		
		usuario.agregarGastos(new Gasto("cine", 250))
		usuario.agregarGastos(new Gasto("desayuno", 35))
		usuario.agregarGastos(new Gasto("Heladera", 9500))
		usuario.agregarGastos(new Gasto("cine", 200))
		usuario.agregarGastos(new Gasto("supermercado", 1500))
		usuario.agregarGastos(new Gasto("cine", 230))
		usuario.agregarGastos(new Gasto("supermercado", 1400))
		usuario.agregarGastos(new Gasto("desayuno", 30))
		usuario.agregarGastos(new Gasto("almuerzo", 150))
		usuario.agregarGastos(new Gasto("supermercado", 1400))
		usuario.agregarGastos(new Gasto("pesca", 350))
		usuario.agregarGastos(new Gasto("cine", 200))
		
		gastos = new ArrayList<Gasto>()
		
		gastos = usuario.gastos
	}
}