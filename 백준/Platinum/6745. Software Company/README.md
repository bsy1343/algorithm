# [Platinum V] Software Company - 6745

[문제 링크](https://www.acmicpc.net/problem/6745)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

이분 탐색, 다이나믹 프로그래밍

### 문제 설명

<p>A software developing company has been assigned two programming projects. As both projects are within the same contract, both must be handed in at the same time. It does not help if one is finished earlier.</p>

<p>This company has n employees to do the jobs. To manage the two projects more easily, each is divided into m independent subprojects. &nbsp;Only one employee can work on a single subproject at one time, but it is possible for two employees to work on different subprojects of the same project simultaneously.</p>

<p>Our goal is to finish the projects as soon as possible.</p>

### 입력

<p>The first line of the input file contains a single integer t (1 &le; t &le; 11), the number of test cases, followed by the input data for each test case. The first line of each test case contains two integers n (1 &le; n &le; 100), and m (1 &le; m &le; 100). The input for this test case will be followed by n lines. Each line contains two integers which specify how much time in seconds it will take for the specified employee to complete one subproject of each project. &nbsp;So if the line contains x and y, it means that it takes the employee x seconds to complete a subproject from the first project, and y seconds to complete a subproject from the second project.</p>

<p>&nbsp;</p>

### 출력

<p>There should be one line per test case containing the minimum amount of time in seconds after which both projects can be completed.&nbsp;</p>

<p>&nbsp;</p>