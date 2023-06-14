package com.boyka.demo.dto;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

@Data
public class PageDTO<T, V> implements Serializable {

    private Long totalElements;
    private Integer totalPages;
    private Integer numberOfElements;
    private Integer size;
    private Integer number;
    private List<V> content;

    public PageDTO(Page<T> page) {
        this.totalElements = page.getTotalElements();
        this.totalPages = page.getTotalPages();
        this.numberOfElements = page.getNumberOfElements();
        this.size = page.getSize();
        this.number = page.getNumber();
    }

}
