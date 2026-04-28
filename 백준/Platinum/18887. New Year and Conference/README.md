# [Platinum II] New Year and Conference - 18887

[문제 링크](https://www.acmicpc.net/problem/18887)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 57, 정답: 38, 맞힌 사람: 37, 정답 비율: 75.510%

### 분류

자료 구조, 정렬, 세그먼트 트리, 스위핑, 트리를 사용한 집합과 맵

### 문제 설명

<p>Filled with optimism, Hyunuk will host a conference about how great this new year will be!</p>

<p>The conference will have $n$ lectures. Hyunuk has two candidate venues $a$ and $b$. For each of the $n$ lectures, the speaker specified two time intervals $[sa_i, ea_i]$ ($sa_i \le ea_i$) and $[sb_i, eb_i]$ ($sb_i \le eb_i$). If the conference is situated in venue $a$, the lecture will be held from $sa_i$ to $ea_i$, and if the conference is situated in venue $b$, the lecture will be held from $sb_i$ to $eb_i$. Hyunuk will choose one of these venues and <strong>all</strong> lectures will be held at that venue.</p>

<p>Two lectures are said to overlap if they share any point in time in common. Formally, a lecture held in interval $[x, y]$ overlaps with a lecture held in interval $[u, v]$ if and only if $\max(x, u) \le \min(y, v)$.</p>

<p>We say that a participant can <em>attend</em>&nbsp;a subset $s$ of the lectures if the lectures in $s$ do not pairwise overlap (i.e. no two lectures overlap). Note that the possibility of attending may depend on whether Hyunuk selected venue $a$ or venue $b$ to hold the conference.</p>

<p>A subset of lectures $s$ is said to be <em>venue-sensitive</em>&nbsp;if, for one of the venues, the participant can attend $s$, but for the other venue, the participant cannot attend $s$.</p>

<p>A venue-sensitive set is problematic for a participant who is interested in attending the lectures in $s$ because the participant cannot be sure whether the lecture times will overlap. Hyunuk will be happy if and only if there are no venue-sensitive sets. Determine whether Hyunuk will be happy.</p>

### 입력

<p>The first line contains an integer $n$ ($1 \le n \le 100\,000$), the number of lectures held in the conference.</p>

<p>Each of the next $n$ lines contains four integers $sa_i$, $ea_i$, $sb_i$, $eb_i$ ($1 \le sa_i, ea_i, sb_i, eb_i \le 10^9$, $sa_i \le ea_i, sb_i \le eb_i$).</p>

### 출력

<p>Print &quot;<code>YES</code>&quot; if Hyunuk will be happy. Print &quot;<code>NO</code>&quot; otherwise.</p>

### 힌트

<p>In second example, lecture set $\{1, 3\}$ is venue-sensitive. Because participant can&#39;t attend this lectures in venue $a$, but can attend in venue $b$.</p>

<p>In first and third example, venue-sensitive set does not exist.</p>