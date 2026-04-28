# [Platinum II] Get out! - 22799

[문제 링크](https://www.acmicpc.net/problem/22799)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 2, 맞힌 사람: 2, 정답 비율: 16.667%

### 분류

정렬, 기하학, 스위핑, 삼분 탐색, 각도 정렬

### 문제 설명

<p>Tom was captured by aliens and brought into a mysterious region.</p>

<p>Since the event was all of a sudden, he did not understand what happened to him until he found some circular objects in the region. They looked really ominous so he got much horrified. He seriously began to consider escaping there, evading the objects, as soon as possible.</p>

<p>The region can be considered on a two-dimensional field. Tom was told that he got caused so that he could do nothing but move straight just in one direction, before the aliens dissapeared. Needless to say, he will fail to escape if he crashes with the objects as his move is blocked, though he may touch them.</p>

<p>In addition to that, when he passes by the objects, he will be robbed of his energy at the closest point to each object. The amount of energy absorbed by the object i is represented by</p>

<p style="text-align: center;">$$\begin{cases} P_i \times (r_i - d_i) / r_i &amp; \text{if }d_i \le r_i \\ 0 &amp; \text{otherwise} \end{cases}$$</p>

<p>where P<sub>i</sub> is a positive number called the power of the object i, r<sub>i</sub> is the radius of the object i, and d<sub>i</sub> is the distance between Tom and the circumference of the object when he gets to the closest point.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22799.%E2%80%85Get%E2%80%85out!/b81cdfc1.png" data-original-src="https://upload.acmicpc.net/81e601f4-95f4-44dc-8021-e43ed00d19f1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 139px; height: 175px;" /></p>

<p>Tom gets unable to move anymore if he loses all his energy.</p>

<p>Your task is to write a program that shows Tom&rsquo;s remaining energy after his escape when he moves in such a direction that he remains his energy as much as possible.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22799.%E2%80%85Get%E2%80%85out!/255c4788.png" data-original-src="https://upload.acmicpc.net/44478051-a831-4a8b-9cc3-446a88b10144/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 408px; height: 288px;" /></p>

### 입력

<p>The input consists of a series of data sets.</p>

<p>The first line of a data set contains an integer N (1 &le; N &le; 50) that indicates the number of the circular objects. The (i + 1)-st line contains four real numbers x<sub>i</sub> (&minus;1000 &le; x<sub>i</sub> &le; 1000), y<sub>i</sub> (&minus;1000 &le; y<sub>i</sub> &le; 1000), r<sub>i</sub> (0.1 &le; r<sub>i</sub> &le; 500), and P<sub>i</sub> (0.1 &le; P<sub>i</sub> &le; 500), which denote the x and y coordinates of the center, the radius, and the power of the object i respectively. The (N + 2)-nd line contains three real numbers x (&minus;1000 &le; x &le; 1000), y (&minus;1000 &le; y &le; 1000), and E (0.1 &le; E &le; 100), which denote the x and y coordinates of Tom&rsquo;s initial position, and Tom&rsquo;s initial energy respectively.</p>

<p>There is always difference of at least 10<sup>&minus;5</sup> degrees between directions Tom can escape touching objects on his left-hand, and that Tom can escape touching objects on his right-hand.</p>

<p>An input line containing a single integer 0 indicates the end of input.</p>

### 출력

<p>For each data set, print a single line.</p>

<p>If Tom can escape from the region, print Tom&rsquo;s remaining energy with three digits after the decimal point. The value should not contain an error greater than 0.001.</p>

<p>Otherwise, print &ldquo;No way to escape&rdquo;.</p>

<p>You may assume Tom remains his energy of at least 10<sup>&minus;5</sup> as long as he moves in such a direction&nbsp;that he can escape. In other words, there is not such a path that Tom can escape remaining his energy less than 10<sup>&minus;5</sup>.</p>

<p>Note that the output line may contain 0.000, though. No extra spaces or blank lines should be printed.</p>