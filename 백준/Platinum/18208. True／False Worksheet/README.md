# [Platinum III] True/False Worksheet - 18208

[문제 링크](https://www.acmicpc.net/problem/18208)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 66, 정답: 28, 맞힌 사람: 23, 정답 비율: 44.231%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Bob is completing a true/false worksheet, consisting of a list of n problems where each answer is either &ldquo;true&rdquo; or &ldquo;false&rdquo;. The problems are numbered from 1 to n. They are too hard for Bob, so the TA, Alice, has given Bob m hints. For each hint i, Alice gives Bob an (inclusive) range of questions [l<sub>i</sub>, r<sub>i</sub>], and tells him either &ldquo;all answers in the range are the same&rdquo; (in other words, either all are &ldquo;true&rdquo;, or all are &ldquo;false&rdquo;); or &ldquo;not all of the answers in the range are the same.&rdquo; Help Bob count how many different answer sequences satisfy the given hints. Since this number may be huge, print the answer modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>The first line of the input contains two space-separated integers n and m (1 &le; n &le; 5 000, 1 &le; m &le; 1 000 000), the number of problems and number of hints, respectively. The next m lines each encode a hint, and contain two space-separated integers l<sub>i</sub> and r<sub>i</sub> (1 &le; l<sub>i</sub> &le; r<sub>i</sub> &le; n) followed by either the word same, if all answers in the range are the same, or different, if all answers in the range are not the same (i.e., at least one answer is &ldquo;true&rdquo; and at least one other answer is &ldquo;false&rdquo;).</p>

### 출력

<p>Print the number of different answer sequences satisfying all the hints, modulo 10<sup>9</sup> + 7.</p>

### 힌트

<p>In the first sample, the four possible sequences consistent with the hints are 00000, 10000, 01111, and 11111 where 0 stands for a &ldquo;false&rdquo; answer and 1 stands for a &ldquo;true&rdquo; answer. In the second sample, the third hint conflicts with the first two hints, so no answer sequence exists consistent with all hints.</p>