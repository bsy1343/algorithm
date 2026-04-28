# [Gold II] Time to Graduate - 4624

[문제 링크](https://www.acmicpc.net/problem/4624)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 5, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

다이나믹 프로그래밍, 그래프 이론, 위상 정렬, 방향 비순환 그래프

### 문제 설명

<p>A prospective CS student is investigating how many semesters it will take to graduate from a variety of different universities. Each university provides a list of required courses, their prerequisites, and when each course is offered. Given this information, determine the minimum number of semesters to graduate.</p>

<p>Consider the following example. A student is required to take 4 courses, mt42, cs123, cs456, and cs789. mt42 is only offered in the fall semester and has no prerequisites. Similarly, cs123 is only offered in the spring semester and has no prerequisites. cs456 is only offered in the spring semester and has both cs123 and mt42 as prerequisites. Finally, cs789 is offered in both fall and spring and has cs456 as its only prerequisite. The shortest time to graduate is 5 semesters, by taking mt42 in the fall, cs123 in the next spring, cs456 the following spring (since it is not offered in the fall) and finally cs789 the following fall.</p>

<p>For this problem, there are only two semesters, fall and spring. Always start counting semesters from the fall.&nbsp;</p>

<p>In addition to the fall/spring scheduling issues, there is one slight complication. In order to keep the dormitories full, each university limits the number of courses that can be taken in any semester. This limit appears as part of the input data. The third example below illustrates this issue.</p>

### 입력

<p>There are one to twenty-five data sets, followed by a final line containing only the integers -1 -1. A data set starts with a line containing two positive integers n, 1 &le; n &le; 12, which is the number of courses in this data set and m, 2 &le; m &le; 6, which is the maximum number of courses that can be taken in any single semester. The next line contains the n course identifiers. Each is a 1-5 character string from the set {a-z, 0-9}. Following the course identifiers is the individual course information. This consists of n lines, one line for each course, containing the course identifier, semester offered (&#39;F&#39;=Fall, &#39;S&#39;=Spring, &#39;B&#39;=Both semesters), the number of prerequisite courses, p, 0 &le; p &le; 5, and finally p prerequisite course identifiers. The first example data set below corresponds to the problem described above.</p>

### 출력

<p>The output contains one line for each data set, formatted as shown in the sample output.</p>