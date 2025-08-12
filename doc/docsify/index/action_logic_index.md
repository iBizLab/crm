# 行为附加 <!-- {docsify-ignore-all} -->

## [客户(ACCOUNT)](module/crm/account.md)  :id=account

#### [合并客户(merge_account)](module/crm/account#行为) :id=account_merge_account




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [删除被合并客户(delete_marge)](module/crm/account/logic/delete_marge.md)



## [商机(DEAL)](module/crm/deal.md)  :id=deal

#### [Create](module/crm/deal#行为) :id=deal_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [商机新建、更新通知(changeNotiy)](module/crm/deal/logic/changeNotiy.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建商机时生成阶段历史(scCreatedealstagehis)](module/crm/deal/logic/scCreatedealstagehis.md)

> [!NOTE|label:外部逻辑]
> 执行实体 [商机(DEAL)](module/crm/deal.md) 的 [异步新建商机时添加到工作进展(Async_addDealToWorkProgress)](module/crm/deal#行为) 行为


#### [Update](module/crm/deal#行为) :id=deal_Update




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [商机新建、更新通知(changeNotiy)](module/crm/deal/logic/changeNotiy.md)



## [线索(LEAD)](module/crm/lead.md)  :id=lead

#### [Create](module/crm/lead#行为) :id=lead_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [异步添加线索到工作进展(asyncLeadtoWorkProgres)](module/crm/lead/logic/asyncLeadtoWorkProgres.md)


#### [GetDraft](module/crm/lead#行为) :id=lead_GetDraft




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建线索前加载跟踪人(defaultExecutor)](module/crm/lead/logic/defaultExecutor.md)



## [备注(NOTE_ATTACH)](module/crm/note_attach.md)  :id=note_attach

#### [Create](module/crm/note_attach#行为) :id=note_attach_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建、更新进展评估后通知(assess_notify)](module/crm/note_attach/logic/assess_notify.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [更新最近评估时间(update_access_time)](module/crm/note_attach/logic/update_access_time.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [异步添加评估到工作进展(asyncevaluateToWorkProgress)](module/crm/note_attach/logic/asyncevaluateToWorkProgress.md)


#### [Update](module/crm/note_attach#行为) :id=note_attach_Update




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建、更新进展评估后通知(assess_notify)](module/crm/note_attach/logic/assess_notify.md)



## [收款记录(PAYEE)](module/crm/payee.md)  :id=payee

#### [Create](module/crm/payee#行为) :id=payee_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:外部逻辑]
> 执行实体 [收款情况统计(PAYEE_STATISTIC)](module/crm/payee.md) 的 [计算统计数据(Calculation)](module/crm/payee#行为) 行为

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [异步添加收款记录到工作进展(asyncPayeeToWorkProgres)](module/crm/payee/logic/asyncPayeeToWorkProgres.md)


#### [CreateTemp](module/crm/payee#行为) :id=payee_CreateTemp




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [传递订单id给向导视图(get_project_id)](module/crm/payee/logic/get_project_id.md)


#### [GetDraft](module/crm/payee#行为) :id=payee_GetDraft




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [将订单分配传入收款记录(project_to_payee)](module/crm/payee/logic/project_to_payee.md)


#### [获取订单相关信息(ProjectInfo)](module/crm/payee#行为) :id=payee_ProjectInfo




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [将订单分配传入收款记录(project_to_payee)](module/crm/payee/logic/project_to_payee.md)


#### [Remove](module/crm/payee#行为) :id=payee_Remove




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:外部逻辑]
> 执行实体 [收款情况统计(PAYEE_STATISTIC)](module/crm/payee.md) 的 [计算统计数据(Calculation)](module/crm/payee#行为) 行为


#### [Save](module/crm/payee#行为) :id=payee_Save




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:外部逻辑]
> 执行实体 [收款情况统计(PAYEE_STATISTIC)](module/crm/payee.md) 的 [计算统计数据(Calculation)](module/crm/payee#行为) 行为


#### [Update](module/crm/payee#行为) :id=payee_Update




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:外部逻辑]
> 执行实体 [收款情况统计(PAYEE_STATISTIC)](module/crm/payee.md) 的 [计算统计数据(Calculation)](module/crm/payee#行为) 行为


#### [UpdateTemp](module/crm/payee#行为) :id=payee_UpdateTemp




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [将订单分配传入收款记录(project_to_payee)](module/crm/payee/logic/project_to_payee.md)



## [收款计划(PAYEE_PLAN)](module/crm/payee_plan.md)  :id=payee_plan

#### [Create](module/crm/payee_plan#行为) :id=payee_plan_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:外部逻辑]
> 执行实体 [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_plan.md) 的 [计算统计数据(Calculation)](module/crm/payee_plan#行为) 行为


#### [Remove](module/crm/payee_plan#行为) :id=payee_plan_Remove




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:外部逻辑]
> 执行实体 [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_plan.md) 的 [计算统计数据(Calculation)](module/crm/payee_plan#行为) 行为


#### [Save](module/crm/payee_plan#行为) :id=payee_plan_Save




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:外部逻辑]
> 执行实体 [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_plan.md) 的 [计算统计数据(Calculation)](module/crm/payee_plan#行为) 行为


#### [Update](module/crm/payee_plan#行为) :id=payee_plan_Update




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:外部逻辑]
> 执行实体 [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_plan.md) 的 [计算统计数据(Calculation)](module/crm/payee_plan#行为) 行为



## [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic.md)  :id=payee_statistic

#### [将计划数据更新到统计表(all_statistic)](module/crm/payee_statistic#行为) :id=payee_statistic_all_statistic



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [清空收款计划表(delete_statistic)](module/crm/payee_statistic/logic/delete_statistic.md)



<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [将分配数据更新到统计表(update_payee_allocate)](module/crm/payee_statistic/logic/update_payee_allocate.md)



## [订单(PROJECT)](module/crm/project.md)  :id=project

#### [Create](module/crm/project#行为) :id=project_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建、更新订单后推送(project_change_notify)](module/crm/project/logic/project_change_notify.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [异步添加订单到工作进展(asyncProjectToWorkProgres)](module/crm/project/logic/asyncProjectToWorkProgres.md)


#### [GetDraft](module/crm/project#行为) :id=project_GetDraft




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建订单前加载执行人(defaultExecutor)](module/crm/project/logic/defaultExecutor.md)


#### [Update](module/crm/project#行为) :id=project_Update




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建、更新订单后推送(project_change_notify)](module/crm/project/logic/project_change_notify.md)



## [任务&活动(TASK)](module/crm/task.md)  :id=task

#### [Create](module/crm/task#行为) :id=task_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建、更新任务后推送(notify)](module/crm/task/logic/notify.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [异步添加活动到工作进展(asyncManeuverToWorkProgres)](module/crm/task/logic/asyncManeuverToWorkProgres.md)


#### [GetDraft](module/crm/task#行为) :id=task_GetDraft




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建任务前加载执行人(defaultExecutor)](module/crm/task/logic/defaultExecutor.md)


#### [Update](module/crm/task#行为) :id=task_Update




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建、更新任务后推送(notify)](module/crm/task/logic/notify.md)



## [周报(WEEKLIES)](module/crm/weeklies.md)  :id=weeklies

#### [Get](module/crm/weeklies#行为) :id=weeklies_Get




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [打开详情页获取关联数据(openDetail)](module/crm/weeklies/logic/openDetail.md)


#### [GetDraft](module/crm/weeklies#行为) :id=weeklies_GetDraft




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [新建周报时加载关联信息(relation)](module/crm/weeklies/logic/relation.md)









