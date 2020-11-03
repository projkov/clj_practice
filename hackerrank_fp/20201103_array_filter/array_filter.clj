(ns hackerrank-fp-clj.array-filter)

(defn array_filter
  [delim lst]
  (doseq [x lst]
    (if (< x delim)
      (println x)))
  )

(array_filter 2 [0 1 2 3])
