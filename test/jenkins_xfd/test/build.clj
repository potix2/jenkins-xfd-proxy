(ns jenkins-xfd.test.build
  (:use jenkins-xfd.build)
  (:use clojure.test midje.sweet))
(fact
  (last-result "test") => {:result "XXXX"}
  (provided
    (clj-http.client/get "http://localhost:8080/job/test/?json=true")
    => {:body {:result "SUCCESS"}}))
