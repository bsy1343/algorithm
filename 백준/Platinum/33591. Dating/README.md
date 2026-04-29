# [Platinum III] Dating - 33591

[문제 링크](https://www.acmicpc.net/problem/33591)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 47, 정답: 19, 맞힌 사람: 13, 정답 비율: 43.333%

### 분류

정렬, 트리

### 문제 설명

<p>You are the developer of a dating app which ignores gender completely. The app has $n$ users, indexed from $1$ to $n$. Each user’s profile features a list of the activities they enjoy doing. There are $m$ possible activities, indexed from $1$ to $m$.</p>

<p>A match between two users is good if they share at least one activity and, at the same time, both of them like at least one activity that the other user does not like.</p>

<p>Find a good match if it exists.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($2 ≤ n ≤ 200\, 000$, $1 ≤ m ≤ 10^6$) — the number of users and the number of activities.</p>

<p>Each of the following $n$ lines contains a number $k_i$ ($0 ≤ k_i ≤ m$) — the number of activities that user $i$ likes — followed by $k_i$ distinct integers from $1$ to $m$ — the activities user $i$ likes.</p>

<p>It is guaranteed that $k_1 + k_2 + \cdots + k_n$ does not exceed $10^6$.</p>

### 출력

<p>Print <code>YES</code> if a good match exists. Otherwise, print <code>NO</code>.</p>

<p>If a good match exists, on the next line print two integers — the indexes of two users that make a match.</p>