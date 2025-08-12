# 订单(project) :id=project
## 创建订单

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 获取订单

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{key}" type="info" :closable="false" ></el-alert>
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
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 删除订单

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新订单

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 新建订单时添加到工作进展

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{key}/add_project_to_work_progress" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
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
<el-alert title="/projects/{key}/add_tags" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 异步新建订单时添加到工作进展

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{key}/async_add_project_to_work_progress" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
```

## 批更新

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{key}/batch_update" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 检查订单主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
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
<el-alert title="/projects/create_task" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`
自动生成



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
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
<el-alert title="/projects/{key}/delete_tags" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 查询父订单信息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/find_by_pid" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 获取订单草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
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
<el-alert title="/projects/{key}/main_view_dr_count" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 保存订单

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 检测子订单是否有未关闭订单

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/{key}/scan_status" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">closed_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|关闭日期|
|<el-row justify="space-between"><el-col :span="20">order_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">is_in_sales_cal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|纳入销售业绩计算|
|<el-row justify="space-between"><el-col :span="20">year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所属年度|
|<el-row justify="space-between"><el-col :span="20">order_allocates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|分配人员|
|<el-row justify="space-between"><el-col :span="20">allocate_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配模式|
|<el-row justify="space-between"><el-col :span="20">business_line</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|执行人|
|<el-row justify="space-between"><el-col :span="20">is_physical_order</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_close_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">is_new_this_year</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">o_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">settlement_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|业绩结算金额|
|<el-row justify="space-between"><el-col :span="20">settlement_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|结算成本|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|税率|



