CREATE TABLE cd_disk (
  cd_disk_id   SERIAL       NOT NULL,
  type VARCHAR(255) NOT NULL,
--   CONSTRAINT cd_disk_pk PRIMARY KEY (cd_disk_id),
  CONSTRAINT cd_disk_audio_item_fk FOREIGN KEY (audio_item_id) REFERENCES audio_item
);