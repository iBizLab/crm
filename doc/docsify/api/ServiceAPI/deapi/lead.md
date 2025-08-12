# 线索(lead) :id=lead
## 创建线索

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}

```

## 获取线索

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`
自动生成

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|




##### 响应示例： {docsify-ignore}
```json

{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}

```

## 删除线索

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新线索

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}

```

## 新建线索时添加到工作进展

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/{key}/add_leadto_work_progress" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```



## 批添加标签

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/{key}/add_tags" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```



## 异步新建线索时添加到工作进展

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/{key}/async_add_leadto_work_progress" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
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
<el-alert title="/leads/{key}/batch_update" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```



## 检查线索主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
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
<el-alert title="/leads/create_task" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`
自动生成



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}

```

## 批移除标签

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/{key}/delete_tags" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```



## 获取线索草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}

```

## 派生商机

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/{key}/lead_to_be_deal" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```



## 线索转商机

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/{key}/lead_to_deal" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```



## main_view_dr计数器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/{key}/main_view_dr_count" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```



## 关联任务和活动

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/{key}/relate_task_and_maneuver" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}

```

## 保存线索

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">executors</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|跟踪人|
|<el-row justify="space-between"><el-col :span="20">account_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">pname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">last_assess_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|最近评估时间|
|<el-row justify="space-between"><el-col :span="20">account_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">annual_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年收入|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">converted_date_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|转换的日期时间|
|<el-row justify="space-between"><el-col :span="20">converted_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|为“已转换”|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">designation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位/职称|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">enrich_status_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">first_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名字|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">last_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">lead_conversion_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线索转换用时|
|<el-row justify="space-between"><el-col :span="20">lead_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">lead_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_of_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">pid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">salutation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">secondary_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备用邮箱|
|<el-row justify="space-between"><el-col :span="20">skype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Skype lD|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "executors" : null,
  "account_name" : null,
  "pname" : null,
  "last_assess_time" : null,
  "account_id" : null,
  "annual_revenue" : null,
  "attachments" : null,
  "city" : null,
  "company" : null,
  "converted_date_time" : null,
  "converted_s" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "designation" : null,
  "email" : null,
  "email_opt_out" : null,
  "enrich_status_s" : null,
  "first_name" : null,
  "full_name" : null,
  "id" : null,
  "last_name" : null,
  "lead_conversion_time" : null,
  "lead_source" : null,
  "lead_status" : null,
  "mobile" : null,
  "name" : null,
  "no_of_employees" : null,
  "owner" : null,
  "pid" : null,
  "salutation" : null,
  "secondary_email" : null,
  "skype_id" : null,
  "state" : null,
  "street" : null,
  "subject" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "zip_code" : null,
}

```

