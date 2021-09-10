## 项目结构
```
DDD demo
├─web             用户接口层
│  ├─controller        接口显示
|  │     ├─command      指令接口(CQRS写接口)
|  │     └─query        查询接口(CQRS读接口)
│  └─filter            拦截操作
|
├─application     应用层
│     ├─vo             
│     │  ├─command     指令接口入参
│     │  └─query       查询接口入参
│     ├─dto            接口出参 
│     ├─adapter        适配器层，用来DO和DTO转换以及VO和DO转换
│     └─service        service接口,可以直接到基础设施层，也可以指挥调度领域对象来解决问题
│        ├─command     指令service
│        └─query       查询service
│       
├─domain          领域层
│    ├─anti-corruption   防腐层
│    ├─specification     规则校验
│    ├─do                业务对象
│    └─aggregation       聚合
│    
└─infrastructure  基础设施层 
     ├─external          外部接口
     ├─cache             缓存
     ├─repository        仓储
     │   ├─adapter       适配器 PO和DO转换
     │   ├─po            实体
     │   └─mapper        数据库查询
     └─util              工具包