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
