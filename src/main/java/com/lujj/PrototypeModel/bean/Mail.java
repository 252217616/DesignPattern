package com.lujj.PrototypeModel.bean;

import lombok.Data;

/**
 * 账单模板
 */
@Data
public class Mail {
    private String receiver;
    private String subject;
    private String appellation;
    private String contxt;
    private String tail;
    private AdvTemplate advTemplate;


    public Mail(AdvTemplate advTemplate){
        this.advTemplate = advTemplate;
    }
}
