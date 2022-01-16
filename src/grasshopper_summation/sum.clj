(ns grasshopper-summation.sum)

(defn summation
  [n]
  (reduce + (range 1 (inc n))))

(defn summation1
  [n]
  (apply + (range (inc n))))

(summation 2)
(summation1 8)
(summation 22)
(summation 100)
(summation1 213)