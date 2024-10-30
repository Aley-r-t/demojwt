package pe.du.tecsup.demojwt.models.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "facturas_items")
public class ItemFactura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="producto_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Producto producto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double calcularImporte() {
        return cantidad.doubleValue() * producto.getPrecio();
    }
    public ItemFactura(){}


    public ItemFactura(Integer cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "ItemFactura{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", producto=" + producto +
                '}';
    }

    private static final long serialVersionUID = 1L;

}
