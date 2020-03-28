package com.societegenerale.cidroid.model.gitlab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitLabProject {

    @JsonProperty("git_http_url")
    private String url;

    @JsonProperty("name")
    private String name;

    @JsonProperty("default_branch")
    private String defaultBranch;

}
