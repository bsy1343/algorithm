# [Platinum III] Performance Review - 13962

[문제 링크](https://www.acmicpc.net/problem/13962)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 142, 정답: 63, 맞힌 사람: 57, 정답 비율: 50.000%

### 분류

자료 구조, 오일러 경로 테크닉, 세그먼트 트리, 정렬, 트리

### 문제 설명

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13962/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-30%20%EC%98%A4%ED%9B%84%204.35.14.png" style="height:232px; width:192px" /></p>

<p>Employee performance reviews are a necessary evil in any company. In a performance review, employees give written feedback about each other on the work done recently. This feedback is passed up to their managers which then decide promotions based on the feedback received.</p>

<p>Maria is in charge of the performance review system in the engineering division of a famous company. The division follows a typical structure. Each employee (except the engineering director) reports to one manager and every employee reports directly or indirectly to the director.&nbsp;</p>

<p>Having the managers assessing the performance of their direct reports has not worked very well. After thorough research, Maria came up with a new performance review system. The main idea is to complement the existing corporate structure with a technical rank for each employee. An employee should give feedback only about subordinated with lower technical level.</p>

<p>Hence, the performance review will work as follows. Employees prepare a summary of their work, estimate how much time it takes to review it, and then request their superiors with higher technical rank to review their work.&nbsp;</p>

<p>Maria is very proud of this new system, but she is unsure if it will be feasible in practice. She wonders how much time each employee will waste writing reviews. Can you help her out?</p>

<p>Given the corporate structure of the engineering division, determine how much time each employee will spend writing performance reviews.</p>

### 입력

<p>The first line of input has one integer E, the number of employees, who are conveniently numbered between 1 and E. The next E lines describe all the employees, starting at employee 1 until employee E. Each line contains three space-separated integers m<sub>i</sub>, r<sub>i</sub>, t<sub>i</sub>, the manager, the technical rank and the expected time to perform the review of employee i. The engineering director has no manager, represented with m<sub>i</sub> = -1. The other employees have m<sub>i</sub> between 1 and E.</p>

<ul>
</ul>

### 출력

<p>he output contains E lines. Line i has the time employee i will spend writing reviews.</p>

### 제한

<ul>
	<li>1 &le; E &le; 100 000 Number of employees</li>
	<li>1 &le; r<sub>i</sub> &le; 100 000 Technical rank of each employee</li>
	<li>1 &le; t<sub>i</sub> &le; 100 000 Expected time to perform each review</li>
</ul>