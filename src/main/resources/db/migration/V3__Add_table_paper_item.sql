CREATE TABLE paper_item (
  paper_item_id            SERIAL       NOT NULL,
  type_of_paper VARCHAR(255) NOT NULL,
--   CONSTRAINT paper_item_pk PRIMARY KEY (paper_item_id),
  CONSTRAINT paper_item_library_item_fk FOREIGN KEY (library_item_id) REFERENCES library_item
);