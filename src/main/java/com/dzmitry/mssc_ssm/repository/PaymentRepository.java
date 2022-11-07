package com.dzmitry.mssc_ssm.repository;

import com.dzmitry.mssc_ssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
