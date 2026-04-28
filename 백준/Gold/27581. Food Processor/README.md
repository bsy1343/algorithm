# [Gold III] Food Processor - 27581

[문제 링크](https://www.acmicpc.net/problem/27581)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 22, 맞힌 사람: 20, 정답 비율: 30.769%

### 분류

수학, 그리디 알고리즘, 정렬

### 문제 설명

<p>You have a food processor with a variety of blades that can be attached to it, as well as some food you would like to process into smaller pieces.</p>

<p>The food processor can have one blade attached at any time. Each blade processes food by reducing its average piece size at a particular exponential rate, but it also has a maximum average piece size requirement; if the average piece size of the food is too big for the blade, the food processor will get stuck. Given a starting average food piece size, a target average piece size, and a set of blades for your food processor, determine the minimum amount of processing time needed to process your food into the target average piece size. </p>

<p>Note that we only care about the time spent actively processing food; we do not track time spent switching out blades or loading/unloading the food processor.</p>

### 입력

<p>The first line of input contains three integers $s$, $t$, and $n$ ($1 \le t &lt; s \le 10^6, 1 \le n \le 10^5$), where $s$ is the starting average piece size, $t$ is the target average piece size, and $n$ is the number of blades.</p>

<p>Each of the next $n$ lines contains two integers $m$ and $h$ ($1 \le m, h \le 10^6$). These are the blades, where $m$ is the maximum average piece size of the blade and $h$ is the number of seconds the blade needs to halve the average piece size.</p>

### 출력

<p>Output a single number, which is the minimum amount of time in seconds needed to process the food to the target average piece size. If it is not possible to reach the target, output $-1$. Your answer should have a <em>relative</em> error of at most $10^{-5}$.</p>