# [Platinum IV] Exam registration - 24858

[문제 링크](https://www.acmicpc.net/problem/24858)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 10, 맞힌 사람: 10, 정답 비율: 62.500%

### 분류

그리디 알고리즘, 이분 탐색

### 문제 설명

<p>Usually everyone associates the New Year with a Christmas tree and a festive table, but students associate the New Year with exams session. It was December 31, and second-year students signed up for the exam.</p>

<p>There are $n$ days when they can take the exam. Each student signed up to take the exam on one of these days. So, on the $i$-th day $a_{i}$ students want to take the exam, but the maximum number of students who can take the exam on this day is $b_{i}$.</p>

<p>Teachers need all students to have the opportunity to take the exam, so some students may have to be moved to another day. Teachers can choose any number of students and assign each of them to take the exam on any day.</p>

<p>If a student wanted to take the exam on the $i$-th day, and the teachers eventually moved it to the $j$-th day, then <em>dissatisfaction</em> of this student will be equal to $|i - j|$.</p>

<p>Help the teachers distribute the students so that for all $i$ on the $i$-th day, no more than $b_i$ students took the exam, and the maximum dissatisfaction among the students was minimal.</p>

### 입력

<p>The first line of the input contains a single integer $n$ --- the number of days when the students can take the exam ($1 \le n \le 10^{6}$).</p>

<p>The second line of the input contains $n$ integers $a_{i}$ --- the number of students who want to take the exam on the $i$-th day ($1 \le a_i \le 10^{9}$).</p>

<p>The third line of the input contains $n$ integers $b_{i}$ --- the maximum number of students who can take the exam on the $i$-th day ($0 \le b_i \le 10^{9}$).</p>

### 출력

<p>Print a single integer --- for which minimum $k$ it is possible make the dissatisfaction of any student not to exceed $k$. If there is no solution, you should print $-1$.</p>

### 힌트

<p>Consider the first sample test. Note that 70 students want to take exam on the third day, but only 24 students can take exam on days 2, 3, and 4. So the answer is at least 2.</p>

<p>One of the ways to move the students in the first sample test so that no student is moved more than 2 days from his desired day is the following.</p>

<ul>
	<li>$6, 14, 70, 1$ --- initial schedule of students;</li>
	<li>$6, 70, 14, 1$ --- move all students from the third day to the second day, and all students from the second day to the third day;</li>
	<li>$70, 6, 14, 1$ --- move all students from the second day to the first day, and all students from the first day to the second day;</li>
	<li>$70, 6, 11, 4$ --- move three students from the third day to the fourth day;</li>
	<li>$70, 3, 14, 4$ --- move three students from the second day to the third day;</li>
</ul>

<p>Note that each student was moved no more than two days from their initial position in the schedule.</p>