# [Gold IV] Investigating Imposters - 21590

[문제 링크](https://www.acmicpc.net/problem/21590)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 42, 맞힌 사람: 40, 정답 비율: 65.574%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>You have stumbled upon a village. In this village, some of the people are &ldquo;imposters&rdquo;, while the rest are not. Fortunately, you know that the number of possible imposters is limited!</p>

<p>You would like to determine who is not an imposter in this village. To do so, you ask each villager to submit a list of some villagers who are not imposters.</p>

<p>Non-imposters will only submit lists that contain other non-imposter names, while there is no such restriction for imposters. Imposters&rsquo; lists could contain imposters or non-imposters.</p>

<p>Given the lists of each villager, determine whether they could possibly be an imposter, or are definitely not an imposter.</p>

### 입력

<p>The first line of input contains two space-separated integers $n$ and $k$ ($1 \le k \le n \le 500$), where $n$ is the number of villagers and $k$ is the maximum possible number of imposters. The villagers are numbered from 1 to $n$.</p>

<p>Each of the next $n$ lines describes a villager, where the $i$<sup>th</sup> line represents the list of villager i. The $i$<sup>th</sup> line starts with an integer $s$ ($0 \le s \le n$), which is the number of people on villager $i$&rsquo;s list of non-imposters. Then there will follow s distinct integers denoting the villagers on villager $i$&rsquo;s list of non-imposters. It is possible for a villager to appear on their own list. All of the villagers on any given list will be distinct.</p>

### 출력

<p>Output $n$ lines, each with a single integer. The $i$<sup>th</sup> line should contain 0 if the villager represented by the $i$<sup>th</sup> list in the input could possibly be an imposter, and 1 if that villager is definitely not an imposter.</p>