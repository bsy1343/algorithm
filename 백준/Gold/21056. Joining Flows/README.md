# [Gold II] Joining Flows - 21056

[문제 링크](https://www.acmicpc.net/problem/21056)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 72, 정답: 40, 맞힌 사람: 37, 정답 비율: 54.412%

### 분류

수학, 그리디 알고리즘, 정렬

### 문제 설명

<p>Having recently taken over the Wonka Factory, Charlie is now in charge of the day-to-day production of the various chocolate products made there. &nbsp;While this may seem like a cushy job with an all-you-can-eat-chocolate perk, it also comes with the difficult responsibility of keeping the (somewhat convoluted and complicated) production lines working.</p>

<p>The heart of the factory is the Chocolate River, where raw molten chocolate flows from $k$ chocolate-producing faucets, to outlets where different types of pralines and choclate bars are made. &nbsp;The $i$&#39;th of the $k$ chocolate faucets produces chocolate at some fixed temperature $t_i$, and the amount of chocolate flowing from the faucet can be adjusted to any value between $a_i$ and $b_i$ millilitres per second. Suppose the $k$ taps are adjusted to produce $x_1, x_2, \ldots, x_k$ millilitres of chocolates per second respectively (where $a_i \le x_i \le b_i$). &nbsp;Then the total flow in the Chocolate river is $x_1 + x_2 + \ldots + x_k$, and its temperature is the weighted average \[ \frac{x_1 t_1 + x_2t_2 + \ldots + x_kt_k}{x_1 + x_2 + \ldots + x_k} \] (each faucet produces grade A quality chocolate which instantly mixes with the chocolate from the other faucets).</p>

<p>Each type of praline and chocolate bar produced at the factory requires the Chocolate River to be adjusted to have a specific temperature and flow level. &nbsp;Charlie recently came across a long list of new praline recipes, and would now like to figure out which of these are even possible to make at the factory. &nbsp;Write a program to determine, for each of the new recipes, if its required temperature and flow level is possible to achieve with some setting of the $k$ faucets.</p>

### 입력

<p>The first line of input contains an integer $k$ ($1 \le k \le 10$), the number of taps. &nbsp;Then follow $k$ lines, describing the taps. &nbsp;The $i$&#39;th of these lines contains the three integers $t_i$, $a_i$, and $b_i$ ($0 \le t_i \le 10^6$, $0 \le a_i \le b_i \le 10^6$) describing the $i$&#39;th faucet.</p>

<p>Next follows a line containing an integer $r$ ($1 \le r \le 10^5$), the number of new recipes to check. &nbsp;Then follows $r$ lines, each describing a recipe. &nbsp;A recipe is described by two integers $\tau$ and $\phi$ ($0 \le \tau \le 10^6$ and $1 \le \phi \le 10^6$), where $\tau$ is the chocolate temperature and $\phi$ the chocolate flow needed for this recipe.</p>

### 출력

<p>For each of the $r$ recipes, print one line with the string &quot;<code>yes</code>&quot; if it is possible to achieve the desired combination of chocolate temperature and flow, and &quot;<code>no</code>&quot; otherwise.</p>