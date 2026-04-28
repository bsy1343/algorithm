# [Platinum III] Average - 13889

[문제 링크](https://www.acmicpc.net/problem/13889)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 117, 정답: 54, 맞힌 사람: 45, 정답 비율: 47.368%

### 분류

조합론, 다이나믹 프로그래밍, 페르마의 소정리, 포함 배제의 원리, 수학, 정수론, 누적 합

### 문제 설명

<p>Suppose 4 teachers are grading the presentation of a student and all their given marks are integers. The actual score is computed by taking arithmetic average of these 4 marks. Even though the marks are integers, the average can still be a fraction. But in some cases the average can also be an integer and in some rare cases the one of given marks can be equal to the average. Such rare incidents are called matching events. Considering all possible marks given by all teachers, you will have to count the total number of matching events. If the average mark matches with marks given by more than 1 teacher then for each match a matching event should be counted.</p>

### 입력

<p>There are at most 1001 test cases. The description of each test case is given below:</p>

<p>The input for each test case consists of two integers N (2 &le; N &le; 60) and fullmarks (1 &le; fullmarks &le; 200). Here N denotes the number of teachers who are grading the student and fullmarks denotes the maximum possible mark that any of the teachers can give. The minimum mark that a teacher can give is always zero.</p>

<p>Input is terminated by a line containing two zeroes.</p>

### 출력

<p>For each test case produce one line of output. This line contains the value M % 1 000 000 007 where M is the total number of matching events for the given input.</p>