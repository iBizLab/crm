# 供应商(vendor) :id=vendor
## 创建供应商

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/vendors" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分类|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">gl_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|总分类账户|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">record_lmage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商图片|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}

```

## 获取供应商

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/vendors/{key}" type="info" :closable="false" ></el-alert>
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
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}

```

## 删除供应商

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/vendors/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新供应商

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/vendors/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分类|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">gl_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|总分类账户|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">record_lmage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商图片|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}

```

## 批添加标签

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/vendors/{key}/add_tags" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分类|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">gl_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|总分类账户|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">record_lmage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商图片|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}
```



## 批更新

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/vendors/{key}/batch_update" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分类|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">gl_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|总分类账户|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">record_lmage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商图片|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}
```



## 检查供应商主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/vendors/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分类|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">gl_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|总分类账户|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">record_lmage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商图片|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
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
<el-alert title="/vendors/create_task" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`
自动生成



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分类|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">gl_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|总分类账户|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">record_lmage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商图片|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}

```

## 批移除标签

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/vendors/{key}/delete_tags" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分类|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">gl_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|总分类账户|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">record_lmage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商图片|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}
```



## 获取供应商草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/vendors/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分类|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">gl_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|总分类账户|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">record_lmage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商图片|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}

```

## main_view_dr计数器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/vendors/{key}/main_view_dr_count" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分类|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">gl_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|总分类账户|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">record_lmage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商图片|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}
```



## 保存供应商

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/vendors/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分类|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件|
|<el-row justify="space-between"><el-col :span="20">email_opt_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|不发营销邮件|
|<el-row justify="space-between"><el-col :span="20">gl_account</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|总分类账户|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">record_lmage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商图片|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/市|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|
|<el-row justify="space-between"><el-col :span="20">unsubscribed_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|退订的时间|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站|
|<el-row justify="space-between"><el-col :span="20">zip_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "category" : null,
  "city" : null,
  "country" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "email" : null,
  "email_opt_out" : null,
  "gl_account" : null,
  "id" : null,
  "locked_s" : null,
  "name" : null,
  "owner" : null,
  "phone" : null,
  "record_lmage" : null,
  "state" : null,
  "street" : null,
  "tag" : null,
  "unsubscribed_mode" : null,
  "unsubscribed_time" : null,
  "update_man" : null,
  "update_time" : null,
  "vendor_name" : null,
  "website" : null,
  "zip_code" : null,
}

```

## 全部数据

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/vendors/fetch_all" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_unsubscribed_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_unsubscribed_mode_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "attachments" : null,
    "category" : null,
    "city" : null,
    "country" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "email" : null,
    "email_opt_out" : null,
    "gl_account" : null,
    "id" : null,
    "locked_s" : null,
    "name" : null,
    "owner" : null,
    "phone" : null,
    "record_lmage" : null,
    "state" : null,
    "street" : null,
    "tag" : null,
    "unsubscribed_mode" : null,
    "unsubscribed_time" : null,
    "update_man" : null,
    "update_time" : null,
    "vendor_name" : null,
    "website" : null,
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
<el-alert title="/vendors/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_unsubscribed_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退订的方式|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_unsubscribed_mode_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "attachments" : null,
    "category" : null,
    "city" : null,
    "country" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "email" : null,
    "email_opt_out" : null,
    "gl_account" : null,
    "id" : null,
    "locked_s" : null,
    "name" : null,
    "owner" : null,
    "phone" : null,
    "record_lmage" : null,
    "state" : null,
    "street" : null,
    "tag" : null,
    "unsubscribed_mode" : null,
    "unsubscribed_time" : null,
    "update_man" : null,
    "update_time" : null,
    "vendor_name" : null,
    "website" : null,
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
<el-alert title="/vendors/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/vendors/exportdata/{param},/vendors/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/vendors/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/vendors/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/vendors/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/vendors/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/vendors/report" type="info" :closable="false" ></el-alert>
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