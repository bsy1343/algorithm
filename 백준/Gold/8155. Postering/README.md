# [Gold I] Postering - 8155

[문제 링크](https://www.acmicpc.net/problem/8155)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 199, 정답: 136, 맞힌 사람: 123, 정답 비율: 69.492%

### 분류

자료 구조, 세그먼트 트리, 스택

### 문제 설명

<p>All the buildings in the east district of Byteburg were built in accordance with the old arbitecture: they stand next to each other with no spacing inbetween. Together they form a very long chain of buildings of diverse height, extending from east to west.</p>

<p>The mayor of Byteburg, Byteasar, has decided to have the north face of the chain covered with posters. Byteasar ponders over the minimum number of posters sufficient to cover the whole north face. The posters have rectangular shape with vertical and horizontal sides. They cannot overlap, but may touch each other, i.e. have common points on the sides. Every poster has to entirely adjoin the walls of certain buildings and the whole surface of the north face has to be covered.</p>

<p>
Write a programme that:</p>

<ul>
	<li>reads the description of buildings from the standard input,</li>
	<li>determines the minimum number of posters needed to entirely cover their north faces,</li>
	<li>writes out the outcome to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains one integer n (1 &le; n &le; 250,000), denoting the number of buildings the chain comprises of. Each of the following n lines contains two integers d<sub>i</sub> and w<sub>i</sub> (1 &le; d<sub>i</sub>,w<sub>i</sub> &le; 1,000,000,000), separated by a single space, denoting respectively the length and height of the i<sup>th</sup> building in the row.</p>

### 출력

<p>The first and only line of the standard output should contain one integer, the minimum number of rectangular posters that suffice to cover the north faces of the buildings.</p>

<p>&nbsp;</p>

### 힌트

<p>For the sample input</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/8155/1.gif" style="height:153px; width:178px" /></p>

<p>For the sample output</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/8155/2.gif" style="height:115px; width:160px" /></p>

<p>The figures show the north face of the buildings chain. The second figure shows an exemplary covering of the face with four posters.</p>

<p>&nbsp;</p>