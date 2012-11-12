(ns making-change-kata.core-test
  (:use clojure.test
        making-change-kata.core))

(deftest test-make-change
  (testing "making change with US coins"
    (is (= [] (make-change 0)))
    (is (= [1] (make-change 1)))
    (is (= [1 1] (make-change 2)))
    (is (= [5] (make-change 5)))
    (is (= [5 1] (make-change 6)))
    (is (= [10] (make-change 10)))
    (is (= [25] (make-change 25)))
    (is (= [25 25 25 10 5 1 1] (make-change 92)))))
