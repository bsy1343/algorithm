# [Platinum II] Doors and Penguins - 4743

[문제 링크](https://www.acmicpc.net/problem/4743)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 99, 정답: 28, 맞힌 사람: 19, 정답 비율: 22.353%

### 분류

볼록 껍질, 기하학, 선분 교차 판정, 볼록 다각형 내부의 점 판정

### 문제 설명

<p>The organizers of the Annual Computing Meeting have invited a number of vendors to set up booths in a large exhibition hall during the meeting to showcase their latest products. As the vendors set up their booths at their assigned locations, they discovered that the organizers did not take into account an important fact &mdash; each vendor supports either the Doors operating system or the Penguin operating system, but not both. A vendor supporting one operating system does not want a booth next to one supporting another operating system.</p>

<p>Unfortunately the booths have already been assigned and even set up. There is no time to reassign the booths or have them moved. To make matter worse, these vendors in fact do not even want to be in the same room with vendors supporting a different operating system.</p>

<p>Luckily, the organizers found some portable partition screens to build a wall that can separate the two groups of vendors. They have enough material to build a wall of any length. The screens can only be used to build a straight wall. The organizers need your help to determine if it is possible to separate the two groups of vendors by a single straight wall built from the portable screens. The wall built must not touch any vendor booth (but it may be arbitrarily close to touching a booth). This will hopefully prevent one of the vendors from knocking the wall over accidentally.</p>

### 입력

<p>The input consists of a number of cases. Each case starts with 2 integers on a line separated by a single space: D and P , the number of vendors supporting the Doors and Penguins operating system, respectively (1 &le; D, P &le; 500). The next D lines specify the locations of the vendors supporting Doors. This is followed by P lines specifying the locations of the vendors supporting Penguins. The location of each vendor is specified by four positive integers: x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>. (x<sub>1</sub>, y<sub>1</sub>) specifies the coordinates of the southwest corner of the booth while (x<sub>2</sub>, y<sub>2</sub>) specifies the coordinates of the northeast corner. The coordinates satisfy x<sub>1</sub> &lt; x<sub>2</sub> and y<sub>1</sub> &lt; y<sub>2</sub>. All booths are rectangular and have sides parallel to one of the compass directions. The coordinates of the southwest corner of the exhibition hall is (0, 0) and the coordinates of the northeast corner is (15000, 15000). You may assume that all vendor booths are completely inside the exhibition hall and do not touch the walls of the hall. The booths do not overlap or touch each other.</p>

<p>The end of input is indicated by D = P = 0.</p>

### 출력

<p>For each case, print the case number (starting from 1), followed by a colon and a space. Next, print the sentence:</p>

<p>It is possible to separate the two groups of vendors.</p>

<p>if it is possible to do so. Otherwise, print the sentence:</p>

<p>It is not possible to separate the two groups of vendors.</p>

<p>Print a blank line between consecutive cases.</p>