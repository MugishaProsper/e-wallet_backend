package com.github.yildizmy.dto.mapper;

import com.github.yildizmy.domain.entity.Transaction;
import com.github.yildizmy.dto.request.TransactionRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-11T06:46:42+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.2 (Oracle Corporation)"
)
@Component
public class TransactionRequestMapperImpl extends TransactionRequestMapper {

    @Override
    public Transaction toTransaction(TransactionRequest dto) {
        if ( dto == null ) {
            return null;
        }

        Transaction transaction = new Transaction();

        if ( dto.getCreatedAt() != null ) {
            transaction.setCreatedAt( dto.getCreatedAt() );
        }
        else {
            transaction.setCreatedAt( java.time.Instant.now() );
        }
        transaction.setId( dto.getId() );
        transaction.setAmount( dto.getAmount() );
        transaction.setDescription( dto.getDescription() );

        transaction.setStatus( com.github.yildizmy.domain.enums.Status.SUCCESS );
        transaction.setReferenceNumber( java.util.UUID.randomUUID() );

        setToEntityFields( transaction, dto );

        return transaction;
    }

    @Override
    public TransactionRequest toTransactionRequest(Transaction entity) {
        if ( entity == null ) {
            return null;
        }

        TransactionRequest transactionRequest = new TransactionRequest();

        transactionRequest.setId( entity.getId() );
        transactionRequest.setAmount( entity.getAmount() );
        transactionRequest.setDescription( entity.getDescription() );
        transactionRequest.setCreatedAt( entity.getCreatedAt() );
        transactionRequest.setReferenceNumber( entity.getReferenceNumber() );
        transactionRequest.setStatus( entity.getStatus() );

        return transactionRequest;
    }
}
