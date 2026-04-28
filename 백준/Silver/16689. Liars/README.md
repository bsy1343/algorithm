# [Silver IV] Liars - 16689

[문제 링크](https://www.acmicpc.net/problem/16689)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB (추가 메모리 없음)

### 통계

제출: 143, 정답: 113, 맞힌 사람: 105, 정답 비율: 82.031%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>There are n people in a circle, numbered from 1 to n, each of whom always tells the truth or always lies.</p>

<p>Each person i makes a claim of the form: &ldquo;the number of truth-tellers in this circle is between a<sub>i&nbsp;</sub>and b<sub>i</sub>, inclusive.&rdquo;</p>

<p>Compute the maximum number of people who could be telling the truth.</p>

### 입력

<p>The first line contains a single integer n (1 &le; n &le; 10<sup>3</sup>). Each of the next n lines contains two space-separated integers a<sub>i</sub> and b<sub>i</sub> (0 &le; a<sub>i</sub> &le; b<sub>i</sub> &le; n).</p>

### 출력

<p>Print, on a single line, the maximum number of people who could be telling the truth. If the given set of statements is inconsistent, print -1 instead.</p>