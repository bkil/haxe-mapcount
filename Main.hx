using Lambda;

class Main {
    static public function main() {
        function countClient(clientId: String,
                             map: Map<String, Map<String, String>>): Int {
            return map.count(entry -> entry.exists(clientId));
        }

        var map = [
            "Balu" => ["OSX" => "1", "QNX" => "2"],
            "Tomi" => ["OSX" => "3"],
            "Zsoc" => ["QNX" => "4"]
        ];
        trace(countClient("OSX", map));
    }
}
