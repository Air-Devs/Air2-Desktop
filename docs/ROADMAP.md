# Air2 Desktop 路线图

## 阶段 1：项目骨架（1 周）

- [ ] Gradle 工程配置（Compose Desktop）
- [ ] 应用入口 + 窗口管理
- [ ] MD3 主题层

## 阶段 2：启动核心（0.5 个月）

参考 HMCL 的 `game/` 与 `java/`：

- [ ] 版本 JSON 解析
- [ ] `inheritsFrom` 合并
- [ ] JVM 参数组装
- [ ] classpath 构建
- [ ] `ProcessBuilder` 启动
- [ ] 日志重定向

## 阶段 3：JRE 管理（0.5 个月）

- [ ] 内置 JDK 21 集成
- [ ] JRE 探测（内置 / 已下载 / 系统）
- [ ] 缺失提示 + Adoptium 下载
- [ ] 版本校验

## 阶段 4：业务功能（1.5 个月）

- [ ] 账号（微软 / 离线 / 第三方）
- [ ] 版本管理
- [ ] 下载
- [ ] 安装（含 Forge processor）
- [ ] 设置

## 阶段 5：打包（0.5 个月）

- [ ] Windows 安装包
- [ ] macOS .app / .dmg
- [ ] Linux AppImage / deb

## 总计

约 3 个月（三平台共用一套代码）
