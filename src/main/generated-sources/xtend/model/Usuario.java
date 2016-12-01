package model;

import java.util.ArrayList;
import java.util.List;
import model.Gasto;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;

@Observable
@Accessors
@SuppressWarnings("all")
public class Usuario {
  private String nombre;
  
  private String password;
  
  private List<Gasto> gastos;
  
  public Usuario() {
  }
  
  public Usuario(final String unNombre, final String unPassword) {
    this.nombre = unNombre;
    this.password = unPassword;
    ArrayList<Gasto> _arrayList = new ArrayList<Gasto>();
    this.gastos = _arrayList;
  }
  
  public boolean agregarGastos(final Gasto gasto) {
    return this.gastos.add(gasto);
  }
  
  public int totalDeGastos() {
    int _xblockexpression = (int) 0;
    {
      int res = 0;
      for (final Gasto gasto : this.gastos) {
        Integer _monto = gasto.getMonto();
        int _plus = (res + (_monto).intValue());
        res = _plus;
      }
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(final String password) {
    this.password = password;
  }
  
  @Pure
  public List<Gasto> getGastos() {
    return this.gastos;
  }
  
  public void setGastos(final List<Gasto> gastos) {
    this.gastos = gastos;
  }
}
