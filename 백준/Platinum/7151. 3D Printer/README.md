# [Platinum I] 3D Printer - 7151

[문제 링크](https://www.acmicpc.net/problem/7151)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 14, 맞힌 사람: 13, 정답 비율: 43.333%

### 분류

기하학, 3차원 기하학

### 문제 설명

<p>3D printing is a technique for manufacturing items from a digital template. The printer lays down layers of a polymer material, building an entire 3D object as a series of flat plates of varying shapes, stacked upon one another. The polymer is initially sticky enough so that the plates printed on top of one another will adhere. After the object dries or cures, the resulting objects can be quite durable.</p>

<p>Consider a 3D printer in which objects to be printed are described as a template, consisting of a combination of several convex polyhedra (i.e., flat-surfaced objects such that a line from one interior point to another interior point never passes outside the volume of the object). Write a program to determine the total volume of polymer required to sculpt an object from a given template.</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with a line with a single integer n (1&le;n&le;100) representing the number of polyhedra in that template.</p>

<p>The subsequent lines describe the n polyhedra. Each polyhedron begins with a line containing an integer f (3&lt;f&lt;30), which is the number of faces on the polyhedron. Following that line is a series of lines describing polygons that comprise the faces. Each such line begins with an integer v (3&le;v&le;24), which is the number of vertices. Following v on the same line will be 3*v real numbers, representing the v vertices as (x,y,z) coordinates. For example, if v=3, then the line would be</p>

<pre>
v x1 y1 z1 x2 y2 z2 x3 y3 z3</pre>

<p>All coordinates will be in the range [-100..100]. Vertices are presented in sequential order; there will be an edge of the polygon from (x1,y1,z1) to (x2,y2,z2), from (x2,y2,z2) to (x3,y3,z3), and so on. The polygons are closed, so there is an implied edge from the last vertex in a polygon back to the first. All of the vertices of a face will be coplanar. Edges will not cross, and each vertex will lie on exactly two edges. No three (or more) vertices in a polygon will be collinear.</p>

<p>None of the polyhedra in any given test case will overlap. The input will end with a line with a single 0.</p>

### 출력

<p>For each template, print a real number on its own line, indicating the volume of polymer required in cubic centimeters. The volume should be printed with a precision of two decimal places, rounded. Do not print any spaces. Do not print any blank lines between answers.</p>