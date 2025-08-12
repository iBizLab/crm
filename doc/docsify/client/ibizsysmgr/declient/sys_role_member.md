# 系统角色成员(sys_role_member) :id=sys_role_member
## CheckKey

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_role_members" type="info" :closable="false" ></el-alert>
</div>
</el-row>



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|id|String|id|
|dc|String|dc|
|role_id|String|Role_id|
|member_uid|String|Member_uid|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "dc" : null,
  "role_id" : null,
  "member_uid" : null,
}
```


## Create

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_role_members" type="info" :closable="false" ></el-alert>
</div>
</el-row>



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|id|String|id|
|dc|String|dc|
|role_id|String|Role_id|
|member_uid|String|Member_uid|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "dc" : null,
  "role_id" : null,
  "member_uid" : null,
}
```


## Get

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_role_members/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|




## GetDraft

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_role_members" type="info" :closable="false" ></el-alert>
</div>
</el-row>



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|id|String|id|
|dc|String|dc|
|role_id|String|Role_id|
|member_uid|String|Member_uid|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "dc" : null,
  "role_id" : null,
  "member_uid" : null,
}
```


## Remove

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_role_members/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|




## Save

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_role_members" type="info" :closable="false" ></el-alert>
</div>
</el-row>



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|id|String|id|
|dc|String|dc|
|role_id|String|Role_id|
|member_uid|String|Member_uid|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "dc" : null,
  "role_id" : null,
  "member_uid" : null,
}
```


## Update

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_role_members/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|id|String|id|
|dc|String|dc|
|role_id|String|Role_id|
|member_uid|String|Member_uid|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "dc" : null,
  "role_id" : null,
  "member_uid" : null,
}
```


## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/sys_role_members" type="info" :closable="false" ></el-alert>
</div>
</el-row>



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|n_id_eq|String|N_ID_EQ|
|n_id_like|String|N_ID_LIKE|
|n_member_uid_eq|String|N_MEMBER_UID_EQ|
|n_role_id_eq|String|N_ROLE_ID_EQ|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_id_like" : null,
  "n_member_uid_eq" : null,
  "n_role_id_eq" : null,
}
```





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