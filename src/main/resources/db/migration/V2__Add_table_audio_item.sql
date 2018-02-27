CREATE TABLE audio_item (
  audio_item_id      SERIAL NOT NULL,
  bitrate INT    NOT NULL,
--   CONSTRAINT audio_item_pk PRIMARY KEY (audio_item_id),
  CONSTRAINT audio_item_library_item_fk FOREIGN KEY (library_item_id) REFERENCES library_item
);