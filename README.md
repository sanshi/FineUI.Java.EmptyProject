# FineUI.Java.EmptyProject

包含最少功能的 FineUI.Java 骨架工程（Spring Boot），便于快速熟悉用法、或在向我们反馈问题时**重现问题**。含四个页面：

- **开始页面**（`/hello`）：一个按钮，点击弹出对话框；
- **首页框架**（`/`）：左侧菜单树 + 顶部工具栏 + 选项卡工作区；
- **登录页面**（`/login`）：表单校验示例（用户名/密码 admin/admin）；
- **主题仓库**（`/themes`）：切换内置/自定义主题。

## 前提条件

- **JDK 17+**（用 JDK 21 亦可），并设置环境变量 `JAVA_HOME` 指向它；
- **Maven**（`mvn` 命令在 PATH 中）。

## 依赖方式

项目文件已声明从公共软件包仓库获取的 Maven 包 `com.fineui:fineui-java`。正常联网构建时，包管理器会自动还原依赖；仓库不包含 FineUI.Core.dll、FineUI.Pro.dll、fineui-java.jar，也不包含 FineUI 框架源码。

## 构建

安装 JDK 17 与 Maven 后，在仓库根目录运行：

```bash
mvn package
```

## 运行

在仓库根目录启动：

```bash
mvn spring-boot:run
```

启动后浏览器打开 <http://localhost:8083/>（端口由 `src/main/resources/application.properties` 的 `server.port` 决定）。

**不需要授权文件**：本仓库引用的是公共软件包仓库中的社区版，社区版不做授权校验，克隆下来就能直接跑。

## 说明

- FineUI 前端运行时（`/F/FineUI.js`、CSS、主题、语言包）已内嵌在类库 jar 内，随依赖自动提供，无需单独部署。
- `res/` 下是项目自带的静态资源（图标、CSS、主题缩略图等），已随本项目提供。

## 许可边界

本仓库中由合肥三生石上软件有限公司拥有著作权的示例或应用项目源代码采用 [MIT 许可证](LICENSE)。FineUI 各端框架源码、二进制软件包、内嵌的 FineUI.js 运行时以及 FineUI 名称、标识和商标不属于 MIT 授权范围，仍适用各自的商业或社区版许可。具体边界见 [NOTICE.md](NOTICE.md)。

## 参与贡献

请先阅读 `CONTRIBUTING.md`。安全问题请按 `SECURITY.md` 私下报告。
