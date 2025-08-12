
## 使用脚本的处理逻辑节点<sup class="footnote-symbol"> <font color=orange>[11]</font></sup>

#### [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)的处理逻辑[将分配数据更新到统计表(update_payee_allocate)](module/crm/payee_statistic/logic/update_payee_allocate)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var plan_info = logic.getParam("Payee_plan_info")
var statistic_info = logic.getParam("Payee_statistic_info")

// 获取当前年份和月份
var currentYear = new Date().getFullYear();
var currentMonth = new Date().getMonth() + 1; // 月份从 0 开始，所以要加 1


for(var i=0;i<plan_info.size;i++){
    var statistic; 
    var plan = plan_info.get(i);
    // 后台传入的 Date 格式时间
    if(plan.get("planned_time").length == 0){
        statistic.set("NAME","未明确");
        statistic.set("TYPE", 0)
    }else{
    var backendDate = new Date(plan.get("planned_time"));
    // 转换为本地时间
    var localDate = new Date(backendDate.getTime() + backendDate.getTimezoneOffset() * 60000);
    // 获取传入时间的年份和月份
    var backendYear = localDate.getFullYear();
    var backendMonth = localDate.getMonth() + 1; // 月份从 0 开始，所以要加 1
   if (backendYear > currentYear) {
        statistic.set("name", backendYear+"-"+backendMonth);
        statistic.set("type", 3)
    }  else {
        statistic.set("name", backendYear+"-"+backendMonth);
        statistic.set("type", 2)
    }
    }
    statistic.set("amount",plan.get("amount"));
    statistic = plan;
    statistic_info.push(statistic);
}
```
#### [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)的处理逻辑[将分配数据更新到统计表(update_payee_allocate)](module/crm/payee_statistic/logic/update_payee_allocate)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var payee = logic.getParam("sub")
var statistic = logic.getParam("statistic")

// 获取当前年份和月份
var currentYear = new Date().getFullYear();
var currentMonth = new Date().getMonth() + 1; // 月份从 0 开始，所以要加 1

    // 后台传入的 Date 格式时间
    if(null == payee.get("payee_date")){
        statistic.set("NAME","");
        statistic.set("TYPE", 0)
    }else{
    var backendDate = new Date(payee.get("payee_date"));
    // 获取传入时间的年份和月份
    var backendYear = backendDate.getFullYear();
     var backendMonth = backendDate.getMonth() + 1;
    statistic.set("type", 1) 
    // 格式化月份为两位数，如 01, 02, ..., 12
    var formattedMonth = backendMonth <= 9 ? "0" + backendMonth : backendMonth.toString();
    statistic.set("NAME",backendYear+formattedMonth);
    statistic.set("statistic_date", new Date(backendYear, backendMonth - 1, 1));
    }
    if(null == payee.get("amount")){
        statistic.set("amount",payee.get("amount"));

    }
    statistic.set("amount",payee.get("amount")*payee.get("ratio")*0.01);
    statistic.set("owner",payee.get("user_id"))
```
#### [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)的处理逻辑[将计划数据更新到统计表(update_payee_staticstic)](module/crm/payee_statistic/logic/update_payee_staticstic)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var plan_info = logic.getParam("Payee_plan_info")
var statistic_info = logic.getParam("Payee_statistic_info")

// 获取当前年份和月份
var currentYear = new Date().getFullYear();
var currentMonth = new Date().getMonth() + 1; // 月份从 0 开始，所以要加 1


