CREATE TABLE book (
  book_id   SERIAL       NOT NULL,
  cover_type VARCHAR(255) NOT NULL,
--   CONSTRAINT book_pk PRIMARY KEY (book_id),
  CONSTRAINT book_paper_item_fk FOREIGN KEY (paper_item_id) REFERENCES paper_item
);