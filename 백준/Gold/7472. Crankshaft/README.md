# [Gold II] Crankshaft - 7472

[문제 링크](https://www.acmicpc.net/problem/7472)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

기하학

### 문제 설명

<p>One company develops a CAD system for crankshaft design. The crankshafts in question are combined of 0 &lt; <em>N</em> &le; 100 metal plates. All plates are made of the same alloy and have equal (small) thickness. Each plate has the shape of a polygon with 3 &le; <em>V<sub>i</sub></em> &le; 200 vertices. All plates in the crankshaft are parallel and firmly connected to each other. They are the only elements of the crankshaft.</p>

<p>Among other features, this CAD system should have a routine for determining the rotation axis of the crankshaft. More precisely, customers sometimes need to find a line, perpendicular to the plane of the crankshaft plates, rotation around which causes minimal vibration of the crankshaft. It is well known that such axis must pass through the mass center of the crankshaft.</p>

<p>The crankshaft design is stored as a set of vertex coordinates for each plate in some Cartesian coordinate system. The plane <em>OXY</em> of the system is parallel to the plates surfaces. All the coordinates are integer, &minus;10<sup>4</sup> &le; X<sub>ij</sub> , Y<sub>ij</sub> &le; 10<sup>4</sup> , where 1 &le; <em>j</em> &le; V<sub>i</sub> , 1 &le; <em>i</em> &le; <em>N</em>. The vertices are numbered clockwise (<em>OX</em> axis is directed rightwards, <em>OY</em> axis is directed upwards). Your program should print the rotation axis coordinates (<em>X<sub>R</sub></em> and <em>Y<sub>R</sub></em>). The correct answer should be given even for a partially designed crankshaft (consisting of two or more non-connected parts). You should suppose that these parts are firmly connected.</p>

### 입력

<p>The input file consists of integer numbers, delimited by spaces and/or line feeds. The numbers are specified in the following order:</p>

<p><em>N</em></p>

<p><em>V<sub>1</sub> X<sub>11</sub> Y<sub>11</sub> ... X<sub>1V<sub>1</sub></sub> Y<sub>1V<sub>1</sub></sub></em></p>

<p>...</p>

<p><em>V<sub>N</sub> X<sub>N1</sub> Y<sub>N1</sub> ... X<sub>NV<sub>N</sub></sub> Y<sub>1V<sub>N</sub></sub></em></p>

### 출력

<p>The output file should contain two real numbers: <em>X<sub>R</sub></em> and <em>Y<sub>R</sub></em>. These values must be exact to four digits to the right of the decimal point.</p>