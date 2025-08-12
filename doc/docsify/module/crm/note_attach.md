# 备注(note_attach)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|内容|CONTENT|长文本，没有长度限制|1048576|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|所属数据对象|OWNER_TYPE|文本，可指定长度|100|是||
|备注主体标识|PRINCIPAL_ID|文本，可指定长度|100|是||
|备注主体名称|PRINCIPAL_NAME|文本，可指定长度|200|是||
|备注主体类型|PRINCIPAL_TYPE|文本，可指定长度|100|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DERCUSTOM_NOTE_ATTACH_ACCOUNT](der/DERCUSTOM_NOTE_ATTACH_ACCOUNT)|[客户(ACCOUNT)](module/crm/account)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_CALL](der/DERCUSTOM_NOTE_ATTACH_CALL)|[通话(CALL)](module/crm/call)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_CAMPAIGN](der/DERCUSTOM_NOTE_ATTACH_CAMPAIGN)|[市场活动(CAMPAIGN)](module/crm/campaign)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_CASE](der/DERCUSTOM_NOTE_ATTACH_CASE)|[服务支持(CASE)](module/crm/service_case)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_CONTACT](der/DERCUSTOM_NOTE_ATTACH_CONTACT)|[联系人(CONTACT)](module/crm/contact)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_DEAL](der/DERCUSTOM_NOTE_ATTACH_DEAL)|[商机(DEAL)](module/crm/deal)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_EVENT](der/DERCUSTOM_NOTE_ATTACH_EVENT)|[会议(EVENT)](module/crm/event)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_INVOICE](der/DERCUSTOM_NOTE_ATTACH_INVOICE)|[发货单(INVOICE)](module/crm/invoice)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_ITEM](der/DERCUSTOM_NOTE_ATTACH_ITEM)|[货品(ITEM)](module/crm/item)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_LEAD](der/DERCUSTOM_NOTE_ATTACH_LEAD)|[线索(LEAD)](module/crm/lead)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_MANEUVER](der/DERCUSTOM_NOTE_ATTACH_MANEUVER)|[活动(MANEUVER)](module/crm/maneuver)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_PAYEE](der/DERCUSTOM_NOTE_ATTACH_PAYEE)|[收款记录(PAYEE)](module/crm/payee)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_PAYEE_PLAN](der/DERCUSTOM_NOTE_ATTACH_PAYEE_PLAN)|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_PRICE_BOOK](der/DERCUSTOM_NOTE_ATTACH_PRICE_BOOK)|[价格表(PRICE_BOOK)](module/crm/price_book)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_PRODUCT](der/DERCUSTOM_NOTE_ATTACH_PRODUCT)|[产品(PRODUCT)](module/crm/product)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_PRODUCT_CERTIFICATE](der/DERCUSTOM_NOTE_ATTACH_PRODUCT_CERTIFICATE)|[产品证书(PRODUCT_CERTIFICATE)](module/crm/product_certificate)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_PROJECT](der/DERCUSTOM_NOTE_ATTACH_PROJECT)|[订单(PROJECT)](module/crm/project)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_PURCHASE_ORDER](der/DERCUSTOM_NOTE_ATTACH_PURCHASE_ORDER)|[采购订单(PURCHASE_ORDER)](module/crm/purchase_order)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_QUOTE](der/DERCUSTOM_NOTE_ATTACH_QUOTE)|[报价(QUOTE)](module/crm/quote)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_SALES_ORDER](der/DERCUSTOM_NOTE_ATTACH_SALES_ORDER)|[销售订单(SALES_ORDER)](module/crm/sales_order)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_SOLUTION](der/DERCUSTOM_NOTE_ATTACH_SOLUTION)|[解决方案(SOLUTION)](module/crm/solution)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_TASK](der/DERCUSTOM_NOTE_ATTACH_TASK)|[任务&活动(TASK)](module/crm/task)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_VENDOR](der/DERCUSTOM_NOTE_ATTACH_VENDOR)|[供应商(VENDOR)](module/crm/vendor)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_WEEKLIES](der/DERCUSTOM_NOTE_ATTACH_WEEKLIES)|[周报(WEEKLIES)](module/crm/weeklies)|自定义关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|异步新建评估时添加到工作进展|Async_evaluateToWorkProgress|用户自定义|默认|不支持||||
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#note_attach_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持|[附加操作](index/action_logic_index#note_attach_Update)|||
|新建评估时添加到工作进展|evaluateToWorkProgress|[实体处理逻辑](module/crm/note_attach/logic/evaluateToWorkProgress "新建评估时添加到工作进展")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[异步添加评估到工作进展](module/crm/note_attach/logic/asyncevaluateToWorkProgress)|asyncevaluateToWorkProgress|无|||
|[新建、更新进展评估后通知](module/crm/note_attach/logic/assess_notify)|assess_notify|无|||
|[新建评估时添加到工作进展](module/crm/note_attach/logic/evaluateToWorkProgress)|evaluateToWorkProgress|无|||
|[更新最近评估时间](module/crm/note_attach/logic/update_access_time)|update_access_time|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[ByOwner](module/crm/note_attach/query/ByOwner)|ByOwner|否|否 |否 ||
|[数据查询(DEFAULT)](module/crm/note_attach/query/Default)|DEFAULT|是|否 |否 ||
|[创建者(createman)](module/crm/note_attach/query/createman)|createman|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[ByOwner](module/crm/note_attach/dataset/ByOwner)|ByOwner|数据查询|否|||
|[数据集(DEFAULT)](module/crm/note_attach/dataset/Default)|DEFAULT|数据查询|是|||
|[全部数据(all)](module/crm/note_attach/dataset/all)|all|数据查询|否|||
|[创建者(createman)](module/crm/note_attach/dataset/createman)|createman|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=note_attach-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `DELETE`
* `READ`
* `UPDATE`



