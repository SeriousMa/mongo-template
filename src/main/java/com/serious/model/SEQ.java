package com.serious.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Serious on 16/3/30.
 */

@Document(collection="SEQ")
public class SEQ {
    String seqKey;
    Long seqValue;

    public String getSeqKey() {
        return seqKey;
    }

    public void setSeqKey(String seqKey) {
        this.seqKey = seqKey;
    }

    public Long getSeqValue() {
        return seqValue;
    }

    public void setSeqValue(Long seqValue) {
        this.seqValue = seqValue;
    }
}
