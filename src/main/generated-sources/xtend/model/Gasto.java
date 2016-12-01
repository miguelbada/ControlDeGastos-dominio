package model;

import java.util.Date;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;

@Observable
@Accessors
@SuppressWarnings("all")
public class Gasto {
  private String descripcion;
  
  private Integer monto;
  
  private Date fecha;
  
  public Gasto() {
    Date _date = new Date();
    this.fecha = _date;
  }
  
  public Gasto(final String unaDescripcion, final Integer unMonto) {
    this.descripcion = unaDescripcion;
    this.monto = unMonto;
    Date _date = new Date();
    this.fecha = _date;
  }
  
  @Pure
  public String getDescripcion() {
    return this.descripcion;
  }
  
  public void setDescripcion(final String descripcion) {
    this.descripcion = descripcion;
  }
  
  @Pure
  public Integer getMonto() {
    return this.monto;
  }
  
  public void setMonto(final Integer monto) {
    this.monto = monto;
  }
  
  @Pure
  public Date getFecha() {
    return this.fecha;
  }
  
  public void setFecha(final Date fecha) {
    this.fecha = fecha;
  }
}
