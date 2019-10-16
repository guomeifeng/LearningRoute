/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testproject.mybatismapper;

/**
 *
 * @author kelly
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author rinco
 */
public class Transaction {

    private int transactionRowId;
    private int marketId;
    private int groupNo;
    private String tranCode;
    private String tranId;
    private String payload;
    private String internalState;
    private String marketState;
    private String addedBy;
    private Date dateAdded;
    private Date dateUpdated;
    private String serviceId;
    private String transGroup;
    private String messageFlow;
    private String initiatingTranId;
    private String messageId;
    private int messageRowId;
    private String ackPayload;
    private Long crRequestId;           // RequestID for CATS

    private String crChangeStatusCode;  // ChangeStatusCode for CATS
    private String fromParticipantId;         // B2B
    private String toParticipantId;           // B2B
    private String priority;   // B2B
    private int ackMessageRowId;            // B2B
    
    
    
    
    /**
     * @return the marketId
     */
    public int getMarketId() {
        return marketId;
    }

    /**
     * @param marketId the marketId to set
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    /**
     * @return the groupNo
     */
    public int getGroupNo() {
        return groupNo;
    }

    /**
     * @param groupNo the groupNo to set
     */
    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }

    /**
     * @return the tranId
     */
    public String getTranId() {
        return tranId;
    }

    /**
     * @param tranId the tranId to set
     */
    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    /**
     * @return the payload
     */
    public String getPayload() {
        return payload;
    }

    /**
     * @param payload the payload to set
     */
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * @return the internalState
     */
    public String getInternalState() {
        return internalState;
    }

    /**
     * @param internalState the internalState to set
     */
    public void setInternalState(String internalState) {
        this.internalState = internalState;
    }

    /**
     * @return the marketState
     */
    public String getMarketState() {
        return marketState;
    }

    /**
     * @param marketState the marketState to set
     */
    public void setMarketState(String marketState) {
        this.marketState = marketState;
    }

    /**
     * @return the addedBy
     */
    public String getAddedBy() {
        return addedBy;
    }

    /**
     * @param addedBy the addedBy to set
     */
    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    /**
     * @return the dateAdded
     */
    public Date getDateAdded() {
        return dateAdded;
    }

    /**
     * @param dateAdded the dateAdded to set
     */
    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    /**
     * @return the dateUpdated
     */
    public Date getDateUpdated() {
        return dateUpdated;
    }

    /**
     * @param dateUpdated the dateUpdated to set
     */
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * @return the serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * @param serviceId the serviceId to set
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * @return the transGroup
     */
    public String getTransGroup() {
        return transGroup;
    }

    /**
     * @param transGroup the transGroup to set
     */
    public void setTransGroup(String transGroup) {
        this.transGroup = transGroup;
    }

    /**
     * @return the messageFlow
     */
    public String getMessageFlow() {
        return messageFlow;
    }

    /**
     * @param messageFlow the messageFlow to set
     */
    public void setMessageFlow(String messageFlow) {
        this.messageFlow = messageFlow;
    }

    /**
     * @return the initiatingTranId
     */
    public String getInitiatingTranId() {
        return initiatingTranId;
    }

    /**
     * @param initiatingTranId the initiatingTranId to set
     */
    public void setInitiatingTranId(String initiatingTranId) {
        this.initiatingTranId = initiatingTranId;
    }

    /**
     * @return the messageId
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * @param messageId the messageId to set
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * @return the tranCode
     */
    public String getTranCode() {
        return tranCode;
    }

    /**
     * @param tranCode the tranCode to set
     */
    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    /**
     * @return the ackPayload
     */
    public String getAckPayload() {
        return ackPayload;
    }

    /**
     * @param ackPayload the ackPayload to set
     */
    public void setAckPayload(String ackPayload) {
        this.ackPayload = ackPayload;
    }

    /**
     * @return the crRequestId
     */
    public Long getCrRequestId() {
        return crRequestId;
    }

    /**
     * @param crRequestId the crRequestId to set
     */
    public void setCrRequestId(Long crRequestId) {
        this.crRequestId = crRequestId;
    }

    /**
     * @return the crChangeStatusCode
     */
    public String getCrChangeStatusCode() {
        return crChangeStatusCode;
    }

    /**
     * @param crChangeStatusCode the crChangeStatusCode to set
     */
    public void setCrChangeStatusCode(String crChangeStatusCode) {
        this.crChangeStatusCode = crChangeStatusCode;
    }

    /**
     * @return the transactionRowId
     */
    public int getTransactionRowId() {
        return transactionRowId;
    }

    /**
     * @param transactionRowId the transactionRowId to set
     */
    public void setTransactionRowId(int transactionRowId) {
        this.transactionRowId = transactionRowId;
    }

    /**
     * @return the messageRowId
     */
    public int getMessageRowId() {
        return messageRowId;
    }

    /**
     * @param messageRowId the messageRowId to set
     */
    public void setMessageRowId(int messageRowId) {
        this.messageRowId = messageRowId;
    }

    /**
     * @return the fromParticipantId
     */
    public String getFromParticipantId() {
        return fromParticipantId;
    }

    /**
     * @param fromParticipantId the fromParticipantId to set
     */
    public void setFromParticipantId(String fromParticipantId) {
        this.fromParticipantId = fromParticipantId;
    }

    /**
     * @return the toParticipantId
     */
    public String getToParticipantId() {
        return toParticipantId;
    }

    /**
     * @param toParticipantId the toParticipantId to set
     */
    public void setToParticipantId(String toParticipantId) {
        this.toParticipantId = toParticipantId;
    }

    /**
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }
    

/**
     * @return the ackMessageRowId
     */
    public int getAckMessageRowId() {
        return ackMessageRowId;
    }

    /**
     * @param ackMessageRowId the ackMessageRowId to set
     */
    public void setAckMessageRowId(int ackMessageRowId) {
        this.ackMessageRowId = ackMessageRowId;
    }    

}
