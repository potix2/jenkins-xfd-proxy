(ns jenkins-xfd.build)
(require '[clj-http.client])
(require '[clojure.data.json :as json])
(defn last-result
  ""
  [job]
  (let
    [http-result (clj-http.client/get job)]
    (json/read-str
      (get http-result :body))))
