# [Platinum III] Reflections - 6306

[문제 링크](https://www.acmicpc.net/problem/6306)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

구현, 기하학, 시뮬레이션

### 문제 설명

<p>Rendering realistic images of imaginary environments or objects is an interesting topic in computer graphics. One of the most popular methods for this purpose is ray-tracing.</p>

<p>To render images using ray-tracing, one computes (traces) the path that rays of light entering a scene will take. We ask you to write a program that computes such paths in a restricted environment.</p>

<p>For simplicity, we will consider only two-dimensional scenes. All objects in the scene are totally reflective (mirror) spheres. When a ray of light hits such a sphere, it is reflected such that the angle of the incoming ray and the leaving ray against the tangent are the same:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6306.%E2%80%85Reflections/009889a1.png" data-original-src="https://www.acmicpc.net/upload/images2/ray1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:272px; width:263px" /></p>

<p>The following figure shows a typical path that a ray of light may take in such a scene:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6306.%E2%80%85Reflections/d7015b06.png" data-original-src="https://www.acmicpc.net/upload/images2/ray2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:256px; width:314px" /></p>

<p>Your task is to write a program, that given a scene description and a ray entering the scene, determines which spheres are hit by the ray.</p>

### 입력

<p>The input consists of a series of scene descriptions. Each description starts with a line containing the number n (n &le; 25) of spheres in the scene. The following n lines contain three integers x<sub>i</sub> y<sub>i</sub> r<sub>i</sub> each, where (x<sub>i</sub>, y<sub>i</sub>) is the center, and r<sub>i</sub> &gt; 0 is the radius of the i-th sphere. Following this is a line containing four integers x y d<sub>x</sub> d<sub>y</sub>, which describe the ray. The ray originates from the point (x,&nbsp;y) and initially points in the direction (d<sub>x</sub>, d<sub>y</sub>). At least one of d<sub>x</sub> and d<sub>y</sub> will be non-zero.</p>

<p>The spheres will be disjoint and non-touching. The ray will not start within a sphere, and never touch a sphere tangentially.</p>

<p>A test case starting with n = 0 terminates the input. This case should not be processed.</p>

### 출력

<p>For each scene first output the number of the scene. Then print the numbers of the spheres that the ray hits in its first ten deflections (the numbering of spheres is according to their order in the input).</p>

<p>If the ray hits at most ten spheres (and then heads towards infinity), print inf after the last sphere it hits. If the ray hits more than 10 spheres, print three points (...) after the tenth sphere.</p>

<p>Output a blank line after each test case.</p>