# [Gold I] Shortcut - 17023

[문제 링크](https://www.acmicpc.net/problem/17023)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 508, 정답: 205, 맞힌 사람: 160, 정답 비율: 38.095%

### 분류

다이나믹 프로그래밍, 그래프 이론, 트리, 최단 경로, 데이크스트라, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Every evening, Farmer John rings a giant bell that summons his cows to the barn for dinner. Eager to get to the barn as quickly as possible, they all follow the shortest possible route to get there.</p>

<p>The farm is described by a set of $N$ fields ($1 \leq N \leq 10,000$), conveniently numbered $1 \ldots N$, with the barn residing in field 1. The fields are connected by a set of $M$ bidirectional trails ($N-1 \leq M \leq 50,000$). Each trail has a travel time associated with it, and there is a path from every field to the barn using some set of trails.</p>

<p>Field $i$ contains $c_i$ cows. Upon hearing the dinner bell, these cows all walk to the barn along a route that takes the minimum amount of time. If there are several routes tied for the minimum time, the cows take whichever of these is &quot;lexicographically&quot; smallest (i.e., they break ties between two routes by favoring the one using the lower-indexed field at the first place where the routes differ, so for example a path that visits fields 7, 3, 6, 1 would be preferable to one that visits 7, 5, 1, assuming both had the same travel time).</p>

<p>Farmer John is worried about the barn being far away from some fields. He adds up the travel time experienced by each cow, summed over all the cows, calling this number the total travel time. He would like to reduce this number as much as possible by adding one extra &quot;shortcut&quot; trail which has a travel time of $T$ ($1 \leq T \leq 10,000$), from the barn (field 1) to some other field of his choosing. If a cow stumbles upon the shortcut trail while traveling along her usual path to the barn, she will take it if it gets her to the barn faster. Otherwise, a cow will follow her usual route, even if it might have been possible to use the shortcut to improve her travel time.</p>

<p>Please help Farmer John determine the greatest possible amount of decrease in total travel time he can achieve by adding his shortcut trail.</p>

### 입력

<p>The first line of input contains $N$, $M$, and $T$. The next line contains $N$ integers $c_1 \ldots c_N$, each in the range $0 \ldots 10,000$. The next $M$ lines each describe a trail using three integers $a$, $b$, and $t$, where the trail connects fields $a$ and $b$ and has travel time $t$. All travel times are in the range $1 \ldots 25,000$.</p>

### 출력

<p>Please output the largest possible reduction in total travel time Farmer John can achieve.</p>