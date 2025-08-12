# 市场活动(campaign) :id=campaign
## 创建市场活动

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/campaigns" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">actual_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实际成本|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">budgeted_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预算成本|
|<el-row justify="space-between"><el-col :span="20">campaign_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|市场活动名称|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">expected_response</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|期望成功率(%)|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预期收益|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查部门|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查类型|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会持续时间|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_launch_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会启动URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_registration_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会注册URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_schedule</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|网络研讨会时间表|
|<el-row justify="space-between"><el-col :span="20">num_sent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|发出数量|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|



##### 请求示例： {docsify-ignore}
```json
{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 获取市场活动

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/campaigns/{key}" type="info" :closable="false" ></el-alert>
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
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 删除市场活动

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/campaigns/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新市场活动

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/campaigns/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">actual_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实际成本|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">budgeted_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预算成本|
|<el-row justify="space-between"><el-col :span="20">campaign_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|市场活动名称|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">expected_response</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|期望成功率(%)|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预期收益|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查部门|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查类型|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会持续时间|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_launch_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会启动URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_registration_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会注册URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_schedule</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|网络研讨会时间表|
|<el-row justify="space-between"><el-col :span="20">num_sent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|发出数量|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|



##### 请求示例： {docsify-ignore}
```json
{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
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
<el-alert title="/campaigns/{key}/add_tags" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">actual_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实际成本|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">budgeted_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预算成本|
|<el-row justify="space-between"><el-col :span="20">campaign_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|市场活动名称|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">expected_response</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|期望成功率(%)|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预期收益|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查部门|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查类型|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会持续时间|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_launch_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会启动URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_registration_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会注册URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_schedule</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|网络研讨会时间表|
|<el-row justify="space-between"><el-col :span="20">num_sent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|发出数量|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|



##### 请求示例： {docsify-ignore}
```json
{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
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
<el-alert title="/campaigns/{key}/batch_update" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">actual_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实际成本|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">budgeted_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预算成本|
|<el-row justify="space-between"><el-col :span="20">campaign_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|市场活动名称|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">expected_response</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|期望成功率(%)|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预期收益|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查部门|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查类型|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会持续时间|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_launch_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会启动URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_registration_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会注册URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_schedule</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|网络研讨会时间表|
|<el-row justify="space-between"><el-col :span="20">num_sent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|发出数量|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|



##### 请求示例： {docsify-ignore}
```json
{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 检查市场活动主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/campaigns/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">actual_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实际成本|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">budgeted_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预算成本|
|<el-row justify="space-between"><el-col :span="20">campaign_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|市场活动名称|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">expected_response</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|期望成功率(%)|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预期收益|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查部门|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查类型|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会持续时间|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_launch_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会启动URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_registration_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会注册URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_schedule</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|网络研讨会时间表|
|<el-row justify="space-between"><el-col :span="20">num_sent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|发出数量|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|



##### 请求示例： {docsify-ignore}
```json
{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
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
<el-alert title="/campaigns/create_task" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`
自动生成



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">actual_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实际成本|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">budgeted_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预算成本|
|<el-row justify="space-between"><el-col :span="20">campaign_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|市场活动名称|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">expected_response</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|期望成功率(%)|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预期收益|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查部门|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查类型|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会持续时间|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_launch_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会启动URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_registration_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会注册URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_schedule</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|网络研讨会时间表|
|<el-row justify="space-between"><el-col :span="20">num_sent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|发出数量|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|



##### 请求示例： {docsify-ignore}
```json
{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
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
<el-alert title="/campaigns/{key}/delete_tags" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">actual_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实际成本|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">budgeted_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预算成本|
|<el-row justify="space-between"><el-col :span="20">campaign_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|市场活动名称|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">expected_response</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|期望成功率(%)|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预期收益|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查部门|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查类型|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会持续时间|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_launch_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会启动URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_registration_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会注册URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_schedule</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|网络研讨会时间表|
|<el-row justify="space-between"><el-col :span="20">num_sent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|发出数量|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|



##### 请求示例： {docsify-ignore}
```json
{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 获取市场活动草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/campaigns/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">actual_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实际成本|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">budgeted_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预算成本|
|<el-row justify="space-between"><el-col :span="20">campaign_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|市场活动名称|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">expected_response</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|期望成功率(%)|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预期收益|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查部门|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查类型|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会持续时间|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_launch_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会启动URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_registration_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会注册URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_schedule</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|网络研讨会时间表|
|<el-row justify="space-between"><el-col :span="20">num_sent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|发出数量|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|



##### 请求示例： {docsify-ignore}
```json
{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
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
<el-alert title="/campaigns/{key}/main_view_dr_count" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">actual_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实际成本|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">budgeted_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预算成本|
|<el-row justify="space-between"><el-col :span="20">campaign_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|市场活动名称|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">expected_response</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|期望成功率(%)|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预期收益|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查部门|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查类型|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会持续时间|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_launch_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会启动URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_registration_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会注册URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_schedule</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|网络研讨会时间表|
|<el-row justify="space-between"><el-col :span="20">num_sent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|发出数量|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|



##### 请求示例： {docsify-ignore}
```json
{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
  "update_man" : null,
  "update_time" : null,
}
```



## 保存市场活动

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/campaigns/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">actual_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实际成本|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">budgeted_cost</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预算成本|
|<el-row justify="space-between"><el-col :span="20">campaign_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|市场活动名称|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">expected_response</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|期望成功率(%)|
|<el-row justify="space-between"><el-col :span="20">expected_revenue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预期收益|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查部门|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查类型|
|<el-row justify="space-between"><el-col :span="20">native_survey_extn_survey_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会持续时间|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_launch_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会启动URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_registration_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会注册URL|
|<el-row justify="space-between"><el-col :span="20">native_webinar_extn_webinar_schedule</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|网络研讨会时间表|
|<el-row justify="space-between"><el-col :span="20">num_sent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigInteger|发出数量|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|



##### 请求示例： {docsify-ignore}
```json
{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
  "update_man" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "actual_cost" : null,
  "attachments" : null,
  "budgeted_cost" : null,
  "campaign_name" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "end_date" : null,
  "expected_response" : null,
  "expected_revenue" : null,
  "id" : null,
  "name" : null,
  "native_survey_extn_department_id" : null,
  "native_survey_extn_survey" : null,
  "native_survey_extn_survey_department" : null,
  "native_survey_extn_survey_type" : null,
  "native_survey_extn_survey_url" : null,
  "native_webinar_extn_webinar_duration" : null,
  "native_webinar_extn_webinar_launch_url" : null,
  "native_webinar_extn_webinar_registration_url" : null,
  "native_webinar_extn_webinar_schedule" : null,
  "num_sent" : null,
  "start_date" : null,
  "status" : null,
  "tag" : null,
  "type" : null,
  "update_man" : null,
  "update_time" : null,
}

```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/campaigns/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_native_survey_extn_survey_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调查类型|
|<el-row justify="space-between"><el-col :span="20">n_native_webinar_extn_webinar_duration_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网络研讨会持续时间|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">n_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_native_survey_extn_survey_type_eq" : null,
  "n_native_webinar_extn_webinar_duration_eq" : null,
  "n_status_eq" : null,
  "n_type_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "actual_cost" : null,
    "attachments" : null,
    "budgeted_cost" : null,
    "campaign_name" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "end_date" : null,
    "expected_response" : null,
    "expected_revenue" : null,
    "id" : null,
    "name" : null,
    "native_survey_extn_department_id" : null,
    "native_survey_extn_survey" : null,
    "native_survey_extn_survey_department" : null,
    "native_survey_extn_survey_type" : null,
    "native_survey_extn_survey_url" : null,
    "native_webinar_extn_webinar_duration" : null,
    "native_webinar_extn_webinar_launch_url" : null,
    "native_webinar_extn_webinar_registration_url" : null,
    "native_webinar_extn_webinar_schedule" : null,
    "num_sent" : null,
    "start_date" : null,
    "status" : null,
    "tag" : null,
    "type" : null,
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
<el-alert title="/campaigns/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/campaigns/exportdata/{param},/campaigns/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/campaigns/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/campaigns/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/campaigns/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/campaigns/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/campaigns/report" type="info" :closable="false" ></el-alert>
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