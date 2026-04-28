# [Gold IV] Coin Tournament - 23653

[문제 링크](https://www.acmicpc.net/problem/23653)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 8, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>There is a coin tossing tournament organized by the Thieves Guild. A total of $x$ thieves and $y$ assassins are going to take part in the tournament. Initially, each participant has a position denoted by an integer from $1$ to $x + y$. The games happen while there are at least two participants. In each game, consider participant $A$ standing at the position with the greatest number. Let it be position $k$. Participant $A$ tosses a fair coin, hoping to move to position $\lfloor k / 2 \rfloor$ which is occupied by some participant $B$ at the moment. If $A$ got heads, then $A$ moves to $B$&#39;s position, and $B$ is kicked out of the tournament. If $A$ got tails, then $A$ is kicked out of the tournament, and $B$ remains at the same position. The last remaining participant is the winner.</p>

<p>Делегация ассассинов опоздала к регистрации, так что воры заняли позиции от $1$ до $x$, и ассассинам остались позиции от $x + 1$ до $x + y$. Казначей турнира хочет заранее знать, какова вероятность победы ассассина на турнире, если во всех играх используется идеальная монетка, то есть вероятности выпадения &lt;&lt;орла&gt;&gt; и &lt;&lt;решки&gt;&gt; равны $1 / 2$ и не зависят друг от друга. Найдите эту вероятность.</p>

<p>The delegation of assassins was late for the registration, so the thieves already occupied the positions from $1$ to $x$, and the assassins were left with the positions from $x + 1$ to $x + y$. The tournament treasurer wants to know in advance what is the probability of an assassin winning the tournament, given that a fair coin is used for every game, that is, the probabilities of heads and tails are equal to $1 / 2$, and all coin tosses are independent. Find this probability.</p>

### 입력

<p>The first line contains two integers $x$ and $y$: the number of thieves and the number of assassins ($1 \le x, y \le 1\,000\,000$).</p>

### 출력

<p>Output the required probability as a decimal fraction. Your answer will be considered correct if the absolute or relative error will be less than $10^{-6}$.</p>