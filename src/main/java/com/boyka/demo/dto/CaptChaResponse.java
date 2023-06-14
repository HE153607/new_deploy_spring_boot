package com.boyka.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaptChaResponse {

    private boolean success;

    private String hostName;

    private String challenge_ts;

}
