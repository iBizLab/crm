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
