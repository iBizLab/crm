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
