(ns nomouse-clj.core
  (:require [clj-http.client :as http]
            [cheshire.core :refer [generate-string parse-string]]))

(defn http-json [url method req]
  (method url
          {:content-type :json
           :accept :json
           :socket-timeout 5000
           :conn-timeout 5000
           :body (generate-string req)}))

(def url-map {"loc" "http://localhost:8080/nomouse-spring"
              })

(defn api
  [url api method req]
  (-> (get url-map url url) (str api) (http-json method req)))

(def masterUid 166158)

(def servantUid 169117)

(defn -main
  [& args]
  (println (api "loc" "/token" http/get {:id 123}))
  )
