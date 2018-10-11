drop table if exists manual_sign;
create table manual_sign
(
  sign_id       int(11)         not null auto_increment    comment '签到ID',
  user_id       varchar(64)     not null                   comment '用户Id',
  sign_time     datetime        not null                   comment '签到时间',
  sign_desc 		varchar(500) 	  not null 				           comment '签到描述',
  sign_tag  		int  	          not null 				           comment '签卡标记',
  primary key (sign_id)
) engine=innodb default charset=utf8 comment = '签到信息表';


drop table if exists work_time;
create table work_time
(
  worktime_id       int(11)         not null auto_increment    comment '工作时间ID',
  onDuty_time       varchar(64)     not null                   comment '上班时间',
  offDuty_time      varchar(64)     not null                   comment '下班时间',
  primary key (worktime_id)
) engine=innodb default charset=utf8 comment = '上下班时间表';