##### 请求示例： {docsify-ignore}
```json
{
  "account_name" : null,
  "closed_date" : null,
  "order_date" : null,
  "is_in_sales_cal" : null,
  "year" : null,
  "order_allocates" : null,
  "allocate_model" : null,
  "business_line" : null,
  "executors" : null,
  "is_physical_order" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "amount" : null,
  "attachments" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "is_close_this_year" : null,
  "is_new_this_year" : null,
  "name" : null,
  "o_number" : null,
  "owner" : null,
  "pid" : null,
  "pname" : null,
  "settlement_amount" : null,
  "settlement_cost" : null,
  "status" : null,
  "tax" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 所有数据

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/fetch_all" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_amount_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_business_line_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_close_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">n_is_new_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">n_is_physical_order_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_amount_gt" : null,
  "n_amount_gtandeq" : null,
  "n_amount_lt" : null,
  "n_amount_ltandeq" : null,
  "n_business_line_eq" : null,
  "n_executors_exists_n_name_like" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_executors_like" : null,
  "n_id_eq" : null,
  "n_is_close_this_year_eq" : null,
  "n_is_new_this_year_eq" : null,
  "n_is_physical_order_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_order_date_gt" : null,
  "n_order_date_gtandeq" : null,
  "n_order_date_lt" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "account_name" : null,
    "closed_date" : null,
    "order_date" : null,
    "is_in_sales_cal" : null,
    "year" : null,
    "order_allocates" : null,
    "allocate_model" : null,
    "business_line" : null,
    "executors" : null,
    "is_physical_order" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "is_close_this_year" : null,
    "is_new_this_year" : null,
    "name" : null,
    "o_number" : null,
    "owner" : null,
    "pid" : null,
    "pname" : null,
    "settlement_amount" : null,
    "settlement_cost" : null,
    "status" : null,
    "tax" : null,
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
<el-alert title="/projects/fetch_createman" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_amount_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_business_line_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_close_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">n_is_new_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">n_is_physical_order_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_amount_gt" : null,
  "n_amount_gtandeq" : null,
  "n_amount_lt" : null,
  "n_amount_ltandeq" : null,
  "n_business_line_eq" : null,
  "n_executors_exists_n_name_like" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_executors_like" : null,
  "n_id_eq" : null,
  "n_is_close_this_year_eq" : null,
  "n_is_new_this_year_eq" : null,
  "n_is_physical_order_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_order_date_gt" : null,
  "n_order_date_gtandeq" : null,
  "n_order_date_lt" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "account_name" : null,
    "closed_date" : null,
    "order_date" : null,
    "is_in_sales_cal" : null,
    "year" : null,
    "order_allocates" : null,
    "allocate_model" : null,
    "business_line" : null,
    "executors" : null,
    "is_physical_order" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "is_close_this_year" : null,
    "is_new_this_year" : null,
    "name" : null,
    "o_number" : null,
    "owner" : null,
    "pid" : null,
    "pname" : null,
    "settlement_amount" : null,
    "settlement_cost" : null,
    "status" : null,
    "tax" : null,
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
<el-alert title="/projects/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_amount_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_business_line_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_close_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">n_is_new_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">n_is_physical_order_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_amount_gt" : null,
  "n_amount_gtandeq" : null,
  "n_amount_lt" : null,
  "n_amount_ltandeq" : null,
  "n_business_line_eq" : null,
  "n_executors_exists_n_name_like" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_executors_like" : null,
  "n_id_eq" : null,
  "n_is_close_this_year_eq" : null,
  "n_is_new_this_year_eq" : null,
  "n_is_physical_order_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_order_date_gt" : null,
  "n_order_date_gtandeq" : null,
  "n_order_date_lt" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "account_name" : null,
    "closed_date" : null,
    "order_date" : null,
    "is_in_sales_cal" : null,
    "year" : null,
    "order_allocates" : null,
    "allocate_model" : null,
    "business_line" : null,
    "executors" : null,
    "is_physical_order" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "is_close_this_year" : null,
    "is_new_this_year" : null,
    "name" : null,
    "o_number" : null,
    "owner" : null,
    "pid" : null,
    "pname" : null,
    "settlement_amount" : null,
    "settlement_cost" : null,
    "status" : null,
    "tax" : null,
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
<el-alert title="/projects/fetch_executor" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_amount_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_business_line_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_close_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">n_is_new_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">n_is_physical_order_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_amount_gt" : null,
  "n_amount_gtandeq" : null,
  "n_amount_lt" : null,
  "n_amount_ltandeq" : null,
  "n_business_line_eq" : null,
  "n_executors_exists_n_name_like" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_executors_like" : null,
  "n_id_eq" : null,
  "n_is_close_this_year_eq" : null,
  "n_is_new_this_year_eq" : null,
  "n_is_physical_order_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_order_date_gt" : null,
  "n_order_date_gtandeq" : null,
  "n_order_date_lt" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "account_name" : null,
    "closed_date" : null,
    "order_date" : null,
    "is_in_sales_cal" : null,
    "year" : null,
    "order_allocates" : null,
    "allocate_model" : null,
    "business_line" : null,
    "executors" : null,
    "is_physical_order" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "is_close_this_year" : null,
    "is_new_this_year" : null,
    "name" : null,
    "o_number" : null,
    "owner" : null,
    "pid" : null,
    "pname" : null,
    "settlement_amount" : null,
    "settlement_cost" : null,
    "status" : null,
    "tax" : null,
    "update_man" : null,
    "update_time" : null,
  }
]
```

## 签单统计

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/fetch_order_statistics" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`
签单统计柱状图用



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_amount_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_business_line_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_close_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">n_is_new_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">n_is_physical_order_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_amount_gt" : null,
  "n_amount_gtandeq" : null,
  "n_amount_lt" : null,
  "n_amount_ltandeq" : null,
  "n_business_line_eq" : null,
  "n_executors_exists_n_name_like" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_executors_like" : null,
  "n_id_eq" : null,
  "n_is_close_this_year_eq" : null,
  "n_is_new_this_year_eq" : null,
  "n_is_physical_order_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_order_date_gt" : null,
  "n_order_date_gtandeq" : null,
  "n_order_date_lt" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "account_name" : null,
    "closed_date" : null,
    "order_date" : null,
    "is_in_sales_cal" : null,
    "year" : null,
    "order_allocates" : null,
    "allocate_model" : null,
    "business_line" : null,
    "executors" : null,
    "is_physical_order" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "is_close_this_year" : null,
    "is_new_this_year" : null,
    "name" : null,
    "o_number" : null,
    "owner" : null,
    "pid" : null,
    "pname" : null,
    "settlement_amount" : null,
    "settlement_cost" : null,
    "status" : null,
    "tax" : null,
    "update_man" : null,
    "update_time" : null,
  }
]
```

## 所有者

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/fetch_owner" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_amount_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_business_line_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_close_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">n_is_new_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">n_is_physical_order_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_amount_gt" : null,
  "n_amount_gtandeq" : null,
  "n_amount_lt" : null,
  "n_amount_ltandeq" : null,
  "n_business_line_eq" : null,
  "n_executors_exists_n_name_like" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_executors_like" : null,
  "n_id_eq" : null,
  "n_is_close_this_year_eq" : null,
  "n_is_new_this_year_eq" : null,
  "n_is_physical_order_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_order_date_gt" : null,
  "n_order_date_gtandeq" : null,
  "n_order_date_lt" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "account_name" : null,
    "closed_date" : null,
    "order_date" : null,
    "is_in_sales_cal" : null,
    "year" : null,
    "order_allocates" : null,
    "allocate_model" : null,
    "business_line" : null,
    "executors" : null,
    "is_physical_order" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "is_close_this_year" : null,
    "is_new_this_year" : null,
    "name" : null,
    "o_number" : null,
    "owner" : null,
    "pid" : null,
    "pname" : null,
    "settlement_amount" : null,
    "settlement_cost" : null,
    "status" : null,
    "tax" : null,
    "update_man" : null,
    "update_time" : null,
  }
]
```

