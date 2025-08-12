# 线索(lead)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|客户标识|ACCOUNT_ID|外键值|100|否||
|客户名称|ACCOUNT_NAME|外键值文本|200|否||
|年收入|ANNUALREVENUE|货币|200|是||
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|城市|CITY|文本，可指定长度|100|是||
|公司|COMPANY|文本，可指定长度|200|是||
|转换的日期时间|CONVERTED_DATE_TIME|日期时间型||是||
|为“已转换”|CONVERTED__S|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|国家/地区|COUNTRY|文本，可指定长度|100|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|职位/职称|DESIGNATION|文本，可指定长度|100|是||
|电子邮件|EMAIL|文本，可指定长度|100|是||
|不发营销邮件|EMAIL_OPT_OUT|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|充实状态|ENRICH_STATUS_S|单项选择(文本值)|60|是||
|跟踪人|EXECUTORS|一对多关系数据集合|1048576|是||
|名字|FIRST_NAME|文本，可指定长度|40|是||
|联系人姓名|FULL_NAME|文本，可指定长度|120|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是否已删除|IS_DELETED|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|最近评估时间|LAST_ASSESS_TIME|日期时间型||是||
|姓氏|LAST_NAME|文本，可指定长度|80|是||
|线索转换用时|LEAD_CONVERSION_TIME|整型||是||
|线索来源|LEAD_SOURCE|[单项选择(文本值)](index/dictionary_index#lead_source "线索来源")|60|是||
|线索状态|LEAD_STATUS|[单项选择(文本值)](index/dictionary_index#lead_status "线索状态")|60|是||
|手机|MOBILE|文本，可指定长度|100|是||
|名称|NAME|文本，可指定长度|200|是||
|员工数|NO_OF_EMPLOYEES|整型||是||
|所有者|OWNER|单项选择(文本值)|60|是||
|父线索标识|PID|外键值|100|是||
|父线索|PNAME|外键值文本|255|是||
|称呼|SALUTATION|单项选择(文本值)|60|是||
|备用邮箱|SECONDARY_EMAIL|文本，可指定长度|100|是||
|Skype lD|SKYPE_ID|文本，可指定长度|50|是||
|省/市|STATE|文本，可指定长度|100|是||
|街道|STREET|文本，可指定长度|250|是||
|主题|SUBJECT|文本，可指定长度|255|是||
|退订的方式|UNSUBSCRIBED_MODE|单项选择(文本值)|60|是||
|退订的时间|UNSUBSCRIBED_TIME|日期时间型||是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||
|邮编|ZIP_CODE|文本，可指定长度|30|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_LEAD_LEAD_PID](der/DER1N_LEAD_LEAD_PID)|[线索(LEAD)](module/crm/lead)|1:N关系||
|[DERCUSTOM_ATTACHMENT_LEAD](der/DERCUSTOM_ATTACHMENT_LEAD)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_LEAD](der/DERCUSTOM_CUSTOM_BUTTON_LEAD)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_EXECUTOR_LEAD](der/DERCUSTOM_EXECUTOR_LEAD)|[执行人(EXECUTOR)](module/crm/executor)|自定义关系||
|[DERCUSTOM_NOTE_ATTACH_LEAD](der/DERCUSTOM_NOTE_ATTACH_LEAD)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|
|[DERCUSTOM_RELATION_LEAD](der/DERCUSTOM_RELATION_LEAD)|[关联(RELATION)](module/crm/relation)|自定义关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_LEAD_ACCOUNT_ACCOUNT_ID](der/DER1N_LEAD_ACCOUNT_ACCOUNT_ID)|[客户(ACCOUNT)](module/crm/account)|1:N关系||
|[DER1N_LEAD_LEAD_PID](der/DER1N_LEAD_LEAD_PID)|[线索(LEAD)](module/crm/lead)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|异步新建线索时添加到工作进展|Async_addLeadtoWorkProgress|用户自定义|默认|不支持||||
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#lead_Create)|||
|Get|Get|内置方法|默认|不支持||[（通用）获取并生成最近访问](index/plugin_index#GetAndCreateRecent)|自动生成|
|GetDraft|GetDraft|内置方法|默认|不支持|[附加操作](index/action_logic_index#lead_GetDraft)|||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|新建线索时添加到工作进展|addLeadtoWorkProgress|[实体处理逻辑](module/crm/lead/logic/addLeadtoWorkProgress "新建线索时添加到工作进展")|默认|不支持||||
|批添加标签|add_tags|用户自定义|默认|不支持||[（通用）添加标签](index/plugin_index#AddTags)|自动生成|
|批更新|batch_update|用户自定义|默认|不支持||[（通用）更新](index/plugin_index#Update)|自动生成|
|批创建任务|create_task|用户自定义|默认|不支持||[（通用）创建任务](index/plugin_index#CreateTask)|自动生成|
|批移除标签|delete_tags|用户自定义|默认|不支持||[（通用）移除标签](index/plugin_index#RemoveTags)|自动生成|
|派生商机|leadToBeDeal|[实体处理逻辑](module/crm/lead/logic/leadToBeDeal "派生商机")|默认|不支持||||
|线索转商机|leadToDeal|[实体处理逻辑](module/crm/lead/logic/leadToDeal "线索转商机")|默认|不支持||||
|main_view_dr计数器|main_view_dr_count|用户自定义|默认|不支持||[（通用）main_view关系计数器](index/plugin_index#UsrSFPlugin0321285737)|自动生成|
|关联任务和活动|relate_task_and_maneuver|[实体处理逻辑](module/crm/lead/logic/relate_task_and_maneuver "关联任务和活动")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[关联任务和活动](module/crm/lead/logic/relate_task_and_maneuver)|relate_task_and_maneuver|无|||
|[异步添加线索到工作进展](module/crm/lead/logic/asyncLeadtoWorkProgres)|asyncLeadtoWorkProgres|无|||
|[新建线索前加载跟踪人](module/crm/lead/logic/defaultExecutor)|defaultExecutor|无|||
|[新建线索时添加到工作进展](module/crm/lead/logic/addLeadtoWorkProgress)|addLeadtoWorkProgress|无|||
|[派生商机](module/crm/lead/logic/leadToBeDeal)|leadToBeDeal|无|||
|[线索转商机](module/crm/lead/logic/leadToDeal)|leadToDeal|无|||
|[获取线索关联任务和活动](module/crm/lead/logic/get_task_and_maneuver)|get_task_and_maneuver|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/lead/query/Default)|DEFAULT|否|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/lead/query/View)|VIEW|是|否 |否 ||
|[全部数据(all)](module/crm/lead/query/all)|all|否|否 |否 ||
|[创建者(createman)](module/crm/lead/query/createman)|createman|否|否 |否 ||
|[执行人(executor)](module/crm/lead/query/executor)|executor|否|否 |否 ||
|[所有者(owner)](module/crm/lead/query/owner)|owner|否|否 |否 ||
|[被关联的数据(target_relation)](module/crm/lead/query/target_relation)|target_relation|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[树表格(tree)](module/crm/lead/dataset/DataSet2)|tree|数据查询|否|[TreeGridDEDataSetRuntime](index/plugin_index#UsrSFPlugin0407757309)||
|[数据集(DEFAULT)](module/crm/lead/dataset/Default)|DEFAULT|数据查询|是|||
|[全部数据(all)](module/crm/lead/dataset/all)|all|数据查询|否|||
|[创建者(createman)](module/crm/lead/dataset/createman)|createman|数据查询|否|||
|[执行人(executor)](module/crm/lead/dataset/executor)|executor|数据查询|否|||
|[线索关联的任务和活动(lead_relation_task)](module/crm/lead/dataset/lead_relation_task)|lead_relation_task|[实体逻辑](module/crm/lead/logic/get_task_and_maneuver)|否|||
|[所有者(owner)](module/crm/lead/dataset/owner)|owner|数据查询|否|||
|[被关联的数据(target_relation)](module/crm/lead/dataset/target_relation)|target_relation|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=lead-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `UPDATE`
* `READ`
* `CREATE`



##### 全部数据-只读 :id=lead-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读写 :id=lead-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/lead#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `DELETE`
* `CREATE`
* `READ`



##### 执行人-读写 :id=lead-EXECUTOR_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[执行人(executor)](module/crm/lead#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `CREATE`
* `READ`



##### 所有者-读写 :id=lead-OWNER_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[所有者(owner)](module/crm/lead#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `UPDATE`
* `READ`
* `CREATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACCOUNT_ID_EQ|客户标识|EQ||
|N_ACCOUNT_NAME_EQ|客户名称|EQ||
|N_ACCOUNT_NAME_LIKE|客户名称|LIKE||
|N_COMPANY_LIKE|公司|LIKE||
|N_ENRICH_STATUS_S_EQ|充实状态|EQ||
|N_EXECUTORS_EXISTS__N_USER_ID_EQ|跟踪人|EXISTS||
|N_ID_EQ|标识|EQ||
|N_LAST_NAME_LIKE|姓氏|LIKE||
|N_LEAD_SOURCE_EQ|线索来源|EQ||
|N_LEAD_STATUS_EQ|线索状态|EQ||
|N_LEAD_STATUS_NOTEQ|线索状态|NOTEQ||
|N_MOBILE_LIKE|手机|LIKE||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_EQ|所有者|EQ||
|N_PID_EQ|父线索标识|EQ||
|N_PNAME_EQ|父线索|EQ||
|N_PNAME_LIKE|父线索|LIKE||
|N_SALUTATION_EQ|称呼|EQ||
|N_SUBJECT_LIKE|主题|LIKE||
|N_UNSUBSCRIBED_MODE_EQ|退订的方式|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加标签 | add_tags | 添加标签 |多项数据（主键）|<details><summary>后台调用</summary>[add_tags](#行为)|自动生成|
| 创建子线索 | createSubLead | 创建子线索 |单项数据|<details><summary>打开视图或向导（模态）</summary>[线索](app/view/lead_lead_edit_view)</details>||
| 打开商机主数据视图 | leadOpenDealZsj | 商机主数据视图 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[商机信息](app/view/deal_main_view)</details>||
| 编辑 | open_edit_view | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[线索](app/view/lead_lead_edit_view)</details>|自动生成|
| 保存并打开线索主信息界面 | SaveAndOpenLead | 保存 |单项数据|<details><summary>后台调用</summary>[Create](#行为)||
| 添加附件 | add_attachments | 添加附件 |无数据|用户自定义|自动生成|
| 派生商机 | leadToBeDeal | 派生商机 |单项数据|<details><summary>打开视图或向导（模态）</summary>[商机](app/view/deal_edit_view)</details>||
| 删除 | remove | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)|自动生成|
| 移除标签 | delete_tags | 移除标签 |多项数据（主键）|<details><summary>后台调用</summary>[delete_tags](#行为)|自动生成|
| 上传附件 | upload_attachment | 上传 |无数据|用户自定义|自动生成|
| 线索转为商机 | leadToDeal | 线索转为商机 |单项数据（主键）|<details><summary>后台调用</summary>[leadToDeal](#行为)||
| 打开线索主数据视图 | openLeadVeiw | 线索详情 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[线索信息](app/view/lead_main_view)</details>||
| 导入数据 | ImportData | 导入线索 |无数据|<details><summary>打开数据导入视图</summary>[导入线索]()</details>|自动生成|
| 打开关联活动任务视图 | open_relation_view | 添加 |无数据|<details><summary>后台调用</summary>[relate_task_and_maneuver](#行为)||
| 管理标签 | mgr_tags | 管理标签 |无数据|<details><summary>打开顶级视图</summary>[标签管理](app/view/tag_mgr_grid_view)</details>|自动生成|
| 创建任务 | create_task | 创建任务 |多项数据（主键）|<details><summary>后台调用</summary>[create_task](#行为)|自动生成|
| 批量更新 | batch_update | 批量更新 |多项数据（主键）|<details><summary>后台调用</summary>[batch_update](#行为)|自动生成|

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[添加附件](module/crm/lead/uilogic/add_attachment)|add_attachment|自动生成|

## 导入模式

* **导入线索**


<el-descriptions direction="vertical" :column="43" :size="size" border>
<el-descriptions-item label="跟踪人">-</el-descriptions-item>
<el-descriptions-item label="客户名称">-</el-descriptions-item>
<el-descriptions-item label="父线索">-</el-descriptions-item>
<el-descriptions-item label="是否已删除">-</el-descriptions-item>
<el-descriptions-item label="最近评估时间">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="城市">-</el-descriptions-item>
<el-descriptions-item label="省/市">-</el-descriptions-item>
<el-descriptions-item label="公司">-</el-descriptions-item>
<el-descriptions-item label="名字">-</el-descriptions-item>
<el-descriptions-item label="街道">-</el-descriptions-item>
<el-descriptions-item label="联系人姓名">-</el-descriptions-item>
<el-descriptions-item label="职位/职称">-</el-descriptions-item>
<el-descriptions-item label="姓氏">-</el-descriptions-item>
<el-descriptions-item label="国家/地区">-</el-descriptions-item>
<el-descriptions-item label="电子邮件">-</el-descriptions-item>
<el-descriptions-item label="邮编">-</el-descriptions-item>
<el-descriptions-item label="手机">-</el-descriptions-item>
<el-descriptions-item label="年收入">-</el-descriptions-item>
<el-descriptions-item label="线索状态">-</el-descriptions-item>
<el-descriptions-item label="员工数">-</el-descriptions-item>
<el-descriptions-item label="线索来源">-</el-descriptions-item>
<el-descriptions-item label="线索转换用时">-</el-descriptions-item>
<el-descriptions-item label="备用邮箱">-</el-descriptions-item>
<el-descriptions-item label="不发营销邮件">-</el-descriptions-item>
<el-descriptions-item label="退订的方式">-</el-descriptions-item>
<el-descriptions-item label="称呼">-</el-descriptions-item>
<el-descriptions-item label="转换的日期时间">-</el-descriptions-item>
<el-descriptions-item label="退订的时间">-</el-descriptions-item>
<el-descriptions-item label="Skype lD">-</el-descriptions-item>
<el-descriptions-item label="充实状态">-</el-descriptions-item>
<el-descriptions-item label="为“已转换”">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
<el-descriptions-item label="所有者">-</el-descriptions-item>
<el-descriptions-item label="描述">-</el-descriptions-item>
<el-descriptions-item label="主题">-</el-descriptions-item>
<el-descriptions-item label="客户标识">-</el-descriptions-item>
<el-descriptions-item label="父线索标识">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/lead?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/lead?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/lead?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/lead?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/lead?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/lead?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/lead?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/lead?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/lead?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/lead?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/lead?id=导入模式`">
  导入模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>