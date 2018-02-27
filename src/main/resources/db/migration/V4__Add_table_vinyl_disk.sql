CREATE TABLE vinyl_disk (
  vinyl_disk_id   SERIAL       NOT NULL,
  size VARCHAR(255) NOT NULL,
--   CONSTRAINT vinyl_disk_pk PRIMARY KEY (vinyl_disk_id),
  CONSTRAINT vinyl_disk_audio_item_fk FOREIGN KEY (audio_item_id) REFERENCES audio_item
);