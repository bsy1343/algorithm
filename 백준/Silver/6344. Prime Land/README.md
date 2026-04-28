# [Silver V] Prime Land - 6344

[문제 링크](https://www.acmicpc.net/problem/6344)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 51, 맞힌 사람: 38, 정답 비율: 86.364%

### 분류

수학, 정수론, 소수 판정, 소인수분해

### 문제 설명

<p>Everybody in the Prime Land is using a prime base number system. In this system, each positive integer $x$ is represented as follows: Let $\{p_i\}_{i=0}^{\infty}$ denote the increasing sequence of all prime numbers. We know that $x &gt; 1$ can be represented in only one way in the form of product of powers of prime factors. This implies that there is an integer $k_x$ and uniquely determined integers&nbsp;$e_{k_x}, e_{k_{x}-1}, \dots, e_1, e_0$, ($e_{k_x} &gt; 0$), that&nbsp;$x = p_{k_{x}}^{e_{k_x}} \cdot p_{k_{x}-1}^{e_{k_x-1}} \cdot \dots \cdot p_1^{e_1} \cdot p_0^{e_0} $. The sequence \[(e_{k_x}, e_{k_{x}-1}, \dots, e_1, e_0)\] is considered to be the representation of $x$ in prime base number system.</p>

<p>It is really true that all numerical calculations in prime base number system can seem to us a little bit unusual, or even hard. In fact, the children in Prime Land learn to add to subtract numbers several years. On the other hand, multiplication and division is very simple.</p>

<p>Recently, somebody has returned from a holiday in the Computer Land where small smart things called computers have been used. It has turned out that they could be used to make addition and subtraction in prime base number system much easier. It has been decided to make an experiment and let a computer to do the operation &quot;minus one&quot;.</p>

<p>Help people in the Prime Land and write a corresponding program.</p>

<p>For practical reasons we will write here the prime base representation as a sequence of such $p_i$ and $e_i$ from the prime base representation above for which $e_i &gt; 0$. We will keep decreasing order with regard to $p_i$.</p>

### 입력

<p>The input consists of lines (at least one) each of which except the last contains prime base representation of just one positive integer greater than 2 and less or equal 32767. All numbers in the line are separated by one space. The last line contains number 0.</p>

### 출력

<p>The output contains one line for each but the last line of the input. If $x$ is a positive integer contained in a line of the input, the line in the output will contain $x - 1$ in prime base representation. All numbers in the line are separated by one space. There is no line in the output corresponding to the last &quot;null&quot; line of the input.</p>