package mockapi

class MockDataConfig {

    static Map getMockDataByUri(String uri) {
        if (mockData.keySet().contains(uri)) {
            mockData.get(uri)
        } else {
            return [error: "uri data not config"]
        }
    }

    def static mockData = [
            "/equipments"    : [items       : [
                                        ["id": 1, "name": "YS-116(测试)", "description": "设备-20141024"],
                                        ["id": 2, "name": "BS100Z", "description": "设备-20150907"],
                                        ["id": 3, "name": "JN75/8", "description": "设备-20150909"]
                                ]
                                , totalItems: 3]
            , "/equipments/1": [obj: ["id": 1, "name": "YS-116(测试)", "description": "设备-20141024"]]
    ]
}
