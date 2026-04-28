# [Platinum IV] Hamster - 30578

[문제 링크](https://www.acmicpc.net/problem/30578)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 11, 맞힌 사람: 7, 정답 비율: 22.581%

### 분류

구현, 자료 구조, 그래프 이론, 그래프 탐색, 기하학, 많은 조건 분기, 분리 집합

### 문제 설명

<p>Hamster Joe is one of the beloved pets of Tomorrow Programming School. The biology department entrusted the school&rsquo;s &ldquo;Central Robot Endowed with Smashing AI&rdquo; (CRESAI) with the job of projecting and building a playpen for Joe. This playpen will be situated in a newly designated animal space within the department. This space is a flat horizontal area, tiled with uniformly sized square tiles of unit side length, that come together to create a rectangular grid marked by grooves where tiles meet. The playpen will be bordered by unit-length wall segments, each rising from the groove between two adjacent tiles, ensuring that both ends of every segment align with tile corners.</p>

<p>Joe can move from his current tile to any adjacent tile if the tiles are not separated by a wall segment. Joe cannot jump or crawl over any wall segment and Joe also cannot squeeze himself between two adjacent wall segments, or smash himself through them. Thus, when the locations of the wall segments are chosen appropriately, they form an enclosure, from which Joe would not be able to escape.</p>

<p>Surprisingly, CRESAI was not up to the task. It positioned each wall segment of unit length correctly, in the sense that each segment&rsquo;s base now sits in a groove and its ends coincide with the corners of a tile. However, it seems that most of the wall segments were positioned randomly so that the existence of any enclosure of any shape is not guaranteed.</p>

<p>To fix the problem at least temporarily, biologists are looking for the minimum number of additional wall segments of unit length, which, when installed at appropriately selected unused grooves, would create an enclosure of any shape or size. In the resulting layout, some of the wall segments originally installed by CRESAI may remain useless.</p>

### 입력

<p>The first line contains one integer M (1 &le; M &le; 10<sup>5</sup>), the number of wall segments installed by CRESAI. Next, there are M lines, each describing one wall segment installed by CRESAI. A wall segment is described by four integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, where x<sub>1</sub>, y<sub>1</sub> are the coordinates of one end of the wall segment and, x<sub>2</sub>, y<sub>2</sub> are the coordinates of the other end of the segment. The axes of the system of coordinates are parallel to the grooves and the coordinates of each grove intersection are integers. For all wall segment coordinates, it holds &minus;10<sup>9</sup> &le; x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub> &le; 10<sup>9</sup> and |x<sub>1</sub> &minus; x<sub>2</sub>| + |y<sub>1</sub> &minus; y<sub>2</sub>| = 1.</p>

### 출력

<p>Output one line with the minimum number of additional wall segments which would create an enclosure of any size or shape, from which Joe would not be able to escape.</p>