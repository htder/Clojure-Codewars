(ns parse-int-from-char.intFromChar)

(defn how-old
  [her-old]
  (biginteger (str (first her-old))))

(defn how-old1
  [her-old]
  (Integer/parseInt (str (first her-old))))

(how-old "1 year old")
(how-old1 "6 years old")
