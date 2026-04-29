# [Bronze III] Building Pyramids - 32585

[문제 링크](https://www.acmicpc.net/problem/32585)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 339, 정답: 258, 맞힌 사람: 219, 정답 비율: 80.220%

### 분류

브루트포스 알고리즘, 수학

### 문제 설명

<p>At long last, the cats have finally set aside their squabbles with the coatis and the bees. They decide to build a monument to commemorate the end of their feud. To show that such different animals can live together in harmony, the Great Architect Principal Coati decides that this monument should consist of two completely different three-dimensional shapes: the triangular pyramid (for having very sharp corners) and the sphere (for having no corners at all). The idea is to create a large regular tetrahedron out of many small spheres, similar to the one shown in Figure B.1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/32585.%E2%80%85Building%E2%80%85Pyramids/1330bac6.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32585-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 225px;"></p>

<p style="text-align: center;">Figure B.1: A triangular pyramid of spheres, corresponding to the second sample input. One edge of the pyramid contains $5$ spheres, so the entire pyramid consists of $35$ spheres.</p>

<p style="text-align: center;"><small>Image CC BY-NC 2.0 by Amafirlian on <a href="https://www.flickr.com/photos/amafirlian/355893316">Flickr</a></small></p>

<p>Alicia the coati, Beesworth the bee, and Darabella the cat would like this monument to be as large as possible. They have designated a piece of land to place the monument on, and have determined how many spheres should be in one of the edges based on where the monument will be placed. How many spheres will the entire pyramid contain, knowing the number of spheres in one of the edges?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1\leq n\leq 10^6$), the number of spheres in one of the edges of the pyramid.</li>
</ul>

### 출력

<p>Output the number of spheres in the entire pyramid.</p>