# [Platinum I] Intelligence Quotient - 7914

[문제 링크](https://www.acmicpc.net/problem/7914)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 19, 맞힌 사람: 15, 정답 비율: 57.692%

### 분류

이분 매칭, 최대 유량, 최대 유량 최소 컷 정리, 그래프 이론

### 문제 설명

<p>At the University of Byteland one can only study maths and computer science. Currently there are n maths students and m computer science students. These majors are so hard to study that nobody studies both of them at the same time.</p>

<p>Byteasar is the rector of the university. He would like to form a team of students which will solve all the hardest problems of mankind. Since he knows the IQ of each student, he has decided to form a team with the largest possible sum of IQs of its members.</p>

<p>However, IQ is not everything. That is why the rector would like all members of the team to know each other. It is known that all maths students know each other. And similarly, each computer science student knows every other student majoring in computer science.</p>

<p>Help the rector by writing a program that will help him form a team of students with the largest possible sum of IQs in which all the members know each other.</p>

### 입력

<p>The first line of the input contains three integers n, m and k (1 &le; n, m &le; 400, 0 &le; k &le; n &middot; m) which denote the number of maths students, the number of computer science students and the number of pairs of students from different majors that know each other, respectively.</p>

<p>Each of the following k lines describes one pair of acquaintances: the i-th of these lines contains two integers a<sub>i</sub> and b<sub>i</sub> (1 &le; a<sub>i</sub> &le; n, 1 &le; b<sub>i</sub> &le; m) denoting an index of a maths student and an index of an computer science student from the i-th pair. The maths students are indexed with integers starting from 1 and so are the computer science students.</p>

<p>The following line contains n integers in the range [1, 10<sup>9</sup>], which represent the IQs of the subsequent maths students. The next line contains m integers representing the IQs of the computer science students, in a similar format.</p>

### 출력

<p>The first line of the output should contain one integer equal to the maximum sum of IQs in a team satisfying Byteasar&rsquo;s requirements.</p>

<p>The second line should contain one integer &mdash; the number of maths students that Byteasar should choose. The third line should contain the indices of these students, listed in any order. If there are no maths students in the team, an empty line should be printed.</p>

<p>The following two lines should describe the indices of computer science students assigned to the team, in a similar format.</p>

<p>If there are multiple optimal solutions, your program should output any one of them.</p>