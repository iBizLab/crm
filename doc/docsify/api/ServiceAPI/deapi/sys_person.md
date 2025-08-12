# 人员(sys_person) :id=sys_person
## 创建人员

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_people" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">dc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|DC|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">user_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">employee_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员编号|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">mail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮箱|
|<el-row justify="space-between"><el-col :span="20">telephone_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系电话|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|移动电话|
|<el-row justify="space-between"><el-col :span="20">identification_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件号|
|<el-row justify="space-between"><el-col :span="20">postal_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">mdepartment_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">organization_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|组织机构标识|
|<el-row justify="space-between"><el-col :span="20">dn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|DN|
|<el-row justify="space-between"><el-col :span="20">mdepartment_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|uid/loginname|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "creator" : null,
  "updater" : null,
  "dc" : null,
  "display_name" : null,
  "user_password" : null,
  "employee_number" : null,
  "employee_type" : null,
  "title" : null,
  "mail" : null,
  "telephone_number" : null,
  "mobile" : null,
  "identification_number" : null,
  "postal_address" : null,
  "description" : null,
  "mdepartment_name" : null,
  "organization_id" : null,
  "dn" : null,
  "mdepartment_id" : null,
  "uid" : null,
  "avatar" : null,
  "create_time" : null,
  "id" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "creator" : null,
  "updater" : null,
  "dc" : null,
  "display_name" : null,
  "user_password" : null,
  "employee_number" : null,
  "employee_type" : null,
  "title" : null,
  "mail" : null,
  "telephone_number" : null,
  "mobile" : null,
  "identification_number" : null,
  "postal_address" : null,
  "description" : null,
  "mdepartment_name" : null,
  "organization_id" : null,
  "dn" : null,
  "mdepartment_id" : null,
  "uid" : null,
  "avatar" : null,
  "create_time" : null,
  "id" : null,
  "update_time" : null,
}

```

## 获取人员

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_people/{key}" type="info" :closable="false" ></el-alert>
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
  "creator" : null,
  "updater" : null,
  "dc" : null,
  "display_name" : null,
  "user_password" : null,
  "employee_number" : null,
  "employee_type" : null,
  "title" : null,
  "mail" : null,
  "telephone_number" : null,
  "mobile" : null,
  "identification_number" : null,
  "postal_address" : null,
  "description" : null,
  "mdepartment_name" : null,
  "organization_id" : null,
  "dn" : null,
  "mdepartment_id" : null,
  "uid" : null,
  "avatar" : null,
  "create_time" : null,
  "id" : null,
  "update_time" : null,
}

```

## 删除人员

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_people/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新人员

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_people/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">dc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|DC|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">user_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">employee_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员编号|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">mail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮箱|
|<el-row justify="space-between"><el-col :span="20">telephone_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系电话|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|移动电话|
|<el-row justify="space-between"><el-col :span="20">identification_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件号|
|<el-row justify="space-between"><el-col :span="20">postal_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">mdepartment_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">organization_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|组织机构标识|
|<el-row justify="space-between"><el-col :span="20">dn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|DN|
|<el-row justify="space-between"><el-col :span="20">mdepartment_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|uid/loginname|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "creator" : null,
  "updater" : null,
  "dc" : null,
  "display_name" : null,
  "user_password" : null,
  "employee_number" : null,
  "employee_type" : null,
  "title" : null,
  "mail" : null,
  "telephone_number" : null,
  "mobile" : null,
  "identification_number" : null,
  "postal_address" : null,
  "description" : null,
  "mdepartment_name" : null,
  "organization_id" : null,
  "dn" : null,
  "mdepartment_id" : null,
  "uid" : null,
  "avatar" : null,
  "create_time" : null,
  "id" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "creator" : null,
  "updater" : null,
  "dc" : null,
  "display_name" : null,
  "user_password" : null,
  "employee_number" : null,
  "employee_type" : null,
  "title" : null,
  "mail" : null,
  "telephone_number" : null,
  "mobile" : null,
  "identification_number" : null,
  "postal_address" : null,
  "description" : null,
  "mdepartment_name" : null,
  "organization_id" : null,
  "dn" : null,
  "mdepartment_id" : null,
  "uid" : null,
  "avatar" : null,
  "create_time" : null,
  "id" : null,
  "update_time" : null,
}