## 全部数据

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/fetch_all" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_company_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_enrich_status_s_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|跟踪人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_last_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">n_lead_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_noteq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_mobile_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_salutation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">n_subject_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">n_unsubscribed_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_company_like" : null,
  "n_enrich_status_s_eq" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_id_eq" : null,
  "n_last_name_like" : null,
  "n_lead_source_eq" : null,
  "n_lead_status_eq" : null,
  "n_lead_status_noteq" : null,
  "n_mobile_like" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_salutation_eq" : null,
  "n_subject_like" : null,
  "n_unsubscribed_mode_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "executors" : null,
    "account_name" : null,
    "pname" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "annual_revenue" : null,
    "attachments" : null,
    "city" : null,
    "company" : null,
    "converted_date_time" : null,
    "converted_s" : null,
    "country" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "designation" : null,
    "email" : null,
    "email_opt_out" : null,
    "enrich_status_s" : null,
    "first_name" : null,
    "full_name" : null,
    "id" : null,
    "last_name" : null,
    "lead_conversion_time" : null,
    "lead_source" : null,
    "lead_status" : null,
    "mobile" : null,
    "name" : null,
    "no_of_employees" : null,
    "owner" : null,
    "pid" : null,
    "salutation" : null,
    "secondary_email" : null,
    "skype_id" : null,
    "state" : null,
    "street" : null,
    "subject" : null,
    "unsubscribed_mode" : null,
    "unsubscribed_time" : null,
    "update_man" : null,
    "update_time" : null,
    "zip_code" : null,
  }
]
```

## 创建者

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/fetch_createman" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_company_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_enrich_status_s_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|跟踪人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_last_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">n_lead_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_noteq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_mobile_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_salutation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">n_subject_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">n_unsubscribed_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_company_like" : null,
  "n_enrich_status_s_eq" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_id_eq" : null,
  "n_last_name_like" : null,
  "n_lead_source_eq" : null,
  "n_lead_status_eq" : null,
  "n_lead_status_noteq" : null,
  "n_mobile_like" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_salutation_eq" : null,
  "n_subject_like" : null,
  "n_unsubscribed_mode_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "executors" : null,
    "account_name" : null,
    "pname" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "annual_revenue" : null,
    "attachments" : null,
    "city" : null,
    "company" : null,
    "converted_date_time" : null,
    "converted_s" : null,
    "country" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "designation" : null,
    "email" : null,
    "email_opt_out" : null,
    "enrich_status_s" : null,
    "first_name" : null,
    "full_name" : null,
    "id" : null,
    "last_name" : null,
    "lead_conversion_time" : null,
    "lead_source" : null,
    "lead_status" : null,
    "mobile" : null,
    "name" : null,
    "no_of_employees" : null,
    "owner" : null,
    "pid" : null,
    "salutation" : null,
    "secondary_email" : null,
    "skype_id" : null,
    "state" : null,
    "street" : null,
    "subject" : null,
    "unsubscribed_mode" : null,
    "unsubscribed_time" : null,
    "update_man" : null,
    "update_time" : null,
    "zip_code" : null,
  }
]
```

## 树表格

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/fetch_data_set2" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_company_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_enrich_status_s_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|跟踪人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_last_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">n_lead_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_noteq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_mobile_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_salutation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">n_subject_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">n_unsubscribed_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_company_like" : null,
  "n_enrich_status_s_eq" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_id_eq" : null,
  "n_last_name_like" : null,
  "n_lead_source_eq" : null,
  "n_lead_status_eq" : null,
  "n_lead_status_noteq" : null,
  "n_mobile_like" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_salutation_eq" : null,
  "n_subject_like" : null,
  "n_unsubscribed_mode_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "executors" : null,
    "account_name" : null,
    "pname" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "annual_revenue" : null,
    "attachments" : null,
    "city" : null,
    "company" : null,
    "converted_date_time" : null,
    "converted_s" : null,
    "country" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "designation" : null,
    "email" : null,
    "email_opt_out" : null,
    "enrich_status_s" : null,
    "first_name" : null,
    "full_name" : null,
    "id" : null,
    "last_name" : null,
    "lead_conversion_time" : null,
    "lead_source" : null,
    "lead_status" : null,
    "mobile" : null,
    "name" : null,
    "no_of_employees" : null,
    "owner" : null,
    "pid" : null,
    "salutation" : null,
    "secondary_email" : null,
    "skype_id" : null,
    "state" : null,
    "street" : null,
    "subject" : null,
    "unsubscribed_mode" : null,
    "unsubscribed_time" : null,
    "update_man" : null,
    "update_time" : null,
    "zip_code" : null,
  }
]
```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_company_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_enrich_status_s_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|跟踪人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_last_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">n_lead_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_noteq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_mobile_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_salutation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">n_subject_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">n_unsubscribed_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_company_like" : null,
  "n_enrich_status_s_eq" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_id_eq" : null,
  "n_last_name_like" : null,
  "n_lead_source_eq" : null,
  "n_lead_status_eq" : null,
  "n_lead_status_noteq" : null,
  "n_mobile_like" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_salutation_eq" : null,
  "n_subject_like" : null,
  "n_unsubscribed_mode_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "executors" : null,
    "account_name" : null,
    "pname" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "annual_revenue" : null,
    "attachments" : null,
    "city" : null,
    "company" : null,
    "converted_date_time" : null,
    "converted_s" : null,
    "country" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "designation" : null,
    "email" : null,
    "email_opt_out" : null,
    "enrich_status_s" : null,
    "first_name" : null,
    "full_name" : null,
    "id" : null,
    "last_name" : null,
    "lead_conversion_time" : null,
    "lead_source" : null,
    "lead_status" : null,
    "mobile" : null,
    "name" : null,
    "no_of_employees" : null,
    "owner" : null,
    "pid" : null,
    "salutation" : null,
    "secondary_email" : null,
    "skype_id" : null,
    "state" : null,
    "street" : null,
    "subject" : null,
    "unsubscribed_mode" : null,
    "unsubscribed_time" : null,
    "update_man" : null,
    "update_time" : null,
    "zip_code" : null,
  }
]
```

