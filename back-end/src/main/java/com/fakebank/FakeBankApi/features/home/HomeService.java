package com.fakebank.FakeBankApi.features.home;

import com.fakebank.FakeBankApi.features.home.vo.TrasactionsVO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public HomeResource getHome() {
        return createMock();
    }

    private HomeResource createMock(){
        List<TrasactionsVO> trasactions = new ArrayList<>();
        trasactions.add(new TrasactionsVO(LocalDateTime.now(),"Credit",1000.26,"bob"));
        trasactions.add(new TrasactionsVO(LocalDateTime.now().minusDays(1),"Debit",845.51,"jhon"));
        trasactions.add(new TrasactionsVO(LocalDateTime.now().minusDays(2),"Credit",78.98,"lisa"));
        trasactions.add(new TrasactionsVO(LocalDateTime.now().minusDays(3),"Debit",7456.81,"sther"));

        HomeResource resource = new HomeResource();
        resource.setBalance(12357.53);
        resource.setTransactions(trasactions);
        return resource;
    }
}
