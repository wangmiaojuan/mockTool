### 说明：

mockTool是基于grails的模拟web请求返回的小工具。

运行：

  `grails run-app`

### 使用说明：
1. 在MockDataConfig类中配置指定请求的返回数据即可。示例如下：
```
  static Map getMockDataByUri(String uri) {
        if (mockData.keySet().contains(uri)) {
            mockData.get(uri)
        } else {
            return [error: "uri data not config"]
        }
    }

   //在mockDate重配置返回数据即可。其中key为请求的uri，value为map形式的期望返回数据。
    def static mockData = [
            "/equipments"    : [items       : [
                                        ["id": 1, "name": "YS-116(测试)", "description": "设备-20141024"],
                                        ["id": 2, "name": "BS100Z", "description": "设备-20150907"],
                                        ["id": 3, "name": "JN75/8", "description": "设备-20150909"]
                                ]
                                , totalItems: 3]
            , "/equipments/1": [obj: ["id": 1, "name": "YS-116(测试)", "description": "设备-20141024"]]
    ]
```
