//Controller와 Service 사이에서 데이터를 주고받는 DTO(Data Access Object)를 구현합니다.

package com.example.ideaBANK.Board.dto;


import com.example.ideaBANK.Board.domain.entity.Board;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long id;
    private String title;
    private String storeType;
    private String storeName;
    private String orderDetail;
    private String minimumOrderAmount;
    private String deliveryCharge;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public Board toEntity() {
        Board build = Board.builder()
                .id(id)
                .title(title)
                .storeType(storeType)
                .storeName(storeName)
                .orderDetail(orderDetail)
                .minimumOrderAmount(minimumOrderAmount)
                .deliveryCharge(deliveryCharge)
                .content(content)
                .build();
        return build;
    }

    @Builder
    public BoardDto(Long id, String title, String storeType, String storeName, String orderDetail, String minimumOrderAmount,
                    String deliveryCharge, String content, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.title = title;
        this.storeType = storeType;
        this.storeName = storeName;
        this.orderDetail = orderDetail;
        this.minimumOrderAmount = minimumOrderAmount;
        this.deliveryCharge = deliveryCharge;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}