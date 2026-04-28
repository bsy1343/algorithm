# [Platinum III] Collatz Conjecture - 15005

[문제 링크](https://www.acmicpc.net/problem/15005)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 440, 정답: 197, 맞힌 사람: 117, 정답 비율: 40.767%

### 분류

수학, 자료 구조, 정수론, 집합과 맵

### 문제 설명

<p>In 1978 AD the great Sir Isaac Newton, whilst proving that P is a strict superset of N P, defined the Beta Alpha Pi Zeta function f as follows over any sequence of positive integers a<sub>1</sub>, . . . , a<sub>n</sub>. Given integers 1 &le; i &le; j &le; n, we define f(i, j) as gcd(a<sub>i</sub>, a<sub>i+1</sub>, . . . , a<sub>j&minus;1</sub>, a<sub>j</sub>).</p>

<p>About a century later Lothar Collatz applied this function to the sequence 1, 1, 1, . . . , 1, and observed that f always equalled 1. Based on this, he conjectured that f is always a constant function, no matter what the sequence a<sub>i</sub> is. This conjecture, now widely known as the Collatz Conjecture, is one of the major open problems in botanical studies. (The Strong Collatz Conjecture claims that however many values f takes on, the real part is always 1/2.)</p>

<p>You, a budding young cultural anthropologist, have decided to disprove this conjecture. Given a sequence ai , calculate how many different values f takes on.</p>

### 입력

<p>The input consists of two lines.</p>

<ul>
	<li>&bull; A single integer 1 &le; n &le; 5 &middot; 10<sup>5</sup>, the length of the sequence.</li>
	<li>The sequence a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>. It is given that 1 &le; a<sub>i</sub> &le; 10<sup>18</sup>.</li>
</ul>

### 출력

<p>Output a single line containing a single integer, the number of distinct values f takes on over the given sequence.</p>