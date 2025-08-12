# 产品(product) :id=product
## 创建产品

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">commission_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|佣金比例|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">manufacturer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">product_active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">product_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">product_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">product_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">qty_in_demand</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|需求数量|
|<el-row justify="space-between"><el-col :span="20">qty_in_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存数量|
|<el-row justify="space-between"><el-col :span="20">qty_ordered</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订购数量|
|<el-row justify="space-between"><el-col :span="20">record_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品图片|
|<el-row justify="space-between"><el-col :span="20">reorder_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存警戒线|
|<el-row justify="space-between"><el-col :span="20">sales_end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售结束日期|
|<el-row justify="space-between"><el-col :span="20">sales_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|错售开始日期|
|<el-row justify="space-between"><el-col :span="20">support_expiry_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持过期日期|
|<el-row justify="space-between"><el-col :span="20">support_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持开始日期|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">taxable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应纳税|
|<el-row justify="space-between"><el-col :span="20">unit_price</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定价|
|<el-row justify="space-between"><el-col :span="20">usage_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">vendor_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}

```

## 获取产品

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/{key}" type="info" :closable="false" ></el-alert>
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
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}

```

## 删除产品

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新产品

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">commission_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|佣金比例|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">manufacturer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">product_active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">product_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">product_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">product_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">qty_in_demand</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|需求数量|
|<el-row justify="space-between"><el-col :span="20">qty_in_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存数量|
|<el-row justify="space-between"><el-col :span="20">qty_ordered</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订购数量|
|<el-row justify="space-between"><el-col :span="20">record_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品图片|
|<el-row justify="space-between"><el-col :span="20">reorder_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存警戒线|
|<el-row justify="space-between"><el-col :span="20">sales_end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售结束日期|
|<el-row justify="space-between"><el-col :span="20">sales_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|错售开始日期|
|<el-row justify="space-between"><el-col :span="20">support_expiry_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持过期日期|
|<el-row justify="space-between"><el-col :span="20">support_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持开始日期|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">taxable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应纳税|
|<el-row justify="space-between"><el-col :span="20">unit_price</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定价|
|<el-row justify="space-between"><el-col :span="20">usage_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">vendor_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}

```

## 添加产品

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/add_product" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">commission_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|佣金比例|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">manufacturer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">product_active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">product_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">product_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">product_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">qty_in_demand</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|需求数量|
|<el-row justify="space-between"><el-col :span="20">qty_in_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存数量|
|<el-row justify="space-between"><el-col :span="20">qty_ordered</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订购数量|
|<el-row justify="space-between"><el-col :span="20">record_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品图片|
|<el-row justify="space-between"><el-col :span="20">reorder_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存警戒线|
|<el-row justify="space-between"><el-col :span="20">sales_end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售结束日期|
|<el-row justify="space-between"><el-col :span="20">sales_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|错售开始日期|
|<el-row justify="space-between"><el-col :span="20">support_expiry_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持过期日期|
|<el-row justify="space-between"><el-col :span="20">support_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持开始日期|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">taxable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应纳税|
|<el-row justify="space-between"><el-col :span="20">unit_price</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定价|
|<el-row justify="space-between"><el-col :span="20">usage_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">vendor_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}

```

## 批添加标签

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/{key}/add_tags" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">commission_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|佣金比例|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">manufacturer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">product_active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">product_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">product_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">product_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">qty_in_demand</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|需求数量|
|<el-row justify="space-between"><el-col :span="20">qty_in_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存数量|
|<el-row justify="space-between"><el-col :span="20">qty_ordered</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订购数量|
|<el-row justify="space-between"><el-col :span="20">record_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品图片|
|<el-row justify="space-between"><el-col :span="20">reorder_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存警戒线|
|<el-row justify="space-between"><el-col :span="20">sales_end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售结束日期|
|<el-row justify="space-between"><el-col :span="20">sales_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|错售开始日期|
|<el-row justify="space-between"><el-col :span="20">support_expiry_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持过期日期|
|<el-row justify="space-between"><el-col :span="20">support_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持开始日期|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">taxable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应纳税|
|<el-row justify="space-between"><el-col :span="20">unit_price</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定价|
|<el-row justify="space-between"><el-col :span="20">usage_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">vendor_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}
```



## 批更新

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/{key}/batch_update" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">commission_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|佣金比例|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">manufacturer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">product_active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">product_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">product_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">product_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">qty_in_demand</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|需求数量|
|<el-row justify="space-between"><el-col :span="20">qty_in_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存数量|
|<el-row justify="space-between"><el-col :span="20">qty_ordered</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订购数量|
|<el-row justify="space-between"><el-col :span="20">record_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品图片|
|<el-row justify="space-between"><el-col :span="20">reorder_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存警戒线|
|<el-row justify="space-between"><el-col :span="20">sales_end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售结束日期|
|<el-row justify="space-between"><el-col :span="20">sales_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|错售开始日期|
|<el-row justify="space-between"><el-col :span="20">support_expiry_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持过期日期|
|<el-row justify="space-between"><el-col :span="20">support_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持开始日期|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">taxable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应纳税|
|<el-row justify="space-between"><el-col :span="20">unit_price</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定价|
|<el-row justify="space-between"><el-col :span="20">usage_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">vendor_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}
```



