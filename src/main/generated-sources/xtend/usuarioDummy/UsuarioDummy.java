package usuarioDummy;

import java.util.ArrayList;
import java.util.List;
import model.Gasto;
import model.Usuario;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;

@Observable
@Accessors
@SuppressWarnings("all")
public class UsuarioDummy {
  private Usuario usuario;
  
  private List<Gasto> gastos;
  
  public UsuarioDummy() {
    Usuario _usuario = new Usuario("Miguel", "1234");
    this.usuario = _usuario;
    Gasto _gasto = new Gasto("cine", Integer.valueOf(250));
    this.usuario.agregarGastos(_gasto);
    Gasto _gasto_1 = new Gasto("desayuno", Integer.valueOf(35));
    this.usuario.agregarGastos(_gasto_1);
    Gasto _gasto_2 = new Gasto("Heladera", Integer.valueOf(9500));
    this.usuario.agregarGastos(_gasto_2);
    Gasto _gasto_3 = new Gasto("cine", Integer.valueOf(200));
    this.usuario.agregarGastos(_gasto_3);
    Gasto _gasto_4 = new Gasto("supermercado", Integer.valueOf(1500));
    this.usuario.agregarGastos(_gasto_4);
    Gasto _gasto_5 = new Gasto("cine", Integer.valueOf(230));
    this.usuario.agregarGastos(_gasto_5);
    Gasto _gasto_6 = new Gasto("supermercado", Integer.valueOf(1400));
    this.usuario.agregarGastos(_gasto_6);
    Gasto _gasto_7 = new Gasto("desayuno", Integer.valueOf(30));
    this.usuario.agregarGastos(_gasto_7);
    Gasto _gasto_8 = new Gasto("almuerzo", Integer.valueOf(150));
    this.usuario.agregarGastos(_gasto_8);
    Gasto _gasto_9 = new Gasto("supermercado", Integer.valueOf(1400));
    this.usuario.agregarGastos(_gasto_9);
    Gasto _gasto_10 = new Gasto("pesca", Integer.valueOf(350));
    this.usuario.agregarGastos(_gasto_10);
    Gasto _gasto_11 = new Gasto("cine", Integer.valueOf(200));
    this.usuario.agregarGastos(_gasto_11);
    ArrayList<Gasto> _arrayList = new ArrayList<Gasto>();
    this.gastos = _arrayList;
    List<Gasto> _gastos = this.usuario.getGastos();
    this.gastos = _gastos;
  }
  
  @Pure
  public Usuario getUsuario() {
    return this.usuario;
  }
  
  public void setUsuario(final Usuario usuario) {
    this.usuario = usuario;
  }
  
  @Pure
  public List<Gasto> getGastos() {
    return this.gastos;
  }
  
  public void setGastos(final List<Gasto> gastos) {
    this.gastos = gastos;
  }
}
