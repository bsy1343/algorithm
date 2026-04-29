# [Gold II] Karte - 32971

[문제 링크](https://www.acmicpc.net/problem/32971)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 43, 정답: 16, 맞힌 사람: 16, 정답 비율: 39.024%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>On Vito’s table, there are $N$ red cards labeled with numbers from $1$ to $N$ and $M$ blue cards labeled with numbers from $1$ to $M$. Each pair of red and blue cards $(c, p)$ (where $c$ represents a red card and $p$ a blue card) can create a <em>COMBO</em> move.</p>

<p>The strength of a deck of cards is defined as:</p>

<p style="text-align: center;"><em>strength</em> = (<em>number of COMBO moves</em>) - $X$ · (<em>number of red cards</em>) − $Y$ · (<em>number of blue cards</em>)</p>

<p>where the <em>number of COMBO moves</em> is the number of pairs $(c, p)$ such that the red card $c$ and the blue card $p$ are in the chosen deck. Vito can include any card from the table in his deck. Help Vito find the value of the strongest deck he can build. Vito can also choose an empty deck of cards.</p>

### 입력

<p>The first line contains $4$ natural numbers $N$, $M$, $X$, $Y$ ($1 ≤ N, M ≤ 21$, $0 ≤ X, Y ≤ 30$).</p>

<p>In the next $N$ lines, there is a sequence of $$M characters ($0$ or $1$), where the $j$-th character indicates whether the $i$-th red card and the $j$-th blue card create a <em>COMBO</em> move.</p>

### 출력

<p>In the first and only line, output the value of the strongest deck of cards that Vito can build.</p>

### 힌트

<p>Explanation of the first sample case: Vito will choose all the cards from the table, creating $3$ COMBO moves.</p>

<p>Explanation of the second sample case: Vito will select the first $2$ red cards and all $3$ blue cards, creating $6$ COMBO moves. The deck strength is $4$ because Vito selected $$2 red cards, so the number of COMBO moves, i.e., $6$, is reduced by $2$.</p>