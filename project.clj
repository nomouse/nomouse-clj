(defproject nomouse-clj "0.1.0-SNAPSHOT"
  :description "My Clojure Project"
  :url "https://github.com/nomouse/nomouse-clj.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["local" "http://localhost:8081/nexus/content/groups/public"]
                 ["clojure" "https://clojars.org/repo"]]
  :dependencies [[cider/cider-nrepl "0.8.1"]
                 [org.clojure/clojure "1.6.0"]
                 [cheshire "5.0.1"]
                 [clj-http "1.0.1"]]
  :main nomouse-clj.core)
