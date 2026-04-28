# [Platinum IV] Matching Palindrome - 26426

[문제 링크](https://www.acmicpc.net/problem/26426)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 19, 맞힌 사람: 16, 정답 비율: 88.889%

### 분류

문자열, KMP, 매내처

### 문제 설명

<p>You are given a <a href="https://en.wikipedia.org/wiki/Palindrome" target="_blank">palindrome</a> string $\mathbf{P}$ of length $\mathbf{N}$ consisting of only lowercase letters of the English alphabet. Find the shortest non-empty palindrome string $Q$ such that $\mathbf{P}$ concatenated with $Q$ forms a palindrome. Formally, the string $\mathbf{P}Q$ forms a palindrome.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. Each test case consists of two lines. The first line of each test case contains an integer $\mathbf{N}$ denoting the length of the string $\mathbf{P}$. The second line of each test case contains a palindrome string $\mathbf{P}$ of length $\mathbf{N}$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the non-empty palindrome string $Q$ as described above.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>String $\mathbf{P}$ is a palindrome consisting of only lowercase letters of the English alphabet.</li>
</ul>