package pl.kacper.pizza.data.entity.size;

import pl.kacper.pizza.domain.model.SizeType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name= "sizes")
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_type")
    private SizeType sizeType;

    @Column(name = "price_base")
    private BigDecimal priceBase;

    @Column(name = "pizza_id")
    private Integer pizzaId;

    public SizeEntity(Integer id, SizeType sizeType, BigDecimal priceBase, Integer pizzaId) {
        this.id = id;
        this.sizeType = sizeType;
        this.priceBase = priceBase;
        this.pizzaId = pizzaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SizeType getSizeType() {
        return sizeType;
    }

    public void setSizeType(SizeType sizeType) {
        this.sizeType = sizeType;
    }

    public BigDecimal getPriceBase() {
        return priceBase;
    }

    public void setPriceBase(BigDecimal priceBase) {
        this.priceBase = priceBase;
    }

    public Integer getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(Integer pizzaId) {
        this.pizzaId = pizzaId;
    }
}
