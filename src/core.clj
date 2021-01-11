(ns core)

(defn fact [n]
  (if (< n 2)
    1
    (* n (fact (dec n)))))

(defn i-am-ignored []
  (println "Ignored by carve"))

(defn -main [& args]
  (fact 2)
  (println "hello from main"))

(comment
  (defn i-do-not-count [x]
    (println "Carve won't care about me")))
