# [Platinum I] Green Energy - 9585

[문제 링크](https://www.acmicpc.net/problem/9585)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 7, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

기하학, 수학

### 문제 설명

<p>The technological progress in Flatland is impressive. This year, for example, the solar power stations of a new type will be build. In these stations solar panels are mounted not on the ground, but on high towers, along their heights.</p>

<p>There are n towers to be mounted. The towers are already bought. The height of i-th tower is h<sub>i</sub>. Now engineers want to choose the points where they should be mounted to get the maximal total power.</p>

<p>The landscape of a territory of the power plant is described by a polyline with m vertices. Vertices of the landscape polyline have coordinates (x<sub>i</sub>, y<sub>i</sub>), such that x<sub>i</sub> &lt; x<sub>i+1</sub>.</p>

<p>The sun angle is always &alpha; degrees in Flatland. The sun is shining from the top-left to the bottom-right. The power that is produced by a tower depends on the length of its surface illuminated by the sun.</p>

<p>When two towers are mounted close to each other, the shadow of the left tower may fall onto the right tower, so the power, produced by the right tower, decreases. Also, the landscape itself may contain high points that drop shadows on some towers.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9585.%E2%80%85Green%E2%80%85Energy/1221d9bd.png" data-original-src="https://www.acmicpc.net/upload/images2/ge.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:182px; width:604px" /></p>

<p>Your task is to find the points on the territory of the plant to mount the given towers to maximize the total length of towers surface that is illuminated by the sun.</p>

### 입력

<p>The first line of the input file contains three integers n, m and &alpha; (1 &le; n &le; 10<sup>4</sup>, 2 &le; m &le; 10<sup>4</sup>, 1 &le; &alpha; &lt; 90). The second line contains n integers h<sub>i</sub> &mdash; the heights of the towers (1 &le; h<sub>i</sub> &le; 10<sup>3</sup>). The following m lines contain pairs x<sub>i</sub>, y<sub>i</sub> &mdash; the coordinates of the vertices of the landscape (|x<sub>i</sub>| &le; 10<sup>5</sup>, x<sub>i</sub> &lt; x<sub>i+1</sub>, |y<sub>i</sub>| &le; 10<sup>3</sup>).</p>

### 출력

<p>On the first line output the maximal possible summary length of towers that can be illuminated by the sun with an absolute precision of at least 10<sup>-6</sup>. On the next n lines output the x-coordinates of the points where the towers should be mounted to achieve this maximum with an absolute precision of at least 10<sup>-9</sup>. Towers should be listed in the same order they are given in the input file.</p>

### 힌트

<p>In this example two towers are mounted at the same point. This is allowed, but only one, the longest, of the towers mounted at the same point is considered to be illuminated by the sun.</p>