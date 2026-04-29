# [Silver III] Calendar of an Enthusiastic Worker - 35099

[문제 링크](https://www.acmicpc.net/problem/35099)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 25, 정답: 19, 맞힌 사람: 18, 정답 비율: 78.261%

### 분류

구현

### 문제 설명

<p>You are an enthusiastic worker. You want to know how many days you can work during the next specified number of days.</p>

<p>Saturdays and Sundays are non-working days. In addition, a number of national holidays and some company-specific days are non-working days. You cannot work on non-working days. Such non-working days may overlap: The founding anniversary of the company may coincide with a national holiday. Even when such non-working days coincide, there is no system to grant additional non-working days.</p>

<p>Today is Monday. Your task is to count the number of days you can work within a specified period starting from today.</p>

### 입력

<p>The input consists of at most $100$ test cases. Each test case is given in the following format.</p>

<blockquote>
<p>$n$ $m$</p>

<p>$a_1$ $\cdots$ $a_n$</p>
</blockquote>

<p>The first line contains the number of additional non-working days $n$, and the number of days of the specified period $m$ ($1 ≤ n ≤ 300$, $1 ≤ m ≤ 10^{18}$). The second line contains $n$ integers, $a_1, \dots , a_n$ ($1 ≤ a_i ≤ 10^{18}$). With today being the first day, the $a_i$-th day for $i = 1, \dots , n$ is a non-working day. The list $a_1, \dots , a_n$ may contain duplicates.</p>

<p>The end of the input is indicated by a line consisting of two zeros.</p>

### 출력

<p>For each test case, output in a line the number of days you can work during $m$ days starting from today.</p>