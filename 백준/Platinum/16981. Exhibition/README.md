# [Platinum V] Exhibition - 16981

[문제 링크](https://www.acmicpc.net/problem/16981)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 315, 정답: 180, 맞힌 사람: 163, 정답 비율: 57.801%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>You are going to hold an exhibition of pictures. In the exhibition, you will put some pictures into frames and exhibit them, lining them up in a row.</p>

<p>There are N candidate pictures for the exhibition, numbered from 1 through N. The picture i (1 &le; i &le; N) has size S<sub>i</sub> and value V<sub>i</sub>.</p>

<p>Also, there are M frames for the pictures, numbered from 1 through M. The frame j (1 &le; j &le; M) has size C<sub>j</sub>. Only pictures of size at most C<sub>j</sub> can be put into the frame j. At most one picture can be put into a frame.</p>

<p>Every picture to be exhibited must be put into a frame. For the sake of appearance, they must satisfy the following conditions:</p>

<ul>
	<li>For any neighboring two pictures, the size of the frame containing the right picture must be at least the size of the frame containing the left picture.</li>
	<li>For any neighboring two pictures, the value of the right picture must be at least the value of the left picture.</li>
</ul>

<p>You want to exhibit as many pictures as possible.</p>

<p>Write a program which, given the number of pictures, the number of frames, and their sizes and values, calculates the maximum number of pictures to be exhibited.</p>

### 입력

<p>Read the following data from the standard input.</p>

<pre>
N M
S<sub>1</sub> V<sub>1</sub>
.
.
.
S<sub>N</sub> V<sub>N</sub>
C<sub>1</sub>
.
.
.
C<sub>M</sub></pre>

### 출력

<p>Write one line to the standard output. The output should contain the maximum number of pictures to be exhibited.</p>

### 제한

<ul>
	<li>1 &le; N &le; 100 000.</li>
	<li>1 &le; M &le; 100 000.</li>
	<li>1 &le; S<sub>i</sub> &le; 1 000 000 000 (1 &le; i &le; N).</li>
	<li>1 &le; V<sub>i</sub> &le; 1 000 000 000 (1 &le; i &le; N).</li>
	<li>1 &le; C<sub>j</sub> &le; 1 000 000 000 (1 &le; j &le; M).</li>
</ul>