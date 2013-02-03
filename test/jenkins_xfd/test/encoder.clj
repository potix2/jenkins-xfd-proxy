(ns jenkins-xfd.test.encoder
  (:use jenkins-xfd.encoder)
  (:use clojure.test midje.sweet))
(fact
  (encode {"result" "SUCCESS"})  => "g"
  (encode {"result" "FAILURE"})  => "r"
  (encode {"result" "UNSTABLE"}) => "y")