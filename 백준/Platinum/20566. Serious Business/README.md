# [Platinum II] Serious Business - 20566

[문제 링크](https://www.acmicpc.net/problem/20566)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 8, 맞힌 사람: 7, 정답 비율: 53.846%

### 분류

구현, 다이나믹 프로그래밍, 자릿수를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>As the proprietor of a Serious Business, you deal with a lot of Serial Numbers. Each gadget, gizmo, and thingamajig you manufacture has a unique serial number. Each serial number is a sequence of decimal digits with no leading zeros.</p>

<p>You are extremely superstitious, however, and you only use <em>lucky</em> serial numbers on your products. A serial number is said to be lucky if it has an odd number of <em>scary</em> contiguous substrings. A contiguous substring is scary if the sum of its digits is even.</p>

<p>An auditor has asked how many gadgets, gizmos, and thingamajigs you manufactured last year, but you can&#39;t remember! All you know is that all the serial numbers you used were between $L$ and $R$ inclusive (when interpreted as decimal numbers), and that you used every lucky serial number in that range. How many such serial numbers are there? Since the answer may be very large, output its remainder modulo the prime $998\,244\,353$.</p>

### 입력

<p>There are two lines of input. The first contains $L$ and the second contains $R$, which are integers with no leading zeros. It is guaranteed that $1 \leq L \leq R &lt; 10^{100\,000}$.</p>

### 출력

<p>Output a single integer, the number of lucky serial numbers between $L$ and $R$, modulo $998\,244\,353$.</p>