# [Platinum I] International Irregularities - 30497

[문제 링크](https://www.acmicpc.net/problem/30497)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 60, 정답: 14, 맞힌 사람: 14, 정답 비율: 29.167%

### 분류

다이나믹 프로그래밍, 자료 구조, 그리디 알고리즘, 누적 합, 많은 조건 분기, 희소 배열

### 문제 설명

<p>Long, long ago on a planet far, far away, a highly contagious virus caused an enduring pandemic.</p>

<p>Even so, the people wanted to travel between countries for their summer holidays. In the good old before-days, travelling from any country to any other country took 1 full day. However, during the pandemic, certain countries preferred not to receive travellers from areas that had higher infection rates, so they made them quarantine for a certain number of days before allowing them to continue their trip or start their holiday.</p>

<p>To keep everything fair, an independent Bureau for Accurate Pandemic Classification was founded. They assigned a $r$-value to each country based on the infection rate in that country. A higher $r$-value indicates higher infection rate.</p>

<p>Each country asked tourists to quarantine if the country they just came from had a $r$-value significantly higher than their own. In particular, when you wanted to travel from country $i$ to country $j$, you would have to quarantine for $t_j$ days if $r_i &gt; r_j + m$.</p>

<p>Archaeologists have found evidence of $q$ tourists travelling between $n$ countries. For each tourist, the start and destination are known. The question that remains to be answered is: how long was each tourist&#39;s minimal travel time?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $n$, $q$, and $m$ ($2\leq n \leq 10^5$, $1\leq q \leq 10^5$, $0\leq m \leq 10^9$), the number of countries, the number of tourists, and the maximum allowed difference between two $r$-values when travelling to a country with a lower infection rate.</li>
	<li>One line with $n$ integers $r_1, \dots, r_n$ ($0 \leq r_1 \leq \dots \leq r_n \leq 10^9$), the $r$-value for each country.</li>
	<li>One line with $n$ integers $t_1, \dots, t_n$ ($0 \leq t_i \leq 10^9$ for all $i$), the required quarantine time in days when travelling to a country with a significantly lower $r$-value.</li>
	<li>$q$ lines, each with two integers $x$ and $y$ ($1 \leq x, y \leq n$, $x \neq y$), indicating a tourist departing from country $x$ with final destination $y$.</li>
</ul>

### 출력

<p>For each tourist, output their minimal travel time in days between their departure country and destination country, in the order in which they appear in the input.</p>