package pl.kacper.pizza.remote.rest.dto.request;

import pl.kacper.pizza.domain.model.SizeType;

import java.math.BigDecimal;

public class AddSizeDto {

    private SizeType size;
    private BigDecimal prize;

    public AddSizeDto(SizeType size, BigDecimal prize) {
        this.size = size;
        this.prize = prize;
    }

    public SizeType getSize() {
        return size;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public BigDecimal getPrize() {
        return prize;
    }

    public void setPrize(BigDecimal prize) {
        this.prize = prize;
    }
}
