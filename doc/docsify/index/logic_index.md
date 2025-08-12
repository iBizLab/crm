# 处理逻辑 <!-- {docsify-ignore-all} -->

## [客户(ACCOUNT)](module/crm/account.md) :id=account

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[删除被合并客户](module/crm/account/logic/delete_marge)|delete_marge|无|||
|[合并客户](module/crm/account/logic/merge_account)|merge_account|无||在填入重复客户的时候将客户合并为一个|
|[获取客户信息](module/crm/account/logic/findAccount)|findAccount|无|||









## [商机(DEAL)](module/crm/deal.md) :id=deal

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[关联任务和活动](module/crm/deal/logic/relate_task_and_maneuver)|relate_task_and_maneuver|无|||
|[商机新建、更新通知](module/crm/deal/logic/changeNotiy)|changeNotiy|无|||
|[商机阶段更新时生成历史](module/crm/deal/logic/scdealstagehis)|scdealstagehis|属性逻辑|||
|[异步添加商机到工作进展](module/crm/deal/logic/asyncDealToWorkProgres)|asyncDealToWorkProgres|无|||
|[新建商机时添加到工作进展](module/crm/deal/logic/addDealToWorkProgress)|addDealToWorkProgress|无|||
|[新建商机时生成阶段历史](module/crm/deal/logic/scCreatedealstagehis)|scCreatedealstagehis|无|||
|[添加商机](module/crm/deal/logic/add_deal)|add_deal|无|||
|[获取商机关联任务和活动](module/crm/deal/logic/get_task_and_maneuver)|get_task_and_maneuver|无|||
|[获取商机阶段概率](module/crm/deal/logic/stageProbability)|stageProbability|无|||








## [线索(LEAD)](module/crm/lead.md) :id=lead

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[关联任务和活动](module/crm/lead/logic/relate_task_and_maneuver)|relate_task_and_maneuver|无|||
|[异步添加线索到工作进展](module/crm/lead/logic/asyncLeadtoWorkProgres)|asyncLeadtoWorkProgres|无|||
|[新建线索前加载跟踪人](module/crm/lead/logic/defaultExecutor)|defaultExecutor|无|||
|[新建线索时添加到工作进展](module/crm/lead/logic/addLeadtoWorkProgress)|addLeadtoWorkProgress|无|||
|[派生商机](module/crm/lead/logic/leadToBeDeal)|leadToBeDeal|无|||
|[线索转商机](module/crm/lead/logic/leadToDeal)|leadToDeal|无|||
|[获取线索关联任务和活动](module/crm/lead/logic/get_task_and_maneuver)|get_task_and_maneuver|无|||



## [备注(NOTE_ATTACH)](module/crm/note_attach.md) :id=note_attach

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[异步添加评估到工作进展](module/crm/note_attach/logic/asyncevaluateToWorkProgress)|asyncevaluateToWorkProgress|无|||
|[新建、更新进展评估后通知](module/crm/note_attach/logic/assess_notify)|assess_notify|无|||
|[新建评估时添加到工作进展](module/crm/note_attach/logic/evaluateToWorkProgress)|evaluateToWorkProgress|无|||
|[更新最近评估时间](module/crm/note_attach/logic/update_access_time)|update_access_time|无|||



## [收款记录(PAYEE)](module/crm/payee.md) :id=payee

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[传递订单id给向导视图](module/crm/payee/logic/get_project_id)|get_project_id|无||传递订单id给向导视图|
|[将订单分配传入收款记录](module/crm/payee/logic/project_to_payee)|project_to_payee|无|||
|[异步添加收款记录到工作进展](module/crm/payee/logic/asyncPayeeToWorkProgres)|asyncPayeeToWorkProgres|无|||
|[新建收款记录添加到工作进展](module/crm/payee/logic/addPayeeToWorkProgress)|addPayeeToWorkProgress|无|||
|[获取对应订单信息](module/crm/payee/logic/project_get)|project_get|无||订单信息回填到表单中|
|[获取对应记录信息](module/crm/payee/logic/plan_account_get)|plan_account_get|无||获取记录信息回填到表单中|
|[通过project_id获取记录信息](module/crm/payee/logic/plan_get_project_id)|plan_get_project_id|无||通过project_id获取记录信息|



## [收款计划(PAYEE_PLAN)](module/crm/payee_plan.md) :id=payee_plan

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[将数据传给记录](module/crm/payee_plan/logic/plan_to_payee)|plan_to_payee|无||将计划数据（金额、描述等）传给记录|
|[将订单数据传给计划](module/crm/payee_plan/logic/dateFromProject)|dateFromProject|无||获取订单的数据并赋给计划展示|


