# crm(crm) <!-- {docsify-ignore-all} -->



### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[客户(ACCOUNT)](module/crm/account)|account|主实体|SQL|ACCOUNT|否|否|自控制|是||
|[活动(ACTIVITIY)](module/crm/activitiy)|activitiy|主实体|SQL|ACTIVITIY|否|否|自控制|否||
|[附件(ATTACHMENT)](module/crm/attachment)|attachment|动态附属实体|SQL|ATTACHMENT|否|否|附属主实体控制|否||
|[通话(CALL)](module/crm/call)|call|主实体|SQL|CALL|否|否|自控制|是||
|[市场活动(CAMPAIGN)](module/crm/campaign)|campaign|主实体|SQL|CAMPAIGN|否|否|自控制|是||
|[联系人(CONTACT)](module/crm/contact)|contact|主实体|SQL|CONTACT|否|否|自控制|是||
|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|custom_button|主实体|SQL|CUSTOM_BUTTON|否|否|自控制|否||
|[商机(DEAL)](module/crm/deal)|deal|主实体|SQL|DEAL|否|否|自控制|是||
|[阶段历史(DEAL_HISTORY)](module/crm/deal_history)|deal_history|主实体|SQL|DEAL_HISTORY|否|否|附属主实体控制|否||
|[商机阶段(DEAL_STAGE)](module/crm/deal_stage)|deal_stage|主实体|SQL|DEAL_STAGE|否|否|自控制|否||
|[会议(EVENT)](module/crm/event)|event|主实体|SQL|EVENT|否|否|自控制|是||
|[执行人(EXECUTOR)](module/crm/executor)|executor|主实体|SQL|EXECUTOR|否|否|自控制|否||
|[发货单(INVOICE)](module/crm/invoice)|invoice|主实体|SQL|INVOICE|否|否|自控制|是||
|[货品(ITEM)](module/crm/item)|item|主实体|SQL|ITEM|否|否|自控制|否||
|[线索(LEAD)](module/crm/lead)|lead|主实体|SQL|LEAD|否|否|自控制|是||
|[活动(MANEUVER)](module/crm/maneuver)|maneuver|主实体|SQL|MANEUVER|否|否|自控制|是||
|[备注(NOTE_ATTACH)](module/crm/note_attach)|note_attach|主实体|SQL|NOTE_ATTACH|否|否|自控制|否||
|[订单分配(ORDER_ALLOCATE)](module/crm/order_allocate)|order_allocate|主实体|SQL|ORDER_ALLOCATE|否|否|自控制|否||
|[收款记录(PAYEE)](module/crm/payee)|payee|主实体|SQL|PAYEE|否|否|自控制|是||
|[回款分配(PAYEE_ALLOCATE)](module/crm/payee_allocate)|payee_allocate|主实体|SQL|PAYEE_ALLOCATE|否|否|自控制|否||
|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|payee_plan|主实体|SQL|PAYEE_PLAN|否|否|自控制|是||
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)|payee_statistic|主实体|SQL|PAYEE_STATISTIC|否|否|自控制|否||
|[价格表(PRICE_BOOK)](module/crm/price_book)|price_book|主实体|SQL|PRICE_BOOK|否|否|自控制|是||
|[产品(PRODUCT)](module/crm/product)|product|主实体|SQL|PRODUCT|否|否|自控制|是||
|[产品证书(PRODUCT_CERTIFICATE)](module/crm/product_certificate)|product_certificate|主实体|SQL|PRODUCT_CERTIFICATE|否|否|自控制|是||
|[订单(PROJECT)](module/crm/project)|project|主实体|SQL|PROJECT|否|否|自控制|是||
|[采购订单(PURCHASE_ORDER)](module/crm/purchase_order)|purchase_order|主实体|SQL|PURCHASE_ORDER|否|否|自控制|是||
|[报价(QUOTE)](module/crm/quote)|quote|主实体|SQL|QUOTE|否|否|自控制|是||
|[最近访问(RECENT)](module/crm/recent)|recent|主实体|SQL|RECENT|是|否|自控制|否||
|[关联(RELATION)](module/crm/relation)|relation|主实体|SQL|RELATION|是|否|自控制|否||
|[预留(RESERVATION)](module/crm/reservation)|reservation|主实体|SQL|RESERVATION|否|否|自控制|否||
|[销售订单(SALES_ORDER)](module/crm/sales_order)|sales_order|主实体|SQL|SALES_ORDER|否|否|自控制|是||
|[日程(SCHEDULE)](module/crm/schedule)|schedule|主实体|SQL|SCHEDULE|否|否|自控制|否||
|[服务支持(CASE)](module/crm/service_case)|service_case|主实体|SQL|CASE|否|否|自控制|是||
|[解决方案(SOLUTION)](module/crm/solution)|solution|主实体|SQL|SOLUTION|否|否|自控制|是||
|[标签(TAG)](module/crm/tag)|tag|主实体|SQL|TAG|否|否|自控制|否||
|[任务&活动(TASK)](module/crm/task)|task|主实体|SQL|TASK|否|否|自控制|是||
|[任务执行人(TASK_EXECUTOR)](module/crm/task_executor)|task_executor|主实体|SQL|TASK_EXECUTOR|否|否|自控制|否||
|[用户(USER)](module/crm/user)|user|主实体|SQL|USER|否|否|自控制|否||
|[供应商(VENDOR)](module/crm/vendor)|vendor|主实体|SQL|VENDOR|否|否|自控制|是||
|[周报(WEEKLIES)](module/crm/weeklies)|weeklies|主实体|SQL|WEEKLIES|否|否|自控制|否||
|[周报明细(WEEKLY_DETAIL)](module/crm/weekly_detail)|weekly_detail|主实体|SQL|WEEKLY_DETAIL|否|否|自控制|否||
|[工作进展(WORK_PROGRESS)](module/crm/work_progress)|work_progress|主实体|SQL|WORK_PROGRESS|否|否|自控制|否||

### ER图

|  中文名col200      |   代码名col150    |  备注col450  |
|  --------   |------------ |  -------- |
|[zoho](er/zoho)|zoho||
|[订单](er/Usr0619854844)|Usr0619854844||
|[产品](er/product)|product||

