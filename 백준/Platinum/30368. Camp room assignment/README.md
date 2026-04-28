# [Platinum I] Camp room assignment - 30368

[문제 링크](https://www.acmicpc.net/problem/30368)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 30, 맞힌 사람: 26, 정답 비율: 74.286%

### 분류

수학, 다이나믹 프로그래밍, 정수론, 조합론, 모듈로 곱셈 역원

### 문제 설명

<p>In the JAG country, there are a total of $m$ universities, and we plan to invite $2n$ students to a training camp. Each student is affiliated with one of the $m$ universities. During the training camp, the students will be accommodated in $n$ twin rooms, meaning that each room will be assigned to exactly two students.</p>

<p>To promote diverse interactions among the students, our goal is to achieve a &quot;good room assignment&quot;. A room assignment is considered good if and only if the students sharing the same room come from different universities.</p>

<p>Here, we are wondering how often a good room assignment is feasible. There are $m^{2n}$ possible sequences of universities to which each student belongs, and please find for how many of them there is a good room assignment.</p>

<p>Actually, we don&#39;t yet know how many rooms we can provide. Therefore, for each of $n = 1, 2, \dots , m$, please find for how many of the sequences of universities there is a good room assignment.</p>

<p>Since the answer may be huge, print the answers modulo $998\,244\,353$.</p>

### 입력

<p>The input is a single line containing an integer $m$ between $1$ and $200\,000$, inclusive.</p>

### 출력

<p>Output $m$ lines. In the $i$-th line, you should output the answer for $n = i$.</p>