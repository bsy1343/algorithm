# [Gold III] Controllers - 27600

[문제 링크](https://www.acmicpc.net/problem/27600)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 41, 맞힌 사람: 40, 정답 비율: 74.074%

### 분류

수학

### 문제 설명

<p>You are at your grandparents&rsquo; house and you are playing an old video game on a strange console. Your controller has only two buttons and each button has a number written on it.</p>

<p>Initially, your score is $0$. The game is composed of $n$ rounds. For each $1 &le; i &le; n$, the $i$-th round works as follows.</p>

<p>On the screen, a symbol $s_i$ appears, which is either <code>+</code> (<em>plus</em>) or <code>-</code> (<em>minus</em>). Then you must press one of the two buttons on the controller <strong>once</strong>. Suppose you press a button with the number $x$ written on it: your score will increase by $x$ if the symbol was <code>+</code> and will decrease by $x$ if the symbol was <code>-</code>. After you press the button, the round ends.</p>

<p>After you have played all $n$ rounds, you win if your score is $0$.</p>

<p>Over the years, your grandparents bought many different controllers, so you have $q$ of them. The two buttons on the $j$-th controller have the numbers $a_j$ and $b_j$ written on them. For each controller, you must compute whether you can win the game playing with that controller.</p>

### 입력

<p>The first line contains a single integer $n$ ($1 &le; n &le; 2 \cdot 10^5$) &mdash; the number of rounds.</p>

<p>The second line contains a string $s$ of length $n$ &mdash; where $s_i$ is the symbol that will appear on the screen in the $i$-th round. It is guaranteed that $s$ contains only the characters <code>+</code> and <code>-</code>.</p>

<p>The third line contains an integer $q$ ($1 &le; q &le; 10^5$) &mdash; the number of controllers.</p>

<p>The following $q$ lines contain two integers $a_j$ and $b_j$ each ($1 &le; a_j , b_j &le; 10^9$) &mdash; the numbers on the buttons of controller $j$.</p>

### 출력

<p>Output $q$ lines. On line $j$ print <code>YES</code> if the game is winnable using controller $j$, otherwise print <code>NO</code>.</p>