# [Platinum II] Izhevsk Training Camp - 19453

[문제 링크](https://www.acmicpc.net/problem/19453)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 30, 정답: 9, 맞힌 사람: 7, 정답 비율: 36.842%

### 분류

(분류 없음)

### 문제 설명

<p>Izhevsk Training Camp is about to begin! This season $n$ teams numbered with consecutive integers from $1$ to $n$ will take part in this event. Nine sophisticated contests will be offered to participating teams in eleven days period. Contest are numbered with consecutive integers from $1$ to $9$. Three of these contests will form the Udmurtia Head Super Cup (UHSC). The question is: what three contests to choose for UHSC?</p>

<p>Oleg is helping to hold the Izhevsk Training Camp. For any contest he knows in advance what place each of the $n$ teams will take in this contest. He wants to use his knowledge to select three contests in order to minimize the total <em>boredom</em> of UHSC.</p>

<p>The <em>boredom</em> of UHSC can be computed as number of pairs of teams {$i$, $j$} such that team $i$ won team $j$ in each of three UHSC contests.</p>

<p>You are to write a program that will help Oleg to find three contests $a$, $b$ and $c$ for UHSC such that the total <em>boredom</em> of UHSC is minimum possible.</p>

### 입력

<p>The first line of input contains an integer $n$ --- the number of participating teams &nbsp;($2 \leq n \leq 2^{16}$).</p>

<p>The $i$-th of the following nine lines contains the $i$-th contest description: $n$ unique positive integers from $1$ to $n$ --- team numbers ordered from the first place to the last.</p>

### 출력

<p>The only line of output should contain three positive integers $a$, $b$ and $c$ --- numbers of contests to choose for UHSC ($1 \leq a, b, c \leq 9$, $a \neq b, a \neq c, b \neq c$).</p>

<p>If there are multiple correct answers --- output any of them.</p>

### 힌트

<p>For the sample test case the minimum possible value of <em>boredom</em> is $5$.</p>