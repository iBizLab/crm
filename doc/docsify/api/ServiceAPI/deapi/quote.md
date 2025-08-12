# 报价(quote) :id=quote
## 创建报价

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">adjustment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调整|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">billing_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-城市|
|<el-row justify="space-between"><el-col :span="20">billing_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-邮编|
|<el-row justify="space-between"><el-col :span="20">billing_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">billing_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-省/市|
|<el-row justify="space-between"><el-col :span="20">billing_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">carrier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|运输|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">discount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|折扣|
|<el-row justify="space-between"><el-col :span="20">grand_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|累计|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">quote_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价编号|
|<el-row justify="space-between"><el-col :span="20">quote_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价阶段|
|<el-row justify="space-between"><el-col :span="20">shipping_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-城市|
|<el-row justify="space-between"><el-col :span="20">shipping_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-邮编|
|<el-row justify="space-between"><el-col :span="20">shipping_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">shipping_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-省/市|
|<el-row justify="space-between"><el-col :span="20">shipping_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-街道|
|<el-row justify="space-between"><el-col :span="20">sub_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小计|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">team</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|团队|
|<el-row justify="space-between"><el-col :span="20">terms_and_conditions</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条款及条件|
|<el-row justify="space-between"><el-col :span="20">valid_till</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|有效期至|



##### 请求示例： {docsify-ignore}
```json
{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}

```

## 获取报价

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes/{key}" type="info" :closable="false" ></el-alert>
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
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}

```

## 删除报价

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新报价

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">adjustment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调整|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">billing_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-城市|
|<el-row justify="space-between"><el-col :span="20">billing_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-邮编|
|<el-row justify="space-between"><el-col :span="20">billing_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">billing_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-省/市|
|<el-row justify="space-between"><el-col :span="20">billing_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">carrier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|运输|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">discount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|折扣|
|<el-row justify="space-between"><el-col :span="20">grand_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|累计|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">quote_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价编号|
|<el-row justify="space-between"><el-col :span="20">quote_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价阶段|
|<el-row justify="space-between"><el-col :span="20">shipping_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-城市|
|<el-row justify="space-between"><el-col :span="20">shipping_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-邮编|
|<el-row justify="space-between"><el-col :span="20">shipping_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">shipping_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-省/市|
|<el-row justify="space-between"><el-col :span="20">shipping_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-街道|
|<el-row justify="space-between"><el-col :span="20">sub_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小计|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">team</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|团队|
|<el-row justify="space-between"><el-col :span="20">terms_and_conditions</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条款及条件|
|<el-row justify="space-between"><el-col :span="20">valid_till</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|有效期至|



##### 请求示例： {docsify-ignore}
```json
{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}