## 实体订单

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/projects/fetch_query_physical_order_grid" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`
签单统计表格用



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_amount_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_business_line_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_close_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">n_is_new_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">n_is_physical_order_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_amount_gt" : null,
  "n_amount_gtandeq" : null,
  "n_amount_lt" : null,
  "n_amount_ltandeq" : null,
  "n_business_line_eq" : null,
  "n_executors_exists_n_name_like" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_executors_like" : null,
  "n_id_eq" : null,
  "n_is_close_this_year_eq" : null,
  "n_is_new_this_year_eq" : null,
  "n_is_physical_order_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_order_date_gt" : null,
  "n_order_date_gtandeq" : null,
  "n_order_date_lt" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "account_name" : null,
    "closed_date" : null,
    "order_date" : null,
    "is_in_sales_cal" : null,
    "year" : null,
    "order_allocates" : null,
    "allocate_model" : null,
    "business_line" : null,
    "executors" : null,
    "is_physical_order" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "is_close_this_year" : null,
    "is_new_this_year" : null,
    "name" : null,
    "o_number" : null,
    "owner" : null,
    "pid" : null,
    "pname" : null,
    "settlement_amount" : null,
    "settlement_cost" : null,
    "status" : null,
    "tax" : null,
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
<el-alert title="/projects/fetch_tree" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_amount_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_amount_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订单金额|
|<el-row justify="space-between"><el-col :span="20">n_business_line_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务条线|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_executors_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|执行人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_close_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年执行|
|<el-row justify="space-between"><el-col :span="20">n_is_new_this_year_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否本年新签|
|<el-row justify="space-between"><el-col :span="20">n_is_physical_order_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对应实体订单|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单名称|
|<el-row justify="space-between"><el-col :span="20">n_o_number_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|订单编号|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_order_date_lt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|订单日期|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父订单|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_amount_gt" : null,
  "n_amount_gtandeq" : null,
  "n_amount_lt" : null,
  "n_amount_ltandeq" : null,
  "n_business_line_eq" : null,
  "n_executors_exists_n_name_like" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_executors_like" : null,
  "n_id_eq" : null,
  "n_is_close_this_year_eq" : null,
  "n_is_new_this_year_eq" : null,
  "n_is_physical_order_eq" : null,
  "n_name_like" : null,
  "n_o_number_like" : null,
  "n_order_date_gt" : null,
  "n_order_date_gtandeq" : null,
  "n_order_date_lt" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "account_name" : null,
    "closed_date" : null,
    "order_date" : null,
    "is_in_sales_cal" : null,
    "year" : null,
    "order_allocates" : null,
    "allocate_model" : null,
    "business_line" : null,
    "executors" : null,
    "is_physical_order" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "amount" : null,
    "attachments" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "is_close_this_year" : null,
    "is_new_this_year" : null,
    "name" : null,
    "o_number" : null,
    "owner" : null,
    "pid" : null,
    "pname" : null,
    "settlement_amount" : null,
    "settlement_cost" : null,
    "status" : null,
    "tax" : null,
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
<el-alert title="/projects/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/projects/exportdata/{param},/projects/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/projects/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/projects/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/projects/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/projects/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/projects/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


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