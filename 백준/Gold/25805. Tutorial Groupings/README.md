# [Gold III] Tutorial Groupings - 25805

[문제 링크](https://www.acmicpc.net/problem/25805)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍, 정렬

### 문제 설명

<p>UCF has some very large classes such as COT 3100 (Introduction to Discrete Mathematics). Unfortunately, some students don&rsquo;t learn well in this environment. Luckily, UCF has so many knowledgeable students (referred to as TAs for the rest of this problem) that classes can be split up into smaller &ldquo;tutorial&rdquo; groups led by TAs, where students are more likely to achieve their potential.</p>

<p>In order for a tutorial group to be successful, the knowledge level of students within that group has to be relatively close to one another. More specifically, the difference between the minimum and maximum knowledge levels of students in a tutorial group can&rsquo;t exceed a given value k. In addition, for a tutorial group to be successful, it cannot have more than s students, for a given value s. (Of course, each group must have at least one student!) Finally, it must be possible to order the tutorial groups as T<sub>1</sub>, T<sub>2</sub>, &hellip;, T<sub>m</sub>, such that for any integer i, 1 &le; i &lt; m, the maximum knowledge level of a student in tutorial T<sub>i</sub> is strictly lower than the minimum knowledge level of a student in tutorial T<sub>i+1</sub>. Since TAs are so plentiful and knowledgeable, as many tutorial groups as desired can be formed.</p>

<p>As an example, consider a class where the students have knowledge levels 10, 6, 5, 9 and 12, such that the difference between the minimum and maximum levels of students in a tutorial can&rsquo;t be greater than 5 and there can be no more than 3 students in a group. For this example, we can split the class into tutorial groups in the following 13 ways:</p>

<ol>
	<li>{5}, {6}, {9}, {10}, {12}</li>
	<li>{5}, {6}, {9}, {10, 12}</li>
	<li>{5}, {6}, {9, 10}, {12}</li>
	<li>{5}, {6}, {9, 10, 12}</li>
	<li>{5}, {6, 9}, {10}, {12}</li>
	<li>{5}, {6, 9}, {10, 12}</li>
	<li>{5}, {6, 9, 10}, {12}</li>
	<li>{5, 6}, {9}, {10}, {12}</li>
	<li>{5, 6}, {9}, {10, 12}</li>
	<li>{5, 6}, {9, 10}, {12}</li>
	<li>{5, 6}, {9, 10, 12}</li>
	<li>{5, 6, 9}, {10}, {12}</li>
	<li>{5, 6, 9}, {10, 12}</li>
</ol>

<p>Given all of these restrictions, your COT 3100 instructor (Dr. Travis Meade) would like to know how many ways the tutorials can be formed.</p>

<p>Given the knowledge level of each student in a class, the maximum difference between knowledge levels allowed in a tutorial group and the maximum number of students in a tutorial group, calculate the number of different ways to form tutorial groups. Since this number could be quite large, report it modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>The first input line contains three space separated integers: n (1 &le; n &le; 10,000), indicating the number of students in the class, k (1 &le; k &le; 10<sup>9</sup>), indicating the maximum difference between the minimum and maximum knowledge levels of students in a single tutorial, and s (1 &le; s &le; 100), indicating the maximum number of students allowed in a tutorial.</p>

<p>The following input line contains n space separated integers. The ith of these integers is a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 10<sup>9</sup>), indicating the knowledge level of the ith student. Assume that all the knowledge levels are distinct, i.e., no duplicates.</p>

### 출력

<p>Print the number of different ways to form tutorial groups, modulo 10<sup>9</sup> + 7. Note that two ways of forming tutorial groups are different if there is a set (tutorial group) in one but not in the other.</p>