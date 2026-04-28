# [Platinum III] Ranks in groups - 10293

[문제 링크](https://www.acmicpc.net/problem/10293)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 45, 정답: 22, 맞힌 사람: 14, 정답 비율: 50.000%

### 분류

자료 구조, 집합과 맵, 분리 집합, 트리를 사용한 집합과 맵, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>There are N students. For 1 &lt;= i &lt;= N, the i-th student scores i points from the exam. These students are divided into groups. In the beginning, each group contains exactly one student. More specifically, initially, the i-th student is in group i.&nbsp;</p>

<p>You have write a program that supports the following operations:&nbsp;</p>

<ol>
	<li>Group Merge: in this operation you are given two group numbers X and Y, and you want to merge group Y into group X. After the merge, every student in group Y will be in group X, and group Y no longer exists.&nbsp;</li>
	<li>Query: in this operation you are given an integer J, and you want to find the rank of the J-th student in her/his group. In a group, the student who gets the highest score has rank 1, the student with the second highest score has rank 2, and so on.&nbsp;</li>
</ol>

<p>For each test case, there will be L operations.&nbsp;</p>

### 입력

<p>The first line of the input contains an integer T (T &lt;= 5) denoting the number of test cases. Then T test cases follow in the format described next.&nbsp;</p>

<ul>
	<li>The first line of the test case contains integers N and L (1 &lt;= N &lt;= 100,000; 1 &lt;= L &lt;= 200,000).&nbsp;</li>
	<li>The next L lines describe the operations in the following format:&nbsp;
	<ul>
		<li>The first integer K in the line specifies the type of the operation.&nbsp;</li>
		<li>If K = 1, it is the Group Merge operation. Then, on the same line, there will be 2 more integers X and Y. You program has to merge students from group Y into group X.&nbsp;</li>
		<li>If K = 2, it is the Query operation. Then an integer J is given. You have to output the rank of the J-th student in her/his group.</li>
	</ul>
	</li>
</ul>

### 출력

<p>For each test case, you have to output, for every Query operation, the rank of the J-th student.&nbsp;</p>