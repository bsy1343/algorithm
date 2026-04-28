# [Platinum I] Good Influencers - 24576

[문제 링크](https://www.acmicpc.net/problem/24576)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 60, 정답: 25, 맞힌 사람: 23, 정답 비율: 43.396%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>There are N (N &ge; 2) students in a computer science class, with distinct student IDs ranging from 1 to N. There are N &minus; 1 friendships amongst the students, with the ith being between students A<sub>i</sub> and B<sub>i</sub> (A<sub>i</sub> &ne; B<sub>i</sub>, 1 &le; A<sub>i</sub> &le; N and 1 &le; B<sub>i</sub> &le; N). Each pair of students in the class are either friends or socially connected. A pair of students a and b are socially connected if there exists a set of students m<sub>1</sub>, m<sub>2</sub>, . . . , m<sub>k</sub> such that</p>

<ul>
	<li>a and m<sub>1</sub> are friends,</li>
	<li>m<sub>i</sub> and m<sub>i+1</sub> are friends (for 1 &le; i &le; k &minus; 1), and</li>
	<li>m<sub>k</sub> and b are friends.</li>
</ul>

<p>Initially, each student i either intends to write the CCC (if P<sub>i</sub> is <code>Y</code>) or does not intend to write the CCC (if P<sub>i</sub> is <code>N</code>). Initially, at least one student intends to write the CCC, and at least one student does not intend to write the CCC.</p>

<p>The CCC has allocated some funds to pay some students to be influencers for the CCC. The CCC will repeatedly choose one student i who intends to write the CCC, pay them C<sub>i</sub> dollars, and ask them to deliver a seminar to all of their friends, and then all of their friends will intend to write the CCC.</p>

<p>Help the CCC determine the minimum cost required to have all of the students intend to write the CCC.</p>

### 입력

<p>The first line contains the integer N.</p>

<p>The next N &minus; 1 lines each contain two space-separated integers, A<sub>i</sub> and B<sub>i</sub> (1 &le; i &le; N &minus; 1).</p>

<p>The next line contains N characters, P<sub>1</sub> . . . P<sub>N</sub>, each of which is either <code>Y</code> or <code>N</code>.</p>

<p>The next line contains N space-separated integers, C<sub>1</sub> . . . C<sub>N</sub>.</p>

### 출력

<p>Output the minimum integer number of dollars required to have all of the students to intend to write the CCC.</p>