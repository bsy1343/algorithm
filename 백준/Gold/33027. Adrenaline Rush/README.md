# [Gold II] Adrenaline Rush - 33027

[문제 링크](https://www.acmicpc.net/problem/33027)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 47, 정답: 35, 맞힌 사람: 33, 정답 비율: 76.744%

### 분류

그리디 알고리즘, 애드 혹, 해 구성하기

### 문제 설명

<p>Alice's friend is a big fan of the Adrenaline Rush racing competition and always strives to attend every race. However, this time, Alice is the one watching the race. To ensure her friend does not miss any important details, Alice decides to take notes on everything that happens on the track.</p>

<p>The first thing Alice notices before the race begins is the numbering of the cars. All the cars line up in front of the starting line in a specific order. The car closest to the line is numbered $1$, the second car is numbered $2$, and so on, up to the last car, which is numbered $n$. How convenient! --- Alice thought.</p>

<p>The race begins with the countdown: "Three! Two! One! Go!". Alice observes that the cars start in their original order. However, as the race progresses, their order changes. She records whenever one car overtakes another, essentially swapping places with it on the track.</p>

<p>During the race, Alice notices something curious: no car overtakes another more than once. In other words, for any two cars $x$ and $y$, there are at most two overtakes between them during the race: "$x$ overtakes $y$" and/or "$y$ overtakes $x$".</p>

<p>At the end of the race, Alice carefully writes down the final order of the cars $c_1, c_2, \ldots, c_n$, where $c_1$ represents the winner of the race.</p>

<p>Alice's friend, however, is only interested in the final ranking and discards all of Alice's notes except for the final ordering. As Alice is quite curious, she wonders: <em>What is the longest possible sequence of overtakes she could have observed during the race?</em> Your task is to help Alice answer this question.</p>

### 입력

<p>The first line of the input contains a single integer $n(1 \le n \le 1000)$ --- the number of cars in the race.</p>

<p>The second line contains a permutation $c_1, c_2, \ldots, c_n(1 \le c_i \le n, c_i \ne c_j)$ --- the final order of the cars.</p>

### 출력

<p>The first line of the output should contain a single integer $m$ --- the maximum possible number of overtakes that can occur during the race.</p>

<p>Each of the next $m$ lines should contain two integers $x$ and $y$ ($1 \le x, y \le n$, $x \ne y$) representing an overtake event, where car $x$ overtakes car $y$. This means that car $x$ was directly behind car $y$ and overtakes it. The overtakes must be listed in the order they occurred during the race.</p>

<p>After all $m$ overtakes have occurred, the cars must arrive at the finish line in the order $c_1, c_2, \ldots, c_n$. Note that any car $x$ should not overtake another car $y$ more than once.</p>

<p>If there are multiple possible longest sequences of overtakes, output any of them.</p>