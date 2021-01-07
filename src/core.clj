(ns core)

(defn unused [n]
  (println n))

(defn fact [n]
  (if (< n 2)
    1
    (* n (fact (dec n)))))

(defn -main [& args]
  (fact 2)
  (println "hello from main"))
