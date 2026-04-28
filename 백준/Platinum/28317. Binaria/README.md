# [Platinum IV] Binaria - 28317

[문제 링크](https://www.acmicpc.net/problem/28317)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 101, 정답: 44, 맞힌 사람: 40, 정답 비율: 60.606%

### 분류

수학, 애드 혹, 정수론, 조합론, 모듈로 곱셈 역원

### 문제 설명

<p>You have been hired by the Cheap Communication Organization (CCO) to work on a communication breakthrough: sub-message sum (SMS). This revolutionary idea works as follows.</p>

<p>Given a binary string of length $N$, and some positive integer $K$ with $K \le N$, the SMS for the string consists of a sequence of $N - K + 1$ sums. The first sum in the sequence is the sum of digits $1$ through $K$, the second sum is the sum of digits $2$ through $K + 1$, and so on until the last sum which is the sum of digits $N - K + 1$ through $N$.</p>

<p>For example, if $K = 4$, the SMS of the binary string <code>110010</code> is $2,2,1$. This is because $1 + 1 + 0 + 0 = 2, 1 + 0 + 0 + 1 = 2,$ and $0 + 0 + 1 + 0 = 1$.</p>

<p>Since you are a very junior developer, your job is not to find the original binary string from a given SMS, but rather the number of binary strings that could have formed this SMS.</p>

### 입력

<p>The first line of input contains the two space-separated integers $N$ and $K$ where $1 \le K \le N$. The second line of input contains $N - K + 1$ space-separated integers which is the SMS of at least one binary string.</p>

### 출력

<p>Output the remainder of $T$ divided by the prime number $10^{6} + 3$ where $T$ is the positive integer equal to the total number of possible binary strings that correspond to the given SMS.</p>

### 제한

<ul>
	<li>$1 \le N \le 10^6$</li>
</ul>