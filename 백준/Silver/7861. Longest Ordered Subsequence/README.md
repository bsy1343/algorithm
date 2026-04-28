# [Silver II] Longest Ordered Subsequence - 7861

[문제 링크](https://www.acmicpc.net/problem/7861)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 208, 정답: 103, 맞힌 사람: 83, 정답 비율: 52.532%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>A numeric sequence of a<sub>i</sub>&nbsp;is ordered if a<sub>1</sub> &le; a<sub>2</sub> &le; &hellip; &le; a<sub>N</sub>. Let the subsequence of the given numeric sequence (a<sub>1</sub>, a<sub>2</sub>, &hellip;, a<sub>N</sub>) be any sequence (a<sub>i<sub>1</sub></sub>, a<sub>i<sub>2</sub></sub>, &hellip;, a<sub>i<sub>K</sub></sub>), where 1 &le; i<sub>1</sub> &lt; i<sub>2</sub>&nbsp;&lt; &hellip; &lt; i<sub>K</sub> &le; N. For example, the sequence (1, 7, 3, 5, 9, 4, 8) has ordered subsequences, e. g., (1, 7), (3, 4, 8) and many others. All longest ordered subsequences of this sequence are of length 4, e. g., (1, 3, 5, 8).</p>

<p>Your program, when given the numeric sequence, must find the length of its longest ordered subsequence.</p>

### 입력

<p>The first line of input file contains the length of sequence N (1 &le; N &le; 1000). The second line contains the elements of sequence &mdash; N integers in the range from 0 to 10000 each, separated by spaces.</p>

### 출력

<p>Output file must contain a single integer &mdash; the length of the longest ordered subsequence of the given sequence.</p>