(fn [state time-left]
  (def turn-directions [:right :left :about-face])
  (def smoke-directions [:forward :backward :left :right :drop])

  (let [command-options [(repeat 2 {:action :move
                                     :metadata {}})
                         (repeat 2 {:action :turn
                                    :metadata {:direction (rand-nth turn-directions)}})
                         (repeat 10 {:action :shoot
                                      :metadata {}})]]

    {:command (rand-nth (flatten command-options))
     :state {}}))
