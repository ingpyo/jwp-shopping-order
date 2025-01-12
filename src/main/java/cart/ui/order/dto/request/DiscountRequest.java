package cart.ui.order.dto.request;

public class DiscountRequest {

    private Long couponId;
    private Integer point;

    public DiscountRequest() {
    }

    public DiscountRequest(final Long couponId, final Integer point) {
        this.couponId = couponId;
        this.point = point;
    }

    public Long getCouponId() {
        return couponId;
    }

    public Integer getPoint() {
        return point;
    }
}
