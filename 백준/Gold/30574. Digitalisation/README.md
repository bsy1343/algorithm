# [Gold I] Digitalisation - 30574

[문제 링크](https://www.acmicpc.net/problem/30574)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

애드 혹, 그리디 알고리즘

### 문제 설명

<p>The students of Tomorrow Programming School are admitted to the school in the nationwide School Admission Process (SAP), which involves most schools in the region. SAP consists of two rounds.</p>

<p>At the beginning of the first SAP round, each student applies for two schools, while indicating his priorities. For each student there is a school which is his first priority and a school which is his second priority. All students who apply are tested in a national exam that gives each student a unique score and creates a common list CL of students sorted according to their scores in the test in descending order (the highest score is the best). CL is available to each school. Each school prefers to admit students with better score. The capacity of each school is bounded by common capacity limit C. Each school keeps a list of candidates, the capacity of the list is also C. The lists are initially empty.</p>

<p>Then, the second round of SAP starts. It consists of one or more cycles of so-called update events. In a cycle, each school, one after another, performs one update event.</p>

<p>In an update event, the school with update list L searches CL from its end (starting with the worst score applicant) and they select the first applicant A who is not in L and who fulfills all following conditions:</p>

<ul>
	<li>Either L is not full, or the score of A is better than the worst score of the candidates in L.</li>
	<li>The school with list L is either the first or the second priority of A.</li>
	<li>A is currently either not on a candidate list of any school or they are currently on candidate list of their second priority school.</li>
</ul>

<p>If the school cannot select an applicant fulfilling the conditions, the update event is claimed to be empty and it is terminated. Otherwise, if L is full at the moment, the candidate with worst score in L is removed from L. Next, A is included in L. If A had been to this moment on a candidate list of another school, A is removed from that list. Finally, the update event is claimed to be valid.</p>

<p>If, during a cycle, at least one update event is valid, a new cycle is started all over again. The second round of SAP ends when all update events in one cycle are empty. Then, the schools admit the students which are on their respective candidate lists.</p>

<p>The regional statisticians want to know, how many students were admitted to their first or second priority schools. Write an appropriate program for them.</p>

### 입력

<p>The first input line contains three integers N, M, C (2 &le; N, M &le; 10<sup>5</sup>; 1 &le; C &le; 100), the total number of student applicants, the number of schools, and the common admission capacity.</p>

<p>Schools are labeled by integers 1, 2, . . . , M. Each of the following N lines contain the first and the second priority of one student, represented by the labels of the schools. The lines are sorted in descending order of the scores of the corresponding students.</p>

### 출력

<p>Output two numbers on a single line. The number of students who got to their desired school with first priority and the number of students who got to their desired school with second priority.</p>