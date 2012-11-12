(ns making-change-kata.core)

(defn find-largest-coin [coins amount]
  (first (filter #(<= % amount) coins)))

(def coins [25 10 5 1])

(defn make-change [cents]
  (loop [change [] amt-rem cents]
    (if (zero? amt-rem) change
	(let [coin (find-largest-coin coins amt-rem)]
	  (recur (concat change [coin]) (- amt-rem coin)))))) 