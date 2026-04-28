# [Gold IV] Prime Distance - 4416

[문제 링크](https://www.acmicpc.net/problem/4416)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 135, 정답: 35, 맞힌 사람: 27, 정답 비율: 32.143%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>The branch of mathematics called number theory is about properties of numbers. One of the areas that has captured the interest of number theoreticians for thousands of years is the question of primality. A prime number is a number that is has no proper factors (it is only evenly divisible by 1 and itself). The first prime numbers are 2,3,5,7 but they quickly become less frequent. One of the interesting questions is how dense they are in various ranges. Adjacent primes are two numbers that are both primes, but there are no other prime numbers between the adjacent primes. For example, 2,3 are the only adjacent primes that are also adjacent numbers.</p>

<p>Your program is given 2 numbers: L and U (1&lt;=L&lt;U&lt;=2,147,483,647), and you are to find the two adjacent primes C1 and C2 (L&lt;=C1&lt;C2&lt;=U) that are closest (i.e. C2-C1 is the minimum). If there are other pairs that are the same distance apart, use the first pair. You are also to find the two adjacent primes D1 and D2 (L&lt;=D1&lt;D2&lt;=U) where D1 and D2 are as distant from each other as possible (again choosing the first pair if there is a tie).</p>

### 입력

<p>Each line of input will contain two positive integers, L and U, with L &lt; U. The difference between L and U will not exceed 1,000,000.</p>

### 출력

<p>For each L and U, the output will either be the statement that there are no adjacent primes (because there are less than two primes between the two given numbers) or a line giving the two pairs of adjacent primes.</p>