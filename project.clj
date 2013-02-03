(defproject jenkins-xfd "1.0.0-SNAPSHOT"
  :description "Jenkins XFD client proxy"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [clj-http "0.6.3"]
                 [midje "1.4.0"]
                 [org.clojure/data.json "0.2.1"]
                 [serial-port "1.1.0"]]
  :main jenkins-xfd.core)