## 检查产品主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">commission_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|佣金比例|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">manufacturer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">product_active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">product_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">product_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">product_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">qty_in_demand</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|需求数量|
|<el-row justify="space-between"><el-col :span="20">qty_in_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存数量|
|<el-row justify="space-between"><el-col :span="20">qty_ordered</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订购数量|
|<el-row justify="space-between"><el-col :span="20">record_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品图片|
|<el-row justify="space-between"><el-col :span="20">reorder_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存警戒线|
|<el-row justify="space-between"><el-col :span="20">sales_end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售结束日期|
|<el-row justify="space-between"><el-col :span="20">sales_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|错售开始日期|
|<el-row justify="space-between"><el-col :span="20">support_expiry_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持过期日期|
|<el-row justify="space-between"><el-col :span="20">support_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持开始日期|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">taxable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应纳税|
|<el-row justify="space-between"><el-col :span="20">unit_price</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定价|
|<el-row justify="space-between"><el-col :span="20">usage_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">vendor_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
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
<el-alert title="/products/create_task" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`
自动生成



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">commission_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|佣金比例|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">manufacturer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">product_active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">product_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">product_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">product_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">qty_in_demand</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|需求数量|
|<el-row justify="space-between"><el-col :span="20">qty_in_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存数量|
|<el-row justify="space-between"><el-col :span="20">qty_ordered</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订购数量|
|<el-row justify="space-between"><el-col :span="20">record_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品图片|
|<el-row justify="space-between"><el-col :span="20">reorder_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存警戒线|
|<el-row justify="space-between"><el-col :span="20">sales_end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售结束日期|
|<el-row justify="space-between"><el-col :span="20">sales_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|错售开始日期|
|<el-row justify="space-between"><el-col :span="20">support_expiry_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持过期日期|
|<el-row justify="space-between"><el-col :span="20">support_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持开始日期|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">taxable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应纳税|
|<el-row justify="space-between"><el-col :span="20">unit_price</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定价|
|<el-row justify="space-between"><el-col :span="20">usage_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">vendor_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}

```

## 批移除标签

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/{key}/delete_tags" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">commission_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|佣金比例|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">manufacturer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">product_active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">product_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">product_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">product_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">qty_in_demand</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|需求数量|
|<el-row justify="space-between"><el-col :span="20">qty_in_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存数量|
|<el-row justify="space-between"><el-col :span="20">qty_ordered</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订购数量|
|<el-row justify="space-between"><el-col :span="20">record_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品图片|
|<el-row justify="space-between"><el-col :span="20">reorder_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存警戒线|
|<el-row justify="space-between"><el-col :span="20">sales_end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售结束日期|
|<el-row justify="space-between"><el-col :span="20">sales_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|错售开始日期|
|<el-row justify="space-between"><el-col :span="20">support_expiry_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持过期日期|
|<el-row justify="space-between"><el-col :span="20">support_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持开始日期|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">taxable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应纳税|
|<el-row justify="space-between"><el-col :span="20">unit_price</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定价|
|<el-row justify="space-between"><el-col :span="20">usage_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">vendor_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}
```



## 获取产品草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">commission_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|佣金比例|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">manufacturer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">product_active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">product_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">product_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">product_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">qty_in_demand</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|需求数量|
|<el-row justify="space-between"><el-col :span="20">qty_in_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存数量|
|<el-row justify="space-between"><el-col :span="20">qty_ordered</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订购数量|
|<el-row justify="space-between"><el-col :span="20">record_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品图片|
|<el-row justify="space-between"><el-col :span="20">reorder_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存警戒线|
|<el-row justify="space-between"><el-col :span="20">sales_end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售结束日期|
|<el-row justify="space-between"><el-col :span="20">sales_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|错售开始日期|
|<el-row justify="space-between"><el-col :span="20">support_expiry_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持过期日期|
|<el-row justify="space-between"><el-col :span="20">support_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持开始日期|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">taxable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应纳税|
|<el-row justify="space-between"><el-col :span="20">unit_price</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定价|
|<el-row justify="space-between"><el-col :span="20">usage_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">vendor_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}

```

