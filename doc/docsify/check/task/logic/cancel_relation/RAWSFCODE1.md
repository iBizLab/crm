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
