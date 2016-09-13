(ns quickcheck-clj.core
  (:use [quickcheck-clj.read-config])
  (:gen-class))

(defn -main
  [& args]
  (println (get-config)))
