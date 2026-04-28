# [Silver I] Competition - 22256

[문제 링크](https://www.acmicpc.net/problem/22256)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 69, 정답: 48, 맞힌 사람: 44, 정답 비율: 73.333%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>You are Nilan, teaching a class of n students. Recently, each student sat for two examinations &mdash; Physics and Biology. The scores of the i-th student in Physics and Biology are denoted by A[i] and B[i] respectively. Each score is a non-negative integer not exceeding 10000, i.e. 0 &le; A[i], B[i] &le; 10000, &forall;i &isin; [1, n].</p>

<p>Based on their results, you are to select a and b students to participate in the Physics and Biology categories of a Science competition respectively. To give all students a chance to represent their school, each student must be enrolled in exactly one of the categories.</p>

<p>Naturally, the school wants to maximise its chances of winning by sending the strongest team possible. This is achieved when the sum of Physics scores of the a Physics students combined with the sum of Biology scores of the b Biology students is maximised.</p>

<p>As their teacher, determine the maximum possible combined score of the Physics and Biology teams!</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first line of the input contains 3 integers n, a and b denoting the total number of students, the size of the Physics team and the size of the Biology team. It is guaranteed that a + b = n i.e. all students take part as either a Physics or a Biology competitor.</p>

<p>2 lines will follow. The first line contains n integers, i.e A[1], A[2], . . . , A[n]. The second line contains n integers, i.e B[1], B[2], . . . , B[n].</p>

### 출력

<p>Your program must print to standard output.</p>

<p>The output should contain a single integer on a single line, the maximum combined sum of all the Physics scores of the Physics team, and the Biology scores of the Biology team.</p>

### 제한

<ul>
	<li>1 &le; n &le; 10<sup>5</sup></li>
	<li>0 &le; a, b &le; n</li>
	<li>a + b = n</li>
	<li>0 &le; A[i], B[i] &le; 10000, &forall;i &isin; [1, n]</li>
</ul>