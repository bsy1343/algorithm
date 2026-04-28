# [Platinum II] Watching - 7611

[문제 링크](https://www.acmicpc.net/problem/7611)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 218, 정답: 127, 맞힌 사람: 89, 정답 비율: 59.732%

### 분류

다이나믹 프로그래밍, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>There are many interesting cultures in Australia such as various sports and various kinds of animals. You are trying to watch many events held on a road in Brisbane.</p>

<p>The road is separated into 1 000 000 000 sections. The sections are numbered 1, 2, . . . , 1 000 000 000 from west to east. You want to watch N events. The i-th event will be held on the section A<sub>i</sub>.</p>

<p>In order to watch the events, you prepared P small cameras and Q large cameras. You can choose a positive integer w as a parameter for taking pictures. Then, a small camera can take a picture of at most w consecutive sections, and a large camera can take a picture of at most 2w consecutive sections. Pictures of a section can be taken by more than one cameras. You want to take pictures of all the sections of the events. Since it is expected many people will visit the events, for the sake of safety, you have to fix the positions of the cameras and it is not allowed to move them during the events. The larger the parameter w is, the higher the cost to take pictures is. So, you want to minimize the value of w.</p>

<p>Write a program that, given information of the events and the number of cameras, determine the minimum value of w so that the pictures of all the sections of the events can be taken.</p>

### 입력

<p>Read the following data from the standard input.</p>

<ul>
	<li>The first line of input contains three space separated integers N, P, Q, where N is the number of the events, P is the number of small cameras, and Q is the number of large cameras.</li>
	<li>The i-th line (1 &le; i &le; N) of the following N lines contains an integer A<sub>i</sub>, the section where the i-th event will be held.</li>
</ul>

### 출력

<p>To the standard output, write the minimum value of w so that the pictures of all the sections of the events can be taken .</p>

### 제한

<ul>
	<li>1 &le; N &le; 2 000.</li>
	<li>1 &le; P &le; 100 000.</li>
	<li>1 &le; Q &le; 100 000.</li>
	<li>1 &le; A<sub>i</sub> &le; 1 000 000 000 (1 &le; i &le; N).</li>
</ul>

### 힌트

<p>In this example 1, when you choose w = 4, you can take pictures of all the sections of the events. For example, you can take pictures from the section 1 to 3 by a small camera, and you can take pictures from the section 11 to 18 by a large camera.</p>