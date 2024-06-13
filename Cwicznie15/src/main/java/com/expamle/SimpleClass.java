package com.expamle;

import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;

import javax.swing.*;
import java.util.List;

public class SimpleClass  extends JFrame {

    public SimpleClass() {
    }

    public XYDataset createDataSet(){

        try{
            Stock stock = YahooFinance.get("TSLA",true);
            List<HistoricalQuote> stockHistory = stock.getHistory();
            
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public JFreeChart createChart(){

    }

    public static void main(String[] args) {

        SimpleClass chart = new SimpleClass();
    }

}
