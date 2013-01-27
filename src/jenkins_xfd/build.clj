(ns jenkins-xfd.build)
(require '[clj-http.client])
(defn last-result
  ""
  [job]
  (let
    [http-result (clj-http.client/get job)]
    (get http-result :body)))
