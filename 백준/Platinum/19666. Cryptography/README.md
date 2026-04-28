# [Platinum V] Cryptography - 19666

[문제 링크](https://www.acmicpc.net/problem/19666)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 36, 맞힌 사람: 34, 정답 비율: 79.070%

### 분류

수학, 자료 구조, 세그먼트 트리, 조합론, 값 / 좌표 압축

### 문제 설명

<p>Charles the Cryptographer has been researching novel methods of generating random numbers. In particular, by combining multiple sources of random numbers, he hopes to create a <em>cryptographically secure pseudorandom number generator (CSPRNG)</em>.</p>

<p>One algorithm that he has recently invented is as follows:</p>

<ol>
	<li>Randomly generate a sequence S of N distinct positive integers S<sub>1</sub>, . . . , S<sub>N</sub></li>
	<li>Randomly shuffle S to obtain a permutation<sup>1</sup> P of N elements P<sub>1</sub>, . . . , P<sub>N</sub></li>
	<li>Find the lexicographical order of P</li>
	<li>As the answer can be very large, output the value modulo<sup>2</sup> 1 000 000 007</li>
</ol>

<p>The lexicographical order of P is defined as the number of permutations of S that are lexicographically smaller than<sup>3</sup> or equal to P.</p>

<p>Unfortunately, Charles is a Cryptographer and not a Coder. Given the resultant permutation P, help Charles to find its lexicographical order, modulo 1 000 000 007.</p>

<p><sup>1</sup>A permutation P of a sequence S is a rearrangement of the elements of S</p>

<p><sup>2</sup>The remainder when the value is divided by 1 000 000 007</p>

<p><sup>3</sup>A permutation P<sub>1</sub>, . . . , P<sub>N</sub> is considered lexicographically smaller than another permutation P&#39;<sub>1</sub> , . . . , P&#39;<sub>N</sub> if there exists 1 &le; k &le; N such that P<sub>k</sub> &lt; P&#39;<sub>k</sub> and P<sub>i</sub> = P&#39;<sub>i</sub> for i = 1, . . . , k &minus; 1.</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first line contains a single integer N.</p>

<p>The second line contains N space-separated integers, P<sub>1</sub>, . . . , P<sub>N</sub>.</p>

### 출력

<p>Your program must print to standard output. The output should contain a single integer on a single line, the lexicographical order of P, modulo 1 000 000 007.</p>

### 제한

<ul>
	<li>1 &le; N &le; 3 &times; 10<sup>5</sup></li>
	<li>1 &le; P<sub>i</sub> &le; 10<sup>9</sup></li>
	<li>P<sub>i</sub> &ne; P<sub>j</sub> for i &ne; j</li>
</ul>