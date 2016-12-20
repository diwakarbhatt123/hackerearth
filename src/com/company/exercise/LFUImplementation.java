package com.company.exercise;

import java.util.ArrayList;
import java.util.List;

public class LFUImplementation {

    private List<Element> elementList = new ArrayList<>();

    static class Element{
        private Integer value;
        private Integer readFreq;
        public Element(Integer value){
            this.value = value;
            this.readFreq = 0;
        }

        public Integer getValue() {
            readFreq++;
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Integer getReadFreq() {
            return readFreq;
        }
    }
    public void addElement(Element element){
        
    }
}
