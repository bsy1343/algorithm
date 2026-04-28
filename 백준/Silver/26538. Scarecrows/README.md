# [Silver V] Scarecrows - 26538

[문제 링크](https://www.acmicpc.net/problem/26538)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 31, 맞힌 사람: 25, 정답 비율: 71.429%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>After having your field picked apart by crows time and time again, you&rsquo;ve decided to employ a system of scarecrows. In order to determine how effective your scarecrow network is, and which areas need more protection, create a graph to display which areas of the field are protected. Each of your scarecrows has a unique range in which it works. Any location within P distance from a scarecrow with a range of P will be protected.</p>

### 입력

<p>The first line will contain a single integer n that indicates the number of data sets that follow. Each data set will start with a single integer w, h, and q, denoting the width and height of your field, and the number of scarecrows you have. the next q lines consist of 3 space separated integers, r, c, and p, representing the horizontal and vertical position of each scarecrow and its range. 0&le;r</p>

### 출력

<p>For each test case, output h lines of w characters each, where character w of line h is an &lsquo;*&rsquo; if point (w,h) is protected, an &lsquo;x&rsquo; if it is a scarecrow, and a &lsquo;.&rsquo; Otherwise. Leave a blank line between test cases.</p>