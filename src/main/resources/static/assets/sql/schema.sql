-- Table: public.employee

-- DROP TABLE public.employee;

CREATE TABLE public.employee
(
    employee_id integer NOT NULL,
    employee_name character varying(200) COLLATE pg_catalog."default" NOT NULL,
    employee_experience smallint NOT NULL,
    employee_designation character varying(200) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT employee_id_pk PRIMARY KEY (employee_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.employee
    OWNER to world;