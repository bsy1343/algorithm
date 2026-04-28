# [Platinum V] Folded Fixtures - 7665

[문제 링크](https://www.acmicpc.net/problem/7665)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 8, 맞힌 사람: 8, 정답 비율: 100.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>You may know of a certain popular and coveted construction toy that Francis got for her birthday this week. This toy consists of a number of metal spheres that can be connected to each other using rigid links (all of the same length) with a magnet on each end. The ends of the links stick to the metal spheres, and the links can freely rotate and extend from the sphere in any direction (essentially forming a spherical joint), allowing you to create a variety of interesting structures.</p>

<p>Francis has assembled several such structures, and now wishes to store her creations by hanging them up in a corner of her room. She notices that, for some of her structures, when she picks it up and holds it by a single sphere, all the links collapse into a single, thin vertical line (see Figure 3) due to the pull of gravity and the spherical joints. Francis can hang up her creations by affixing one sphere on the structure to her ceiling, and wishes to save space by hanging each one up by the sphere that results in the shortest collapsed line. She deems those fixtures which do not hang as a single thin line to take up too much space, and discards them.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7665.%E2%80%85Folded%E2%80%85Fixtures/874960c9.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7665/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:147px; width:540px" /></p>

<p>Figure 3: One of Francis&rsquo;s constructions (left), the same collapsed into a straight-line fixture of length 2 (middle), and a structure that will not collapse into a single line when hung up by any sphere (right). Note that in the middle diagram, the horizontal gaps shown between the spheres are for illustrative purposes only! Mathematically, the fixture would be a single, infinitely thin vertical line.</p>

<p>For simplicity, we can treat the metal spheres as infinitely small points and the links as line segments of unit length. Can you write a program to help Francis figure out how much space her fixtures will take, and which ones to discard? Your task is to find the shortest length possible for the collapsed fixture if you were to hang it up by a single sphere, or report that there is no way to hang up the fixture by so that it collapses into an infinitely thin straight line.</p>

### 입력

<p>The input will contain multiple test cases for you to analyze. Each test case describes a fully connected fixture (i.e. there are no loose, unattached components). The first line of a test case consists of two integers, n and m, separated by a space, indicating the number of spheres (1 &le; n &le; 100) and links (0 &le; m &le; 1000) used in the structure, respectively. The spheres are numbered uniquely from 1 to n. The following m lines of input each contain two integers, a<sub>i</sub> and b<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n), indicating that Francis has attached sphere a to sphere b in her fixture. Note that both ends of a link cannot be attached to a single sphere, and no two links will attach the same two spheres.</p>

<p>A blank line separates input test cases, as seen in the sample input below. A single line containing &ldquo;0 0&rdquo; marks the end of input; do not process this case.</p>

### 출력

<p>For each input test case, print a single line containing the shortest length possible of the collapsed fixture. If it is not possible to hang the described fixture up by a single sphere so that it collapses into a line, print &ldquo;impossible&rdquo;.</p>