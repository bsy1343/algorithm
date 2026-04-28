# [Silver IV] Transporting Spaghetti - 24750

[문제 링크](https://www.acmicpc.net/problem/24750)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 196, 정답: 74, 맞힌 사람: 61, 정답 비율: 35.260%

### 분류

수학, 브루트포스 알고리즘, 정수론

### 문제 설명

<p>The unique location of Venice in northeastern Italy poses a shipping problem in many cases due to the canals and whatnot. To transport large quantities of spaghetti from Milan to Venice, a company uses trucks capable of carrying A tons from Milan to Mestre, the city on the mainland closest to Venice, and boats capable of carrying B tons from Mestre to Venice. One day, the depot in Venice requests an arbitrary amount of spaghetti, but not less than C tons and the depot in Mestre requests exactly D tons. Write a program to determine the smallest number of trucks to be sent from Milan to satisfy both orders such that every truck and boat used for the transport is loaded to capacity.</p>

### 입력

<p>There is a single line of input containing the four integers, A, B, C and D. (0 &lt; A &le; 100), (0 &lt; B &le; 20), (0 &le; C &le; 100), (0 &le; D &le; 100).</p>

### 출력

<p>The single output line consists of the sentence: We need t trucks and b boats. Where t is the number of trucks required and b is the number of boats required. If t or b is 1, then you should not pluralize the words &ldquo;truck&rdquo; or &ldquo;boat&rdquo; respectively. If there is no solution that meets the criteria, output: No solution.</p>