## main_view_dr计数器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/{key}/main_view_dr_count" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">commission_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|佣金比例|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">manufacturer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">product_active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">product_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">product_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">product_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">qty_in_demand</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|需求数量|
|<el-row justify="space-between"><el-col :span="20">qty_in_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存数量|
|<el-row justify="space-between"><el-col :span="20">qty_ordered</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订购数量|
|<el-row justify="space-between"><el-col :span="20">record_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品图片|
|<el-row justify="space-between"><el-col :span="20">reorder_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存警戒线|
|<el-row justify="space-between"><el-col :span="20">sales_end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售结束日期|
|<el-row justify="space-between"><el-col :span="20">sales_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|错售开始日期|
|<el-row justify="space-between"><el-col :span="20">support_expiry_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持过期日期|
|<el-row justify="space-between"><el-col :span="20">support_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持开始日期|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">taxable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应纳税|
|<el-row justify="space-between"><el-col :span="20">unit_price</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定价|
|<el-row justify="space-between"><el-col :span="20">usage_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">vendor_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}
```



## 保存产品

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">commission_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|佣金比例|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">manufacturer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">product_active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">product_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">product_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">product_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">qty_in_demand</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|需求数量|
|<el-row justify="space-between"><el-col :span="20">qty_in_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存数量|
|<el-row justify="space-between"><el-col :span="20">qty_ordered</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订购数量|
|<el-row justify="space-between"><el-col :span="20">record_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品图片|
|<el-row justify="space-between"><el-col :span="20">reorder_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存警戒线|
|<el-row justify="space-between"><el-col :span="20">sales_end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售结束日期|
|<el-row justify="space-between"><el-col :span="20">sales_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|错售开始日期|
|<el-row justify="space-between"><el-col :span="20">support_expiry_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持过期日期|
|<el-row justify="space-between"><el-col :span="20">support_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持开始日期|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">taxable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应纳税|
|<el-row justify="space-between"><el-col :span="20">unit_price</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定价|
|<el-row justify="space-between"><el-col :span="20">usage_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">vendor_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}

```

