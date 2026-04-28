# [Silver IV] Course Scheduling - 4126

[문제 링크](https://www.acmicpc.net/problem/4126)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 140, 정답: 94, 맞힌 사람: 73, 정답 비율: 63.478%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>It is a difficult job to schedule all of the courses in a university to satisfy students&#39; choices with a minimum of conflicts. The task is made all the more difficult when some students don&#39;t pre-enroll, or pre-enroll multiple times because they forget that they already did it.</p>

### 입력

<p>The first line of input contains an integer 0 &lt; n &lt;= 100000, the number of student course requests. Each of the next n lines contains three strings separated by spaces: a student&#39;s first and last name, and the course that the student wishes to take. You may assume that each name is a string of at least one and at most 20 upper-case letters, and that a course is a string of at least one and at most 10 upper-case letters and digits. If a student requests a given course more than once, only the first such request should be considered. You may assume that no two students have both their first and last names the same.</p>

### 출력

<p>For each requested course, output a line containing the course, a space, and the number of students who requested the course. Output the courses sorted in lexicographical order (with digits sorted before letters).</p>