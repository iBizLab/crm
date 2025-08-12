# 模型预警 <!-- {docsify-ignore-all} -->


### 未配置数据字典项<sup class="footnote-symbol"> <font color=orange>[8]</font></sup>
| 数据字典col200   | 代码标识col300  |
| --------   |------------|
|[同构汇总表时间维度](index/dictionary_index#codelist95)|CodeList95|
|[工作时间代码表](index/dictionary_index#codelist49)|CodeList49|
|[应用界面主题](index/dictionary_index#codelist58)|CodeList58|
|[数据库存储区域](index/dictionary_index#codelist105)|CodeList105|
|[税](index/dictionary_index#tax)|tax|
|[系统内置菜单](index/dictionary_index#codelist79)|CodeList79|
|[页面参数](index/dictionary_index#codelist64)|CodeList64|
|[页面参数类型](index/dictionary_index#codelist78)|CodeList78|

### 处理逻辑中使用脚本<sup class="footnote-symbol"> <font color=orange>[9]</font></sup>
| 实体col200   | 处理逻辑col300  | 脚本模式col100  |
| --------   |------------|----------|
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic#处理逻辑)|[将分配数据更新到统计表(update_payee_allocate)](module/crm/payee_statistic/logic/update_payee_allocate.md)|否|
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic#处理逻辑)|[将计划数据更新到统计表(update_payee_staticstic)](module/crm/payee_statistic/logic/update_payee_staticstic.md)|否|
|[订单(PROJECT)](module/crm/project#处理逻辑)|[检测子订单状态后保存订单(scan_save)](module/crm/project/logic/scan_save.md)|否|
|[任务&活动(TASK)](module/crm/task#处理逻辑)|[取消关联(cancel_relation)](module/crm/task/logic/cancel_relation.md)|否|
|[任务&活动(TASK)](module/crm/task#处理逻辑)|[取消关联(商机)(deal_cancel_relation)](module/crm/task/logic/deal_cancel_relation.md)|否|
|[任务&活动(TASK)](module/crm/task#处理逻辑)|[取消关联(线索)(lead_cancel_relation)](module/crm/task/logic/lead_cancel_relation.md)|否|
|[用户(USER)](module/crm/user#处理逻辑)|[查询销售领导(SalesLeader)](module/crm/user/logic/SalesLeader.md)|否|
|[周报(WEEKLIES)](module/crm/weeklies#处理逻辑)|[新建周报时加载关联信息(relation)](module/crm/weeklies/logic/relation.md)|否|
|[周报(WEEKLIES)](module/crm/weeklies#处理逻辑)|[根据统计时间更新关联信息(updateRelation)](module/crm/weeklies/logic/updateRelation.md)|否|

### 处理逻辑中使用SQL调用<sup class="footnote-symbol"> <font color=orange>[11]</font></sup>
| 实体col200   | 处理逻辑col300  |
| --------   |------------|
|[商机(DEAL)#处理逻辑](module/crm/deal)|[商机阶段更新时生成历史(scdealstagehis)](module/crm/deal/logic/scdealstagehis.md)|
|[商机(DEAL)#处理逻辑](module/crm/deal)|[获取商机关联任务和活动(get_task_and_maneuver)](module/crm/deal/logic/get_task_and_maneuver.md)|
|[线索(LEAD)#处理逻辑](module/crm/lead)|[线索转商机(leadToDeal)](module/crm/lead/logic/leadToDeal.md)|
|[线索(LEAD)#处理逻辑](module/crm/lead)|[获取线索关联任务和活动(get_task_and_maneuver)](module/crm/lead/logic/get_task_and_maneuver.md)|
|[收款情况统计(PAYEE_STATISTIC)#处理逻辑](module/crm/payee_statistic)|[将分配数据更新到统计表(update_payee_allocate)](module/crm/payee_statistic/logic/update_payee_allocate.md)|
|[收款情况统计(PAYEE_STATISTIC)#处理逻辑](module/crm/payee_statistic)|[清空收款计划表(delete_statistic)](module/crm/payee_statistic/logic/delete_statistic.md)|
|[收款情况统计(PAYEE_STATISTIC)#处理逻辑](module/crm/payee_statistic)|[计算统计数据(Calculation)](module/crm/payee_statistic/logic/Calculation.md)|
|[周报(WEEKLIES)#处理逻辑](module/crm/weeklies)|[打开详情页获取关联数据(openDetail)](module/crm/weeklies/logic/openDetail.md)|
|[周报(WEEKLIES)#处理逻辑](module/crm/weeklies)|[打开详情页获取关联数据2(openDetail2)](module/crm/weeklies/logic/openDetail2.md)|
|[周报(WEEKLIES)#处理逻辑](module/crm/weeklies)|[新建周报时加载关联信息(relation)](module/crm/weeklies/logic/relation.md)|
|[周报(WEEKLIES)#处理逻辑](module/crm/weeklies)|[根据统计时间更新关联信息(updateRelation)](module/crm/weeklies/logic/updateRelation.md)|

### 界面逻辑中使用脚本<sup class="footnote-symbol"> <font color=orange>[26]</font></sup>
| 实体col200   | 界面逻辑col300  |
| --------   |------------|
|[客户(ACCOUNT)](module/crm/account#界面逻辑)|[添加附件](module/crm/account/uilogic/add_attachment)|
|[附件(ATTACHMENT)](module/crm/attachment#界面逻辑)|[附件_删除](module/crm/attachment/uilogic/remove_attachment_sc)|
|[市场活动(CAMPAIGN)](module/crm/campaign#界面逻辑)|[添加附件](module/crm/campaign/uilogic/add_attachment)|
|[服务支持(CASE)](module/crm/service_case#界面逻辑)|[添加附件](module/crm/service_case/uilogic/add_attachment)|
|[联系人(CONTACT)](module/crm/contact#界面逻辑)|[添加附件](module/crm/contact/uilogic/add_attachment)|
|[商机(DEAL)](module/crm/deal#界面逻辑)|[添加附件](module/crm/deal/uilogic/add_attachment)|
|[发货单(INVOICE)](module/crm/invoice#界面逻辑)|[添加附件](module/crm/invoice/uilogic/add_attachment)|
|[线索(LEAD)](module/crm/lead#界面逻辑)|[添加附件](module/crm/lead/uilogic/add_attachment)|
|[备注(NOTE_ATTACH)](module/crm/note_attach#界面逻辑)|[编辑备注](module/crm/note_attach/uilogic/edit_note)|
|[备注(NOTE_ATTACH)](module/crm/note_attach#界面逻辑)|[清空评论](module/crm/note_attach/uilogic/clear_comment)|
|[备注(NOTE_ATTACH)](module/crm/note_attach#界面逻辑)|[发送评论](module/crm/note_attach/uilogic/send_comment)|
|[收款记录(PAYEE)](module/crm/payee#界面逻辑)|[收款记录保存之前](module/crm/payee/uilogic/before_save_payee)|
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic#界面逻辑)|[导航到表格视图（统计图表导航）](module/crm/payee_statistic/uilogic/exp_to_gridview)|
|[价格表(PRICE_BOOK)](module/crm/price_book#界面逻辑)|[添加附件](module/crm/price_book/uilogic/add_attachment)|
|[产品(PRODUCT)](module/crm/product#界面逻辑)|[添加附件](module/crm/product/uilogic/add_attachment)|
|[产品证书(PRODUCT_CERTIFICATE)](module/crm/product_certificate#界面逻辑)|[添加附件](module/crm/product_certificate/uilogic/add_attachment)|
|[订单(PROJECT)](module/crm/project#界面逻辑)|[添加附件](module/crm/project/uilogic/add_attachment)|
|[采购订单(PURCHASE_ORDER)](module/crm/purchase_order#界面逻辑)|[添加附件](module/crm/purchase_order/uilogic/add_attachment)|
|[报价(QUOTE)](module/crm/quote#界面逻辑)|[添加附件](module/crm/quote/uilogic/add_attachment)|
|[销售订单(SALES_ORDER)](module/crm/sales_order#界面逻辑)|[添加附件](module/crm/sales_order/uilogic/add_attachment)|
|[解决方案(SOLUTION)](module/crm/solution#界面逻辑)|[添加附件](module/crm/solution/uilogic/add_attachment)|
|[任务&活动(TASK)](module/crm/task#界面逻辑)|[添加附件](module/crm/task/uilogic/add_attachment)|
|[用户(USER)](module/crm/user#界面逻辑)|[修改密码（表单）](module/crm/user/uilogic/change_pas)|
|[供应商(VENDOR)](module/crm/vendor#界面逻辑)|[添加附件](module/crm/vendor/uilogic/add_attachment)|
|[周报(WEEKLIES)](module/crm/weeklies#界面逻辑)|[生成周报附件](module/crm/weeklies/uilogic/generate_attachment)|
|[周报(WEEKLIES)](module/crm/weeklies#界面逻辑)|[打开新建周报编辑视图](module/crm/weeklies/uilogic/open_new_edit)|

### 包含长文本的查询<sup class="footnote-symbol"> <font color=orange>[22]</font></sup>
| 实体col200   | 数据查询col300  |
| --------   |------------|
|[活动(ACTIVITIY)](module/crm/activitiy)|[数据查询(DEFAULT)](module/crm/activitiy/query/Default)|
|[商机(DEAL)](module/crm/deal)|[全部商机(All)](module/crm/deal/query/All)|
|[线索(LEAD)](module/crm/lead)|[全部数据(all)](module/crm/lead/query/all)|
|[备注(NOTE_ATTACH)](module/crm/note_attach)|[ByOwner](module/crm/note_attach/query/ByOwner)|
|[备注(NOTE_ATTACH)](module/crm/note_attach)|[数据查询(DEFAULT)](module/crm/note_attach/query/Default)|
|[备注(NOTE_ATTACH)](module/crm/note_attach)|[创建者(createman)](module/crm/note_attach/query/createman)|
|[收款记录(PAYEE)](module/crm/payee)|[数据查询(DEFAULT)](module/crm/payee/query/Default)|
|[收款记录(PAYEE)](module/crm/payee)|[创建者(createman)](module/crm/payee/query/createman)|
|[收款记录(PAYEE)](module/crm/payee)|[执行人(executor)](module/crm/payee/query/executor)|
|[收款记录(PAYEE)](module/crm/payee)|[金额汇总(sum)](module/crm/payee/query/sum)|
|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|[数据查询(DEFAULT)](module/crm/payee_plan/query/Default)|
|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|[全部(all)](module/crm/payee_plan/query/all)|
|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|[创建者(createman)](module/crm/payee_plan/query/createman)|
|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|[执行人(executor)](module/crm/payee_plan/query/executor)|
|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|[金额汇总(sum)](module/crm/payee_plan/query/sum)|
|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|[进行中(toward)](module/crm/payee_plan/query/toward)|
|[任务&活动(TASK)](module/crm/task)|[关闭的任务（关联）(close_task_related)](module/crm/task/query/close_task_related)|
|[任务&活动(TASK)](module/crm/task)|[活动_关联(maneuver_related)](module/crm/task/query/maneuver_related)|
|[任务&活动(TASK)](module/crm/task)|[任务关联已完成任务(relate_complete_task)](module/crm/task/query/relate_complete_task)|
|[工作进展(WORK_PROGRESS)](module/crm/work_progress)|[数据查询(DEFAULT)](module/crm/work_progress/query/Default)|
|[工作进展(WORK_PROGRESS)](module/crm/work_progress)|[创建者(createman)](module/crm/work_progress/query/createman)|
|[工作进展(WORK_PROGRESS)](module/crm/work_progress)|[根据日期天查询工作进展(findWorkProgressByDate)](module/crm/work_progress/query/findWorkProgressByDate)|

### 使用自定义SQL的查询<sup class="footnote-symbol"> <font color=orange>[7]</font></sup>
| 实体col200   | 数据查询col300  |
| --------   |------------|
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)|[空未明确(emptyIndefinite)](module/crm/payee_statistic/query/emptyIndefinite)|
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)|[空收款记录(emptyPayee)](module/crm/payee_statistic/query/emptyPayee)|
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)|[空计划(emptyPlan)](module/crm/payee_statistic/query/emptyPlan)|
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)|[查询计划和记录(findplan_payee)](module/crm/payee_statistic/query/findplan_payee)|
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)|[统计时间之后(pending)](module/crm/payee_statistic/query/pending)|
|[订单(PROJECT)](module/crm/project)|[月份无订单(monthNoPro)](module/crm/project/query/monthNoPro)|
|[周报(WEEKLIES)](module/crm/weeklies)|[周报期间(period)](module/crm/weeklies/query/period)|


### 未配置查询的数据集合<sup class="footnote-symbol"> <font color=orange>[1]</font></sup>
| 实体col200   | 数据集合col300  |
| --------   |------------|
|[阶段历史(DEAL_HISTORY)](module/crm/deal_history)|[创建者(createman)](module/crm/deal_history/dataset/createman)|

### 未配置权限请求接口<sup class="footnote-symbol"> <font color=orange>[12]</font></sup>
| 实体col200| 请求路径col500| 请求方式col100   |    行为/集合col300    |
| -------- |-------- | --------|-------- |
|[商机(DEAL)](module/crm/deal.md)|/deals/{key}/add_deal_to_work_progress|POST|[新建商机时添加到工作进展(addDealToWorkProgress)](module/crm/deal#行为)|
|[商机(DEAL)](module/crm/deal.md)|/deals/{key}/async_add_deal_to_work_progress|POST|[异步新建商机时添加到工作进展(Async_addDealToWorkProgress)](module/crm/deal#行为)|
|[线索(LEAD)](module/crm/lead.md)|/leads/{key}/add_leadto_work_progress|POST|[新建线索时添加到工作进展(addLeadtoWorkProgress)](module/crm/lead#行为)|
|[线索(LEAD)](module/crm/lead.md)|/leads/{key}/async_add_leadto_work_progress|POST|[异步新建线索时添加到工作进展(Async_addLeadtoWorkProgress)](module/crm/lead#行为)|
|[备注(NOTE_ATTACH)](module/crm/note_attach.md)|/note_attaches/{key}/async_evaluate_to_work_progress|POST|[异步新建评估时添加到工作进展(Async_evaluateToWorkProgress)](module/crm/note_attach#行为)|
|[备注(NOTE_ATTACH)](module/crm/note_attach.md)|/note_attaches/{key}/evaluate_to_work_progress|POST|[新建评估时添加到工作进展(evaluateToWorkProgress)](module/crm/note_attach#行为)|
|[收款记录(PAYEE)](module/crm/payee.md)|/payees/{key}/add_payee_to_work_progress|POST|[新建收款记录添加到工作进展(addPayeeToWorkProgress)](module/crm/payee#行为)|
|[收款记录(PAYEE)](module/crm/payee.md)|/payees/{key}/async_add_payee_to_work_progress|POST|[异步新建线索时添加到工作进展(Async_addPayeeToWorkProgress)](module/crm/payee#行为)|
|[订单(PROJECT)](module/crm/project.md)|/projects/{key}/add_project_to_work_progress|POST|[新建订单时添加到工作进展(addProjectToWorkProgress)](module/crm/project#行为)|
|[订单(PROJECT)](module/crm/project.md)|/projects/{key}/async_add_project_to_work_progress|POST|[异步新建订单时添加到工作进展(Async_addProjectToWorkProgress)](module/crm/project#行为)|
|[任务&活动(TASK)](module/crm/task.md)|/tasks/{key}/async_maneuver_to_work_progress|POST|[异步新建活动时添加到工作进展(Async_maneuverToWorkProgress)](module/crm/task#行为)|
|[任务&活动(TASK)](module/crm/task.md)|/tasks/{key}/maneuver_to_work_progress|POST|[新建活动时添加到工作进展(maneuverToWorkProgress)](module/crm/task#行为)|

### NONE权限请求接口<sup class="footnote-symbol"> <font color=orange>[23]</font></sup>
| 实体col200| 请求路径col500| 请求方式col100   |    行为/集合col300    |
| -------- |-------- | --------|-------- |
|[客户(ACCOUNT)](module/crm/account.md)|/accounts/{key}/find_account|POST|[通过id查询客户信息(find_account)](module/crm/account#行为)|
|[客户(ACCOUNT)](module/crm/account.md)|/accounts/{key}/merge_account|POST|[合并客户(merge_account)](module/crm/account#行为)|
|[商机(DEAL)](module/crm/deal.md)|/deals/add_deal|POST|[添加商机(add_deal)](module/crm/deal#行为)|
|[商机(DEAL)](module/crm/deal.md)|/deals/stage_probability|POST|[获取阶段概率(stageProbability)](module/crm/deal#行为)|
|[线索(LEAD)](module/crm/lead.md)|/leads/{key}/lead_to_be_deal|POST|[派生商机(leadToBeDeal)](module/crm/lead#行为)|
|[线索(LEAD)](module/crm/lead.md)|/leads/{key}/lead_to_deal|POST|[线索转商机(leadToDeal)](module/crm/lead#行为)|
|[收款记录(PAYEE)](module/crm/payee.md)|/payees/account_from_plan|POST|[获取对应记录金额(AccountFromPlan)](module/crm/payee#行为)|
|[收款记录(PAYEE)](module/crm/payee.md)|/payees/allocate_from_project|POST|[获取订单的人员分配(AllocateFromProject)](module/crm/payee#行为)|
|[收款记录(PAYEE)](module/crm/payee.md)|/payees/plan_info_by_project|POST|[通过project_id获取plan(PlanInfoByProject)](module/crm/payee#行为)|
|[收款记录(PAYEE)](module/crm/payee.md)|/payees/project_info|POST|[获取订单相关信息(ProjectInfo)](module/crm/payee#行为)|
|[收款计划(PAYEE_PLAN)](module/crm/payee_plan.md)|/payee_plans/add_project|POST|[获取订单数据(add_project)](module/crm/payee_plan#行为)|
|[收款计划(PAYEE_PLAN)](module/crm/payee_plan.md)|/payee_plans/{key}/plan_to_payee|POST|[将数据传给记录(plan_to_payee)](module/crm/payee_plan#行为)|
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic.md)|/payee_statistics/{key}/all_statistic|POST|[将计划数据更新到统计表(all_statistic)](module/crm/payee_statistic#行为)|
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic.md)|/payee_statistics/{key}/async_calculation|POST|[异步计算统计数据(Async_Calculation)](module/crm/payee_statistic#行为)|
|[产品(PRODUCT)](module/crm/product.md)|/products/add_product|POST|[添加产品(add_product)](module/crm/product#行为)|
|[产品(PRODUCT)](module/crm/product.md)|/products/{key}/unlink|POST|[取消关联(unlink)](module/crm/product#行为)|
|[订单(PROJECT)](module/crm/project.md)|/projects/find_by_pid|POST|[查询父订单信息(FindByPid)](module/crm/project#行为)|
|[订单(PROJECT)](module/crm/project.md)|/projects/{key}/scan_status|PUT|[检测子订单是否有未关闭订单(CheckSubAndUpdate)](module/crm/project#行为)|
|[任务&活动(TASK)](module/crm/task.md)|/tasks/{key}/closed_task|POST|[关闭任务/活动(Closed_task)](module/crm/task#行为)|
|[用户(USER)](module/crm/user.md)|/users/{key}/unlink|POST|[取消关联(unlink)](module/crm/user#行为)|
|[周报(WEEKLIES)](module/crm/weeklies.md)|/weeklies/get_link_type|POST|[获取链接视图类型(get_link_type)](module/crm/weeklies#行为)|
|[周报(WEEKLIES)](module/crm/weeklies.md)|/weeklies/{key}/nothing|POST|[无操作(nothing)](module/crm/weeklies#行为)|
|[周报(WEEKLIES)](module/crm/weeklies.md)|/weeklies/fetch_period|POST|[周报期间(period)](module/crm/weeklies#数据集合)|

### 操作标识未配置映射<sup class="footnote-symbol"> <font color=orange>[2]</font></sup>
| 实体col200   | 操作标识col300  |
| --------   |------------|
|[附件(ATTACHMENT)](module/crm/attachment.md)|CREATE<br>READ<br>DELETE<br>UPDATE|
|[阶段历史(DEAL_HISTORY)](module/crm/deal_history.md)|CREATE<br>READ<br>DELETE<br>UPDATE|

### 除主键、主信息、预置属性外，不包含其他配置的表格<sup class="footnote-symbol"> <font color=orange>[16]</font></sup>
| 实体col200   |   视图col400 | 表格col400  |
| --------   |------------|------------|
|[客户(ACCOUNT)](module/crm/account)|主表格(main)|[客户(account_pickup_grid_view)](app/view/account_pickup_grid_view)|
|[通话(CALL)](module/crm/call)|已完成的任务&历史活动（通话）（表格）_表格(grid_close_view_grid)|[已完成的任务&历史活动（通话）(call_grid_close_view)](app/view/call_grid_close_view)|
|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|主表格(main)|[链接(custom_button_grid_view)](app/view/custom_button_grid_view)|
|[商机(DEAL)](module/crm/deal)|主表格(main)|[商机(deal_pickup_grid_view)](app/view/deal_pickup_grid_view)|
|[商机阶段(DEAL_STAGE)](module/crm/deal_stage)|主表格(main)|[商机阶段(deal_stage_pickup_grid_view)](app/view/deal_stage_pickup_grid_view)|
|[会议(EVENT)](module/crm/event)|主表格(main)|[已完成的任务&历史活动（会议）(event_grid_close_view)](app/view/event_grid_close_view)|
|[收款记录(PAYEE)](module/crm/payee)|记录反查表格_表格(usr06216630_grid_view_grid)|[记录反查表格(payee_usr06216630_grid_view)](app/view/payee_usr06216630_grid_view)|
|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|计划反查表格_表格(reverse_grid_view_grid)|[计划反查表格(payee_plan_reverse_grid_view)](app/view/payee_plan_reverse_grid_view)|
|[价格表(PRICE_BOOK)](module/crm/price_book)|价格表多模式表格视图_表格(grid_view_multimode_grid)|[价格表(price_book_grid_view_multimode)](app/view/price_book_grid_view_multimode)|
|[产品(PRODUCT)](module/crm/product)|主表格(main)|[产品(product_pickup_grid_view)](app/view/product_pickup_grid_view)|
|[采购订单(PURCHASE_ORDER)](module/crm/purchase_order)|采购订单多模式表格视图_表格(grid_view_multimode_grid)|[采购订单(purchase_order_grid_view_multimode)](app/view/purchase_order_grid_view_multimode)|
|[报价(QUOTE)](module/crm/quote)|报价多模式表格视图_表格(grid_view_multimode_grid)|[报价(quote_grid_view_multimode)](app/view/quote_grid_view_multimode)|
|[销售订单(SALES_ORDER)](module/crm/sales_order)|销售订单多模式表格视图_表格(grid_view_multimode_grid)|[销售订单(sales_order_grid_view_multimode)](app/view/sales_order_grid_view_multimode)|
|[日程(SCHEDULE)](module/crm/schedule)|主表格(main)|[已完成的任务&历史活动(schedule_close_view)](app/view/schedule_close_view)|
|[解决方案(SOLUTION)](module/crm/solution)|解决方案多模式表格视图_表格(grid_view_multimode_grid)|[解决方案(solution_grid_view_multimode)](app/view/solution_grid_view_multimode)|
|[供应商(VENDOR)](module/crm/vendor)|主表格(main)|[供应商(vendor_grid_view_multimode)](app/view/vendor_grid_view_multimode)|

### 无搜索项的搜索表单<sup class="footnote-symbol"> <font color=orange>[27]</font></sup>
| 实体col200   |   视图col400 | 搜索表单col400  |
| --------   |------------|-----------|
|[客户(ACCOUNT)](module/crm/account)|客户多模式列表视图_搜索表单(list_view_multimode_search_form)|[客户(account_data_view_multimode)](app/view/account_data_view_multimode)|
|[活动(ACTIVITIY)](module/crm/activitiy)|null(searchform)|[操作日志(activitiy_list_view)](app/view/activitiy_list_view)|
|[通话(CALL)](module/crm/call)|待办任务（通话）（列表）_搜索表单(list_not_close_view_search_form)|[已完成的任务&历史活动（通话）(call_grid_close_view)](app/view/call_grid_close_view)|
|[市场活动(CAMPAIGN)](module/crm/campaign)|市场活动多模式列表视图_搜索表单(list_view_multimode_search_form)|[市场活动(campaign_data_view_multimode)](app/view/campaign_data_view_multimode)|
|[服务支持(CASE)](module/crm/service_case)|服务支持多模式列表视图_搜索表单(list_view_multimode_search_form)|[服务支持(service_case_data_view_multimode)](app/view/service_case_data_view_multimode)|
|[联系人(CONTACT)](module/crm/contact)|联系人多模式列表视图_搜索表单(list_view_multimode_search_form)|[联系人(contact_data_view_multimode)](app/view/contact_data_view_multimode)|
|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|默认搜索表单(default)|[链接(custom_button_grid_view)](app/view/custom_button_grid_view)|
|[商机(DEAL)](module/crm/deal)|默认搜索表单(default)|[商机(deal_data_view_multimode)](app/view/deal_data_view_multimode)|
|[商机阶段(DEAL_STAGE)](module/crm/deal_stage)|默认搜索表单(default)|[阶段管理(deal_stage_grid_view)](app/view/deal_stage_grid_view)|
|[会议(EVENT)](module/crm/event)|待办任务（会议）（列表）_搜索表单(list_not_close_view_search_form)|[已完成的任务&历史活动（会议）(event_grid_close_view)](app/view/event_grid_close_view)|
|[发货单(INVOICE)](module/crm/invoice)|发货单多模式列表视图_搜索表单(list_view_multimode_search_form)|[发货单(invoice_data_view_multimode)](app/view/invoice_data_view_multimode)|
|[线索(LEAD)](module/crm/lead)|线索多模式列表视图_搜索表单(list_view_multimode_search_form)|[线索(lead_data_view_multimode)](app/view/lead_data_view_multimode)|
|[收款记录(PAYEE)](module/crm/payee)|记录反查表格_搜索表单(usr06216630_grid_view_search_form)|[收款记录(payee_grid_view)](app/view/payee_grid_view)|
|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|计划反查表格_搜索表单(reverse_grid_view_search_form)|[收款计划(payee_plan_grid_view)](app/view/payee_plan_grid_view)|
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)|统计看板_搜索表单(kanban_view_search_form)|[统计看板(payee_statistic_kanban_view)](app/view/payee_statistic_kanban_view)|
|[价格表(PRICE_BOOK)](module/crm/price_book)|价格表多模式列表视图_搜索表单(list_view_multimode_search_form)|[价格表(price_book_data_view_multimode)](app/view/price_book_data_view_multimode)|
|[产品(PRODUCT)](module/crm/product)|产品多模式列表视图_搜索表单(list_view_multimode_search_form)|[产品(product_data_view_multimode)](app/view/product_data_view_multimode)|
|[产品证书(PRODUCT_CERTIFICATE)](module/crm/product_certificate)|默认搜索表单(default)|[产品证书(product_certificate_grid_view)](app/view/product_certificate_grid_view)|
|[采购订单(PURCHASE_ORDER)](module/crm/purchase_order)|采购订单多模式列表视图_搜索表单(list_view_multimode_search_form)|[采购订单(purchase_order_data_view_multimode)](app/view/purchase_order_data_view_multimode)|
|[报价(QUOTE)](module/crm/quote)|报价多模式列表视图_搜索表单(list_view_multimode_search_form)|[报价(quote_data_view_multimode)](app/view/quote_data_view_multimode)|
|[销售订单(SALES_ORDER)](module/crm/sales_order)|销售订单多模式列表视图_搜索表单(list_view_multimode_search_form)|[销售订单(sales_order_data_view_multimode)](app/view/sales_order_data_view_multimode)|
|[日程(SCHEDULE)](module/crm/schedule)|默认搜索表单(default)|[已完成的任务&历史活动(schedule_close_view)](app/view/schedule_close_view)|
|[解决方案(SOLUTION)](module/crm/solution)|解决方案多模式列表视图_搜索表单(list_view_multimode_search_form)|[解决方案(solution_data_view_multimode)](app/view/solution_data_view_multimode)|
|[标签(TAG)](module/crm/tag)|默认搜索表单(default)|[标签管理(tag_mgr_grid_view)](app/view/tag_mgr_grid_view)|
|[任务&活动(TASK)](module/crm/task)|任务看板_搜索表单(task_kanban_view_search_form)|[已完成的任务(task_grid_close_view)](app/view/task_grid_close_view)|
|[用户(USER)](module/crm/user)|关联销售_搜索表单(grid_view_relation_search_form)|[关联销售人员(user_grid_view_relation)](app/view/user_grid_view_relation)|
|[供应商(VENDOR)](module/crm/vendor)|供应商多模式列表视图_搜索表单(list_view_multimode_search_form)|[供应商(vendor_data_view_multimode)](app/view/vendor_data_view_multimode)|

### 除主键、主信息、预置属性外，不包含其他配置的表单<sup class="footnote-symbol"> <font color=orange>[20]</font></sup>
| 实体col200   |   视图col400 |表单col400  |
| --------   |------------|------------|
|[通话(CALL)](module/crm/call)|主编辑表单(main)|[通话(call_edit_view)](app/view/call_edit_view)|
|[服务支持(CASE)](module/crm/service_case)|编辑_表单(edit_view_form)|[服务支持(service_case_edit_view)](app/view/service_case_edit_view)|
|[阶段历史(DEAL_HISTORY)](module/crm/deal_history)|主编辑表单(main)|[阶段历史(deal_history_edit_view)](app/view/deal_history_edit_view)|
|[商机阶段(DEAL_STAGE)](module/crm/deal_stage)|阶段维护_表单(edit_view_form)|[阶段维护(deal_stage_edit_view)](app/view/deal_stage_edit_view)|
|[会议(EVENT)](module/crm/event)|主编辑表单(main)|[会议(event_edit_view)](app/view/event_edit_view)|
|[发货单(INVOICE)](module/crm/invoice)|编辑_表单(edit_view_form)|[发货单(invoice_edit_view)](app/view/invoice_edit_view)|
|[收款记录(PAYEE)](module/crm/payee)|主编辑表单(main)|[收款记录(payee_edit_view)](app/view/payee_edit_view)|
|[收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)|主编辑表单(main)|[收款情况统计(payee_statistic_edit_view)](app/view/payee_statistic_edit_view)|
|[价格表(PRICE_BOOK)](module/crm/price_book)|编辑_表单(edit_view_form)|[价格表(price_book_edit_view)](app/view/price_book_edit_view)|
|[订单(PROJECT)](module/crm/project)|主编辑表单(main)|[订单(project_edit_view)](app/view/project_edit_view)|
|[采购订单(PURCHASE_ORDER)](module/crm/purchase_order)|编辑_表单(edit_view_form)|[采购订单(purchase_order_edit_view)](app/view/purchase_order_edit_view)|
|[报价(QUOTE)](module/crm/quote)|编辑_表单(edit_view_form)|[报价(quote_edit_view)](app/view/quote_edit_view)|
|[预留(RESERVATION)](module/crm/reservation)|主编辑表单(main)|[预留(reservation_edit_view)](app/view/reservation_edit_view)|
|[销售订单(SALES_ORDER)](module/crm/sales_order)|编辑_表单(edit_view_form)|[销售订单(sales_order_edit_view)](app/view/sales_order_edit_view)|
|[日程(SCHEDULE)](module/crm/schedule)|主编辑表单(main)|[日程(schedule_edit_view)](app/view/schedule_edit_view)|
|[解决方案(SOLUTION)](module/crm/solution)|编辑_表单(edit_view_form)|[解决方案(solution_edit_view)](app/view/solution_edit_view)|
|[标签(TAG)](module/crm/tag)|Remove(remove)|[添加标签(tag_add_tag)](app/view/tag_add_tag)|
|[用户(USER)](module/crm/user)|密码变更_表单(password_edit_view_form)|[密码变更(user_password_edit_view)](app/view/user_password_edit_view)|
|[供应商(VENDOR)](module/crm/vendor)|编辑_表单(edit_view_form)|[供应商(vendor_edit_view)](app/view/vendor_edit_view)|
|[工作进展(WORK_PROGRESS)](module/crm/work_progress)|主编辑表单(main)|[工作进展(work_progress_edit_view)](app/view/work_progress_edit_view)|
