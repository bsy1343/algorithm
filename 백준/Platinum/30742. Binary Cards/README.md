# [Platinum I] Binary Cards - 30742

[문제 링크](https://www.acmicpc.net/problem/30742)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

그리디 알고리즘, 애드 혹, 누적 합, 비트마스킹, 백트래킹

### 문제 설명

<p>It is never too late to play the fancy &quot;Binary Cards&quot; game!</p>

<p>There is an infinite amount of cards of positive and negative ranks that are used in the game. The absolute value of any card rank is a power of two, i.e. each card has a rank of either $2^k$ or $-2^k$ for some integer $k \geq 0$. There is an infinite amount of cards of any valid rank.</p>

<p>At the beginning of the game player forms his deck that is some multiset (possibly empty) of cards. It is allowed to pick any number of cards of any rank but the small deck is considered to be a skill indicator. Game consists of $n$ rounds. In the $i$-th round jury tells the player an integer $a_i$. After that the player is obligated to draw such a subset of his deck that the sum of ranks of the chosen cards is equal to $a_i$ (it is allowed to not draw any cards, in which case the sum is considered to be equal to zero). If player fails to do so, he loses and the game is over. Otherwise, player takes back all of his cards into his deck and the game proceeds to the next round. Player is considered a winner if he is able to draw the suitable set of cards in each of the rounds.</p>

<p>Somebody told you which numbers $a_i$ the jury is going to tell you in each round. Now you want to pick a deck consisting of the minimum number of cards that allows you to win the &quot;Binary Cards&quot; game.</p>

### 입력

<p>The first line of input contains an integer $n$ ($1 \le n \le 100\,000$), the number of rounds in the game.</p>

<p>The second line of input contains $n$ integers $a_1, a_2, \ldots, a_n$ ($-100\,000 \le a_i \le 100\,000$), the numbers that jury is going to tell in each round.</p>

### 출력

<p>In the first line print the integer $k$ ($0 \leq k \leq 100\,000$), the minimum number of cards you have to pick in your deck in ordered to win the &quot;Binary Cards&quot;.</p>

<p>In the second line print $k$ integers $b_1, b_2, \ldots, b_k$ ($-2^{20} \leq b_i \leq 2^{20}$, $|b_i|$ is a power of two), the ranks of the cards in your deck. You may output ranks in any order. If there are several optimum decks, you are allowed to print any of them.</p>

<p>It is guaranteed that there exists a deck of minimum size satisfying all the requirements above.</p>

### 힌트

<p>In the first sample there is the only round in the game, in which you may simply draw both your cards. Note that this sample test is the only one satisfying the first test group constraints.</p>

<p>In the second sample you may draw the only card $-1$ in the first round, cards $4$ and $-1$ in the second round, nothing in the third round, the only card $4$ in the fourth round and the whole deck in the fifth round.</p>