```

## 批添加标签

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes/{key}/add_tags" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">adjustment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调整|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">billing_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-城市|
|<el-row justify="space-between"><el-col :span="20">billing_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-邮编|
|<el-row justify="space-between"><el-col :span="20">billing_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">billing_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-省/市|
|<el-row justify="space-between"><el-col :span="20">billing_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">carrier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|运输|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">discount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|折扣|
|<el-row justify="space-between"><el-col :span="20">grand_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|累计|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">quote_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价编号|
|<el-row justify="space-between"><el-col :span="20">quote_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价阶段|
|<el-row justify="space-between"><el-col :span="20">shipping_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-城市|
|<el-row justify="space-between"><el-col :span="20">shipping_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-邮编|
|<el-row justify="space-between"><el-col :span="20">shipping_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">shipping_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-省/市|
|<el-row justify="space-between"><el-col :span="20">shipping_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-街道|
|<el-row justify="space-between"><el-col :span="20">sub_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小计|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">team</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|团队|
|<el-row justify="space-between"><el-col :span="20">terms_and_conditions</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条款及条件|
|<el-row justify="space-between"><el-col :span="20">valid_till</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|有效期至|



##### 请求示例： {docsify-ignore}
```json
{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}
```



## 批更新

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes/{key}/batch_update" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">adjustment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调整|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">billing_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-城市|
|<el-row justify="space-between"><el-col :span="20">billing_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-邮编|
|<el-row justify="space-between"><el-col :span="20">billing_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">billing_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-省/市|
|<el-row justify="space-between"><el-col :span="20">billing_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">carrier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|运输|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">discount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|折扣|
|<el-row justify="space-between"><el-col :span="20">grand_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|累计|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">quote_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价编号|
|<el-row justify="space-between"><el-col :span="20">quote_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价阶段|
|<el-row justify="space-between"><el-col :span="20">shipping_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-城市|
|<el-row justify="space-between"><el-col :span="20">shipping_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-邮编|
|<el-row justify="space-between"><el-col :span="20">shipping_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">shipping_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-省/市|
|<el-row justify="space-between"><el-col :span="20">shipping_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-街道|
|<el-row justify="space-between"><el-col :span="20">sub_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小计|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">team</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|团队|
|<el-row justify="space-between"><el-col :span="20">terms_and_conditions</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条款及条件|
|<el-row justify="space-between"><el-col :span="20">valid_till</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|有效期至|



##### 请求示例： {docsify-ignore}
```json
{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}
```



## 检查报价主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">adjustment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调整|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">billing_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-城市|
|<el-row justify="space-between"><el-col :span="20">billing_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-邮编|
|<el-row justify="space-between"><el-col :span="20">billing_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">billing_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-省/市|
|<el-row justify="space-between"><el-col :span="20">billing_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">carrier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|运输|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">discount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|折扣|
|<el-row justify="space-between"><el-col :span="20">grand_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|累计|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">quote_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价编号|
|<el-row justify="space-between"><el-col :span="20">quote_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价阶段|
|<el-row justify="space-between"><el-col :span="20">shipping_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-城市|
|<el-row justify="space-between"><el-col :span="20">shipping_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-邮编|
|<el-row justify="space-between"><el-col :span="20">shipping_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">shipping_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-省/市|
|<el-row justify="space-between"><el-col :span="20">shipping_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-街道|
|<el-row justify="space-between"><el-col :span="20">sub_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小计|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">team</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|团队|
|<el-row justify="space-between"><el-col :span="20">terms_and_conditions</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条款及条件|
|<el-row justify="space-between"><el-col :span="20">valid_till</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|有效期至|



##### 请求示例： {docsify-ignore}
```json
{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
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
<el-alert title="/quotes/create_task" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`
自动生成



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">adjustment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调整|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">billing_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-城市|
|<el-row justify="space-between"><el-col :span="20">billing_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-邮编|
|<el-row justify="space-between"><el-col :span="20">billing_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">billing_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-省/市|
|<el-row justify="space-between"><el-col :span="20">billing_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">carrier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|运输|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">discount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|折扣|
|<el-row justify="space-between"><el-col :span="20">grand_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|累计|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">quote_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价编号|
|<el-row justify="space-between"><el-col :span="20">quote_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价阶段|
|<el-row justify="space-between"><el-col :span="20">shipping_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-城市|
|<el-row justify="space-between"><el-col :span="20">shipping_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-邮编|
|<el-row justify="space-between"><el-col :span="20">shipping_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">shipping_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-省/市|
|<el-row justify="space-between"><el-col :span="20">shipping_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-街道|
|<el-row justify="space-between"><el-col :span="20">sub_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小计|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">team</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|团队|
|<el-row justify="space-between"><el-col :span="20">terms_and_conditions</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条款及条件|
|<el-row justify="space-between"><el-col :span="20">valid_till</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|有效期至|



##### 请求示例： {docsify-ignore}
```json
{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}

```

## 批移除标签

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes/{key}/delete_tags" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">adjustment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调整|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">billing_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-城市|
|<el-row justify="space-between"><el-col :span="20">billing_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-邮编|
|<el-row justify="space-between"><el-col :span="20">billing_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">billing_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-省/市|
|<el-row justify="space-between"><el-col :span="20">billing_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">carrier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|运输|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">discount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|折扣|
|<el-row justify="space-between"><el-col :span="20">grand_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|累计|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">quote_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价编号|
|<el-row justify="space-between"><el-col :span="20">quote_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价阶段|
|<el-row justify="space-between"><el-col :span="20">shipping_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-城市|
|<el-row justify="space-between"><el-col :span="20">shipping_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-邮编|
|<el-row justify="space-between"><el-col :span="20">shipping_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">shipping_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-省/市|
|<el-row justify="space-between"><el-col :span="20">shipping_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-街道|
|<el-row justify="space-between"><el-col :span="20">sub_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小计|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">team</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|团队|
|<el-row justify="space-between"><el-col :span="20">terms_and_conditions</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条款及条件|
|<el-row justify="space-between"><el-col :span="20">valid_till</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|有效期至|



##### 请求示例： {docsify-ignore}
```json
{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}
```



## 获取报价草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">adjustment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调整|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">billing_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-城市|
|<el-row justify="space-between"><el-col :span="20">billing_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-邮编|
|<el-row justify="space-between"><el-col :span="20">billing_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">billing_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-省/市|
|<el-row justify="space-between"><el-col :span="20">billing_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">carrier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|运输|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">discount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|折扣|
|<el-row justify="space-between"><el-col :span="20">grand_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|累计|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">quote_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价编号|
|<el-row justify="space-between"><el-col :span="20">quote_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价阶段|
|<el-row justify="space-between"><el-col :span="20">shipping_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-城市|
|<el-row justify="space-between"><el-col :span="20">shipping_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-邮编|
|<el-row justify="space-between"><el-col :span="20">shipping_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">shipping_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-省/市|
|<el-row justify="space-between"><el-col :span="20">shipping_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-街道|
|<el-row justify="space-between"><el-col :span="20">sub_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小计|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">team</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|团队|
|<el-row justify="space-between"><el-col :span="20">terms_and_conditions</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条款及条件|
|<el-row justify="space-between"><el-col :span="20">valid_till</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|有效期至|



##### 请求示例： {docsify-ignore}
```json
{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}

```

## main_view_dr计数器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes/{key}/main_view_dr_count" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">adjustment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调整|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">billing_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-城市|
|<el-row justify="space-between"><el-col :span="20">billing_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-邮编|
|<el-row justify="space-between"><el-col :span="20">billing_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">billing_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-省/市|
|<el-row justify="space-between"><el-col :span="20">billing_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">carrier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|运输|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">discount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|折扣|
|<el-row justify="space-between"><el-col :span="20">grand_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|累计|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">quote_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价编号|
|<el-row justify="space-between"><el-col :span="20">quote_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价阶段|
|<el-row justify="space-between"><el-col :span="20">shipping_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-城市|
|<el-row justify="space-between"><el-col :span="20">shipping_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-邮编|
|<el-row justify="space-between"><el-col :span="20">shipping_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">shipping_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-省/市|
|<el-row justify="space-between"><el-col :span="20">shipping_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-街道|
|<el-row justify="space-between"><el-col :span="20">sub_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小计|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">team</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|团队|
|<el-row justify="space-between"><el-col :span="20">terms_and_conditions</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条款及条件|
|<el-row justify="space-between"><el-col :span="20">valid_till</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|有效期至|



##### 请求示例： {docsify-ignore}
```json
{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}
```



## 保存报价

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">adjustment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调整|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">billing_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-城市|
|<el-row justify="space-between"><el-col :span="20">billing_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-邮编|
|<el-row justify="space-between"><el-col :span="20">billing_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">billing_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|开单地址-省/市|
|<el-row justify="space-between"><el-col :span="20">billing_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">carrier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|运输|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">discount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|折扣|
|<el-row justify="space-between"><el-col :span="20">grand_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|累计|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">quote_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价编号|
|<el-row justify="space-between"><el-col :span="20">quote_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价阶段|
|<el-row justify="space-between"><el-col :span="20">shipping_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-城市|
|<el-row justify="space-between"><el-col :span="20">shipping_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-邮编|
|<el-row justify="space-between"><el-col :span="20">shipping_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-国家/地区|
|<el-row justify="space-between"><el-col :span="20">shipping_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-省/市|
|<el-row justify="space-between"><el-col :span="20">shipping_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发货地址-街道|
|<el-row justify="space-between"><el-col :span="20">sub_total</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小计|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主题|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">team</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|团队|
|<el-row justify="space-between"><el-col :span="20">terms_and_conditions</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条款及条件|
|<el-row justify="space-between"><el-col :span="20">valid_till</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|有效期至|



##### 请求示例： {docsify-ignore}
```json
{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "adjustment" : null,
  "attachments" : null,
  "billing_city" : null,
  "billing_code" : null,
  "billing_country" : null,
  "billing_state" : null,
  "billing_street" : null,
  "carrier" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "discount" : null,
  "grand_total" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "quote_number" : null,
  "quote_stage" : null,
  "shipping_city" : null,
  "shipping_code" : null,
  "shipping_country" : null,
  "shipping_state" : null,
  "shipping_street" : null,
  "sub_total" : null,
  "subject" : null,
  "tag" : null,
  "tax" : null,
  "team" : null,
  "terms_and_conditions" : null,
  "update_man" : null,
  "update_time" : null,
  "valid_till" : null,
}

```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_carrier_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|运输|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_quote_stage_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报价阶段|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_carrier_eq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_quote_stage_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "adjustment" : null,
    "attachments" : null,
    "billing_city" : null,
    "billing_code" : null,
    "billing_country" : null,
    "billing_state" : null,
    "billing_street" : null,
    "carrier" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "discount" : null,
    "grand_total" : null,
    "id" : null,
    "locked_s" : null,
    "name" : null,
    "quote_number" : null,
    "quote_stage" : null,
    "shipping_city" : null,
    "shipping_code" : null,
    "shipping_country" : null,
    "shipping_state" : null,
    "shipping_street" : null,
    "sub_total" : null,
    "subject" : null,
    "tag" : null,
    "tax" : null,
    "team" : null,
    "terms_and_conditions" : null,
    "update_man" : null,
    "update_time" : null,
    "valid_till" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/quotes/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/quotes/exportdata/{param},/quotes/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/quotes/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/quotes/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/quotes/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/quotes/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/quotes/report" type="info" :closable="false" ></el-alert>
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