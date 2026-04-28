# [Gold II] Measuring WAC-ness - 21111

[문제 링크](https://www.acmicpc.net/problem/21111)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 28, 맞힌 사람: 24, 정답 비율: 51.064%

### 분류

수학, 조합론

### 문제 설명

<p>Consider a string of length $N$. Let string $S$ be that string repeated $K$ times. You are interested in how wack the string is, so your task is to find the WAC-ness of this string.</p>

<p>The WAC-ness of a string is the number of times &quot;<code>WAC</code>&quot; appears as a subsequence of that string.</p>

<p>A subsequence of a string is a string that can be derived from the given sequence by deleting zero or more characters without changing the order of the remaining characters. Two subsequences are different if at least one of the remaining indices are different. For example, in the string &quot;<code>AABC</code>&quot;, the subsequence formed by indices $1$, $3$, and $4$ is distinct from the subsequence formed by indices $2$, $3$, and $4$.</p>

<p>As the answer can be very large, please output the answer modulo $998\,244\,353$.</p>

### 입력

<p>The first line will contain two integers, $N$ and $K$ ($1 \le N \le 200\,000$, $1 \le K \le 200\,000$), the length of the original string and the number of times that string is repeated to form $S$. The second and final line will contain the original string of $N$ characters, consisting of uppercase letters of the English alphabet.</p>

### 출력

<p>Output the WAC-ness of the string $S$ modulo $998\,244\,353$.</p>