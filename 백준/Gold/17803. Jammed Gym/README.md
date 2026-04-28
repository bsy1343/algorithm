# [Gold III] Jammed Gym - 17803

[문제 링크](https://www.acmicpc.net/problem/17803)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 32, 맞힌 사람: 31, 정답 비율: 67.391%

### 분류

수학, 다이나믹 프로그래밍, 기하학

### 문제 설명

<p>You are at the fitness centre to run through your exercise programme. You must use the kinds of exercise machine in an order precisely dictated by the programme, although there may be more than one instance of a machine.</p>

<p>You start at the centre of a unit circle around which the exercise stations are arranged. You can walk directly between any two points in the circle, and you may also visit the same point multiple times. See Figure J.1 below for an example.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17803.%E2%80%85Jammed%E2%80%85Gym/2766ee33.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17803.%E2%80%85Jammed%E2%80%85Gym/2766ee33.png" data-original-src="https://upload.acmicpc.net/fcb714ef-7740-42d3-8677-c9e2a63867e0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 237px; height: 230px;" /></p>

<p style="text-align: center;">Figure J.1: Illustration of Sample Input 1. Types of machine: [1, 2, 4, 1, 3, 2]</p>

<p>Exercise is an important and noble endeavour, but in today&rsquo;s busy world we must strive for efficiency in everything we do. Find the most efficient way of visiting exercise stations that matches the order given.</p>

### 입력

<ul>
	<li>The first line of input contains the number of exercises in the programme, n (1 &le; n &le; 100).</li>
	<li>The second line of input contains n space-separated integers each denoting the type of an item on the programme t (1 &le; t<sub>i</sub> &le; 100). There will always be at least one station for each programme in this list.</li>
	<li>The third line of input contains the number of stations, m (1 &le; m &le; 100).</li>
	<li>The fourth line of input contains m space-separated integers each denoting the type of a station q (1 &le; q<sub>i</sub> &le; 100).</li>
</ul>

### 출력

<p>Output the minimum distance you will need to walk. Your answer must be accurate to an absolute or relative error of 10<sup>&minus;6</sup>.</p>