for(var i=0;i<plan_info.size;i++){
    var statistic; 
    var plan = plan_info.get(i);
    // 后台传入的 Date 格式时间
    if(plan.get("planned_time").length == 0){
        statistic.set("NAME","未明确");
        statistic.set("TYPE", 0)
    }else{
    var backendDate = new Date(plan.get("planned_time"));
    // 转换为本地时间
    var localDate = new Date(backendDate.getTime() + backendDate.getTimezoneOffset() * 60000);
    // 获取传入时间的年份和月份
    var backendYear = localDate.getFullYear();
    var backendMonth = localDate.getMonth() + 1; // 月份从 0 开始，所以要加 1
   if (backendYear > currentYear) {
        statistic.set("name", backendYear+"-"+backendMonth);
        statistic.set("type", 3)
    }  else {
        statistic.set("name", backendYear+"-"+backendMonth);
        statistic.set("type", 2)
    }
    }
    statistic.set("amount",plan.get("amount"));
    statistic = plan;
    statistic_info.push(statistic);
}
```
#### [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)的处理逻辑[将计划数据更新到统计表(update_payee_staticstic)](module/crm/payee_statistic/logic/update_payee_staticstic)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var plan = logic.getParam("sub")
var statistic = logic.getParam("statistic")

// 获取当前年份和月份
var currentYear = new Date().getFullYear();
var currentMonth = new Date().getMonth() + 1; // 月份从 0 开始，所以要加 1

    // 后台传入的 Date 格式时间
    if(null == plan.get("planned_time")){
        statistic.set("NAME","");
        statistic.set("TYPE", 0)
    }else{
     var backendDate = new Date(plan.get("planned_time"));
    // 获取传入时间的年份和月份
    var backendYear = backendDate.getFullYear();
    var backendMonth = backendDate.getMonth() + 1; // 使用 backendDate 中的月份

    // 格式化月份为两位数，如 01, 02, ..., 12
    var formattedMonth = backendMonth <= 9 ? "0" + backendMonth : backendMonth.toString();

    statistic.set("name", backendYear + "-" + formattedMonth);
    statistic.set("type", 2);

    // 设置统计日期为每月的 1 号
    statistic.set("statistic_date", new Date(backendYear, backendMonth - 1, 1));
    }
    statistic.set("amount", plan.get("amount"));
```
#### [订单(PROJECT)](module/crm/project)的处理逻辑[检测子订单状态后保存订单(scan_save)](module/crm/project/logic/scan_save)

节点：设置关闭时间
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var defaultObj = logic.getParam("default");
defaultObj.set("closed_date", new Date());
```
#### [任务&活动(TASK)](module/crm/task)的处理逻辑[取消关联(cancel_relation)](module/crm/task/logic/cancel_relation)

节点：拼接关系主键
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
// var relation_obj = logic.getParam("relation_obj");
// var _default = logic.getParam("Default");
// if(_default.get("principal_id") != null && _default.get("id") != null  &&  _default.get("type") != null){
//     relation_obj.set("id", _default.get("principal_id") + "_" + _default.get("id") + '_' + _default.get("type"));
// }
var relation_obj = logic.getParam("relation_obj");
var _default = logic.getParam("Default");
if(_default.get("principal_id") != null && _default.get("id") != null){
    relation_obj.set("id", _default.get("principal_id") + "_" + _default.get("id") + '_' + 'TASK');
}
```
#### [任务&活动(TASK)](module/crm/task)的处理逻辑[取消关联(商机)(deal_cancel_relation)](module/crm/task/logic/deal_cancel_relation)

节点：拼接关系主键
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
// var relation_obj = logic.getParam("relation_obj");
// var _default = logic.getParam("Default");
// if(_default.get("principal_id") != null && _default.get("id") != null  &&  _default.get("type") != null){
//     relation_obj.set("id", _default.get("principal_id") + "_" + _default.get("id") + '_' + _default.get("type"));
// }
var relation_obj = logic.getParam("relation_obj");
var _default = logic.getParam("Default");

if(_default.get("principal_id") != null && _default.get("id") != null){
    relation_obj.set("id", _default.get("principal_id") + "_" + _default.get("id") + '_' + 'DEAL');
}
// relation_obj.set("id", _default.get("principal_id") + "_" + _default.get("id") + '_' + 'DEAL');

