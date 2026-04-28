# [Platinum II] Designing the Toy - 15286

[문제 링크](https://www.acmicpc.net/problem/15286)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 71, 정답: 26, 맞힌 사람: 26, 정답 비율: 42.623%

### 분류

해 구성하기

### 문제 설명

<p>You are the main toy producer in the city. Recently you bought a 3D-printer that provides you with an unprecedented opportunity for designing new fancy toys for children.</p>

<p>In a package with the 3D-printer there is a booklet containing several examples of what can be created with it. One of the examples is a figure that looks like a triangle, like a circle, or like a square depending on which of its sides you are looking at.</p>

<p>Unfortunately, it turned out that the booklet describes the most recent version of your printer. Your printer is only able to create figures that consist of voxels (three-dimensional pixels), i.e. figures that look like a union of a unit-length cubes that are the cells of a three-dimensional grid. Thus, you are not able to print any &ldquo;smooth&rdquo; figures (like a sphere, for example) with it. On the other hand, important feature of your model is its ability to create figures whose parts are not even connected with each other by putting wires of a negligible thickness between them.</p>

<p>You like the idea of the figure in the booklet, so you decided to improve upon this idea. Instead of specifying shapes of figure projections from different perspectives, you would specify their areas. In this problem, a voxel is defined by a triple of integers (x, y, z), which corresponds to a unit cube [x, x + 1] &times; [y, y + 1] &times; [z, z + 1].</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15286.%E2%80%85Designing%E2%80%85the%E2%80%85Toy/41aa6d45.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15286.%E2%80%85Designing%E2%80%85the%E2%80%85Toy/41aa6d45.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15286/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:353px; width:347px" /></p>

<p>You are given three positive integers a, b and c. Your task is to find a description of a figure F consisting of one or more voxels, for which the area of its orthogonal projection onto the plane Oxy is a, the area of its orthogonal projection onto the plane Oxz is b, and the area of its orthogonal projection onto the plane Oyz is c, or to determine that it is impossible.</p>

### 입력

<p>The only line of the input contains three integers a, b, and c (1 &le; a, b, c &le; 100) &mdash; the desired area of orthogonal projections onto the planes Oxy, Oxz, and Oyz correspondingly.</p>

### 출력

<p>If it is impossible to find the desired figure, print only the integer &minus;1.</p>

<p>Otherwise, in the first line print the integer n, defining the number of voxels in the figure. Then print n triples x, y, z (&minus;100 &le; x, y, z &le; 100) defining the voxels of the figure. Voxels may be printed in any order, but no voxel may be repeated twice.</p>

<p>The number of voxels n should not exceed 10<sup>6</sup>.</p>

<p>Any figure with the requested projection areas is accepted.</p>