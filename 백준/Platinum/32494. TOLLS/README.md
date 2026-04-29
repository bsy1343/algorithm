# [Platinum V] TOLLS - 32494

[문제 링크](https://www.acmicpc.net/problem/32494)

### 성능 요약

시간 제한: 0.25 초, 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 25, 맞힌 사람: 22, 정답 비율: 48.889%

### 분류

값 / 좌표 압축, 누적 합, 분리 집합, 이분 탐색, 자료 구조, 정렬

### 문제 설명

<p>In the country named Ivo, there are $N$ cities connected by $N-1$ bidirectional highways and you can get from any city to any other city using the highways. Each highway connects two different cities $u_i$ and $v_i$ and it has a toll tax $w_i$, $1 \leq i \leq N-1$. We will call "trip" a simple path (not containing duplicate cities) along the highways between two different cities $u$ and $v$. The costs for the trips in the country Ivo have been reduced and instead of paying the sum of the tolls along the trip, only one toll is paid, which is a maximal toll for a highway along the trip.</p>

<p>Ivaylo is responsible for the profits in the country. The government asked Ivaylo $Q$ questions for the sum of the costs of all the trips with costs in the interval $[l_j, r_j]$, $1 \leq j \leq Q$. It is guaranteed that the first question is for the sum of the costs of the trips between every two different cities, i.e. $l_1=1$ and $r_1=max_{1 \leq i \leq N-1}\{w_i\}$. Ivaylo cannot handle this task, calculating by hand, and because he cannot work with computers he requires that you write a program <strong><code>tolls</code></strong>, which calculates the answers to the questions.</p>

### 입력

<p>The first line of the standard input contains two positive integers $N$ and $Q$ -- the number of cities in the country Ivo and the number of questions given to Ivaylo. Each of the next $N-1$ lines contains three positive integers $u_i, v_i, w_i$, which describe a highway between the cities $u_i$ and $v_i$ with toll $w_i$. Each of the rest $Q$ lines contains two positive integers $l_j, r_j$, which describe the questions given to Ivaylo.</p>

### 출력

<p>For each question, in input order, output on a separate line the sum of the costs of the trips that are in the interval $[l_j, r_j]$.</p>

### 제한

<ul>
	<li>$1 \leq N, Q \leq 10^5$</li>
	<li>$1 \leq u_i, v_i \leq N-1$</li>
	<li>$1 \leq w_i \leq 10^9$</li>
	<li>$1 \leq l_j \leq r_j \leq 10^9$</li>
</ul>

### 힌트

<p>Illustration of the cities and the highways:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32494.%E2%80%85TOLLS/eef8b6be.png" data-original-src="https://boja.mercury.kr/assets/problem/32494-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 204px;"></p>

<ul>
	<li>The count of the trips with cost $1$ is $3$: $1-2,1-4,2-4$.</li>
	<li>The count of the trips with cost $2$ is $4$: $1-5,2-5,3-6,4-5$.</li>
	<li>The count of the trips with cost $3$ is $8$: $1-3,1-6,2-3,2-6,3-4,3-5,4-6,5-6$.</li>
	<li>The count of the trips with cost $4$ is $6$: $1-7,2-7,3-7,4-7,5-7,6-7$.</li>
	<li>The count of the trips with cost $5$ is $0$.</li>
	<li>The answer to the first question is: $3 \times 1+4 \times 2+8 \times 3+6 \times 4=59$.</li>
	<li>The answer to the second question is: $4 \times 2+8 \times 3=32$.</li>
	<li>The answer to the third question is: $4 \times 2+8 \times 3+6 \times 4=56$.</li>
	<li>The answer to the fourth question is: $3 \times 1+4 \times 2+8 \times 3=35$.</li>
	<li>The answer to the fifth question is: $4 \times 2+8 \times 3+6 \times 4+0 \times 5=56$.</li>
</ul>