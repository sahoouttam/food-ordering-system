package com.food.ordering.system.restaurant.service.dataaccess.restaurant.entity;

import com.food.ordering.system.domain.valueobject.OrderApprovalStatus;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_approval", schema = "restaurant")
@Entity
public class OrderApprovalEntity {

    @Id
    private UUID id;
    private UUID restaurantId;
    private UUID orderId;
    @Enumerated(EnumType.STRING)
    private OrderApprovalStatus status;
}
