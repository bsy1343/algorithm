# [Platinum I] Lampice - 26399

[문제 링크](https://www.acmicpc.net/problem/26399)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 12, 맞힌 사람: 12, 정답 비율: 41.379%

### 분류

자료 구조, 해싱, 누적 합

### 문제 설명

<p>Christmas is coming! Teo has already decided to decorate his terrace.</p>

<p>Teo has a big rectangular-shaped terrace. It is n meters long and m meters wide. Teo has decided to decorate his terrace in a very strange way. Instead of hanging Christmas lights on the edges of his terrace, he will put them on the floor!</p>

<p>Teo has 2k lamps, two per each of k colours. He will put each in some position (x<sub>i</sub>, y<sub>i</sub>), where x<sub>i</sub> represents the distance from the left side of the terrace and y<sub>i</sub> from the bottom side.</p>

<p>Proud of how he decorated the terrace, he decided to take the rest of his day off. But soon he got bored, so he returned to the terrace. He started counting nice rectangles on the terrace. A rectangle is nice if for each colour both lamps are either inside or outside of the rectangle. If a lamp is located on the rectangle edge, it is considered to be inside of it.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26399.%E2%80%85Lampice/bc4ab28f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26399.%E2%80%85Lampice/bc4ab28f.png" data-original-src="https://upload.acmicpc.net/b8dc5cd6-0db1-4326-afe4-c629b67057a3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 547px; height: 191px;" /></p>

<p style="text-align: center;">The left rectangle is not nice. One blue lamp is inside the rectangle, and one is outside. The right rectangle is nice. Red and blue lamps are inside. Yellow lamps are outside.</p>

<p>Teo has realized that counting nice rectangles is not an easy job. He is interested in how many nice rectangles are there, whose corners have integer distances from the bottom and left sides of the terrace. All rectangles we consider are parallel with terrace sides. This is where you step in! Count the number of nice rectangles.</p>

### 입력

<p>The first line contains three integers n, m, k (1 &le; n &le; 150, 1 &le; m &le; 1 000, 0 &le; k &le; 200 000), the length and the width of the terrace, and the number of lamp colours.</p>

<p>The next k lines contain four numbers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub> (0 &le; x<sub>1</sub>, x<sub>2</sub> &le; n, 0 &le; y<sub>1</sub>, y<sub>2</sub> &le; m), positions of the first and the second lamp of the i-th colour.</p>

### 출력

<p>In a single line output the number of nice rectangles.</p>

### 힌트

<p>Clarification of the first example: The image shows all nice rectangles from the first example.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26399.%E2%80%85Lampice/d7a694bd.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26399.%E2%80%85Lampice/d7a694bd.png" data-original-src="https://upload.acmicpc.net/f05a7995-ab3e-4756-ba4f-c3d8f7e52064/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 243px; height: 85px;" /></p>