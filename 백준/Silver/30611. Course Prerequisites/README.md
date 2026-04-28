# [Silver IV] Course Prerequisites - 30611

[문제 링크](https://www.acmicpc.net/problem/30611)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 108, 정답: 87, 맞힌 사람: 67, 정답 비율: 79.762%

### 분류

자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>As a student at a university, you want to choose a set of courses for the next semester. Each course may or may not have a set of prerequisite courses. Therefore, before making your final decision, you want to ensure that you have satisfied all the prerequisites required for the courses you intend to take.</p>

<p>For instance, suppose a student has successfully completed courses courseA, courseB, courseC, courseE, courseG, and courseH. The course she wishes to enroll in has specific prerequisites, namely courseA, courseC, and courseG. In this scenario, the student meets the prerequisites because she has already completed all of them - courseA, courseC, and courseG.</p>

### 입력

<p>The first line of the input contains a single integer m, the size of set A (1 &le; m &le; 500,000). The second line of input contains the courses of set A separated by spaces. The third line of the input contains a single integer n, the size of set B (1 &le; n &le; 500,000). The fourth line of input contains the courses of set B separated by spaces.</p>

<p>All courses are strings. It is guaranteed that each string given contains at most 10 characters, and only consists of alphanumeric characters. The size of the input data is guaranteed to not exceed 5 megabytes.</p>

### 출력

<p>Output 0 if prerequisites are not satisfied, else 1 if prerequisites are satisfied.</p>