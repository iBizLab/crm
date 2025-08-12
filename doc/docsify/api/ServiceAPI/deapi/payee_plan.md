# 收款计划(payee_plan) :id=payee_plan
## 创建收款计划

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 获取收款计划

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|




##### 响应示例： {docsify-ignore}
```json

{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 删除收款计划

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新收款计划

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 获取订单数据

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/add_project" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`
获取订单数据



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 批添加标签

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/{key}/add_tags" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`
自动生成

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 批更新

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/{key}/batch_update" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`
自动生成

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 检查收款计划主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 批创建任务

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/create_task" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`
自动生成



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 批移除标签

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/{key}/delete_tags" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`
自动生成

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 获取收款计划草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## main_view_dr计数器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/{key}/main_view_dr_count" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`
自动生成

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 移动排序

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/{key}/move_order" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 将数据传给记录

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/{key}/plan_to_payee" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`
将数据传给记录

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 保存收款计划

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "sequence" : null,
  "planned_time" : null,
  "is_not_in_plan" : null,
  "o_number" : null,
  "owner" : null,
  "pproject_id" : null,
  "plan_status" : null,
  "plan_name" : null,
  "project_amount" : null,
  "settlement_amount" : null,
  "account_name" : null,
  "order_date" : null,
  "business_line" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "name" : null,
  "project_id" : null,
  "project_name" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 全部

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/fetch_all" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_amount_gtandeq" : null,
  "n_amount_in" : null,
  "n_amount_ltandeq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_plan_name_like" : null,
  "n_plan_status_eq" : null,
  "n_planned_time_gt" : null,
  "n_planned_time_gtandeq" : null,
  "n_planned_time_in" : null,
  "n_planned_time_ltandeq" : null,
  "n_project_id_eq" : null,
  "n_project_name_eq" : null,
  "n_project_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "sequence" : null,
    "planned_time" : null,
    "is_not_in_plan" : null,
    "o_number" : null,
    "owner" : null,
    "pproject_id" : null,
    "plan_status" : null,
    "plan_name" : null,
    "project_amount" : null,
    "settlement_amount" : null,
    "account_name" : null,
    "order_date" : null,
    "business_line" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "name" : null,
    "project_id" : null,
    "project_name" : null,
    "update_man" : null,
    "update_time" : null,
  }
]
```

## 创建者

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/fetch_createman" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_amount_gtandeq" : null,
  "n_amount_in" : null,
  "n_amount_ltandeq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_plan_name_like" : null,
  "n_plan_status_eq" : null,
  "n_planned_time_gt" : null,
  "n_planned_time_gtandeq" : null,
  "n_planned_time_in" : null,
  "n_planned_time_ltandeq" : null,
  "n_project_id_eq" : null,
  "n_project_name_eq" : null,
  "n_project_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "sequence" : null,
    "planned_time" : null,
    "is_not_in_plan" : null,
    "o_number" : null,
    "owner" : null,
    "pproject_id" : null,
    "plan_status" : null,
    "plan_name" : null,
    "project_amount" : null,
    "settlement_amount" : null,
    "account_name" : null,
    "order_date" : null,
    "business_line" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "name" : null,
    "project_id" : null,
    "project_name" : null,
    "update_man" : null,
    "update_time" : null,
  }
]
```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_amount_gtandeq" : null,
  "n_amount_in" : null,
  "n_amount_ltandeq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_plan_name_like" : null,
  "n_plan_status_eq" : null,
  "n_planned_time_gt" : null,
  "n_planned_time_gtandeq" : null,
  "n_planned_time_in" : null,
  "n_planned_time_ltandeq" : null,
  "n_project_id_eq" : null,
  "n_project_name_eq" : null,
  "n_project_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "sequence" : null,
    "planned_time" : null,
    "is_not_in_plan" : null,
    "o_number" : null,
    "owner" : null,
    "pproject_id" : null,
    "plan_status" : null,
    "plan_name" : null,
    "project_amount" : null,
    "settlement_amount" : null,
    "account_name" : null,
    "order_date" : null,
    "business_line" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "name" : null,
    "project_id" : null,
    "project_name" : null,
    "update_man" : null,
    "update_time" : null,
  }
]
```

## 执行人

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/fetch_executor" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_amount_gtandeq" : null,
  "n_amount_in" : null,
  "n_amount_ltandeq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_plan_name_like" : null,
  "n_plan_status_eq" : null,
  "n_planned_time_gt" : null,
  "n_planned_time_gtandeq" : null,
  "n_planned_time_in" : null,
  "n_planned_time_ltandeq" : null,
  "n_project_id_eq" : null,
  "n_project_name_eq" : null,
  "n_project_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "sequence" : null,
    "planned_time" : null,
    "is_not_in_plan" : null,
    "o_number" : null,
    "owner" : null,
    "pproject_id" : null,
    "plan_status" : null,
    "plan_name" : null,
    "project_amount" : null,
    "settlement_amount" : null,
    "account_name" : null,
    "order_date" : null,
    "business_line" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "name" : null,
    "project_id" : null,
    "project_name" : null,
    "update_man" : null,
    "update_time" : null,
  }
]
```

