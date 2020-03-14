package es.usj.mastertsa.jhernandez.musicquiz.client.auth;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class MarvelAuth implements RequestInterceptor {

    private String apiKey;
    private String timestamp;
    private String hash;
    private Integer limit;
    private Integer offset;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }


    public Integer getOffset() {
        return offset;
    }

    public void setHash(Integer offset) {
        this.offset = offset;
    }


    public MarvelAuth(String timestamp, String apiKey, String hash) {
        this.timestamp = timestamp;
        this.apiKey = apiKey;
        this.hash = hash;
    }

    @Override
    public void apply(RequestTemplate template) {
        template.query("ts", timestamp);
        template.query("apikey", apiKey);
        template.query("hash", hash);

        if (this.limit != null) {
            template.query("limit", limit.toString());

        }
        if (this.offset != null) {
            template.query("offset", offset.toString());

        }

    }
}
