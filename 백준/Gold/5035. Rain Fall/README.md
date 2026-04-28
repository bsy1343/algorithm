# [Gold V] Rain Fall - 5035

[문제 링크](https://www.acmicpc.net/problem/5035)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 56, 정답: 25, 맞힌 사람: 23, 정답 비율: 42.593%

### 분류

수학

### 문제 설명

<p>Rainfall is measured in millimeters. The rain is collected in a vertical transparent tube with millimeter markings, and once the rain has stopped falling, one can check the height of the water in the tube.</p>

<p>In our problem, the tube unfortunately has a leak at height L millimeters (mm). If the water level is above the leak then water drains from the tube at a rate of K millimeters per hour (mm/h).</p>

<p>We want to figure out how much rain fell during a particular rainfall. We assume that the tube is high enough that it does not overflow. We also assume that rain falls at an (unknown) uniform rate during a rainfall, and that water does not evaporate from the tube. The height of the leak itself is also negligible.</p>

### 입력

<p>The input is a line with five positive numbers: L K T1 T2 H where</p>

<ul>
	<li>L is where the leak is (mm)</li>
	<li>K is the rate at which water leaks (mm/h)</li>
	<li>T1 is the duration of the rainfall (h)</li>
	<li>T2 is the time between the end of the rainfall and the observation of the water level (h)</li>
	<li>H is the water level in the tube when we observe it (mm)</li>
</ul>

<p>Each number is at least 0.01 and at most 1000.00, and each is given with two decimals.</p>

### 출력

<p>One line with two floating point numbers F1 F2 where F1 is the smallest rainfall in millimeters that would result in the given observation, and F2 is the largest rainfall in millimeters that would result in the given observation. Values with either absolute or relative error smaller than 10<sup>&minus;6</sup> are acceptable.</p>