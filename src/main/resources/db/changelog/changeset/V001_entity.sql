BEGIN;

CREATE TABLE IF NOT EXISTS public.users
(
    id_user bigint primary key,
    name_user character varying(255) NOT NULL,
    date_auth TIMESTAMPTZ NOT NULL,
    login character varying(255) NOT NULL,
    pass character varying(255) NOT NULL
)
    WITH (
        OIDS = FALSE
    );

CREATE SEQUENCE users_seq START WITH 10;

END;