## 金额汇总

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/fetch_sum" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_amount_gtandeq" : null,
  "n_amount_in" : null,
  "n_amount_ltandeq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_plan_name_like" : null,
  "n_plan_status_eq" : null,
  "n_planned_time_gt" : null,
  "n_planned_time_gtandeq" : null,
  "n_planned_time_in" : null,
  "n_planned_time_ltandeq" : null,
  "n_project_id_eq" : null,
  "n_project_name_eq" : null,
  "n_project_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "sequence" : null,
    "planned_time" : null,
    "is_not_in_plan" : null,
    "o_number" : null,
    "owner" : null,
    "pproject_id" : null,
    "plan_status" : null,
    "plan_name" : null,
    "project_amount" : null,
    "settlement_amount" : null,
    "account_name" : null,
    "order_date" : null,
    "business_line" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "name" : null,
    "project_id" : null,
    "project_name" : null,
    "update_man" : null,
    "update_time" : null,
  }
]
```

## 进行中

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/fetch_toward" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_amount_gtandeq" : null,
  "n_amount_in" : null,
  "n_amount_ltandeq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_plan_name_like" : null,
  "n_plan_status_eq" : null,
  "n_planned_time_gt" : null,
  "n_planned_time_gtandeq" : null,
  "n_planned_time_in" : null,
  "n_planned_time_ltandeq" : null,
  "n_project_id_eq" : null,
  "n_project_name_eq" : null,
  "n_project_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "sequence" : null,
    "planned_time" : null,
    "is_not_in_plan" : null,
    "o_number" : null,
    "owner" : null,
    "pproject_id" : null,
    "plan_status" : null,
    "plan_name" : null,
    "project_amount" : null,
    "settlement_amount" : null,
    "account_name" : null,
    "order_date" : null,
    "business_line" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "name" : null,
    "project_id" : null,
    "project_name" : null,
    "update_man" : null,
    "update_time" : null,
  }
]
```

## 树表格

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/fetch_tree" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_amount_gtandeq" : null,
  "n_amount_in" : null,
  "n_amount_ltandeq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_plan_name_like" : null,
  "n_plan_status_eq" : null,
  "n_planned_time_gt" : null,
  "n_planned_time_gtandeq" : null,
  "n_planned_time_in" : null,
  "n_planned_time_ltandeq" : null,
  "n_project_id_eq" : null,
  "n_project_name_eq" : null,
  "n_project_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "sequence" : null,
    "planned_time" : null,
    "is_not_in_plan" : null,
    "o_number" : null,
    "owner" : null,
    "pproject_id" : null,
    "plan_status" : null,
    "plan_name" : null,
    "project_amount" : null,
    "settlement_amount" : null,
    "account_name" : null,
    "order_date" : null,
    "business_line" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "name" : null,
    "project_id" : null,
    "project_name" : null,
    "update_man" : null,
    "update_time" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/importtemplate" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |



