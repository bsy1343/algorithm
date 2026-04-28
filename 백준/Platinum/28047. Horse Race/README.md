# [Platinum IV] Horse Race - 28047

[문제 링크](https://www.acmicpc.net/problem/28047)

### 성능 요약

시간 제한: 0.1 초, 메모리 제한: 1024 MB

### 통계

제출: 103, 정답: 58, 맞힌 사람: 52, 정답 비율: 59.770%

### 분류

그리디 알고리즘, 해 구성하기, 이분 매칭

### 문제 설명

<p>The Exponential Horse Racing company has been building larger and larger stadiums, allowing for many more horses than usual to participate in the same race. And, to facilitate filling those slots, it combines races of different tiers. That is, horses that are known to be much worse than others are allowed to race together, and spectators are allowed to bet on each of the small races that are happening. This also allows for horses that are between tiers to race in both tiers at once.</p>

<p>Paul is in charge of noting down the winner of each small race. To speed up that work, instead of noting down the full name of the winning horse, Paul notes down only its placement on the full race.</p>

<p>As an example, suppose that horses &ldquo;<code>a</code>&rdquo;, &ldquo;<code>b</code>&rdquo;, &ldquo;<code>c</code>&rdquo;, &ldquo;<code>d</code>&rdquo; and &ldquo;<code>e</code>&rdquo; participated in a full race, and they reached the finish line in the order &ldquo;<code>e</code>&rdquo;, &ldquo;<code>c</code>&rdquo;, &ldquo;<code>a</code>&rdquo;, &ldquo;<code>b</code>&rdquo; and &ldquo;<code>d</code>&rdquo;. Hence a small race with horses &ldquo;<code>c</code>&rdquo; and &ldquo;<code>b</code>&rdquo; was won by &ldquo;<code>c</code>&rdquo;, and then Paul would note down that the winner of the small race was the second horse, because &ldquo;<code>c</code>&rdquo; got that placement on the full race.</p>

<p>One day you got Paul&rsquo;s notes, but didn&rsquo;t have the full race results on hand. All you know is that there were no ties in the full race, and that every horse reached the finish line. Can you figure out the full race results by having only the description of each small race?</p>

### 입력

<p>The first line contains an integer $N$ ($2 &le; N &le; 300$) indicating the number of horses in the full race. The second line contains $N$ different strings representing the names of the horses. Each string has a length of up to three and is made of lowercase letters. The third line contains an integer $R$ ($1 &le; R &le; 10^5$) denoting the number of small races. For $i = 1, 2, \dots , R$, the $i$-th of the next $R$ lines describes a small race with two integers $M_i$ ($2 &le; M_i &le; N$) and $W_i$ ($1 &le; W_i &le; N$), followed by $M_i$ different strings, indicating respectively the number of horses in the small race, the winner according to Paul&rsquo;s notes, and the names of the participating horses. It is guaranteed that $\sum_i{M_i} &le; 10^5$.</p>

### 출력

<p>Output a single line with $N$ strings indicating the names of the horses in a valid order, that represents a possible result of the full race. It is guaranteed that there exists at least one solution. If there are multiple solutions, output any of them.</p>