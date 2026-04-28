# [Platinum IV] A1 - 3247

[문제 링크](https://www.acmicpc.net/problem/3247)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 9, 맞힌 사람: 8, 정답 비율: 44.444%

### 분류

자료 구조, 그리디 알고리즘, 해시를 사용한 집합과 맵, 누적 합, 우선순위 큐, 세그먼트 트리, 스위핑, 집합과 맵

### 문제 설명

<p>Our country needs to be connected by highways that need to be repaired every once in a while. A committee chosen by the government of our country tries to continually improve the condition of the main highway imaginatively named &ldquo;A1&rdquo; by finding the first damage that needs to be fixed. Starting with the first damage the highway is divided into segments of the same length. A damage fixing team is then being sent to each segment containing damage. Since there usually are much more damages than teams available, it would be advisable to divide the highway into segments of given length in such a way that the number of segments containing damages is as small as possible.</p>

<p>There are N known damages on the highway, each described by an integer representing its distance from the beginning of the highway in meters. The length of a segment is M meters (an integer). There are no damages within the first M meters. The first segment has to start within the first M meters of the highway. If the first segment starts at the Kth meter then Lth segment starts at the (K+(L-1)*M)th meter of the highway. A team can fix all damages occurring within one segment starting with the first meter of the segment and ending with the last meter of that segment.</p>

<p>Write a program that will determine the minimal number of damage fixing teams needed to fix all damages occurring on the highway &ldquo;A1&rdquo; and all possible beginnings of the first segment.&nbsp;</p>

### 입력

<p>The first line of the input file contains two whole numbers M and N separated by a space character, 1 &le; M, N &le; 100 000, where M is a length of a segment and N is a number of damages occurring on the highway.</p>

<p>The second line contains N whole numbers separated by a space character representing the positions of all damages. Each of those numbers is greater than M and less than or equal to 2 000 000 000 (two billion). The sequence of N numbers given in the second line will always be strictly increasing sequence.&nbsp;</p>

### 출력

<p>The first line of the output file should contain the minimal number of damage fixing teams.</p>

<p>The second line should contain all the positions where the first segment can begin. These numbers should be separated by a space character and they must form a strictly increasing sequence.&nbsp;</p>