package com.dzmitry.mssc_ssm.services;


import com.dzmitry.mssc_ssm.domain.Payment;
import com.dzmitry.mssc_ssm.domain.PaymentEvent;
import com.dzmitry.mssc_ssm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);
    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
