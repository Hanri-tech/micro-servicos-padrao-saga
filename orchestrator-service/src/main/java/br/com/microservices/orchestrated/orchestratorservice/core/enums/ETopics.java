package br.com.microservices.orchestrated.orchestratorservice.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ETopics {
    START_SAGA("start-saga"),
    BASE_ORCHESTRATOR("orchestrator"),
    FINISH_SUCESS("finish-sucess"),
    FINISH_FAIL("finish-fail"),
    PRODUCT_VALIDATION_SUCESS("product-validation-sucess"),
    PRODUCT_VALIDATION_FAIL("product-validation-fail"),
    PAYMENT_SUCESS("payment-sucess"),
    PAYMENT_FAIL("payment-fail"),
    INVETORY_SUCESS("inventory-sucess"),
    INVETORY_FAIL("inventory-fail"),
    NOTIFY_ENDING("notify-ending");

    private String topicName;
}
