# [Silver V] Daniel's Debugging Disaster - 34385

[문제 링크](https://www.acmicpc.net/problem/34385)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 27, 정답: 26, 맞힌 사람: 23, 정답 비율: 95.833%

### 분류

사칙연산, 수학, 확률론

### 문제 설명

<p>Daniel is a software engineer and is working at a company that makes payment processing software. Because lots of money is being transacted through the software, it must be highly reliable.</p>

<p>In order for the software to function properly, it must successfully make $N$ requests in a row. Each request opens a new connection via a random port. If any of the requests fail, then the money will be lost! Unfortunately for Daniel, some requests are failing.</p>

<p>As he debugs the program, and realizes that he misconfigured his firewall and blocked $K\%$ of the ports on the computer that the software is running on. This means that there is a $K\%$ chance that any given request will be blocked by the firewall, and thus fail. Note that because the port used by each request is random, each request is independent, meaning that every request has a $K\%$ chance of failing, regardless of the outcome of other requests.</p>

<p>However, instead of fixing the firewall, Daniel decides to just retry the $N$ requests if one or more of them fails.</p>

<p>He adds a loop to the program that will attempt the $N$ requests until either all of them succeed, or $R$ attempts have been made. That is, if on any of the $R$ attempts, all $N$ requests succeed, then the program is successful, and no more attempts are made. If the program is successful, then the customer is happy because the program did not lose their money.</p>

<p>Given $K$, $N$, and $R$, can you calculate the probability that the program will succeed?</p>

### 입력

<p>There will be three lines of input.</p>

<p>The first line contains the real number $0 \leq K \leq 1$ representing the probability that a request will be blocked by the firewall. Each number contains at most one digit after the decimal point.</p>

<p>The second line contains the integer $1 \leq N \leq 20$ representing the number of requests that must succeed in a row for the program to be considered "successful."</p>

<p>The third line contains the integer $1 \leq R \leq 20$ representing the number of times that the program will attempt the $N$ requests.</p>

### 출력

<p>Output a real number representing the probability that the program will succeed. (Anything within $0.00001$ of the correct probability will be accepted.)</p>