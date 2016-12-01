package appModel;

import com.google.common.base.Objects;
import java.util.List;
import model.Gasto;
import model.Usuario;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.ObservableUtils;
import org.uqbar.commons.utils.Observable;

@Observable
@Accessors
@SuppressWarnings("all")
public class AppModelControlGastos {
  private Gasto gastoSeleccionado;
  
  private Usuario usuario;
  
  private String nuevaDescripcion;
  
  private String busquedaDescripcion;
  
  private Integer nuevoMonto;
  
  public AppModelControlGastos() {
  }
  
  public void agregarNuevaCalificacion() {
    Gasto gasto = new Gasto(this.nuevaDescripcion, this.nuevoMonto);
    this.usuario.agregarGastos(gasto);
    ObservableUtils.firePropertyChanged(this, "buscarDescripcion");
    ObservableUtils.firePropertyChanged(this, "totalDeDescripcionBuscada");
    ObservableUtils.firePropertyChanged(this, "totalDeGastos");
  }
  
  public void setbusquedaDescripcion(final String unaDescripcion) {
    this.busquedaDescripcion = unaDescripcion;
    ObservableUtils.firePropertyChanged(this, "buscarDescripcion");
  }
  
  public List<Gasto> buscarDescripcion() {
    List<Gasto> _gastos = this.usuario.getGastos();
    final Function1<Gasto, Boolean> _function = new Function1<Gasto, Boolean>() {
      public Boolean apply(final Gasto gasto) {
        String _descripcion = gasto.getDescripcion();
        return Boolean.valueOf(AppModelControlGastos.this.compararDescripcion(AppModelControlGastos.this.busquedaDescripcion, _descripcion));
      }
    };
    Iterable<Gasto> _filter = IterableExtensions.<Gasto>filter(_gastos, _function);
    return IterableExtensions.<Gasto>toList(_filter);
  }
  
  public boolean compararDescripcion(final String descripcionEsperada, final String descripcionObtenida) {
    boolean _xblockexpression = false;
    {
      boolean _equals = Objects.equal(descripcionEsperada, null);
      if (_equals) {
        return true;
      }
      String _lowerCase = descripcionObtenida.toLowerCase();
      String _lowerCase_1 = descripcionEsperada.toLowerCase();
      _xblockexpression = _lowerCase.contains(_lowerCase_1);
    }
    return _xblockexpression;
  }
  
  public Integer totalDeDescripcionBuscada() {
    return Integer.valueOf(this.usuario.totalDeGastos());
  }
  
  public Integer totalDeGastos() {
    return Integer.valueOf(this.usuario.totalDeGastos());
  }
  
  @Pure
  public Gasto getGastoSeleccionado() {
    return this.gastoSeleccionado;
  }
  
  public void setGastoSeleccionado(final Gasto gastoSeleccionado) {
    this.gastoSeleccionado = gastoSeleccionado;
  }
  
  @Pure
  public Usuario getUsuario() {
    return this.usuario;
  }
  
  public void setUsuario(final Usuario usuario) {
    this.usuario = usuario;
  }
  
  @Pure
  public String getNuevaDescripcion() {
    return this.nuevaDescripcion;
  }
  
  public void setNuevaDescripcion(final String nuevaDescripcion) {
    this.nuevaDescripcion = nuevaDescripcion;
  }
  
  @Pure
  public String getBusquedaDescripcion() {
    return this.busquedaDescripcion;
  }
  
  public void setBusquedaDescripcion(final String busquedaDescripcion) {
    this.busquedaDescripcion = busquedaDescripcion;
  }
  
  @Pure
  public Integer getNuevoMonto() {
    return this.nuevoMonto;
  }
  
  public void setNuevoMonto(final Integer nuevoMonto) {
    this.nuevoMonto = nuevoMonto;
  }
}
