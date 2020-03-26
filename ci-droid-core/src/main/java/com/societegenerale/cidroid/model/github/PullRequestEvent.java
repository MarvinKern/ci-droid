package com.societegenerale.cidroid.model.github;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.societegenerale.cidroid.model.Repository;
import com.societegenerale.cidroid.model.SourceControlEvent;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PullRequestEvent implements SourceControlEvent {

    private String action;

    @JsonProperty("number")
    private int prNumber;

    private Repository repository;



}
