package com.fakebank.FakeBankApi.features.home;

import com.fakebank.FakeBankApi.features.home.vo.TrasactionsVO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class HomeResource {

    double balance;
    List<TrasactionsVO> transactions;

}
