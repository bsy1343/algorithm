# [Platinum III] Tiles - 8005

[문제 링크](https://www.acmicpc.net/problem/8005)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

임의 정밀도 / 큰 수 연산, 수학, 정수론

### 문제 설명

<p>Byteasar, a master tiler, and his mate Byteolini renovate a bathroom of the Bytesons. There is to be a decorative, horizontal strip composed of various figured tiles in the bathroom. The strip is to be n tiles wide and one tile high. Mrs Byteson has told Byteolini that the tiles composing the horizontal strip have had to be put to form a pattern recurring every k tiles. As soon as Mrs Byteson has left, Mr Byteson has come and has told Byteolini that the tiles composing the horizontal strip have had to be put to form a pattern recurring every l tiles. Confused Byteolini has come to Byteasar to ask for advice:</p>

<p>&quot;Chief, how should I finally tile? Should the pattern recur every k, or every l tiles?&quot;</p>

<p>&quot;Whatever they say! You have to tile in such a way that the pattern recurs both every k and every l tiles. Moreover you have to use as many different tiles as possible, to make the pattern not too monotonous. Now, stop playing the philosopher and go to work!&quot;</p>

<p>Byteolini has been left completely dizzy. Help him!</p>

<p>Write a program which:</p>

<ul>
	<li>reads the numbers n, k and l from the standard input,</li>
	<li>computes the number of different tiles that are to be used,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the standard input there are three integers n, k and l - in the first, second and third line, accordingly. The numbers satisfy the conditions 1 &le; n &le; 10<sup>500</sup>, 1 &le; k,l &le; n. Note: the numbers k and l need not be divisors of n.</p>

### 출력

<p>Your program should write to the standard output. In the first and only line there should be one integer: the maximal number of different tiles to use to decorate the bathroom with a strip of length n in such a way that the pattern recurs both every k and every l tiles.</p>