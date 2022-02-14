(ns numb-to-digit-arr.numberToDigitArr)

(require '[clojure.string])

(defn digitize 
  [n]
  (reverse (int-array (map biginteger (clojure.string/split (str n) #"")))))

(digitize 1234)
