package com.fakebank.FakeBankApi.features.home.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class TrasactionsVO {

    private LocalDateTime dateTime;
    private String type;
    private double value;
    private String receiver;

    public TrasactionsVO(LocalDateTime dateTime, String type, double value, String receiver) {
        this.dateTime = dateTime;
        this.type = type;
        this.value = value;
        this.receiver = receiver;
    }
}