## [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic.md) :id=payee_statistic

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[将分配数据更新到统计表](module/crm/payee_statistic/logic/update_payee_allocate)|update_payee_allocate|无|||
|[将计划数据更新到统计表](module/crm/payee_statistic/logic/update_payee_staticstic)|update_payee_staticstic|无|||
|[清空收款计划表](module/crm/payee_statistic/logic/delete_statistic)|delete_statistic|无|||
|[计算统计数据](module/crm/payee_statistic/logic/Calculation)|Calculation|无|||



## [产品(PRODUCT)](module/crm/product.md) :id=product

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[取消关联](module/crm/product/logic/unlink)|unlink|无|||
|[添加产品](module/crm/product/logic/add_product)|add_product|无|||



## [订单(PROJECT)](module/crm/project.md) :id=project

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[异步添加订单到工作进展](module/crm/project/logic/asyncProjectToWorkProgres)|asyncProjectToWorkProgres|无|||
|[循环子订单判断](module/crm/project/logic/loop_son_project)|loop_son_project|无||循环订单下的子订单来判断是否有未关闭的订单|
|[新建、更新订单后推送](module/crm/project/logic/project_change_notify)|project_change_notify|无|||
|[新建订单前加载执行人](module/crm/project/logic/defaultExecutor)|defaultExecutor|无|||
|[新建订单时添加到工作进展](module/crm/project/logic/addProjectToWorkProgress)|addProjectToWorkProgress|无|||
|[检测子订单状态后保存订单](module/crm/project/logic/scan_save)|scan_save|无||判断子订单状态，如果出现未关闭订单则提示订单状态；调用了【循环子订判断】的逻辑|
|[通过父订单查询客户](module/crm/project/logic/GetAccount)|GetAccount|无|||













## [标签(TAG)](module/crm/tag.md) :id=tag

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[ignore](module/crm/tag/logic/ignore)|ignore|无|||


## [任务&活动(TASK)](module/crm/task.md) :id=task

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[ignore](module/crm/task/logic/ignore)|ignore|无|||
|[关联任务和活动](module/crm/task/logic/relate_task_and_maneuver)|relate_task_and_maneuver|无|||
|[关闭任务](module/crm/task/logic/closed_taskormaneuver)|closed_taskormaneuver|无|||
|[取消关联](module/crm/task/logic/cancel_relation)|cancel_relation|无|||
|[取消关联(商机)](module/crm/task/logic/deal_cancel_relation)|deal_cancel_relation|无|||
|[取消关联(线索)](module/crm/task/logic/lead_cancel_relation)|lead_cancel_relation|无|||
|[异步添加活动到工作进展](module/crm/task/logic/asyncManeuverToWorkProgres)|asyncManeuverToWorkProgres|无|||
|[新建、更新任务后推送](module/crm/task/logic/notify)|notify|无|||
|[新建任务前加载执行人](module/crm/task/logic/defaultExecutor)|defaultExecutor|无|||
|[新建活动时添加到工作进展](module/crm/task/logic/maneuverToWorkProgress)|maneuverToWorkProgress|无|||



## [用户(USER)](module/crm/user.md) :id=user

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[创建账号](module/crm/user/logic/createSysPerson)|createSysPerson|无|||
|[取消关联](module/crm/user/logic/unlink)|unlink|无|||
|[查询销售领导](module/crm/user/logic/SalesLeader)|SalesLeader|无|||
|[添加客户关联销售](module/crm/user/logic/add_account_reluser)|add_account_reluser|无|||



## [周报(WEEKLIES)](module/crm/weeklies.md) :id=weeklies

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[打开详情页获取关联数据](module/crm/weeklies/logic/openDetail)|openDetail|无||打开详情页获取关联数据|
|[打开详情页获取关联数据2](module/crm/weeklies/logic/openDetail2)|openDetail2|无||临时备份|
|[新建周报时加载关联信息](module/crm/weeklies/logic/relation)|relation|无||新建周报时加载关联信息|
|[根据统计时间更新关联信息](module/crm/weeklies/logic/updateRelation)|updateRelation|无||根据统计时间更新关联信息|
|[获取链接视图类型](module/crm/weeklies/logic/get_link_type)|get_link_type|无||周报编辑页面，链接商机或线索视图时获取类型|



