# [Gold V] RSA Mistake - 24758

[문제 링크](https://www.acmicpc.net/problem/24758)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 154, 정답: 69, 맞힌 사람: 56, 정답 비율: 47.863%

### 분류

수학, 자료 구조, 정수론, 집합과 맵, 해시를 사용한 집합과 맵, 소수 판정

### 문제 설명

<p>An <em>RSA</em> number is a positive integer $n$ that is the product of two distinct primes. For example, $10 = 2 \cdot 5$ and $77 = 7 \cdot 11$ are RSA numbers whereas $7 = 7, 9 = 3 \cdot 3$, and $105 = 3 \cdot 5 \cdot 7$ are not.</p>

<p>You are teaching a course that covers RSA cryptography. For one assignment problem, you asked students to generate RSA numbers. They were to submit two positive integers $A, B$. Ideally, these would be distinct prime numbers. But some students submitted incorrect solutions. If they were not distinct primes, partial credit can be earned if $A \cdot B$ is not an integer multiple of $k^2$ for any integer $k \geq 2$. If there is an integer $k \geq 2$ such that $k^2$ divides $A \cdot B$, then the student receives no credit.</p>

<p>For a pair of positive integers submitted by a student for the assignment, determine if they should receive full credit, partial credit, or no credit for this submission.</p>

<p><strong>Note</strong>: In the sixth sample case below, the number $545\,528\,636\,581 \cdot 876\,571\,629\,707$ is divisible by $1\,000\,003^2$ and in the seventh sample case below, the number $431\,348\,146\,441 \cdot 3$ is divisible by $656\,771^2$.</p>

### 입력

<p>The input consists of a single line containing two integers $A$ ($2 \leq A \leq 10^{12}$) and $B$ ($2 \leq B \leq 10^{12}$), which are the two submitted numbers.</p>

### 출력

<p>Display if the student should receive <code>full credit</code>, <code>partial credit</code>, or <code>no credit</code> for the submitted numbers.</p>