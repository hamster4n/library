CREATE TABLE library_item (
  library_item_id SERIAL       NOT NULL,
  catalog_code    VARCHAR(255) NOT NULL,
  name            VARCHAR(255) NOT NULL,
  author          VARCHAR(255) NOT NULL,
  number_of_pages INT          NOT NULL,
  year            INT          NOT NULL,
  CONSTRAINT library_item_pk PRIMARY KEY (library_item_id)
);

