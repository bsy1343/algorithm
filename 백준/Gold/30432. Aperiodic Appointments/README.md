# [Gold II] Aperiodic Appointments - 30432

[문제 링크](https://www.acmicpc.net/problem/30432)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 65, 정답: 28, 맞힌 사람: 24, 정답 비율: 50.000%

### 분류

수학, 재귀

### 문제 설명

<p>Nick has always struggled with maintaining habits. The problem is that he just can&#39;t stop maintaining them. If Nick does something $K$ times in a row, he has to keep doing it forever.</p>

<p>Luckily, he has started visiting Dr Patternson, an expert in PBT (Pattern Breaking Therapy). The principle of PBT is simple: Nick will visit Dr Patternson every day, and if he has done the same thing $K$ times in a row on a specific visit, the doctor will charge him money. This will motivate Nick to not continue this habit.</p>

<p>PBT has worked out great for Nick, as he has now successfully quit all his habits. Except for one, the habit of visiting Dr Patternson. The frequent visits are starting to take a toll on Nick&#39;s economy, so your task is to calculate how many times he has to pay the doctor for the next $N$ days.</p>

<p>Formally, let $s = s_1s_2s_3\dots s_N$ be a string consisting of zeroes and ones. A one means that Nick has to pay the doctor on the $i$th day. This string is generated one character at a time, in the following way:</p>

<ol>
	<li>$s_i = 0$ if $i \leq K$.</li>
	<li>If $i &gt; K$, then $s_i = 1$ if the previous characters contains a pattern that repeats $K$ times. More specifically, let $s&#39; = s_1s_2\dots s_{i-1}$. If there is a nonempty string $t$ such that the last $|t|\cdot K$ characters of $s&#39;$ can be written as $t+t+\dots + t$, then $s_i = 1$. Otherwise $s_i = 0$.</li>
</ol>

<p>You are given the numbers $N$ and $K$, and your task is to calculate the number of ones in the string $s$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6bdc72dc-8be7-4f18-a7f7-fedba7cfaf46/-/preview/" style="width: 271px; height: 100px;" /></p>

<p style="text-align: center;">The picture represents Sample 1. An angry face means that Nick had to pay on the corresponding day.</p>

### 입력

<p>The input consists of one line with the integers $N$ and $K$ ($1 \leq N \leq 10^9$, $2 \leq K \leq 10^9$).</p>

### 출력

<p>Print one integer, the number of ones in the string $s$.</p>