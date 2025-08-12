# 用户(user)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|别名|ALIAS|文本，可指定长度|50|是||
|城市|CITY|文本，可指定长度|100|是||
|国家/地区|COUNTRY|文本，可指定长度|100|是||
|国家/地区设置|COUNTRY_LOCALE|文本，可指定长度|100|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|生日|DOB|日期型||是||
|电子邮件|EMAIL|电子邮件|100|是||
|逻辑有效标志|ENABLE|是否逻辑|8|否||
|传真|FAX|文本，可指定长度|30|是||
|姓名|FIRST_NAME|文本，可指定长度|50|是||
|全名|FULL_NAME|文本，可指定长度|120|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|头像|IMAGE_LINK|文本，可指定长度|200|是||
|姓氏|LAST_NAME|文本，可指定长度|50|是||
|语言|LOCALE|文本，可指定长度|100|是||
|手机|MOBILE|文本，可指定长度|100|是||
|名称|NAME|文本，可指定长度|200|是||
|电话|PHONE|文本，可指定长度|100|是||
|职位|ROLE|文本，可指定长度|100|是||
|省/市|STATE|文本，可指定长度|100|是||
|状态|STATUS|单项选择(文本值)|60|是||
|街道|STREET|文本，可指定长度|250|是||
|rt用户标识|SYSUSERID|文本，可指定长度|100|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||
|账号|USER_NAME|文本，可指定长度|100|是||
|网站|WEBSITE|文本，可指定长度|200|是||
|邮编|ZIP|文本，可指定长度|30|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_EXECUTOR_USER_USER_ID](der/DER1N_EXECUTOR_USER_USER_ID)|[执行人(EXECUTOR)](module/crm/executor)|1:N关系||
|[DER1N_ORDER_ALLOCATE_USER_USER_ID](der/DER1N_ORDER_ALLOCATE_USER_USER_ID)|[订单分配(ORDER_ALLOCATE)](module/crm/order_allocate)|1:N关系||
|[DER1N_PAYEE_ALLOCATE_USER_USER_ID](der/DER1N_PAYEE_ALLOCATE_USER_USER_ID)|[回款分配(PAYEE_ALLOCATE)](module/crm/payee_allocate)|1:N关系||
|[DER1N_TASK_EXECUTOR_USER_USER_ID](der/DER1N_TASK_EXECUTOR_USER_USER_ID)|[任务执行人(TASK_EXECUTOR)](module/crm/task_executor)|1:N关系||
|[DERCUSTOM_DEAL_USER](der/DERCUSTOM_DEAL_USER)|[商机(DEAL)](module/crm/deal)|自定义关系||
|[DERCUSTOM_TARGET_RELATION_USER](der/DERCUSTOM_TARGET_RELATION_USER)|[关联(RELATION)](module/crm/relation)|自定义关系||


</el-tab-pane>
</el-tabs>
</el-row>

## 映射
| 名称col150    | 映射实体col200   | 备注col900  |
| -------- |----------  |----- |
|[ibizsysmgr人员映射](module/crm/user/demap/ibizsysmgr)|[人员(SYS_PERSON)](module/runtime/sys_person)||

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|添加关联销售|add_account_reluser|[实体处理逻辑](module/crm/user/logic/add_account_reluser "添加客户关联销售")|默认|不支持||||
|创建账号|createSysPerson|[实体处理逻辑](module/crm/user/logic/createSysPerson "创建账号")|默认|不支持||||
|取消关联|unlink|[实体处理逻辑](module/crm/user/logic/unlink "取消关联")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[创建账号](module/crm/user/logic/createSysPerson)|createSysPerson|无|||
|[取消关联](module/crm/user/logic/unlink)|unlink|无|||
|[查询销售领导](module/crm/user/logic/SalesLeader)|SalesLeader|无|||
|[添加客户关联销售](module/crm/user/logic/add_account_reluser)|add_account_reluser|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/user/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/user/query/View)|VIEW|否|否 |否 ||
|[客户关联销售(account_reluser)](module/crm/user/query/account_reluser)|account_reluser|否|否 |否 ||
|[当前用户(curuser)](module/crm/user/query/curuser)|curuser|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/user/dataset/Default)|DEFAULT|数据查询|是|||
|[销售领导(SalesLeader)](module/crm/user/dataset/SalesLeader)|SalesLeader|[实体逻辑](module/crm/user/logic/SalesLeader)|否|||
|[客户关联销售(account_reluser)](module/crm/user/dataset/account_reluser)|account_reluser|数据查询|否|||
|[全部数据(all)](module/crm/user/dataset/all)|all|数据查询|否|||
|[当前用户(curuser)](module/crm/user/dataset/curuser)|curuser|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=user-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `READ`
* `CREATE`
* `DELETE`



##### 全部数据-只读 :id=user-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 当前数据-读写 :id=user-CUR_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[当前用户(curuser)](module/crm/user#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_FIRST_NAME_LIKE|姓名|LIKE||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_STATUS_EQ|状态|EQ||
|N_SYSUSERID_EQ|rt用户标识|EQ||
|N_SYSUSERID_NOTEQ|rt用户标识|NOTEQ||
|N_USER_NAME_LIKE|账号|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 修改密码（表单） | change_password | 确认 |无数据|用户自定义||
| 新建用户 | new_user | 新建 |无数据|<details><summary>打开视图或向导（模态）</summary>[新建用户](app/view/user_quick_new_view)</details>||
| 添加关联销售 | add_account_reluser | 添加关联销售 |无数据|<details><summary>后台调用</summary>[add_account_reluser](#行为)||
| 取消关联 | unlink | 取消关联 |多项数据（主键）|<details><summary>后台调用</summary>[unlink](#行为)||
| 编辑个人信息（工作用户） | work_user_edit_personal_info | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[个人信息编辑](app/view/user_work_user_option_view)</details>||
| 编辑个人信息 | edit_personal_info | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[个人信息编辑](app/view/user_option_view)</details>||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[修改密码（表单）](module/crm/user/uilogic/change_pas)|change_pas|修改密码|

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/user?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/user?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/user?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/user?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/user?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/user?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/user?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/user?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/user?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/user?id=界面逻辑`">
  界面逻辑
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