# [Gold III] Education - 15031

[문제 링크](https://www.acmicpc.net/problem/15031)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 94, 정답: 45, 맞힌 사람: 41, 정답 비율: 46.591%

### 분류

그리디 알고리즘, 정렬, 역추적

### 문제 설명

<p>Seeking to cash in on the lucrative private education business, EduCorp recently established the prestigious &rdquo;Bootcamp Academy of Economics&rdquo; and, counter to their early projections, is growing rapidly.</p>

<p>So rapidly, in fact, that the student body is already overflowing the small (but prestigious) campus building and now needs to be contained somewhere else while more new (and prestigious) buildings are built.</p>

<p>Each department will sell off its original space and then move into its own new rented building. As departments are deeply territorial, buildings must not be shared. Because this is an economics academy, the capacities and rents of each of all the local available buildings were easy to find by disguising the task as homework.</p>

<p>However, it still remains to choose which buildings to rent so as to minimise total budget. This is where you can help.</p>

### 입력

<ul>
	<li>one line containing the integers n and m (1 &le; n &le; m &le; 5000), the number of departments and buildings respectively.</li>
	<li>one line containing n integers s<sub>1</sub> . . . s<sub>n</sub> (1 &le; s<sub>i</sub> &le; 1000 for each i), where s<sub>i</sub> is the number of students in department i.</li>
	<li>one line containing m integers p<sub>1</sub> . . . p<sub>m</sub> (1 &le; p<sub>i</sub> &le; 1000 for each i), where p<sub>i</sub> is the capacity of building i.</li>
	<li>one line containing m integers r<sub>1</sub> . . . r<sub>m</sub> (1 &le; r<sub>i</sub> &le; 1000 for each i), where r<sub>i</sub> is the yearly rental cost of building i.</li>
</ul>

### 출력

<p>If it is not possible to rent enough buildings for all the departments, output impossible.</p>

<p>Otherwise, output n unique, space-separated integers v<sub>1</sub>. . . v<sub>n</sub>, where the i-th number is the building to be rented by the i-th department so as to minimise the total spend on rent. If there are multiple equally good answers, you may print any.</p>