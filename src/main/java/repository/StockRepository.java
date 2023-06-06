package repository;

import models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {


    Stock findStockByCompanyOrSymbol(String company, String symbol);

    Stock findBySymbolIgnoreCase(String symbol);

    List<Stock> findByCompanyEqualsIgnoreCaseOrSymbolEqualsIgnoreCase(String companyQuery, String symbolQuery);

    List<Stock> findByStockIdIn(List<Integer> ids);
}
