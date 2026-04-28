# [Silver V] Hiding Nuts - 18306

[문제 링크](https://www.acmicpc.net/problem/18306)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 40, 맞힌 사람: 32, 정답 비율: 76.190%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Bob, a squirrel, has set up N hiding places throughout his territory, where he stores nuts before the winter. The hiding places are placed at integer coordinates on a grid. He would like to select one of those hiding places as his main den. He is very worried about his nuts being eaten by other animals. He would therefore like to choose a den that minimizes the average distance of the paths between the den and the N &minus; 1 remaining hiding places.</p>

<p>Bob has kind of a poor sense of direction. In order not to get lost between his den and each hiding place, he decides that he will only travel using the horizontal and vertical lines of the grid at integer coordinates.</p>

<p>For instance, the distance between the points D and E in the following grid is 4 (one path of minimal length between D and E is drawn in red below), and the average distance between D and the other points is 13/5 .</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/18306.%E2%80%85Hiding%E2%80%85Nuts/5621206c.png" data-original-src="https://upload.acmicpc.net/cbbe3c94-ecd1-4897-802e-e0c17c6ce4f0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 279px; height: 236px;" /></p>

### 입력

<p>The input consists of the following lines:</p>

<ul>
	<li>on the first line: the total number N of hiding places, an integer;</li>
	<li>on the next N lines: X<sub>i</sub> and Y<sub>i</sub>, the integer coordinates of the i-th hiding place, separated by a space.</li>
</ul>

### 출력

<p>The coordinates of a hiding place that minimizes the distance to the other hiding places. In case of equality, that hiding place must be the one with the smallest X coordinate and, in case there is still equality, with the smallest Y coordinate.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000;</li>
	<li>0 &le; X<sub>i</sub>, Y<sub>i</sub> &le; 1 000 000 for all points.</li>
</ul>

<p>No two hiding places are at the same coordinates.</p>