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
