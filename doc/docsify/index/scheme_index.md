# 数据结构 <!-- {docsify-ignore-all} -->

### DEFAULT
#### 客户(ACCOUNT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCOUNT_NAME|客户名称|VARCHAR|是|200|||
|ACCOUNT_NUMBER|客户编号|VARCHAR|是|100|||
|ACCOUNT_SITE|客户所在地|VARCHAR|是|100|||
|ACCOUNT_TYPE|客户类型|VARCHAR|是|60|||
|ANNUAL_REVENUE|年收入|VARCHAR|是|200|||
|BILLING_CITY|开单地址-城市|VARCHAR|是|100|||
|BILLING_CODE|开单地址-邮编|VARCHAR|是|30|||
|BILLING_COUNTRY|开单地址-国家/地区|VARCHAR|是|100|||
|BILLING_STATE|开单地址-省/市|VARCHAR|是|100|||
|BILLING_STREET|开单地址-街道|VARCHAR|是|250|||
|CHANGE_LOG_TIME__S|Change_Log_Time|DATETIME|是||||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|1048576|||
|EMPLOYEES|员工数|INT|是||||
|ENRICH_STATUS__S|充实状态|VARCHAR|是|60|||
|FAX|传真|VARCHAR|是|30|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INDUSTRY|行业|VARCHAR|是|60|||
|LAST_ACTIVITY_TIME|最近操作时间|DATETIME|是||||
|LAST_ENRICHED_TIME__S|最后充实时间|DATETIME|是||||
|LOCKED__S|Locked|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|OWNER|客户所有者|VARCHAR|是|60|||
|OWNERSHIP|公司所有权|VARCHAR|是|60|||
|PHONE|电话|VARCHAR|是|100|||
|PID|父标识|VARCHAR|是|100|||
|RATING|等级|VARCHAR|是|100|||
|RECORD_LMAGE|客户图片|VARCHAR|是|200|||
|SHIPPING_CITY|发货地址-城市|VARCHAR|是|100|||
|SHIPPING_CODE|发货地址-邮编|VARCHAR|是|30|||
|SHIPPING_COUNTRY|发货地址-国家/地区|VARCHAR|是|100|||
|SHIPPING_STATE|发货地址-省/市|VARCHAR|是|100|||
|SHIPPING_STREET|发货地址-街道|VARCHAR|是|250|||
|SIC_CODE|SIC代码|INT|是||||
|TAG|标签|VARCHAR|是|2000|||
|TICKER_SYMBOL|股票代码|VARCHAR|是|30|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|WEBSITE|网站|VARCHAR|是|100|||
#### 活动(ACTIVITIY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AUDITINFO|审计信息|TEXT|是|1048576|||
|AUDITTYPE|审计类型|VARCHAR|是|100|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IPADDRESS|访问地址|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|OBJECTID|对象标识|VARCHAR|是|100|||
|OBJECTTYPE|对象类型|VARCHAR|是|100|||
|OPPERSONID|操作人|VARCHAR|是|100|||
|OPPERSONNAME|操作人|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 附件(ATTACHMENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|FILE_ID|文件标识|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER_ID|所属数据标识|VARCHAR|是|100|||
|OWNER_SUBTYPE|所属对象子类型|VARCHAR|是|100|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|TITLE|标题|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 通话(CALL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CALLER_ID|呼叫者ID|VARCHAR|是|30|||
|CALL_AGENDA|通话议程|VARCHAR|是|255|||
|CALL_DURATION|通话持续时间|VARCHAR|是|50|||
|CALL_DURATION_IN_SECONDS|通话持续时间(秒)|INT|是||||
|CALL_PURPOSE|通话目的|VARCHAR|是|60|||
|CALL_RESULT|通话结果|VARCHAR|是|60|||
|CALL_START_TIME|通话开始时间|DATETIME|是||||
|CALL_TYPE|通话类型|VARCHAR|是|60|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|CTI_ENTRY|CTI条目|INT|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|DIALLED_NUMBER|拨打的号码|VARCHAR|是|30|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OUTGOING_CALL_STATUS|去电通话状态|VARCHAR|是|60|||
|OWNER_ID|所属数据标识|VARCHAR|是|100|||
|OWNER_SUBTYPE|所属对象子类型|VARCHAR|是|100|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|REMINDER|提醒|VARCHAR|是|60|||
|SCHEDULED_IN_CRM|在CRM中已预定|VARCHAR|是|60|||
|SUBJECT|主题|VARCHAR|是|255|||
|TAG|标签|VARCHAR|是|2000|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|VOICE_RECORDING__S|语音录音|VARCHAR|是|100|||
#### 市场活动(CAMPAIGN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTUAL_COST|实际成本|VARCHAR|是|200|||
|BUDGETED_COST|预算成本|VARCHAR|是|200|||
|CAMPAIGN_NAME|市场活动名称|VARCHAR|是|255|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|END_DATE|结束日期|DATETIME|是||||
|EXPECTED_RESPONSE|期望成功率(%)|BIGINT|是|20|||
|EXPECTED_REVENUE|预期收益|VARCHAR|是|200|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|NATIVE_SURVEY__EXTN__DEPARTMENT_ID|部门ID|VARCHAR|是|255|||
|NATIVE__SURVEY__EXTN__SURVEY|调查|VARCHAR|是|255|||
|NATIVE__SURVEY__EXTN__SURVEY_TYPE|调查类型|VARCHAR|是|60|||
|NATIVE__SURVEY__EXTN__SURVEY_URL|调查URL|VARCHAR|是|100|||
|NATIVE__SURVEY__EXTN__SURVEY__DEPARTMENT|调查部门|VARCHAR|是|255|||
|NATIVE__WEBINAR__EXTN__WEBINAR_LAUNCH_URL|网络研讨会启动URL|VARCHAR|是|100|||
|NATIVE__WEBINAR__EXTN__WEBINAR_REGISTRATION_URL|网络研讨会注册URL|VARCHAR|是|100|||
|NATIVE__WEBINAR__EXTN__WEBINAR__DURATION|网络研讨会持续时间|VARCHAR|是|60|||
|NATIVE__WEBINAR__EXTN__WEBINAR__SCHEDULE|网络研讨会时间表|DATETIME|是||||
|NUM_SENT|发出数量|BIGINT|是|20|||
|START_DATE|开始日期|DATETIME|是||||
|STATUS|状态|VARCHAR|是|60|||
|TAG|标签|VARCHAR|是|2000|||
|TYPE|类型|VARCHAR|是|60|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 服务支持(CASE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADD_COMMENT|添加评论|TEXT|是|32000|||
|CASE_ORIGIN|服务支持来源|VARCHAR|是|60|||
|CASE_REASON|服务支持原因|VARCHAR|是|60|||
|COMMENTS|评论|VARCHAR|是|1000|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|EMAIL|电子邮件|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INTERNAL_COMMENTS|内部评论|TEXT|是|32000|||
|LOCKED__S|Locked|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|NO_OF_COMMENTS|评论数量|INT|是||||
|PHONE|电话|VARCHAR|是|100|||
|PRIORITY|优先级|VARCHAR|是|60|||
|REPORTED_BY|报告人|VARCHAR|是|255|||
|SOLUTION|解决方案|TEXT|是|32000|||
|STATUS|状态|VARCHAR|是|60|||
|SUBJECT|主题|VARCHAR|是|300|||
|TAG|标签|VARCHAR|是|2000|||
|TYPE|类型|VARCHAR|是|60|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 联系人(CONTACT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCOUNT_ID|客户ID|VARCHAR|是|100|||
|ASSISTANT|助理|VARCHAR|是|50|||
|ASST_PHONE|助理电话|VARCHAR|是|100|||
|CHANGE_LOG_TIME__S|Change_Log_Time|DATETIME|是||||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DATE_OF_BIRTH|生日|DATETIME|是||||
|DEPARTMENT|部门|VARCHAR|是|50|||
|DESCRIPTION|描述|TEXT|是|32000|||
|EMAIL|电子邮件|VARCHAR|是|100|||
|EMAIL_OPT_OUT|不发营销邮件|INT|是||||
|ENRICH_STATUS__S|充实状态|VARCHAR|是|60|||
|FAX|传真|VARCHAR|是|30|||
|FIRST_NAME|名字|VARCHAR|是|40|||
|FULL_NAME|全名|VARCHAR|是|120|||
|HOME_PHONE|住宅电话|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LAST_ACTIVITY_TIME|最近操作时间|DATETIME|是||||
|LAST_ENRICHED_TIME__S|最后充实时间|DATETIME|是||||
|LAST_NAME|姓氏|VARCHAR|是|80|||
|LEAD_SOURCE|线索来源|VARCHAR|是|60|||
|LOCKED__S|Locked|INT|是||||
|MAILING_CITY|邮寄地址-城市|VARCHAR|是|100|||
|MAILING_COUNTRY|邮寄地址-国家/地|VARCHAR|是|100|||
|MAILING_STATE|邮寄地址-省/市|VARCHAR|是|100|||
|MAILING_STREET|邮寄地址-街道|VARCHAR|是|250|||
|MAILING_ZIP|邮寄地址-邮编|VARCHAR|是|30|||
|MOBILE|手机|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|OTHER_CITY|其它城市|VARCHAR|是|100|||
|OTHER_COUNTRY|其它国家/地区|VARCHAR|是|100|||
|OTHER_STATE|其它省/市|VARCHAR|是|100|||
|OTHER_STREET|其它街道|VARCHAR|是|250|||
|OTHER_ZIP|其他邮编|VARCHAR|是|30|||
|OWNER|客户所有者|VARCHAR|是|60|||
|PHONE|电话|VARCHAR|是|100|||
|RECORD_IMAGE|联系人图片|VARCHAR|是|100|||
|SALUTATION|称呼|VARCHAR|是|60|||
|SECONDARY_EMAIL|备用邮箱|VARCHAR|是|100|||
|SKYPE_ID|Skype_ID|VARCHAR|是|50|||
|TAG|标签|VARCHAR|是|2000|||
|TITLE|职位/职称|VARCHAR|是|100|||
|UNSUBSCRIBED_MODE|退订的方式|VARCHAR|是|60|||
|UNSUBSCRIBED_TIME|退订的时间|DATETIME|是||||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 链接(CUSTOM_BUTTON)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER|客户所有者|VARCHAR|是|60|||
|OWNER_ID|所属数据标识|VARCHAR|是|100|||
|OWNER_SUBTYPE|所属对象子类型|VARCHAR|是|100|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|URL|URL|VARCHAR|是|2000|||
#### 商机(DEAL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCOUNT_ID|客户ID|VARCHAR|是|100|||
|AMOUNT|金额|VARCHAR|是|200|||
|BUSINESS_LINE|业务条线|VARCHAR|是|60|||
|CHANGE_LOG_TIME__S|Change Log Time|DATETIME|是||||
|CLOSING_DATE|预计成交日期|DATETIME|是||||
|CONTACT_ID|联系人标识|VARCHAR|是|100|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DEAL_NAME|商机名称|VARCHAR|是|120|||
|DESCRIPTION|描述|TEXT|是|32000|||
|EXPECTED_REVENUE|预期收益|VARCHAR|是|200|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LAST_ACTIVITY_TIME|最近操作时间|DATETIME|是||||
|LAST_ASSESS_TIME|最近评估时间|DATETIME|是||||
|LEAD_CONVERSIONTIME|线索转换用时|INT|是||||
|LEAD_SOURCE|线索来源|VARCHAR|是|60|||
|LOCKED__S|Locked|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|NEXT_STEP|下一步|VARCHAR|是|100|||
|OVERALL_SALES_DURATION|总销售时间|INT|是||||
|OWNER|所有者|VARCHAR|是|60|||
|PROBABILITY|可能性|INT|是||||
|REASON_FOR_LOSS__S|丢单原因|VARCHAR|是|60|||
|SALES_CYCLE_DURATION|销售周期的持续时间|INT|是||||
|STAGE|阶段|VARCHAR|是|60|||
|TAG|标签|VARCHAR|是|2000|||
|TYPE|类型|VARCHAR|是|60|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 阶段历史(DEAL_HISTORY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AMOUNT|金额|DECIMAL|是||2||
|CLOSING_DATE|预计成交日期|DATETIME|是||||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DEAL_ID|商机标识|VARCHAR|是|100|||
|EXPECTED_REVENUE|预期收益|DECIMAL|是||2||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LAST_ACTIVITY_TIME|最近操作时间|DATETIME|是||||
|MOVED_TO__S|移动到|VARCHAR|是|60|||
|NAME|名称|VARCHAR|是|200|||
|PROBABILITY|可能性|INT|是||||
|STAGE|阶段|VARCHAR|是|60|||
|STAGE_DURATION_CALENDAR_DAYS|阶段持续时间(日历天数)|INT|是||||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 商机商品(DEAL_PRODUCT)
#### 商机阶段(DEAL_STAGE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|阶段标识|VARCHAR|否|100|||
|NAME|阶段名称|VARCHAR|是|200|||
|PROBABILITY|默认阶段成交概率|DECIMAL|是||2||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 会议(EVENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ALL_DAY|全天|INT|是||||
|CHECK_IN_ADDRES|签到地址|TEXT|是|2000|||
|CHECK_IN_CITY|签到城市|VARCHAR|是|100|||
|CHECK_IN_COMMENT|签到评注|TEXT|是|3000|||
|CHECK_IN_COUNTRY|签到国家|VARCHAR|是|100|||
|CHECK_IN_STATE|签到省份|VARCHAR|是|100|||
|CHECK_IN_STATUS|签到状态|VARCHAR|是|30|||
|CHECK_IN_SUB_LOCALITY|签到地区|VARCHAR|是|250|||
|CHECK_IN_TIME|签到时间|DATETIME|是||||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|END_DATETIME|结束日期时间|DATETIME|是||||
|EVENT_TITLE|标题|VARCHAR|是|255|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LATITUDE|纬度|DECIMAL|是||||
|LONGITUDE|经度|DECIMAL|是||||
|NAME|名称|VARCHAR|是|200|||
|OWNER|客户所有者|VARCHAR|是|60|||
|OWNER_ID|所属数据标识|VARCHAR|是|100|||
|OWNER_SUBTYPE|所属对象子类型|VARCHAR|是|100|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|PARTICIPANTS|参与者|BIGINT|是|20|||
|START_DATETIME|起始日期时间|DATETIME|是||||
|TAG|标签|VARCHAR|是|2000|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|VENUE|地点|VARCHAR|是|255|||
|ZIP_CODE|邮政编码|VARCHAR|是|30|||
#### 执行人(EXECUTOR)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PRINCIPAL_ID|关联主体标识|VARCHAR|是|100|||
|PRINCIPAL_TYPE|关联主体类型|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|USER_ID|用户标识|VARCHAR|是|100|||
#### 发货单(INVOICE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADJUSTMENT|调整|VARCHAR|是|100|||
|BILLING_CITY|开单地址-城市|VARCHAR|是|100|||
|BILLING_CODE|开单地址-邮编|VARCHAR|是|30|||
|BILLING_COUNTRY|开单地址-国家/地区|VARCHAR|是|100|||
|BILLING_STATE|开单地址-省/市|VARCHAR|是|100|||
|BILLING_STREET|开单地址-街道|VARCHAR|是|250|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|DISCOUNT|折扣|VARCHAR|是|100|||
|DUE_DATE|到期日期|DATETIME|是|100|||
|EXCISE_DUTY|消费税|VARCHAR|是|100|||
|GRAND_TOTAL|累计|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INVOICE_DATE|发货单日期|DATETIME|是|100|||
|INVOICE_NUMBER|发货单编号|VARCHAR|是|100|||
|LOCKED__S|Locked|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|PURCHASE_ORDER|采购订单|VARCHAR|是|120|||
|SALES_COMMISSIO|销售佣金|VARCHAR|是|100|||
|SHIPPING_CITY|发货地址-城市|VARCHAR|是|100|||
|SHIPPING_CODE|发货地址-邮编|VARCHAR|是|30|||
|SHIPPING_COUNTRY|发货地址-国家/地区|VARCHAR|是|100|||
|SHIPPING_STATE|发货地址-省/市|VARCHAR|是|100|||
|SHIPPING_STREET|发货地址-街道|VARCHAR|是|250|||
|STATUS|状态|VARCHAR|是|60|||
|SUBJECT|主题|VARCHAR|是|120|||
|SUB_TOTAL|小计|VARCHAR|是|100|||
|TAG|标签|VARCHAR|是|2000|||
|TAX|税|VARCHAR|是|100|||
|TERMS_AND_CONDITIONS|条款及条件|TEXT|是|32000|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 货品(ITEM)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 线索(LEAD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCOUNT_ID|客户标识|VARCHAR|是|100|||
|ANNUALREVENUE|年收入|VARCHAR|是|200|||
|CHANGE_LOG_TIME__S|Change Log Time|DATETIME|是||||
|CITY|城市|VARCHAR|是|100|||
|COMPANY|公司|VARCHAR|是|200|||
|CONVERTED_DATE_TIME|转换的日期时间|DATETIME|是||||
|CONVERTED__S|为“已转换”|INT|是||||
|COUNTRY|国家/地区|VARCHAR|是|100|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|DESIGNATION|职位/职称|VARCHAR|是|100|||
|EMAIL|电子邮件|VARCHAR|是|100|||
|EMAIL_OPT_OUT|不发营销邮件|INT|是||||
|ENRICH_STATUS_S|充实状态|VARCHAR|是|60|||
|FAX|传真|VARCHAR|是|30|||
|FIRST_NAME|名字|VARCHAR|是|40|||
|FULL_NAME|全名|VARCHAR|是|120|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INDUSTRY|行业|VARCHAR|是|60|||
|IS_DELETED|是否已删除|INT|是||||
|LAST_ACTIVITY_TIME|最近操作时间|DATETIME|是||||
|LAST_ASSESS_TIME|最近评估时间|DATETIME|是||||
|LAST_ENRICHED_TIME__S|最后充实时间|DATETIME|是||||
|LAST_NAME|姓氏|VARCHAR|是|80|||
|LEAD_CONVERSION_TIME|线索转换用时|INT|是||||
|LEAD_SOURCE|线索来源|VARCHAR|是|60|||
|LEAD_STATUS|线索状态|VARCHAR|是|60|||
|LOCKED__S|Locked|INT|是||||
|MOBILE|手机|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|NO_OF_EMPLOYEES|员工数|INT|是||||
|OWNER|客户所有者|VARCHAR|是|60|||
|PHONE|电话|VARCHAR|是|100|||
|PID|父线索标识|VARCHAR|是|100|||
|RATING|等级|VARCHAR|是|60|||
|RECORD_LMAGE|线索图片|VARCHAR|是|100|||
|SALUTATION|称呼|VARCHAR|是|60|||
|SECONDARY_EMAIL|备用邮箱|VARCHAR|是|100|||
|SKYPE_ID|Skype lD|VARCHAR|是|50|||
|STATE|省/市|VARCHAR|是|100|||
|STREET|街道|VARCHAR|是|250|||
|SUBJECT|主题|VARCHAR|是|255|||
|TAG|标签|VARCHAR|是|2000|||
|UNSUBSCRIBED_MODE|退订的方式|VARCHAR|是|60|||
|UNSUBSCRIBED_TIME|退订的时间|DATETIME|是||||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|WEBSITE|网站|VARCHAR|是|100|||
|ZIP_CODE|邮编|VARCHAR|是|30|||
#### 活动(MANEUVER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER|所有者|VARCHAR|是|60|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 备注(NOTE_ATTACH)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CONTENT|内容|TEXT|是|1048576|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|PRINCIPAL_ID|备注主体标识|VARCHAR|是|100|||
|PRINCIPAL_NAME|备注主体名称|VARCHAR|是|100|||
|PRINCIPAL_TYPE|备注主体类型|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 订单分配(ORDER_ALLOCATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AMOUNT|金额|DECIMAL|是||2||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER_ID|所属数据标识|VARCHAR|是|100|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|RATIO|分配比率|DECIMAL|是||2||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|USER_ID|用户标识|VARCHAR|是|100|||
#### 收付款(PAYEE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ALLOCATE_MODEL|分配模式|VARCHAR|是|100|||
|AMOUNT|金额|DECIMAL|是||||
|BUSINESS_LINE|业务条线|VARCHAR|是|100|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|METHOD|收款方式|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER|所有者|VARCHAR|是|100|||
|O_NUMBER|订单编号|VARCHAR|是|100|||
|PAYEE_DATE|收款日期|DATETIME|是||||
|PAYEE_NUMBER|编号|VARCHAR|是|120|||
|PAYEE_PLAN_ID|收款计划标识|VARCHAR|是|100|||
|PROJECT_ID|订单标识|VARCHAR|是|100|||
|SEQUENCE|序号|DECIMAL|是||||
|STATUS|状态|VARCHAR|是|60|||
|TYPE|类型|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|YEAR|所属年度|VARCHAR|是|100|||
#### 回款分配(PAYEE_ALLOCATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AMOUNT|金额|DECIMAL|是||2||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER_ID|所属数据标识|VARCHAR|是|100|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|PAYEE_ID|回款标识|VARCHAR|是|100|||
|RATIO|分配比率|DECIMAL|是||2||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|USER_ID|用户标识|VARCHAR|是|100|||
#### 收款计划(PAYEE_PLAN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AMOUNT|金额|DECIMAL|是||2||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_NOT_IN_PLAN|未纳入结算计划款|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|OWBER|所有者|VARCHAR|是|100|||
|O_NUMBER|订单编号|VARCHAR|是|100|||
|PLANNED_TIME|计划收款时间|DATETIME|是||||
|PLAN_STATUS|计划状态|VARCHAR|是|100|||
|PROJECT_ID|订单标识|VARCHAR|是|100|||
|SEQUENCE|序号|DECIMAL|是||||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 收款情况统计(PAYEE_STATISTIC)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AMOUNT|金额|DECIMAL|是||2||
|BUSINESS_LINE|业务条线|VARCHAR|是|60|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|款项说明|TEXT|是|32000|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OD_ID|原数据ID|VARCHAR|是|100|||
|OWNER|销售人员|VARCHAR|是|100|||
|PROJECT_ID|订单标识|VARCHAR|是|100|||
|SECTOR|行业|VARCHAR|是|100|||
|STATISTIC_DATE|统计时间|DATETIME|是||||
|TYPE|收款类型|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 价格表(PRICE_BOOK)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|活跃|INT|是||||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LOCKED__S|Locked|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|PRICE_BOOK_NAME|价格表名称|VARCHAR|是|120|||
|PRICING_DETAILS|价格明细|VARCHAR|是|120|||
|PRICING_MODEL|价格模型|VARCHAR|是|100|||
|TAG|标签|VARCHAR|是|2000|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 产品(PRODUCT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COMMISSION_RATE|佣金比例|VARCHAR|是|100|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LOCKED__S|Locked|INT|是||||
|MANUFACTURER|制造商|VARCHAR|是|60|||
|NAME|名称|VARCHAR|是|200|||
|OWNER|客户所有者|VARCHAR|是|60|||
|PRODUCT_ACTIVE|产品有效|INT|是||||
|PRODUCT_CATEGORY|产品分类|VARCHAR|是|60|||
|PRODUCT_CODE|产品编码|VARCHAR|是|255|||
|PRODUCT_NAME|产品名称|VARCHAR|是|255|||
|QTY_IN_DEMAND|需求数量|DECIMAL|是||||
|QTY_IN_STOCK|库存数量|DECIMAL|是||||
|QTY_ORDERED|订购数量|DECIMAL|是||||
|RECORD_IMAGE|产品图片|VARCHAR|是|100|||
|REORDER_LEVEL|库存警戒线|DECIMAL|是||||
|SALES_END_DATE|销售结束日期|DATETIME|是||||
|SALES_START_DATE|错售开始日期|DATETIME|是||||
|SUPPORT_EXPIRY_DATE|支持过期日期|DATETIME|是||||
|SUPPORT_START_DATE|支持开始日期|DATETIME|是||||
|TAG|标签|VARCHAR|是|2000|||
|TAX|税|VARCHAR|是|2000|||
|TAXABLE|应纳税|INT|是||||
|UNIT_PRICE|定价|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|USAGE_UNIT|使用单位|VARCHAR|是|60|||
|VENDOR_ID|供应商标识|VARCHAR|是|100|||
#### 产品证书(PRODUCT_CERTIFICATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCREDITED_ORGANIZATION|受证单位|VARCHAR|是|100|||
|AWARDING_ORGANIZATION|颁证机构|VARCHAR|是|100|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|END_DATE|有效期止|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|ISSUE_DATE|签发日期|DATETIME|是||||
|ISSUE_MAN|签发人|VARCHAR|是|100|||
|NAME|证书名称|VARCHAR|是|200|||
|PC_NUMBER|证书编号|VARCHAR|是|100|||
|PRODUCT_ID|产品标识|VARCHAR|是|100|||
|SCOPE|认证范围|VARCHAR|是|200|||
|SERVICE_NAME|产品/服务名称及型号|VARCHAR|是|200|||
|START_DATE|有效期起|DATETIME|是||||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 在线项目(PROJECT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCOUNT_ID|客户标识|VARCHAR|是|100|||
|ALLOCATE_MODEL|分配模式|VARCHAR|是|100|||
|AMOUNT|订单金额|DECIMAL|是||||
|BUSINESS_LINE|业务条线|VARCHAR|是|60|||
|CLOSED_DATE|关闭日期|DATETIME|是||||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_IN_SALES_CAL|是否纳入销售业绩计算|INT|是||||
|IS_PHYSICAL_ORDER|是否对应实体订单|INT|是||||
|LAST_ASSESS_TIME|最近评估时间|DATETIME|是||||
|LAST_NOTE_TIME|最近评估时间|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|ORDER_DATE|订单日期|DATETIME|是||||
|OWNER|所有者|VARCHAR|是|60|||
|O_NUMBER|订单编号|VARCHAR|是|120|||
|PID|父标识|VARCHAR|是|100|||
|SETTLEMENT_AMOUNT|业绩结算金额|DECIMAL|是||||
|SETTLEMENT_COST|结算成本|DECIMAL|是||||
|STATUS|状态|VARCHAR|是|60|||
|TAX|税率|VARCHAR|是|2000|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|YEAR|所属年度|VARCHAR|是|100|||
#### 采购订单(PURCHASE_ORDER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADJUSTMENT|调整|VARCHAR|是|100|||
|BILING_STREET|开单地址-街道|VARCHAR|是|250|||
|BILLING_CITY|开单地址-城市|VARCHAR|是|100|||
|BILLING_CODE|开单地址-邮编|VARCHAR|是|50|||
|BILLING_COUNTRY|开单地址-国家/地区|VARCHAR|是|100|||
|BILLING_STATE|开单地址-省/市|VARCHAR|是|100|||
|CARRIER|运输|VARCHAR|是|60|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|DISCOUNT|折扣|VARCHAR|是|100|||
|DUE_DATE|到期日期|DATETIME|是||||
|EXCISE_DUTY|消费税|VARCHAR|是|100|||
|GRAND_TOTAL|累计|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LOCKED__S|Locked|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|PO_DATE|订单日期|DATETIME|是||||
|PO_NUMBER|订单编号|VARCHAR|是|120|||
|REQUISITION_NO|申请号|VARCHAR|是|120|||
|SALES_COMMISSION|销售佣金|VARCHAR|是|100|||
|SHIPPING_CITY|发货地址-城市|VARCHAR|是|100|||
|SHIPPING_CODE|发货地址-邮编|VARCHAR|是|50|||
|SHIPPING_COUNTRY|发货地址-国家/地区|VARCHAR|是|100|||
|SHIPPING_STATE|发货地址-省/市|VARCHAR|是|100|||
|SHIPPING_STREET|发货地址-街道|VARCHAR|是|250|||
|STATUS|状态|VARCHAR|是|60|||
|SUBJECT|主题|VARCHAR|是|120|||
|SUB_TOTAL|小计|VARCHAR|是|100|||
|TAG|标签|VARCHAR|是|2000|||
|TAX|税|VARCHAR|是|100|||
|TERMS_AND_CONDITIONS|条款及条件|TEXT|是|32000|||
|TRACKING_NUMBER|追踪号|VARCHAR|是|120|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 报价(QUOTE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADJUSTMENT|调整|VARCHAR|是|100|||
|BILLING_CITY|开单地址-城市|VARCHAR|是|100|||
|BILLING_CODE|开单地址-邮编|VARCHAR|是|30|||
|BILLING_COUNTRY|开单地址-国家/地区|VARCHAR|是|100|||
|BILLING_STATE|开单地址-省/市|VARCHAR|是|100|||
|BILLING_STREET|记录ID|VARCHAR|是|250|||
|CARRIER|运输|VARCHAR|是|60|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|DISCOUNT|折扣|VARCHAR|是|100|||
|GRAND_TOTAL|累计|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LOCKED__S|Locked|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|QUOTE_NUMBER|报价编号|VARCHAR|是|100|||
|QUOTE_STAGE|报价阶段|VARCHAR|是|60|||
|SHIPPING_CITY|发货地址-城市|VARCHAR|是|100|||
|SHIPPING_CODE|发货地址-邮编|VARCHAR|是|30|||
|SHIPPING_COUNTRY|发货地址-国家/地区|VARCHAR|是|100|||
|SHIPPING_STATE|发货地址-省/市|VARCHAR|是|100|||
|SHIPPING_STREET|发货地址-街道|VARCHAR|是|250|||
|SUBJECT|主题|VARCHAR|是|120|||
|SUB_TOTAL|小计|VARCHAR|是|100|||
|TAG|标签|VARCHAR|是|2000|||
|TAX|税|VARCHAR|是|100|||
|TEAM|团队|VARCHAR|是|120|||
|TERMS_AND_CONDITIONS|条款及条件|TEXT|是|32000|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|VALID_TILL|有效期至|DATETIME|是||||
#### recent(RECENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IDENTIFIER|编号|VARCHAR|是|100|||
|IS_DELETED|是否已删除|INT|是||||
|NAME|名称|VARCHAR|是|500|||
|OWNER_ID|所属数据标识|VARCHAR|是|100|||
|OWNER_SUBTYPE|所属对象子类型|VARCHAR|是|100|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|RECENT_PARENT|访问父类|VARCHAR|是|100|||
|RECENT_PARENT_IDENTIFIER|访问父类编号|VARCHAR|是|100|||
|RECENT_PARENT_NAME|访问父类名称|VARCHAR|是|100|||
|TYPE|访问类型|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 关联(RELATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PRINCIPAL_ID|关联主体标识|VARCHAR|是|100|||
|PRINCIPAL_TYPE|关联主体类型|VARCHAR|是|100|||
|TARGET_ID|关联目标标识|VARCHAR|是|100|||
|TARGET_TYPE|关联目标类型|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 预留(RESERVATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 销售订单(SALES_ORDER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADJUSTMENT|客户编号|VARCHAR|是|100|||
|BILLING_CITY|开单地址-城市|VARCHAR|是|100|||
|BILLING_CODE|报价名称|VARCHAR|是|30|||
|BILLING_COUNTRY|开单地址-国家/地区|VARCHAR|是|100|||
|BILLING_STATE|调整|VARCHAR|是|100|||
|BILLING_STREET|开单地址-街道|VARCHAR|是|250|||
|CARRIER|运输|VARCHAR|是|60|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|CUSTOMER_NO|发货地址-省/市|VARCHAR|是|120|||
|DESCRIPTION|条款及条件|TEXT|是|32000|||
|DISCOUNT|折扣|VARCHAR|是|100|||
|DUE_DATE|到期日期|DATETIME|是||||
|EXCISE_DUTY|消费税|VARCHAR|是|100|||
|GRAND_TOTAL|采购订单|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LOCKED__S|Locked|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|PENDING|待决|VARCHAR|是|120|||
|PURCHASE_ORDER|开单地址-邮编|VARCHAR|是|120|||
|QUOTE_NAME|描述|TEXT|是|1048576|||
|SALES_COMMISSION|销售佣金|VARCHAR|是|100|||
|SHIPPING_CITY|税|VARCHAR|是|100|||
|SHIPPING_CODE|发货地址-邮编|VARCHAR|是|30|||
|SHIPPING_COUNTR|发货地址-国家/地区|VARCHAR|是|100|||
|SHIPPING_STATE|累计|VARCHAR|是|100|||
|SHIPPING_STREET|发货地址-街道|VARCHAR|是|250|||
|SO_NUMBER|销售订单编号|VARCHAR|是|100|||
|STATUS|状态|VARCHAR|是|60|||
|SUBJECT|主题|VARCHAR|是|120|||
|SUB_TOTAL|小计|VARCHAR|是|100|||
|TAG|标签|VARCHAR|是|2000|||
|TAX|开单地址-省/市|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 日程(SCHEDULE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|END_DATETIME|结束日期时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER|客户所有者|VARCHAR|是|60|||
|OWNER_ID|所属数据标识|VARCHAR|是|100|||
|OWNER_SUBTYPE|所属对象子类型|VARCHAR|是|100|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|START_DATETIME|起始日期时间|DATETIME|是||||
|STATUS|状态|VARCHAR|是|60|||
|TYPE|类型|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 解决方案(SOLUTION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADD_COMMENT|添加评论|TEXT|是|32000|||
|ANSWER|答案|TEXT|是|32000|||
|COMMENTS|评论|VARCHAR|是|1000|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LOCKED__S|Locked|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|NO_OF_COMMENTS|评论数量|INT|是||||
|PUBLISHED|已发布|INT|是||||
|QUESTION|问题|TEXT|是|32000|||
|SOLUTION_NUMBER|解决方案编号|VARCHAR|是|100|||
|SOLUTION_TITLE|解决方案标题|VARCHAR|是|100|||
|STATUS|状态|VARCHAR|是|60|||
|TAG|标签|VARCHAR|是|2000|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 标签(TAG)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COLOR|颜色|VARCHAR|是|100|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 任务(TASK)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CLOSED_TIME|关闭时间|DATETIME|是||||
|COST|费用|DECIMAL|是||||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|DUE_DATE|到期日期|DATETIME|是||||
|END_TIME|结束时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LAST_ASSESS_TIME|最近评估时间|DATETIME|是||||
|LOCKED__S|Locked|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|OWNER|所有者|VARCHAR|是|60|||
|OWNER_ID|所属数据标识|VARCHAR|是|100|||
|OWNER_NAME|所属数据名称|VARCHAR|是|100|||
|OWNER_SUBTYPE|所属对象子类型|VARCHAR|是|100|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|PID|父任务标识|VARCHAR|是|100|||
|PRIORITY|优先级|VARCHAR|是|60|||
|REMIND_AT|提醒时间|DATETIME|是||||
|SEND_NOTIFICATION_EMAIL|发送通知邮件|INT|是||||
|START_TIME|开始时间|DATETIME|是||||
|STATUS|状态|VARCHAR|是|60|||
|SUBJECT|主题|VARCHAR|是|255|||
|TAG|标签|VARCHAR|是|2000|||
|TYPE|类型|VARCHAR|是|60|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 任务执行人(TASK_EXECUTOR)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|TASK_ID|任务标识|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|USER_ID|人员标识|VARCHAR|是|100|||
#### 用户(USER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ALIAS|别名|VARCHAR|是|50|||
|CITY|城市|VARCHAR|是|100|||
|COUNTRY|国家/地区|VARCHAR|是|100|||
|COUNTRY_LOCALE|国家/地区设置|VARCHAR|是|100|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DOB|生日|DATETIME|是||||
|EMAIL|电子邮件|VARCHAR|是|100|||
|ENABLE|逻辑有效标志|INT|是|8|||
|FAX|传真|VARCHAR|是|30|||
|FIRST_NAME|名字|VARCHAR|是|50|||
|FULL_NAME|全名|VARCHAR|是|120|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IMAGE_LINK|头像|VARCHAR|是|200|||
|LAST_NAME|姓氏|VARCHAR|是|50|||
|LOCALE|语言|VARCHAR|是|100|||
|MOBILE|手机|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|PHONE|电话|VARCHAR|是|100|||
|ROLE|职位|VARCHAR|是|100|||
|STATE|省/市|VARCHAR|是|100|||
|STATUS|状态|VARCHAR|是|60|||
|STREET|街道|VARCHAR|是|250|||
|SYSUSERID|rt用户标识|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|USER_NAME|账号|VARCHAR|是|100|||
|WEBSITE|网站|VARCHAR|是|200|||
|ZIP|邮编|VARCHAR|是|30|||
#### 供应商(VENDOR)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CATEGORY|分类|VARCHAR|是|120|||
|CITY|城市|VARCHAR|是|100|||
|COUNTRY|国家/地区|VARCHAR|是|100|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|EMAIL|电子邮件|VARCHAR|是|100|||
|EMAIL_OPT_OUT|不发营销邮件|INT|是||||
|GL_ACCOUNT|总分类账户|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LOCKED__S|Locked|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|OWNER|所有者|VARCHAR|是|60|||
|PHONE|电话|VARCHAR|是|100|||
|RECORD_LMAGE|供应商图片|VARCHAR|是|100|||
|STATE|省/市|VARCHAR|是|100|||
|STREET|街道|VARCHAR|是|250|||
|TAG|标签|VARCHAR|是|100|||
|UNSUBSCRIBED_MODE|退订的方式|VARCHAR|是|60|||
|UNSUBSCRIBED_TIME|退订的时间|DATETIME|是||||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|VENDOR_NAME|供应商名称|VARCHAR|是|120|||
|WEBSITE|网站|VARCHAR|是|100|||
|ZIP_CODE|邮编|VARCHAR|是|30|||
#### 周报(WEEKLIES)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ATTACHMENT|周报文件|VARCHAR|是|1000|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|END_DATE|结束时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER|所有者|VARCHAR|是|60|||
|START_DATE|开始时间|DATETIME|是||||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 周报明细(WEEKLY_DETAIL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CONTENT|内容|VARCHAR|是|100|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PRINCIPAL_ID|关联主体标识|VARCHAR|是|100|||
|PRINCIPAL_TYPE|关联主体类型|VARCHAR|是|100|||
|TARGET_ID|关联目标标识|VARCHAR|是|100|||
|TARGET_TYPE|关联目标类型|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|WEEKLIES_ID|周报标识|VARCHAR|是|100|||
#### 工作进展(WORK_PROGRESS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIONTYPE|操作类型|VARCHAR|是|100|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DESCRIPTION|描述|TEXT|是|32000|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|TARGET_ID|关联目标标识|VARCHAR|是|100|||
|TARGET_NAME|关联目标名称|VARCHAR|是|100|||
|TARGET_TYPE|关联目标类型|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||






