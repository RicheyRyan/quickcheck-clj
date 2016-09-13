(ns quickcheck-clj.read-config
  (require [clojure.string :as str])
  (use [str-helpers.core]))

(def user-home (System/getProperty "user.home"))

(def file-uri (str user-home "/.quickcheck"))

(defn log [v]
  (println v)
  v)

(defn dasherize-and-lowercase [s]
  (str/lower-case (dasherize s)))

(defn string-into-keyword-and-value [s]
   (let [pair (str/split s #"=| ")]
   (hash-map (keyword (dasherize-and-lowercase (first pair))) (second pair))))

(defn config-to-map [conf]
  (merge
    (into {} (map string-into-keyword-and-value conf))))

(defn get-config []
  (->
    (slurp file-uri)
    (str/split-lines)
    (config-to-map)))
