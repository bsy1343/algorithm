# [Platinum I] Pseudo-Random Number Generator - 18300

[문제 링크](https://www.acmicpc.net/problem/18300)

### 성능 요약

시간 제한: 0.3 초, 메모리 제한: 512 MB

### 통계

제출: 151, 정답: 51, 맞힌 사람: 34, 정답 비율: 30.357%

### 분류

그래프 이론, 런타임 전의 전처리

### 문제 설명

<p>Donald loves nature. Being a programmer, Donald writes programs to simulate the growth of trees or to build realistic 3D landscapes. For this purpose, Donald needs a good pseudo-random number generator. He devises the following method to produce an infinite sequence of 40-bit unsigned integers (the lines in green are comments).</p>

<ul>
	<li>M := 1 &lt;&lt; 40 // = 2<sup>40</sup> = 1 099 511 627 776</li>
	<li>S(0) := 0x600DCAFE // = 1 611 516 670</li>
	<li>S(n + 1) := (S(n) + (S(n) &gt;&gt; 20) + 12345) % M</li>
</ul>

<p>On the last line, x &gt;&gt; 20 denotes the quotient of the Euclidean division of x by 2<sup>20</sup> and x % M denotes the remainder of the Euclidean division of x by M.</p>

<p>As a very first test to decide if this is indeed a good pseudo-random number generator, Donald wishes to count the number of even values produced by this sequence, in order to check whether this is close enough to 50%. Your help will be welcome.</p>

### 입력

<p>The input consists of a single line, containing an integer N.</p>

### 출력

<p>The output should contain a single line with a single integer corresponding to the number of even values in the sequence S(0), S(1), . . . , S(N &minus; 1).</p>

### 제한

<p>The input satisfies 0 &le;&nbsp;N &lt; 2<sup>63</sup>.</p>