# https://blog.csdn.net/tianyaleixiaowu/article/details/70242971

# db0
DROP DATABASE IF EXISTS `ds_0`;
CREATE DATABASE `ds_0` DEFAULT CHARACTER SET utf8;
USE ds_0;

DROP TABLE IF EXISTS t_order_0;
CREATE TABLE t_order_0 (
order_id bigint(20) NOT NULL,
user_id bigint(20) NOT NULL,
PRIMARY KEY (order_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

DROP TABLE IF EXISTS t_order_1;
CREATE TABLE t_order_1 (
  order_id bigint(20) NOT NULL,
  user_id bigint(20) NOT NULL,
  PRIMARY KEY (order_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

# db1
DROP DATABASE IF EXISTS `ds_1`;
CREATE DATABASE `ds_1` DEFAULT CHARACTER SET utf8;
USE ds_1;

DROP TABLE IF EXISTS t_order_0;
CREATE TABLE t_order_0 (
  order_id bigint(20) NOT NULL,
  user_id bigint(20) NOT NULL,
  PRIMARY KEY (order_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

DROP TABLE IF EXISTS t_order_1;
CREATE TABLE t_order_1 (
  order_id bigint(20) NOT NULL,
  user_id bigint(20) NOT NULL,
  PRIMARY KEY (order_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;