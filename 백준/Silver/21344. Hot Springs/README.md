# [Silver II] Hot Springs - 21344

[문제 링크](https://www.acmicpc.net/problem/21344)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 205, 정답: 158, 맞힌 사람: 140, 정답 비율: 78.212%

### 분류

그리디 알고리즘, 정렬, 해 구성하기

### 문제 설명

<p>Iceland is famous for its geothermal activity, which supplies the country with much of its electricity and heating. It is also a source of pleasure, in the form of hot springs.</p>

<p>Kalle is visiting one of Iceland&#39;s famous hot springs. It contains $n$ pools of water, where the $i$th one has temperature $t_i$. Although staying in one of the warmer pools for a long time sure is relaxing, Kalle is on a very tight schedule and just wants a quick dip in each of the pools. As you may know, the nicest thing about hot baths is the contrast between hot and cold. Therefore, to get the most out of his stay, Kalle wants to find an ordering of the pools so that the difference in temperature between subsequent pools is increasing.</p>

<p>Given a sequence of pool temperatures $t_1, t_2, \dots, t_n$, rearrange them into a new sequence $t&#39;_1, t&#39;_2, \dots, t&#39;_n$ such that for all $2 \leq i \leq n-1$ it holds that \[ |t&#39;_{i-1} - t&#39;_i| \leq |t&#39;_i - t&#39;_{i+1}|. \]</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($2 \le n \leq &nbsp;10^5$), the number of pools.</li>
	<li>One line with $n$ integers $t_1, \ldots, t_n$ ($-10^5 \leq t_i \leq 10^5$ for each $i$), the temperatures in each of the $n$ pools.</li>
</ul>

### 출력

<p>Output a rearrangement of the sequence satisfying the given requirement. If no solution exists, output &quot;<code>impossible</code>&quot;. If there are multiple valid solutions, you may output any one of them.</p>