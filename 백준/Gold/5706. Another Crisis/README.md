# [Gold III] Another Crisis - 5706

[문제 링크](https://www.acmicpc.net/problem/5706)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 10, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그리디 알고리즘, 그래프 탐색, 정렬, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>A couple of years ago, a new world wide crisis started, leaving many people with economical problems. Some workers of a particular company are trying to ask for an increase in their salaries.</p>

<p>The company has a strict hierarchy, in which each employee has exactly one direct boss, with the exception of the owner of the company that has no boss. Employees that are not bosses of any other employee are called workers. The rest of the employees and the owner are called bosses.</p>

<p>To ask for a salary increase, a worker should file a petition to his direct boss. Of course, each boss is encouraged to try to make their subordinates happy with their current income, making the company&rsquo;s profit as high as possible. However, when at least T percent of its direct subordinates have filed a petition, that boss will be pressured and have no choice but to file a petition himself to his own direct boss. Each boss files at most 1 petition to his own direct boss, regardless on how many of his subordinates filed him a petition. A boss only accounts his direct subordinates (the ones that filed him a petition and the ones that didn&rsquo;t) to calculate the pressure percentage.</p>

<p>Note that a boss can have both workers and bosses as direct subordinates at the same time. Such a boss may receive petitions from both kinds of employees, and each direct subordinate, regardless of its kind, will be accounted as 1 when checking the pressure percentage.</p>

<p>When a petition file gets all the way up to the owner of the company, all salaries are increased. The workers&rsquo; union is desperately trying to make that happen, so they need to convince many workers to file a petition to their direct boss.</p>

<p>Given the company&rsquo;s hierarchy and the parameter T, you have to find out the minimum number of workers that have to file a petition in order to make the owner receive a petition.</p>

### 입력

<p>There are several test cases. The input for each test case is given in exactly two lines. The first line contains two integers N and T (1 &le; N &le; 10<sup>5</sup>, 1 &le; T &le; 100), separated by a single space. N indicates the number of employees of the company (not counting the owner) and T is the parameter described above. Each of the employees is identified by an integer between 1 and N. The owner is identified by the number 0. The second line contains a list of integers separated by single spaces. The integer B<sub>i</sub>, at position i on this list (starting from 1), indicates the identification of the direct boss of employee i (0 &le; B<sub>i</sub> &le; i &minus; 1).</p>

<p>The last test case is followed by a line containing two zeros separated by a single space.</p>

### 출력

<p>For each test case output a single line containing a single integer with the minimum number of workers that need to file a petition in order to get the owner of the company to receive a petition.</p>