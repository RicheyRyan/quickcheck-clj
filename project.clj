(defproject quickcheck-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [str-helpers "0.1.0"]]
  :main ^:skip-aot quickcheck-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :plugins [[lein-kibit "0.1.2"]
            [lein-bikeshed "0.3.0"]
            [jonase/eastwood "0.2.3"]
            [venantius/yagni "0.1.4"]
            [lein-ancient "0.6.10"]])
