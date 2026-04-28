# [Platinum III] Azulejos - 17150

[문제 링크](https://www.acmicpc.net/problem/17150)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 164, 정답: 63, 맞힌 사람: 61, 정답 비율: 48.413%

### 분류

자료 구조, 그리디 알고리즘, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Ceramic artists Maria and Jo&atilde;o are opening a small azulejo store in Porto. Azulejos are the beautiful ceramic tiles for which Portugal is famous. Maria and Jo&atilde;o want to create an attractive window display, but, due to limited space in their shop, they must arrange their tile samples in two rows on a single shelf. Each of Jo&atilde;o&rsquo;s tiles has exactly one of Maria&rsquo;s tiles in front of it and each of Maria&rsquo;s tiles has exactly one of Jo&atilde;o&rsquo;s tiles behind it. These hand-crafted tiles are of many different sizes, and it is important that each tile in the back row is taller than the tile in front of it so that both are visible to passers-by. For the convenience of shoppers, tiles in each row are arranged in non-decreasing order of price from left to right. Tiles of the same price may be arranged in any order subject to the visibility condition stated above.</p>

<p>Your task is to find an ordering of the tiles in each row that satisfies these constraints, or determine that no such ordering exists.</p>

### 입력

<p>The first line of input contains an integer n (1 &le; n &le; 5 &middot; 10<sup>5</sup>), the number of tiles in each row. The next four lines contain n integers each; the first pair of lines represents the back row of tiles and the second pair of lines represents the front row. Tiles in each row are numbered from 1 to n according to their ordering in the input. The first line in each pair contains n integers p<sub>1</sub>, . . . , p<sub>n</sub> (1 &le; p<sub>i</sub> &le; 10<sup>9</sup> for each i), where p<sub>i</sub> is the price of tile number i in that row. The second line in each pair contains n integers h<sub>1</sub>, . . . , h<sub>n</sub> (1 &le; h<sub>i</sub> &le; 10<sup>9</sup> for each i), where h<sub>i</sub> is the height of tile number i in that row.</p>

### 출력

<p>If there is a valid ordering, output it as two lines of n integers, each consisting of a permutation of the tile numbers from 1 to n. The first line represents the ordering of the tiles in the back row and the second represents the ordering of the tiles in the front row. If more than one pair of permutations satisfies the constraints, any such pair will be accepted. If no ordering exists, output impossible.</p>