##### 全部数据-只读 :id=note_attach-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读写 :id=note_attach-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/note_attach#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `UPDATE`
* `READ`
* `CREATE`



## 消息通知

|    中文名col200   | 代码名col150       |  消息队列col200   |  消息模板col200 |  通知目标col150     |  备注col350  |
|------------| -----   |  -------- | -------- |-------- |-------- |
|[线索进展评估通知](module/crm/note_attach/notify/LeadNotify)|LeadNotify|[默认消息队列](index/notify_index)|[进展评估通知模板](index/notify_index#progress_assess)|跟踪人 销售领导 ||
|[商机进展评估通知](module/crm/note_attach/notify/dealNotify)|dealNotify|[默认消息队列](index/notify_index)|[进展评估通知模板](index/notify_index#progress_assess)|销售领导 ||
|[订单进展评估通知](module/crm/note_attach/notify/progress_assess_notify)|progress_assess_notify|[默认消息队列](index/notify_index)|[进展评估通知模板](index/notify_index#progress_assess)|执行人 销售领导 ||
|[任务进展评估通知](module/crm/note_attach/notify/taskNotify)|taskNotify|[默认消息队列](index/notify_index)|[进展评估通知模板](index/notify_index#progress_assess)|销售领导 执行人 ||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_TYPE_EQ|所属数据对象|EQ||
|N_PRINCIPAL_ID_EQ|备注主体标识|EQ||
|N_PRINCIPAL_TYPE_EQ|备注主体类型|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 编辑 | panel_note_attach_list_button_calluilogic1_click | 编辑 |单项数据|用户自定义||
| 导入备注 | import | 导入备注 |无数据|<details><summary>打开数据导入视图</summary>[跟随主数据导入]()</details>||
| 清空评论 | clear_comment | 清空 |无数据|用户自定义||
| 删除评论 | del_comment | 删除评论 |单项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)||
| 发送评论 | send_comment | 发送评论 |单项数据|用户自定义||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[发送评论](module/crm/note_attach/uilogic/send_comment)|send_comment||
|[控制备注按钮显示](module/crm/note_attach/uilogic/note_icon_show)|note_icon_show||
|[控制备注按钮隐藏](module/crm/note_attach/uilogic/note_icon_hidden)|note_icon_hidden||
|[清空评论](module/crm/note_attach/uilogic/clear_comment)|clear_comment||
|[编辑备注](module/crm/note_attach/uilogic/edit_note)|edit_note||

## 导入模式

* **跟随主数据导入**


<el-descriptions direction="vertical" :column="1" :size="size" border>
<el-descriptions-item label="内容">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/note_attach?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/note_attach?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/note_attach?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/note_attach?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/note_attach?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/note_attach?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/note_attach?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/note_attach?id=消息通知`">
  消息通知
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/note_attach?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/note_attach?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/note_attach?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/note_attach?id=导入模式`">
  导入模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'minor',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>