## 数据导出

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/exportdata/{param},/payee_plans/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|param|String|导出集合方法名称|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|srfexporttag|String|导出模板标识|

##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|page|Integer|page|
|size|Integer|分页大小|
|n_xxx_eq|String|过滤参数|


## 数据导入

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/importdata" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 数据导入（返回错误excel）

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/importdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 自定义表头导入（异步）
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/asyncimportdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |
| srfossfileid | String | 导入文件 |
| srfimportschemaid | String | 表头定义 |


## 数据打印
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/printdata/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfprinttag | String | 打印标识 |
| srfcontenttype | String | 打印类型 |



## 报表打印

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/payee_plans/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfreporttag | String | 报表标识 |
| srfcontenttype | String | 报表类型 |




## 根据订单创建收款计划

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单获取收款计划

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|
|key|String|标识|




## 根据订单删除收款计划

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|
|key|String|标识|




## 根据订单更新收款计划

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单获取订单数据

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/add_project" type="info" :closable="false" ></el-alert>
</div>
</el-row>
获取订单数据

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单批添加标签

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/{key}/add_tags" type="info" :closable="false" ></el-alert>
</div>
</el-row>
自动生成

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单批更新

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/{key}/batch_update" type="info" :closable="false" ></el-alert>
</div>
</el-row>
自动生成

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单检查收款计划主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单批创建任务

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/create_task" type="info" :closable="false" ></el-alert>
</div>
</el-row>
自动生成

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单批移除标签

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/{key}/delete_tags" type="info" :closable="false" ></el-alert>
</div>
</el-row>
自动生成

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单获取收款计划草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单main_view_dr计数器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/{key}/main_view_dr_count" type="info" :closable="false" ></el-alert>
</div>
</el-row>
自动生成

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单移动排序

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/{key}/move_order" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单将数据传给记录

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/{key}/plan_to_payee" type="info" :closable="false" ></el-alert>
</div>
</el-row>
将数据传给记录

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单保存收款计划

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|序号|
|<el-row justify="space-between"><el-col :span="20">planned_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">is_not_in_plan</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|未纳入结算计划款|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pproject_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单标识|
|<el-row justify="space-between"><el-col :span="20">plan_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">project_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单客户|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|款项说明|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">project_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">project_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单全部

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/fetch_all" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单创建者

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/fetch_createman" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单执行人

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/fetch_executor" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单金额汇总

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/fetch_sum" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单进行中

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/fetch_toward" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|



## 根据订单树表格

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/fetch_tree" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|订单主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|金额|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划名称|
|<el-row justify="space-between"><el-col :span="20">n_plan_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划状态|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_planned_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划收款时间|
|<el-row justify="space-between"><el-col :span="20">n_project_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_project_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|




## 根据订单下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/importtemplate" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |



## 根据订单数据导出

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/exportdata/{param},/projects/{pkey}/payee_plans/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|
|param|String|导出集合方法名称|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|
|srfexporttag|String|导出模板标识|

##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|page|Integer|page|
|size|Integer|分页大小|
|n_xxx_eq|String|过滤参数|


## 根据订单数据导入

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/importdata" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 根据订单数据导入（返回错误excel）

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/importdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 根据订单自定义表头导入（异步）
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/asyncimportdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |
| srfossfileid | String | 导入文件 |
| srfimportschemaid | String | 表头定义 |


## 根据订单数据打印
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/printdata/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfprinttag | String | 打印标识 |
| srfcontenttype | String | 打印类型 |



## 根据订单报表打印

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{pkey}/payee_plans/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfreporttag | String | 报表标识 |
| srfcontenttype | String | 报表类型 |



<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    },
    methods: {

    }
  }).use(ElementPlus).mount('#app')
</script>