(ns jenkins-xfd.core
  (:use jenkins-xfd.encoder)
  (:use jenkins-xfd.build)
  (:use serial-port)
  (:gen-class))
(def serial-device "/dev/cu.usbmodemfa141")
(defn update-xfd-status
  [status]
  (with-open [w (java.io.FileWriter. serial-device)]
    (.write w status)))
(defn -main [& job-url]
  (println
    (encode
      (last-result (apply str job-url)))))
