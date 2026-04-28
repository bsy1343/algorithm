# [Silver III] German Conference for Public Counting - 28375

[문제 링크](https://www.acmicpc.net/problem/28375)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 118, 정답: 87, 맞힌 사람: 73, 정답 비율: 78.495%

### 분류

수학

### 문제 설명

<p>Greta loves counting. She practises it every day of the year. Depending on the season, she counts falling leaves, raindrops, snowflakes, or even growing leaves. However, there is one event in summer which tops everything else: the German Conference for Public Counting (GCPC).</p>

<p>At this event, Greta meets counting enthusiasts from all over the country for one week of counting and counting and counting... Together they participate in the Glamorous Competitive Public Counting and the Great Chaotic Public Counting. At the end of the week they all try to win the Golden Cup of Public Counting. Her favourite is the Gently Calming Public Counting where the crowd counts in silence, trying to harmoniously synchronise to reach the target number at precisely the same moment.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/fcc4bc58-212a-4702-a734-e468f8b22d9c/-/preview/" style="width: 599px; height: 150px;" /></p>

<p style="text-align: center;">Figure G.1: People holding up signs for the countdown.</p>

<p>To increase the tension and to prepare for the Gently Calming Public Counting, the organizers of GCPC plan to start with a silent countdown, where the people on the stage will at any time display the current number by holding up signs with its digits. On every sign, there is exactly one decimal digit. Numbers greater than $9$ are displayed by holding up several signs next to each other. Each number is shown using the least possible number of signs; there is no left padding with zeroes. This way, the people on the stage display numbers $n, n-1, n-2, \dots$ until they finally display $0$. Since the GCPC will take place soon, the organizers want to finish their preparations quickly. How many signs do they need to prepare at least so that they can display the entire countdown from $n$ to $0$?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1 \le n \le 10^9$), the starting number of the countdown.</li>
</ul>

### 출력

<p>Output the minimum number of signs required to display every number of the countdown.</p>

### 힌트

<p>In the first sample case, the organizers need one sign each with the digits $0$ to $5$, for a total of $6$ signs. In the second sample case, they need one sign with each digit other than $1$, and two signs with a $1$, for a total of $9+2=11$ signs.</p>