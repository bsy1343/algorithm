# [Silver I] Floor Plan - 6907

[문제 링크](https://www.acmicpc.net/problem/6907)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 211, 정답: 70, 맞힌 사람: 59, 정답 비율: 33.714%

### 분류

그래프 이론, 그래프 탐색, 정렬, 너비 우선 탐색, 깊이 우선 탐색, 플러드 필

### 문제 설명

<p>The floor plan of a house shows rooms separated by walls. This floor plan can be transferred to a grid using the character <code>I</code> for walls and <code>.</code> for room space. Doorways are not shown. Each <code>I</code> or <code>.</code> character occupies one square metre.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6907.%E2%80%85Floor%E2%80%85Plan/0592bea9.png" data-original-src="https://upload.acmicpc.net/a737d03e-09f3-48d1-957c-04c6dc1dc10f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 262px;" /></p>

<p>In this diagram, there are six rooms.</p>

<p>You have been given the floor plan of a house and a supply of hardwood flooring. You are to determine how many rooms will have the flooring installed if you start installing the floor in the largest room first and move to the next largest room, and so on. You may not skip over any room, and you must stop when you do not have enough wood for the next room. Output the number of rooms that can have hardwood installed, and how many square metres of flooring are left over. No room will be larger than $64$ square metres.</p>

<p>The first line contains the number of square metres of flooring you have. The second line contains an integer $r$ in range $1 \dots 25$ that represents the number of rows in the grid. The third line contains an integer $c$ in $1 \dots 25$ that represents the number of columns in the grid. The remaining $r$ lines contain $c$ characters of grid data.</p>

### 입력



### 출력

