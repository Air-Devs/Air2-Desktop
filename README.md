# Air2 Desktop

> Air2 桌面客户端 —— Windows / Linux / macOS

## 技术栈

| 层 | 选型 |
|---|---|
| UI | Kotlin + Compose Desktop + Material3 |
| 业务 | Kotlin |
| 启动核心 | **Kotlin 自研**（参考 HMCL 的逻辑） |
| Java 层 | **不需要**（直接 `java -cp ... Main`） |

## 关键设计

### 1. 不写 Java 层

MC 的入口就是 `net.minecraft.client.main.Main`，
启动器只要拼好 classpath 和参数，用 `ProcessBuilder` 起子进程即可。

```bash
java -Xmx4G \
  -Djava.library.path=<natives> \
  -cp <libraries + client.jar> \
  net.minecraft.client.main.Main \
  --username Steve --gameDir ... --version 1.21.1
```

### 2. JRE 管理

- **内置完整 JDK 21**（能跑 Forge 安装）
- 其他版本（8 / 17 / 25）按需下载

详见 [Air2-Spec / JRE-STRATEGY](https://github.com/Air-Devs/Air2-Spec/blob/main/docs/JRE-STRATEGY.md)

### 3. 与 iOS 的差异

| 项 | iOS | Desktop |
|---|---|---|
| JVM | 进程内 `JLI_Launch` | **子进程** |
| 崩溃影响 | 整个 App | 只影响游戏 |
| 内存 | 受 jetsam 限制 | **不限** |
| 多开 | ❌ | **✅** |

## 构建产物

| 平台 | 格式 |
|---|---|
| Windows | `.exe` / `.msi`（内置 JRE） |
| macOS | `.app` / `.dmg`（内置 JRE） |
| Linux | `.deb` / AppImage（内置 JRE） |

## 规范

设计规范见 [Air2-Spec](https://github.com/Air-Devs/Air2-Spec)

## 状态

🚧 项目初始化中
