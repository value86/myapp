DROP TABLE IF EXISTS T_GREETING;

/**********************************/
/* Table Name:  */
/**********************************/
CREATE TABLE T_GREETING(
		greeting_id INTEGER,
		greeting_content VARCHAR(100) NOT NULL,
		created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
		updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);


ALTER TABLE T_GREETING ADD CONSTRAINT IDX_T_GREETING_PK PRIMARY KEY (greeting_id);