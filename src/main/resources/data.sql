/* Clear WALLETS */

DELETE FROM TRANSACTION;

DELETE FROM WALLETS;

/* Insert wallets */

INSERT INTO
    WALLETS (
    ID, FULL_NAME, CPF, EMAIL, "PASSWORD", "TYPE", BALANCE
    )
VALUES (
        1, 'Bruno - User', 12345678900, 'bruno@test.com', '123456', 1, 1000.00
    );

INSERT INTO
    WALLETS (
    ID, FULL_NAME, CPF, EMAIL, "PASSWORD", "TYPE", BALANCE
    )
VALUES (
         2, 'Maria - Merchant' 12345678901, 'maria@test.com', '123456', 2, 1000.00
);