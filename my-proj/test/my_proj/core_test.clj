(ns my-proj.core-test
  (require [clojure.test :refer :all]
            [my-proj.core :refer :all]
           [my-proj.rectangle :refer :all]))

(deftest calculate
  (is (= 10 (calculatePerimeter 2 3)))
         (is (= 6 (calculateArea 2 3)))
  )