## 执行人

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/fetch_executor" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_company_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_enrich_status_s_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|跟踪人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_last_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">n_lead_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_noteq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_mobile_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_salutation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">n_subject_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">n_unsubscribed_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_company_like" : null,
  "n_enrich_status_s_eq" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_id_eq" : null,
  "n_last_name_like" : null,
  "n_lead_source_eq" : null,
  "n_lead_status_eq" : null,
  "n_lead_status_noteq" : null,
  "n_mobile_like" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_salutation_eq" : null,
  "n_subject_like" : null,
  "n_unsubscribed_mode_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "executors" : null,
    "account_name" : null,
    "pname" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "annual_revenue" : null,
    "attachments" : null,
    "city" : null,
    "company" : null,
    "converted_date_time" : null,
    "converted_s" : null,
    "country" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "designation" : null,
    "email" : null,
    "email_opt_out" : null,
    "enrich_status_s" : null,
    "first_name" : null,
    "full_name" : null,
    "id" : null,
    "last_name" : null,
    "lead_conversion_time" : null,
    "lead_source" : null,
    "lead_status" : null,
    "mobile" : null,
    "name" : null,
    "no_of_employees" : null,
    "owner" : null,
    "pid" : null,
    "salutation" : null,
    "secondary_email" : null,
    "skype_id" : null,
    "state" : null,
    "street" : null,
    "subject" : null,
    "unsubscribed_mode" : null,
    "unsubscribed_time" : null,
    "update_man" : null,
    "update_time" : null,
    "zip_code" : null,
  }
]
```

## 线索关联的任务和活动

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/fetch_lead_relation_task" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_company_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_enrich_status_s_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|跟踪人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_last_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">n_lead_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_noteq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_mobile_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_salutation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">n_subject_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">n_unsubscribed_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_company_like" : null,
  "n_enrich_status_s_eq" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_id_eq" : null,
  "n_last_name_like" : null,
  "n_lead_source_eq" : null,
  "n_lead_status_eq" : null,
  "n_lead_status_noteq" : null,
  "n_mobile_like" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_salutation_eq" : null,
  "n_subject_like" : null,
  "n_unsubscribed_mode_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "executors" : null,
    "account_name" : null,
    "pname" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "annual_revenue" : null,
    "attachments" : null,
    "city" : null,
    "company" : null,
    "converted_date_time" : null,
    "converted_s" : null,
    "country" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "designation" : null,
    "email" : null,
    "email_opt_out" : null,
    "enrich_status_s" : null,
    "first_name" : null,
    "full_name" : null,
    "id" : null,
    "last_name" : null,
    "lead_conversion_time" : null,
    "lead_source" : null,
    "lead_status" : null,
    "mobile" : null,
    "name" : null,
    "no_of_employees" : null,
    "owner" : null,
    "pid" : null,
    "salutation" : null,
    "secondary_email" : null,
    "skype_id" : null,
    "state" : null,
    "street" : null,
    "subject" : null,
    "unsubscribed_mode" : null,
    "unsubscribed_time" : null,
    "update_man" : null,
    "update_time" : null,
    "zip_code" : null,
  }
]
```

