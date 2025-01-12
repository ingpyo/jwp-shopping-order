package cart.application.service.order.dto;

import cart.ui.order.dto.request.CreateOrderDiscountRequest;

import java.util.List;

public class CreateOrderDiscountDto {

    private final List<Long> couponIds;
    private final Integer point;

    public CreateOrderDiscountDto(final List<Long> couponIds, final Integer point) {
        this.couponIds = couponIds;
        this.point = point;
    }

    public static CreateOrderDiscountDto from(final CreateOrderDiscountRequest orderDiscounts) {
        return new CreateOrderDiscountDto(orderDiscounts.getCouponIds(), orderDiscounts.getPoint());
    }

    public List<Long> getCouponIds() {
        return couponIds;
    }

    public Integer getPoint() {
        return point;
    }

}
