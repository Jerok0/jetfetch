(defproject jetfetch "v1"
  :description "A simple script which scrapes a website for airline schedule."
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot jetfetch.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
