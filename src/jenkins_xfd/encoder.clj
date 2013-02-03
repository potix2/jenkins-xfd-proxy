(ns jenkins-xfd.encoder)
(defn encode
  "Encode result json of jenkins build to single byte"
  [result]
  (let
    [status (get result "result")]
    (cond
      (= status "SUCCESS") "g"
      (= status "FAILURE") "r"
      (= status "UNSTABLE") "y")))

