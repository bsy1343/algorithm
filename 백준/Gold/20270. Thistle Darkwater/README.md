# [Gold IV] Thistle Darkwater - 20270

[문제 링크](https://www.acmicpc.net/problem/20270)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 16, 맞힌 사람: 16, 정답 비율: 61.538%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>Thistle &#39;Silver-Eye&#39; Darkwater is a famous explorer. After sailing a long way on the seven seas, she has reached the mysterious archipelago of the Sunken Ship Isles. &nbsp;The geography there is not much different from her homeland of Scotland. Islands, &nbsp;coves, emerged rocks, inlets, aits, lochs, holms, skerries, cays, reefs and so on. It&#39;s just a giant maze. After such a long journey, Thistle and her crew are tired. They agree to pick a land to touch down upon, fill up with fresh food and have a well-deserved break. Looking from the crow&#39;s nest, her sailors have managed to establish a map of the surrounding land formations around her ship. Thistle wants to reach a part of land that has lots of food, so that the crew&#39;s rest will be long and plentiful. Of course, she can only pick a piece of land that she can reach by sea from her current position.</p>

<p>Her scouts have marked the territorial situation on a map which shows water, land or food at different positions located at the points of a hexagonal lattice. What they can see forms a hexagonal region centered around the ship. Every position on the map has therefore up to six neighbors. The ship is at the center of the lattice and is always positioned on water.</p>

<p>Can you help Thistle to find the most plentiful piece of connected land that she can reach by sea?</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/29184eed-a0d3-4891-8f5b-310bf73e3da8/-/preview/" style="width: 555px; height: 318px;" /></p>

### 입력

<p>The input file consists of multiple test cases. The first line of the input file consists of a single integer $n$ indicating the number of test cases. Each test case follows. The first line of a test case consists of a single integer $d$ ($1 \le d \le 100$) indicating the size of the side of the hexagon that represents the territory. The next $2d-1$ lines describe the territory. Each line has $4d-3$ characters. The $k$<sup>th</sup> line ($1\le k \le 2d-1$) consists of $2d-1 - |k-d|$ letters separated by single spaces and centered on the line with spaces. Each letter is either $W$ (the cell contains water), $L$ (the cell contains land without food), or $F$ (the cell contains land with food). The center letter of the center line is always $W$.</p>

### 출력

<p>For each test case in the input, your program should produce one line consisting of one integer that indicates the maximum number of food items on a piece of connected land that Thistle&#39;s boat can reach by sea from its initial position.</p>

### 힌트

<p>Image rights</p>

<ul>
	<li>Sailboat image: public domain, <a href="https://pixabay.com/vectors/yacht-sailing-sailboatsea-cruise-26603/">https://pixabay.com/vectors/yacht-sailing-sailboatsea-cruise-26603/</a></li>
	<li>Rice image: DataBase Center for Life Science (DBCLS) <a href="http://dbcls.rois.ac.jp/">http://dbcls.rois.ac.jp/</a> on <a href="https://commons.wikimedia.org/wiki/File:201109_rice.png">https://commons.wikimedia.org/wiki/File:201109_rice.png</a></li>
</ul>