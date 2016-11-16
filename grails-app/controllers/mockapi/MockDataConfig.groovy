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
                                        ["id": 1, "name": "YS-006(测试)", "description": "师傅的设备-201410240300002694"],
                                        ["id": 2, "name": "BS3110100Z", "description": "师傅的设备-201509070400005001"],
                                        ["id": 3, "name": "新邦JN75/8", "description": "师傅的设备-201509070400005001"]
                                ]
                                , totalItems: 3]
            , "/equipments/1": [obj: ["id": 1, "name": "YS-006(测试)", "description": "师傅的设备-201410240300002694"]]
    ]
}
