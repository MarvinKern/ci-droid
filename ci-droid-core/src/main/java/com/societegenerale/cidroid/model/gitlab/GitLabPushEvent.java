package com.societegenerale.cidroid.model.gitlab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.societegenerale.cidroid.model.Repository;
import com.societegenerale.cidroid.model.SourceControlEvent;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitLabPushEvent implements SourceControlEvent {

    @JsonProperty("ref")
    private String ref;

    private GitLabProject project;

    private Repository repository;
}
