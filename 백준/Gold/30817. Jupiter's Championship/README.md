# [Gold I] Jupiter's Championship - 30817

[문제 링크](https://www.acmicpc.net/problem/30817)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

그리디 알고리즘, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>As you probably know, in June Flatland will host the Jupiter&#39;s football championship. There will be $n$ teams participating in the competition, and each team is going to play with each other team exactly once.</p>

<p>There are $m$ different colors of football t-shirts produced on Jupiter. Each team will bring t-shirts of two <strong>different</strong> colors. Of course, during the single match all members of one team must wear t-shirts of the same colors, and this color should be different from the color of t-shirts opposite team is using in this game.</p>

<p>The president of the Fantastic Interplanet Football Association Joseph was invited to referee such an important tournament. At the beginning of each game Joseph can specify for each of the opposing teams the particular color of the t-shirts they should use during this game. He is able to choose colors only among the two colors this team has brought to the tournament. After this, Joseph chooses the color he is going to wear during the match. As you can guess, this color should differ from colors teams are using, so they are able to distinguish the referee and each team on the field. Any t-shirts may be used multiple times.</p>

<p>Joseph is going to buy the necessary t-shirts right before the start of the tournament, when he already knows for each team the colors of t-shirts this team has. Joseph cares a lot about the money of the federation, so he wants to buy the minimum number of t-shirts that is necessary to referee all the games. This problem is quite complicated for the common football referee, so he asks you to help.</p>

### 입력

<p>The first line of the input contains two integers $n$ and $m$ ($2 \leq n \leq 100\,000, 2 \leq m \leq 10^9$) --- the number of teams participating in the championship and the number of different colors of football t-shirts produced on Jupiter.</p>

<p>The $i$-th of the following $n$ lines contains two distinct integers from $1$ to $m$ --- colors of the t-shirts that are available for the team number $i$.</p>

### 출력

<p>First print the minimum number of t-shirts required to be able to referee matches between all pairs of teams. If there is no solution, print <code>-1</code> instead.</p>

<p>Then print the colors of the t-shirts that form optimal answer.</p>

<p>If there are multiple possible solutions, you may print any of them.</p>

### 힌트

<p>In the first sample it&#39;s enough to buy only t-shirt of color $1$, cause in any match teams will be able to choose different colors, without using color $1$. For example, in the game between first and second teams Joseph may tell team number $1$ to use color $2$ and team number $2$ to use color $3$.</p>