CREATE TABLE login_activity (
  id BIGSERIAL PRIMARY KEY,
  user_id TEXT,
  device_id TEXT,
  ip_address TEXT,
  location TEXT,
  timestamp TIMESTAMPTZ
);