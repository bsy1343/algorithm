# [Platinum I] Inspections - 28496

[문제 링크](https://www.acmicpc.net/problem/28496)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 193, 정답: 20, 맞힌 사람: 18, 정답 비율: 27.692%

### 분류

많은 조건 분기, 자료 구조, 구현, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Benson the Rabbit now has to build a plane!</p>

<p>Benson the Rabbit has a factory with $n$ machines numbered from $1$ to $n$. Each machine runs for one day and only one machine can run at a time. He has $m$ tasks to complete, numbered from $1$ to $m$. Each task $i$ is represented by two positive integers $l[i]$ and $r[i]$ where $l[i] &le; r[i]$.</p>

<p>To complete task $i$, Benson needs to run machines $l[i], l[i] + 1, \dots , r[i]$ in that order. Once a machine has finished running, the next machine starts immediately. Once task $i$ is complete, Benson immediately starts task $i + 1$ until task $m$ is complete.</p>

<p>In order to comply with safety regulations, the factory must have an safety value $s$. If a machine with safety value $s$ was not run in the past $s$ or more days, this machine needs to be inspected before it can be run. Machines do not need to be inspected the first time they are run. See the samples for more details.</p>

<p>Benson has $q$ different candidate safety values $s[1], s[2], \dots , s[q]$. For each safety value $s[j]$, help him compute the number of inspections that need to be done if the safety value is $s[j]$.</p>

### 입력

<p>The first line of input will contain $3$ spaced integers $n$, $m$ and $q$, representing the number of machines, tasks and safety values respectively.</p>

<p>The next $m$ lines of input will contain $2$ spaced integers each. The $i$-th of these lines will contain $l[i]$ and $r[i]$ respectively, describing task $i$.</p>

<p>The next line of input will contain $q$ spaced integers $s[1], s[2], \dots , s[q]$, which represent the $q$ safety values to be tested.</p>

### 출력

<p>Output one line with $q$ spaced integers, the $j$-th integer representing the number of inspections that need to be done if the safety value is $s[j]$.</p>

### 제한

<ul>
	<li>$1 &le; n, m, q &le; 200\,000$</li>
	<li>$1 &le; l[i] &le; r[i] &le; n$</li>
	<li>$0 &le; s[j] &le; 10^{12}$</li>
</ul>