```

## 检查人员主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_people/checkkey" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">dc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|DC|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">user_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">employee_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员编号|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">mail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮箱|
|<el-row justify="space-between"><el-col :span="20">telephone_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系电话|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|移动电话|
|<el-row justify="space-between"><el-col :span="20">identification_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件号|
|<el-row justify="space-between"><el-col :span="20">postal_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">mdepartment_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">organization_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|组织机构标识|
|<el-row justify="space-between"><el-col :span="20">dn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|DN|
|<el-row justify="space-between"><el-col :span="20">mdepartment_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|uid/loginname|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "creator" : null,
  "updater" : null,
  "dc" : null,
  "display_name" : null,
  "user_password" : null,
  "employee_number" : null,
  "employee_type" : null,
  "title" : null,
  "mail" : null,
  "telephone_number" : null,
  "mobile" : null,
  "identification_number" : null,
  "postal_address" : null,
  "description" : null,
  "mdepartment_name" : null,
  "organization_id" : null,
  "dn" : null,
  "mdepartment_id" : null,
  "uid" : null,
  "avatar" : null,
  "create_time" : null,
  "id" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取人员草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_people/getdraft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">dc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|DC|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">user_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">employee_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员编号|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">mail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮箱|
|<el-row justify="space-between"><el-col :span="20">telephone_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系电话|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|移动电话|
|<el-row justify="space-between"><el-col :span="20">identification_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件号|
|<el-row justify="space-between"><el-col :span="20">postal_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">mdepartment_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">organization_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|组织机构标识|
|<el-row justify="space-between"><el-col :span="20">dn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|DN|
|<el-row justify="space-between"><el-col :span="20">mdepartment_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|uid/loginname|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "creator" : null,
  "updater" : null,
  "dc" : null,
  "display_name" : null,
  "user_password" : null,
  "employee_number" : null,
  "employee_type" : null,
  "title" : null,
  "mail" : null,
  "telephone_number" : null,
  "mobile" : null,
  "identification_number" : null,
  "postal_address" : null,
  "description" : null,
  "mdepartment_name" : null,
  "organization_id" : null,
  "dn" : null,
  "mdepartment_id" : null,
  "uid" : null,
  "avatar" : null,
  "create_time" : null,
  "id" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "creator" : null,
  "updater" : null,
  "dc" : null,
  "display_name" : null,
  "user_password" : null,
  "employee_number" : null,
  "employee_type" : null,
  "title" : null,
  "mail" : null,
  "telephone_number" : null,
  "mobile" : null,
  "identification_number" : null,
  "postal_address" : null,
  "description" : null,
  "mdepartment_name" : null,
  "organization_id" : null,
  "dn" : null,
  "mdepartment_id" : null,
  "uid" : null,
  "avatar" : null,
  "create_time" : null,
  "id" : null,
  "update_time" : null,
}

```

## 保存人员

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_people/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">dc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|DC|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">user_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">employee_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员编号|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">mail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮箱|
|<el-row justify="space-between"><el-col :span="20">telephone_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系电话|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|移动电话|
|<el-row justify="space-between"><el-col :span="20">identification_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件号|
|<el-row justify="space-between"><el-col :span="20">postal_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">mdepartment_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">organization_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|组织机构标识|
|<el-row justify="space-between"><el-col :span="20">dn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|DN|
|<el-row justify="space-between"><el-col :span="20">mdepartment_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|uid/loginname|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "creator" : null,
  "updater" : null,
  "dc" : null,
  "display_name" : null,
  "user_password" : null,
  "employee_number" : null,
  "employee_type" : null,
  "title" : null,
  "mail" : null,
  "telephone_number" : null,
  "mobile" : null,
  "identification_number" : null,
  "postal_address" : null,
  "description" : null,
  "mdepartment_name" : null,
  "organization_id" : null,
  "dn" : null,
  "mdepartment_id" : null,
  "uid" : null,
  "avatar" : null,
  "create_time" : null,
  "id" : null,
  "update_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "creator" : null,
  "updater" : null,
  "dc" : null,
  "display_name" : null,
  "user_password" : null,
  "employee_number" : null,
  "employee_type" : null,
  "title" : null,
  "mail" : null,
  "telephone_number" : null,
  "mobile" : null,
  "identification_number" : null,
  "postal_address" : null,
  "description" : null,
  "mdepartment_name" : null,
  "organization_id" : null,
  "dn" : null,
  "mdepartment_id" : null,
  "uid" : null,
  "avatar" : null,
  "create_time" : null,
  "id" : null,
  "update_time" : null,
}

```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_people/fetchdefault" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_dc_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|DC|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_dc_eq" : null,
  "n_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "creator" : null,
    "updater" : null,
    "dc" : null,
    "display_name" : null,
    "user_password" : null,
    "employee_number" : null,
    "employee_type" : null,
    "title" : null,
    "mail" : null,
    "telephone_number" : null,
    "mobile" : null,
    "identification_number" : null,
    "postal_address" : null,
    "description" : null,
    "mdepartment_name" : null,
    "organization_id" : null,
    "dn" : null,
    "mdepartment_id" : null,
    "uid" : null,
    "avatar" : null,
    "create_time" : null,
    "id" : null,
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
<el-alert title="/sys_people/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/sys_people/exportdata/{param},/sys_people/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/sys_people/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/sys_people/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/sys_people/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/sys_people/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/sys_people/report" type="info" :closable="false" ></el-alert>
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