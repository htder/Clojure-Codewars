(ns are-you-playing-banjo.banjo)

(defn plays-banjo?
  [name]
  (if (re-matches #"(?i)^r(.*)" name)
    (str name " plays banjo")
    (str name " does not play banjo")))

(defn plays-banjo1?
  [name]
  (if (#{\r \R} (first name))
    (str name " plays banjo")
    (str name " does not play banjo")))

(defn plays-banjo2?
  [name]
  (if (or (= first name) \r) (= first name) \R)
  (str name " plays banjo")
  (str name " does not play banjo"))

(plays-banjo? "Adam")
(plays-banjo1? "Paul")
(plays-banjo1? "Ringo")
(plays-banjo? "bravo")
(plays-banjo2? "rolf")



