CREATE TABLE newspaper (
  newspaper_id   SERIAL       NOT NULL,
  number INT NOT NULL,
--   CONSTRAINT newspaper_pk PRIMARY KEY (newspaper_id),
  CONSTRAINT newspaper_paper_item_fk FOREIGN KEY (paper_item_id) REFERENCES paper_item
);