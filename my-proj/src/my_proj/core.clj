(ns my-proj.core
    (:gen-class)
    (require my-proj.rectangle)
    (refer my-proj.rectangle))


(defn -main
      [& args]
      (println  (calculatePerimeter 2 3))
      (println (calculateArea 2 3))
      )

