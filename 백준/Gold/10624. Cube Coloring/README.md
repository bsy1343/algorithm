# [Gold III] Cube Coloring - 10624

[문제 링크](https://www.acmicpc.net/problem/10624)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 80, 정답: 49, 맞힌 사람: 39, 정답 비율: 63.934%

### 분류

다이나믹 프로그래밍, 수학, 누적 합

### 문제 설명

<p>Great painter Cubic is famous for using cubes for his art. Now, he is engaged in a new work of art. He tries to form an \(X \times Y \times Z\) rectangular parallelepiped by arranging and piling up many \(1 \times 1 \times 1\) cubes such that the adjacent surfaces of cubes are fully shared.</p>

<p>Of course, he won&#39;t finish his work only arranging and piling up cubes. The position of each cube is denoted by \((0,0,0)\) through \((X-1,Y-1,Z-1)\) as by the ordinary coordinate system, and Cubic calls the cube \((A,B,C)\) the <em>origin cube</em>. Then, he paints a pattern on the rectangular parallelepiped with different colors according to the distance between each cube and the origin cube. He paints all cubes regardless of whether or not a cube is visible externally. This is his artistic policy. He uses <em>Manhattan distance</em> as the distance between cubes. The Manhattan distance between two cubes \((x_1,y_1,z_1)\) and \((x_2,y_2,z_2)\) is defined as \(|x_1-x_2| + |y_1-y_2| + |z_1-z_2|\).</p>

<p>On the current work, Cubic decides to use \(N\) colors, which are numbered from \(1\) to \(N\). He paints a cube with the \((i+1)\)-th color if the distance \(D\) between the cube and the origin cube satisfies \(D \equiv i \pmod{N}\).</p>

<p>Cubic wants to estimate the consumption of each color in order to prepare for the current work. He asks a great programmer, you, to write a program calculating the number of cubes that will be painted by each color.</p>

### 입력

<p>The input contains seven integers \(X\), \(Y\), \(Z\), \(A\), \(B\), \(C\), and \(N\). All integers are in one line and separated by a single space. Three integers \(X\), \(Y\), and \(Z\) (\(1 \leq X, Y, Z \leq 10^6\)) represent the length of each side of the rectangular parallelepiped that Cubic tries to form. Three integers \(A\), \(B\), and \(C\) (\(0 \leq A \lt X\), \(0 \leq B \lt Y\), \(0 \leq C \lt Z\)) represent the position of the origin cube. The number of kinds of colors is denoted by \(N\) (\(1 \leq N \leq 1{,}000\)).</p>

### 출력

<p>The output contains \(N\) integers in one line. The \(i\)-th integer (\(1 \leq i \leq N\)) represents the number of the cubes that will be painted by the \(i\)-th color. All integers must be separated by a single space.</p>