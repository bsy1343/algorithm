# [Platinum II] Alchemy - 27565

[문제 링크](https://www.acmicpc.net/problem/27565)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 80, 정답: 21, 맞힌 사람: 18, 정답 비율: 38.298%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You just finished day one of your alchemy class! For your alchemy homework, you have been given a string of lowercase letters and wish to make it a palindrome. You&#39;re only a beginner at alchemy though, so your powers are limited. In a single operation, you may choose exactly two adjacent letters and change each of them into a different lowercase letter. The resulting characters may be the same as or different from one another, so long as they were both changed by the operation.</p>

<p>Formally, if the string before the operation is $s$ and you chose to change characters $s_i$ and $s_{i+1}$ to produce string $t$, then $s_i \neq t_i$ and $s_{i+1} \neq t_{i+1}$ must be true, but $t_i = t_{i+1}$ is permitted.</p>

<p>Compute the minimum number of operations needed to make the string a palindrome.</p>

### 입력

<p>The single line of input contains a string of $n$ $(2 \le n \le 100)$ lowercase letters, the string you are converting into a palindrome.</p>

### 출력

<p>Output a single integer, which is the minimum number of operations needed to make the string a palindrome.</p>