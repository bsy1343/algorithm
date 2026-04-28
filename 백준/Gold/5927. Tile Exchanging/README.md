# [Gold III] Tile Exchanging - 5927

[문제 링크](https://www.acmicpc.net/problem/5927)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 252, 정답: 117, 맞힌 사람: 91, 정답 비율: 52.000%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Farmer John wants to remodel the floor of his barn using a collection of square tiles he recently purchased from the local square mart store (which of course, only sells square objects).  Unfortunately, he didn&apos;t measure the size of the barn properly before making his purchase, so now he needs to exchange some of his tiles for new square tiles of different sizes.</p><p>The N square tiles previously purchased by FJ have side lengths A_1...A_N. He would like to exchange some of these with new square tiles so that the total sum of the areas of the his tiles is exactly M.  Square mart is currently offering a special deal: a tile of side length A_i can be exchanged for a new tile of side length B_i for a cost of |A_i-B_i|*|A_i-B_i| units. However, this deal only applies to previously-purchased tiles -- FJ is not allowed to exchange a tile that he has already obtained via exchanging some other tile (i.e., a size-3 tile cannot be exchanged for a size-2 tile, which is then exchanged for a size-1 tile).</p><p>Please determine the minimum amount of money required to exchange tiles so that the sum of the areas of the tiles becomes M.  Output -1 if it is impossible to obtain an area of M.</p>

### 입력

<ul><li>Line 1: Two space-separated integers, N (1&lt;=N&lt;=10) and M (1&lt;=M&lt;=10,000).</li><li>Lines 2..1+N: Each line contains one of the integers A_1 through A_N, describing the side length of an input square (1&lt;=A_i&lt;=100).</li></ul>

### 출력

<ul><li>Line 1: The minimum cost of exchanging tiles to obtain M units of total area, or -1 if this is impossible.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 3 tiles.  Two are squares of side length 3, and one is a square with side length 1.  We would like to exchange these to make a total area of 6.</p><h4>Output Details</h4><p>Exchange one of the side-3 squares for a side-2 square, and another side-3 square for a side-1 square.  This gives the desired area of 4+1+1=6 and costs 4+1=5 units.</p>