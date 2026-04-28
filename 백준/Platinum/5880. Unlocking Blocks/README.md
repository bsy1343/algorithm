# [Platinum IV] Unlocking Blocks - 5880

[문제 링크](https://www.acmicpc.net/problem/5880)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 49, 정답: 14, 맞힌 사람: 12, 정답 비율: 28.571%

### 분류

구현, 그래프 이론, 그래프 탐색, 기하학, 너비 우선 탐색

### 문제 설명

<p>A little-known fact about cows is that they love puzzles! For Bessie&#39;s birthday, Farmer John gives her an interesting mechanical puzzle for her to solve. The puzzle consists of three solid objects, each of which is built from 1x1 unit squares glued together. Each of these objects is a &quot;connected&quot; shape, in the sense that you can get from one square on the object to any other square on the object by stepping north, south, east, or west, through squares on the object.</p>

<p>An object can be moved by repeatedly sliding it either north, south, east, or west one unit. The goal of the puzzle is to move the objects so that they are separated -- where their bounding boxes no longer share any positive overlap with each-other. Given the shapes and locations of the three objects, your task is to help Bessie decide what is the minimum number of individual slides required to separate the objects.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5880.%E2%80%85Unlocking%E2%80%85Blocks/a24158a3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5880.%E2%80%85Unlocking%E2%80%85Blocks/a24158a3.png" data-original-src="https://www.acmicpc.net/upload/images2/fig_unlock.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:92px; width:92px" /></p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: N1, N2, and N3, describing respectively the number of unit squares making up objects 1, 2, and 3.</li>
	<li>Lines 2..1+N1: Each of these lines describes the (x,y) location of the south-west corner of single square that is part of object 1. All coordinates lie in the range 0..9.</li>
	<li>Lines 2+N1..1+N1+N2: Each of these lines describes the (x,y) location of the south-west corner of single square that is part of object 2. All coordinates lie in the range 0..9.</li>
	<li>Lines 2+N1+N2..1+N1+N2+N3: Each of these lines describes the (x,y) location of the south-west corner of single square that is part of object 3. All coordinates lie in the range 0..9.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The minimum number of moves necessary to separate the three objects, or -1 if the objects cannot be separated.</li>
</ul>

### 힌트

<h4>Input Details</h4>

<p>Object 1 is made from 12 squares, object 2 is made from 3 squares, and object 3 is made from 5 squares. The shapes of the objects are those in the figure above.</p>

<h4>Output Details</h4>

<p>If we slide object 3 to the east by one position, then slide object 2 north by one position, then slide object 1 west by three positions, then the bounding boxes of the three objects will no longer share any overlap in common.</p>