## 所有者

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/fetch_owner" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_company_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_enrich_status_s_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|跟踪人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_last_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">n_lead_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_noteq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_mobile_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_salutation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">n_subject_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">n_unsubscribed_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_company_like" : null,
  "n_enrich_status_s_eq" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_id_eq" : null,
  "n_last_name_like" : null,
  "n_lead_source_eq" : null,
  "n_lead_status_eq" : null,
  "n_lead_status_noteq" : null,
  "n_mobile_like" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_salutation_eq" : null,
  "n_subject_like" : null,
  "n_unsubscribed_mode_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "executors" : null,
    "account_name" : null,
    "pname" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "annual_revenue" : null,
    "attachments" : null,
    "city" : null,
    "company" : null,
    "converted_date_time" : null,
    "converted_s" : null,
    "country" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "designation" : null,
    "email" : null,
    "email_opt_out" : null,
    "enrich_status_s" : null,
    "first_name" : null,
    "full_name" : null,
    "id" : null,
    "last_name" : null,
    "lead_conversion_time" : null,
    "lead_source" : null,
    "lead_status" : null,
    "mobile" : null,
    "name" : null,
    "no_of_employees" : null,
    "owner" : null,
    "pid" : null,
    "salutation" : null,
    "secondary_email" : null,
    "skype_id" : null,
    "state" : null,
    "street" : null,
    "subject" : null,
    "unsubscribed_mode" : null,
    "unsubscribed_time" : null,
    "update_man" : null,
    "update_time" : null,
    "zip_code" : null,
  }
]
```

## 被关联的数据

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/fetch_target_relation" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户标识|
|<el-row justify="space-between"><el-col :span="20">n_account_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_account_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户名称|
|<el-row justify="space-between"><el-col :span="20">n_company_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_enrich_status_s_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|充实状态|
|<el-row justify="space-between"><el-col :span="20">n_executors_exists_n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|跟踪人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_last_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓氏|
|<el-row justify="space-between"><el-col :span="20">n_lead_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索来源|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_lead_status_noteq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|线索状态|
|<el-row justify="space-between"><el-col :span="20">n_mobile_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_pid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索标识|
|<el-row justify="space-between"><el-col :span="20">n_pname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_pname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父线索|
|<el-row justify="space-between"><el-col :span="20">n_salutation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|称呼|
|<el-row justify="space-between"><el-col :span="20">n_subject_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">n_unsubscribed_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_id_eq" : null,
  "n_account_name_eq" : null,
  "n_account_name_like" : null,
  "n_company_like" : null,
  "n_enrich_status_s_eq" : null,
  "n_executors_exists_n_user_id_eq" : null,
  "n_id_eq" : null,
  "n_last_name_like" : null,
  "n_lead_source_eq" : null,
  "n_lead_status_eq" : null,
  "n_lead_status_noteq" : null,
  "n_mobile_like" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_pid_eq" : null,
  "n_pname_eq" : null,
  "n_pname_like" : null,
  "n_salutation_eq" : null,
  "n_subject_like" : null,
  "n_unsubscribed_mode_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "executors" : null,
    "account_name" : null,
    "pname" : null,
    "last_assess_time" : null,
    "account_id" : null,
    "annual_revenue" : null,
    "attachments" : null,
    "city" : null,
    "company" : null,
    "converted_date_time" : null,
    "converted_s" : null,
    "country" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "designation" : null,
    "email" : null,
    "email_opt_out" : null,
    "enrich_status_s" : null,
    "first_name" : null,
    "full_name" : null,
    "id" : null,
    "last_name" : null,
    "lead_conversion_time" : null,
    "lead_source" : null,
    "lead_status" : null,
    "mobile" : null,
    "name" : null,
    "no_of_employees" : null,
    "owner" : null,
    "pid" : null,
    "salutation" : null,
    "secondary_email" : null,
    "skype_id" : null,
    "state" : null,
    "street" : null,
    "subject" : null,
    "unsubscribed_mode" : null,
    "unsubscribed_time" : null,
    "update_man" : null,
    "update_time" : null,
    "zip_code" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/leads/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/leads/exportdata/{param},/leads/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/leads/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/leads/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/leads/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/leads/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/leads/report" type="info" :closable="false" ></el-alert>
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