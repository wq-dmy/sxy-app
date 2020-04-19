# 森鑫源财务后端服务项目

跟新时间：2020-04-18

### 应用模块

1. sxy-ibf-app：web应用启动项目
2. sxy-ibf-common：项目供用包
3. sxy-ibf-repository：持久层模块
4. sxy-ibf-sdk：项目外部调用服务API
5. sxy-ibf-security：登录授权安全模块
6. sxy-ibf-services：业务服务模块
7. sxy-ibf-job：任务调度模块

分模块依据
    先按项目结构层分，每个模块有标志性根目录包名
    然后按业务大类分模块

```lua
sxy-app-parent -- 父项目，公共依赖
│  ├─sxy-ibf-app -- 主应用启动项目一级工程[8080]
│  │─sxy-ibf-common -- 通用工具一级模块
│  ├─sxy-ibf-repository -- 持久层模块
│  ├─sxy-ibf-sdk -- 项目文档
│  ├─sxy-ibf-security -- 登录按授权处理一级模块
│  ├─sxy-ibf-services -- 财务业务一级模块
│  │  ├─sxy-ibf-service -- 财务主业务模块
│  │  ├─sxy-ibf-service-erp -- 财务ERP 业务模块二级模块
│  │  ├─sxy-ibf-service-xxx -- 财务其他业务模块二级工程
│  ├─sxy-ibf-job -- 任务调度一级模块[2222]

```

## 约定 > 配置 > 编码
1. 所有开源包版本父项目统一管理
2. 自摸所有配置参数集中到启动工程，模块可配置，配置案例可存README.md文件
3. 子模块添加包尽量不要添加版本号，由父项目管理
4. 子项目子项目之间可以引用相同的包，但不要出现多个版本号
5. 类目命名明确带有标志性前缀


## 测试步骤

1. 启动web应用启动项目springboot 主类
2. 访问项目web接口或同前端项目调用网关访问

