# [Silver V] H-Index - 22282

[문제 링크](https://www.acmicpc.net/problem/22282)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 420, 정답: 210, 맞힌 사람: 175, 정답 비율: 50.578%

### 분류

브루트포스 알고리즘, 정렬

### 문제 설명

<p>In research, it is tough to determine how good of a researcher you are. One way that people determine how good you are is by looking at your <em>$H$-Index</em>.</p>

<p>Each paper has a certain number of citations. Your $H$-Index is the largest number $H$ such that you have $H$ papers with at least $H$ citations. Given the number of citations on each paper you have written, what is your $H$-Index?</p>

### 입력

<p>The first line of input contains a single integer $n$ ($1 \leq n \leq 100\,000$), which is the number of papers you have written.</p>

<p>The next $n$ lines describe the papers. Each of these lines contains a single integer $c$ ($0 \leq c \leq 1\,000\,000\,000$), which is the number of citations that this paper has.</p>

### 출력

<p>Display your $H$-Index.</p>