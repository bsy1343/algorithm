# [Platinum III] Travelling Taro Trains - 35176

[문제 링크](https://www.acmicpc.net/problem/35176)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

그래프 이론, 그래프 탐색, 자료 구조, 집합과 맵

### 문제 설명

<p>Taro is travelling within a country, which consists of $N$ cities numbered from $1$ to $N$. There are also $K$ train companies, numbered from $1$ to $K$, that operate the trains within the nation. Initially, there are $M$ one-way train services, each of which can be described as a triple $(u, v, k)$, meaning that there are trains operated by company $k$ that goes from city $u$ to city $v$.</p>

<p>Taro is currently in city $1$. In the next $Q$ months, one of the following three events may happen.</p>

<ul>
<li><code>1 u v k</code>: company $k$ <strong>starts</strong> a new train service that goes from city $u$ to city $v$. In other words, add $(u, v, k)$ to the train network.</li>
<li><code>2 u v k</code>: company $k$ <strong>ends</strong> its train service that goes from city $u$ to city $v$. In other words, remove $(u, v, k)$ from the train network.</li>
<li><code>3 k</code>: Taro either <strong>stays</strong> in the city he is currently in, or <strong>takes</strong> one of the trains operated by company $k$ from the city he is currently in to another city.</li>
</ul>

<p>It is guaranteed to you that the existing services $(u, v, k)$ are always distinct throughout the course of events, and event $2$ always removes a currently existing service.</p>

<p>Every time an event $3$ happens, find the number of different cities Taro can possibly be in, given the course of events so far.</p>

### 입력

<p>The first line contains three integers $N$, $M$, $K$, and $Q$ ($2 \le N \le 300000$; $1 \le M, K, Q \le 300000$). Each of the next $M$ lines contains three integers $u$, $v$, $k$ ($1 \leq u, v \leq N$; $1 \leq k \leq K$; $u \neq v$) describing the initial train services.</p>

<p>Each of the next $Q$ lines contains an event as described above. The input guarantees that the existing services $(u, v, k)$ are always distinct throughout the event.</p>

### 출력

<p>For each event $3$, output, in a single line, the number of different cities Taro can possibly be in.</p>