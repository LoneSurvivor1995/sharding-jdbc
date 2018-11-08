# https://blog.csdn.net/tianyaleixiaowu/article/details/70242971
DROP TABLE IF EXISTS t_order_0;
CREATE TABLE t_order_0 (
order_id bigint(20) NOT NULL,
user_id bigint(20) NOT NULL,
PRIMARY KEY (order_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;