## 取消关联

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/{key}/unlink" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件|
|<el-row justify="space-between"><el-col :span="20">commission_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|佣金比例|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">locked_s</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Locked|
|<el-row justify="space-between"><el-col :span="20">manufacturer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">product_active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">product_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">product_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">product_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">qty_in_demand</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|需求数量|
|<el-row justify="space-between"><el-col :span="20">qty_in_stock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存数量|
|<el-row justify="space-between"><el-col :span="20">qty_ordered</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|订购数量|
|<el-row justify="space-between"><el-col :span="20">record_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品图片|
|<el-row justify="space-between"><el-col :span="20">reorder_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|库存警戒线|
|<el-row justify="space-between"><el-col :span="20">sales_end_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售结束日期|
|<el-row justify="space-between"><el-col :span="20">sales_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|错售开始日期|
|<el-row justify="space-between"><el-col :span="20">support_expiry_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持过期日期|
|<el-row justify="space-between"><el-col :span="20">support_start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|支持开始日期|
|<el-row justify="space-between"><el-col :span="20">tag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标签|
|<el-row justify="space-between"><el-col :span="20">tax</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税|
|<el-row justify="space-between"><el-col :span="20">taxable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应纳税|
|<el-row justify="space-between"><el-col :span="20">unit_price</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|定价|
|<el-row justify="space-between"><el-col :span="20">usage_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">vendor_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">vendor_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "attachments" : null,
  "commission_rate" : null,
  "create_man" : null,
  "create_time" : null,
  "description" : null,
  "id" : null,
  "locked_s" : null,
  "manufacturer" : null,
  "name" : null,
  "owner" : null,
  "product_active" : null,
  "product_category" : null,
  "product_code" : null,
  "product_name" : null,
  "qty_in_demand" : null,
  "qty_in_stock" : null,
  "qty_ordered" : null,
  "record_image" : null,
  "reorder_level" : null,
  "sales_end_date" : null,
  "sales_start_date" : null,
  "support_expiry_date" : null,
  "support_start_date" : null,
  "tag" : null,
  "tax" : null,
  "taxable" : null,
  "unit_price" : null,
  "update_man" : null,
  "update_time" : null,
  "usage_unit" : null,
  "vendor_id" : null,
  "vendor_name" : null,
}
```



## 全部数据

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/fetch_all" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_manufacturer_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_product_active_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">n_product_category_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">n_product_code_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">n_product_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">n_usage_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">n_vendor_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">n_vendor_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">n_vendor_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_manufacturer_eq" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_product_active_eq" : null,
  "n_product_category_eq" : null,
  "n_product_code_like" : null,
  "n_product_name_like" : null,
  "n_usage_unit_eq" : null,
  "n_vendor_id_eq" : null,
  "n_vendor_name_eq" : null,
  "n_vendor_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "attachments" : null,
    "commission_rate" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "locked_s" : null,
    "manufacturer" : null,
    "name" : null,
    "owner" : null,
    "product_active" : null,
    "product_category" : null,
    "product_code" : null,
    "product_name" : null,
    "qty_in_demand" : null,
    "qty_in_stock" : null,
    "qty_ordered" : null,
    "record_image" : null,
    "reorder_level" : null,
    "sales_end_date" : null,
    "sales_start_date" : null,
    "support_expiry_date" : null,
    "support_start_date" : null,
    "tag" : null,
    "tax" : null,
    "taxable" : null,
    "unit_price" : null,
    "update_man" : null,
    "update_time" : null,
    "usage_unit" : null,
    "vendor_id" : null,
    "vendor_name" : null,
  }
]
```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_manufacturer_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_product_active_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">n_product_category_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">n_product_code_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">n_product_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">n_usage_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">n_vendor_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">n_vendor_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">n_vendor_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_manufacturer_eq" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_product_active_eq" : null,
  "n_product_category_eq" : null,
  "n_product_code_like" : null,
  "n_product_name_like" : null,
  "n_usage_unit_eq" : null,
  "n_vendor_id_eq" : null,
  "n_vendor_name_eq" : null,
  "n_vendor_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "attachments" : null,
    "commission_rate" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "locked_s" : null,
    "manufacturer" : null,
    "name" : null,
    "owner" : null,
    "product_active" : null,
    "product_category" : null,
    "product_code" : null,
    "product_name" : null,
    "qty_in_demand" : null,
    "qty_in_stock" : null,
    "qty_ordered" : null,
    "record_image" : null,
    "reorder_level" : null,
    "sales_end_date" : null,
    "sales_start_date" : null,
    "support_expiry_date" : null,
    "support_start_date" : null,
    "tag" : null,
    "tax" : null,
    "taxable" : null,
    "unit_price" : null,
    "update_man" : null,
    "update_time" : null,
    "usage_unit" : null,
    "vendor_id" : null,
    "vendor_name" : null,
  }
]
```

## 关联的目标产品

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/fetch_relation_target" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_manufacturer_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|制造商|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所有者|
|<el-row justify="space-between"><el-col :span="20">n_product_active_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|产品有效|
|<el-row justify="space-between"><el-col :span="20">n_product_category_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品分类|
|<el-row justify="space-between"><el-col :span="20">n_product_code_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品编码|
|<el-row justify="space-between"><el-col :span="20">n_product_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|产品名称|
|<el-row justify="space-between"><el-col :span="20">n_usage_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|使用单位|
|<el-row justify="space-between"><el-col :span="20">n_vendor_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商标识|
|<el-row justify="space-between"><el-col :span="20">n_vendor_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">n_vendor_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_manufacturer_eq" : null,
  "n_name_like" : null,
  "n_owner_eq" : null,
  "n_product_active_eq" : null,
  "n_product_category_eq" : null,
  "n_product_code_like" : null,
  "n_product_name_like" : null,
  "n_usage_unit_eq" : null,
  "n_vendor_id_eq" : null,
  "n_vendor_name_eq" : null,
  "n_vendor_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "attachments" : null,
    "commission_rate" : null,
    "create_man" : null,
    "create_time" : null,
    "description" : null,
    "id" : null,
    "locked_s" : null,
    "manufacturer" : null,
    "name" : null,
    "owner" : null,
    "product_active" : null,
    "product_category" : null,
    "product_code" : null,
    "product_name" : null,
    "qty_in_demand" : null,
    "qty_in_stock" : null,
    "qty_ordered" : null,
    "record_image" : null,
    "reorder_level" : null,
    "sales_end_date" : null,
    "sales_start_date" : null,
    "support_expiry_date" : null,
    "support_start_date" : null,
    "tag" : null,
    "tax" : null,
    "taxable" : null,
    "unit_price" : null,
    "update_man" : null,
    "update_time" : null,
    "usage_unit" : null,
    "vendor_id" : null,
    "vendor_name" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/products/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/products/exportdata/{param},/products/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/products/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/products/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/products/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/products/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/products/report" type="info" :closable="false" ></el-alert>
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