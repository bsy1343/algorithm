# [Platinum IV] Robots and Oil Transportation System - 11817

[문제 링크](https://www.acmicpc.net/problem/11817)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 35, 정답: 30, 맞힌 사람: 14, 정답 비율: 82.353%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 단절점과 단절선

### 문제 설명

<p>In some country there is a huge oil transportation system. The system consists of control stations. Some pairs of stations are conneted by pipes.</p>

<p>System is conneted, so there is a path via pipes from each control station to each other control station. But there are some pipes such that if they will broke, the system will become not conneted. These pipes are called magistral. It&#39;s guaranteed that there is at least one magistral pipe.</p>

<p>The company has bought two robots for maintaining magistral pipes. After receiving a command, some magistral pipe will be chosen and both robots start to move to different ends of this pipe. Arrival time is the time needed for robot that will arrive to its destination later.</p>

<p>Robots are moving along pipes. They pass one unit of length in one unit of time. At the moment of receiving the command robots are located on the given control stations (may be different).</p>

<p>Write a program that will determine a magistral pipe such that robots&#39; arrival time is minimal possible.</p>

### 입력

<p>First line of the input contains two integer numbers N (2 &le; N &le; 100 000) and M (2 &le; M &le; 100 000) - number of control stations and pipes.</p>

<p>Each of the next M lines contains three integers: numbers of two control stations and length of the pipe conneting them. Length of the pipe does not exeed 1000.</p>

<p>(M + 2)-th line contains two integers: numbers of the control stations where robots are located at the moment of receiving command.</p>

### 출력

<p>Output the only one number - minimal time robots&#39; arrival time to a magistral pipe.</p>