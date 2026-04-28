# [Silver II] Lost Array - 19686

[문제 링크](https://www.acmicpc.net/problem/19686)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 50, 맞힌 사람: 43, 정답 비율: 76.786%

### 분류

해 구성하기

### 문제 설명

<p>Rar the Cat has an array X of N positive integers. He is a teacher and he wants to give his students a homework based on his array. The students in his class had learnt the min function, and Rar would like to test them on this. He have already set M homework questions, and all of them are of this form:</p>

<p style="text-align: center;">min(X<sub>i</sub>, X<sub>j</sub>) = ?</p>

<p>Unfortunately, Rar has lost his array! Given the M homework questions, as well as the answer key, help Rar to reconstruct a possible array that matches all of his homework answers. Such an array is guaranteed to exist.</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first line of the input will contain 2 numbers, N and M.</p>

<p>The next M lines of input will contain 3 numbers, A<sub>i</sub>, B<sub>i</sub>, and C<sub>i</sub>. For all i = 1, 2, ..., M, min(X<sub>A<sub>i</sub></sub>, X<sub>B<sub>i</sub></sub>) = C<sub>i</sub>.</p>

### 출력

<p>Output N numbers in a single line (separated by spaces), the array X. If multiple solutions exist, all of them will be accepted. All elements of X must be between 1 and 10<sup>9</sup> (inclusive).</p>

### 제한

<ul>
	<li>1 &le; N, M &le; 10<sup>5</sup></li>
	<li>1 &le; A<sub>i</sub>, B<sub>i</sub> &le; N</li>
	<li>A<sub>i</sub> &ne; B<sub>i</sub></li>
	<li>1 &le; C<sub>i</sub> &le; 10<sup>9</sup></li>
</ul>