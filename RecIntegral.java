/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laba1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 40ush
 */
public class RecIntegral implements Serializable {
    private List<String> record;
    public static RecIntegral fromString(String inputData) {
       StringBuilder sb =new StringBuilder(inputData);
       sb.delete(0,20);
       sb.delete(sb.length()-2,sb.length());
       List<String> localstring = List.of(sb.toString().split(", "));
       return new RecIntegral(localstring);
    }
    @Override
    public String toString() {
       return "RecIntegral{" +
               "record=" + record +
               '}';
    }
    public List<String> getRecord() {
       return record;
    }
    public void setRecord(List<String> record) {
       this.record = record;
    }
    public void setDataByIndex(int index, String record) {
       this.record.set(index, record);
    }
    public RecIntegral(List<String> record){
       this.record = new ArrayList<>(record);
    }
}