```
#### [任务&活动(TASK)](module/crm/task)的处理逻辑[取消关联(线索)(lead_cancel_relation)](module/crm/task/logic/lead_cancel_relation)

节点：拼接关系主键
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
// var relation_obj = logic.getParam("relation_obj");
// var _default = logic.getParam("Default");
// if(_default.get("principal_id") != null && _default.get("id") != null  &&  _default.get("type") != null){
//     relation_obj.set("id", _default.get("principal_id") + "_" + _default.get("id") + '_' + _default.get("type"));
// }
var relation_obj = logic.getParam("relation_obj");
var _default = logic.getParam("Default");

if(_default.get("principal_id") != null && _default.get("id") != null){
    relation_obj.set("id", _default.get("principal_id") + "_" + _default.get("id") + '_' + 'LEAD');
}


```
#### [用户(USER)](module/crm/user)的处理逻辑[查询销售领导(SalesLeader)](module/crm/user/logic/SalesLeader)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var member_page = logic.getParam("member_page");
var user_filter = logic.getParam("user_filter");
var user_ids = "";
for (var i = 0; i < member_page.length; i++) {
if(i>0){
user_ids = user_ids+",";
}
var id = member_page.get(i);
user_ids = user_ids + id.get("member_uid");
}
if(user_ids != ""){
user_filter.in("sysuserId",user_ids);
}
```
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[新建周报时加载关联信息(relation)](module/crm/weeklies/logic/relation)

节点：填充默认开始/结束时间
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var defaultInfo = logic.getParam("Default");

// 获取当前日期  
var now = new Date();  
// 获取当前周的第一天（周一）和最后一天（周日）  
function getFirstDayOfWeek(date) {  
    var day = date.getDay() || 7; // 如果 getDay() 返回 0，则视为周日  
    var diff = date.getDate() - day + (day === 0 ? -6 : 1); // 调整日期到周一  
    return new Date(date.setDate(diff));  
}  

function getLastDayOfWeek(date) {  
    var firstDay = getFirstDayOfWeek(date);  
    return new Date(firstDay.setDate(firstDay.getDate() + 6)); // 从周一开始加6天得到周日  
}  
  
// 格式化日期为 "YYYY-MM-DD" 字符串  
function formatDate(date) {  
    var year = date.getFullYear();  
    var month = date.getMonth() + 1; // 月份是从0开始的，所以需要+1  
    var day = date.getDate();  
    // 如果月份或日期是小于10的数字，则在前面添加一个'0'  
    month = (month < 10 ? '0' : '') + month;  
    day = (day < 10 ? '0' : '') + day;  
    return year + '-' + month + '-' + day;  
} 
  
// 获取当前周的开始和结束日期  
var startOfWeek = getFirstDayOfWeek(now);  
var endOfWeek = getLastDayOfWeek(now);  
  
// 格式化日期为字符串  
var startOfWeekString = formatDate(startOfWeek);  
var endOfWeekString = formatDate(endOfWeek);  
  
// 连接两个日期字符串为逗号分隔的字符串  
var dateRangeString = startOfWeekString+','+endOfWeekString;  
name = defaultInfo.get('name');

if(defaultInfo.get('start_date') == null && defaultInfo.get('end_date') == null){
    defaultInfo.set('start_date', startOfWeekString);
    defaultInfo.set('end_date', endOfWeekString);
    defaultInfo.set('date_scope', startOfWeekString + ',' + endOfWeekString);
}
if(defaultInfo.get('name') == sys.user().getUsername()){
    defaultInfo.set('name', name+startOfWeekString+'至'+endOfWeekString+'周报');
}

```
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[根据统计时间更新关联信息(updateRelation)](module/crm/weeklies/logic/updateRelation)

节点：设置名称
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var defaultInfo = logic.getParam("Default");
name = defaultInfo.get('name');
var startDate = new Date(defaultInfo.get('start_date')); 
var endDate = new Date(defaultInfo.get('end_date')); 

var formattedStartDate = startDate.getFullYear() + '-' +  
    ('0' + (startDate.getMonth() + 1)).slice(-2) + '-' +  
    ('0' + startDate.getDate()).slice(-2);  
var formattedEndDate = endDate.getFullYear() + '-' +  
    ('0' + (endDate.getMonth() + 1)).slice(-2) + '-' +  
    ('0' + endDate.getDate()).slice(-2); 
name = name + formattedStartDate + '至' + formattedEndDate + '周报';  
defaultInfo.set('name', name);
defaultInfo.set('start_date', formattedStartDate+' 00:00:00');
defaultInfo.set('end_date', formattedEndDate+' 23:59:59');
```




