package gmailbrowser.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailMetaData {
    private Number threadIds;
    private String msgId;
    private List<String> flags;
    private Number gmId;
    private Long internalDate;
    private Object xGmailReceived;
    private List<String> labels;
    private String subject;
    // Any keys not explicitly listed below will go to this map.
    // We can keep adding more fields explicitly as we see them.
    private Map<String, JsonNode> unknownMetaDataFields = new HashMap<>();

    @JsonGetter("thread_ids")
    public Number getThreadIds() {
        return threadIds;
    }

    @JsonSetter("thread_ids")
    public void setThreadIds(Number threadIds) {
        this.threadIds = threadIds;
    }

    @JsonGetter("msg_id")
    public String getMsgId() {
        return msgId;
    }

    @JsonSetter("msg_id")
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    @JsonGetter("flags")
    public List<String> getFlags() {
        return flags;
    }

    @JsonSetter("flags")
    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    @JsonGetter("gm_id")
    public Number getGmId() {
        return gmId;
    }

    @JsonSetter("gm_id")
    public void setGmId(Number gmId) {
        this.gmId = gmId;
    }

    @JsonGetter("internal_date")
    public Long getInternalDate() {
        return internalDate;
    }

    @JsonSetter("internal_date")
    public void setInternalDate(Long internalDate) {
        this.internalDate = internalDate;
    }

    @JsonGetter("x_gmail_received")
    public Object getxGmailReceived() {
        return xGmailReceived;
    }

    @JsonSetter("x_gmail_received")
    public void setxGmailReceived(Object xGmailReceived) {
        this.xGmailReceived = xGmailReceived;
    }

    @JsonGetter("labels")
    public List<String> getLabels() {
        return labels;
    }

    @JsonSetter("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    @JsonGetter("subject")
    public String getSubject() {
        return subject;
    }

    @JsonSetter("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonAnyGetter
    private Map<String, JsonNode> getUnknowProperties() {
        return this.unknownMetaDataFields;
    }

    @JsonAnySetter
    private void setUnknownMetaDataField(String name, JsonNode val) {
        this.unknownMetaDataFields.put(name, val);
    }
}
