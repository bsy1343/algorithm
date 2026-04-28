# [Gold IV] Biometrics - 4323

[문제 링크](https://www.acmicpc.net/problem/4323)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 12, 맞힌 사람: 10, 정답 비율: 41.667%

### 분류

기하학

### 문제 설명

<p>Recently, the term Biometrics been used to refer to the emerging field of technology devoted to identification of individuals using biological traits, such as those based on retinal or iris scanning, fingerprints, or face recognition.</p>

<p>A simple biometric system translates a human image into a polygon by considering certain features (eyes, nose, ears, etc.) to be vertices and connecting them with line segments. The polygon has distinct vertices but may be degenerate in that the line segments could intersect. Because these polygons are generally created from remote images, there is some uncertainty as to their scale and rotation. Your job is to determine whether or not two polygons are similar; that is, can they be made equal by repositioning, rotating and magnifying them?</p>

### 입력

<p>Input consists of several test cases. Each test case consists of three lines containing:</p>

<ul>
	<li>f, the number of features</li>
	<li>f coordinate pairs giving the vertices of the first polygon</li>
	<li>f coordinate pairs giving the vertices of the second polygon</li>
</ul>

<p>The vertices for both polygons correspond to the same set of features in the same order; for example, right ear tip, chin cleft, right eye, nose, left eye, left ear tip, space between front teeth. Each polygon has f distinct vertices; each vertex is given as an x and y coordinate pair. There are at least three and no more than ten features. Coordinates are integers between -1000 and 1000. A line containing 0 follows the last test case.</p>

### 출력

<p>For each case, output a line &quot;similar&quot; or &quot;dissimilar&quot; as appropriate. The two polygons are similar if, after some combination of translation, rotation, and scaling (but not reflection) both vertices corresponding to each feature are in the same position.</p>