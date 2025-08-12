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
