# [Gold II] Number Tricks - 7525

[문제 링크](https://www.acmicpc.net/problem/7525)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 31, 맞힌 사람: 25, 정답 비율: 40.323%

### 분류

수학, 정수론, 소수 판정, 소인수분해

### 문제 설명

<p>Dora loves impressing her friends with number tricks. One of her favorite tricks is to let them name a number n. Dora will then tell them, how many zeroes there are at the end of n!. Usually, Dora&rsquo;s friends are very impressed because n! is such a large number. For example, if n is 100, even though n! is bigger than the estimated number of atoms in the universe (not counting parallel universes, though), Dora can quickly tell that n! ends with exactly 24 zeroes.</p>

<p>However, some of Dora&rsquo;s newest friends are aliens with more or less than 10 fingers (or however you call the corresponding parts of their bodies). Like all life forms she has met so far, they count in a number system that has as many digits as they have fingers (even the centipedes from planet Millennium!). Dora wants to impress them as well, but she is not sure how to adapt her trick. Can you help her?</p>

<p>Given a base b and a number n, you should compute how many zeroes there are at the end of n! when written in base b. For example, consider b = 2 and n = 5. Since 5! = 120 = 1111000<sub>2</sub>, the answer is three.</p>

### 입력

<p>The first line contains the number of scenarios. For each scenario, the input will consist of one line containing the two numbers b (2 &le; b &le; 1 000) and n (1 &le; n &le; 1 000 000), both given in base ten.</p>

### 출력

<p>The output for every scenario begins with a line containing &ldquo;Scenario #i:&rdquo;, where i is the number of the scenario starting at 1. Then print a single line containing (in base ten) k, the number of zeroes at the end of n! when written in base b. Terminate each scenario with a blank line.</p>