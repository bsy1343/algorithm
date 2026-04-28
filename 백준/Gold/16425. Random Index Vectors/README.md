# [Gold IV] Random Index Vectors - 16425

[문제 링크](https://www.acmicpc.net/problem/16425)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 82, 정답: 36, 맞힌 사람: 34, 정답 비율: 47.222%

### 분류

구현, 두 포인터

### 문제 설명

<p>Random Index Vectors (RIVs) are a relatively new technique for pattern matching. A RIV is a large, sparse vector of 1s and -1s. If randomly generated, the dot product of two RIVs is zero or very nearly zero, so they are orthogonal or very nearly orthogonal. They are used by assigning a RIV to various attributes, and then combining them in specific ways to form new vectors for patterns with those attributes. Then, the cosine of the angle between vectors for two patterns can be used as a measure of similarity between the patterns.</p>

<p>There are three basic operations on RIVs:</p>

<ul>
	<li>Two RIVs can be ADDED element by element: C<sub>i</sub> = A<sub>i</sub>+B<sub>i</sub>.

	<ul>
		<li>RIVs can only have 1 and -1 as nonzero elements, so 1+1=1 and -1+-1=-1</li>
	</ul>
	</li>
	<li>Two RIVs can be MULTIPLIED element by element: C<sub>i</sub> = A<sub>i</sub>&times;B<sub>i</sub></li>
	<li>One RIV can be ROTATED by some integer k, where all of the values are shifted to the left by k (towards the lower indices), and values at the start of the vector go to the end.</li>
</ul>

<p>Because they are large and sparse, RIVs usually use a condensed representation. The vector is represented by a sorted list of indices (starting at 1) where there are non-zero values, with the index being negative if the value is -1. The representation starts with the number of non-zero indices.</p>

<p>For example, consider this RIV:</p>

<p style="text-align: center;">1 0 -1 0 0 0 -1 0 0 1 0</p>

<p>There are 4 non-zero elements at indices 1, 3, 7 and 10. In condensed representation:</p>

<p style="text-align: center;">4 1 -3 -7 10</p>

<p>Given two RIVs in condensed representation, add them, multiply them, and rotate them both. Give the resulting vectors in condensed form.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs.</p>

<p>Each test case will begin with a line with two space-separated integers n (1 &le; n &le; 10<sup>18</sup>) and k (1 &le; k &le; n), where n is the maximum index of the vectors and k is the number of spots to rotate by.</p>

<p>Each of the next two lines will have a vector in condensed form, starting with an integer m (0 &le; m &le; 1,000) followed by m indices i (1 &le; |i| &le; n), all separated by spaces.</p>

### 출력

<p>Output four Random Index Vectors, one per line, in condensed form.</p>

<ul>
	<li>On the first line, output the sum of the input vectors.</li>
	<li>On the second line, output the product of the input vectors.</li>
	<li>On the third line, output the first input vector rotated by k.</li>
	<li>On the fourth line, output the second input vector rotated by k.</li>
</ul>