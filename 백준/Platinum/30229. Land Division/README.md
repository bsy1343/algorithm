# [Platinum IV] Land Division - 30229

[문제 링크](https://www.acmicpc.net/problem/30229)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 8, 맞힌 사람: 7, 정답 비율: 29.167%

### 분류

수학, 기하학, 삼분 탐색

### 문제 설명

<p>Uncle Trapezoid has a piece of land in the shape of a trapezoid that he would like to split into four pieces to bequeath to his four nieces. He is fairly lazy, so all he will do is pick a particular point inside of the trapezoid, and then the four pieces will be the four triangles formed by this point and each of the four sides of the trapezoid as illustrated below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30229.%E2%80%85Land%E2%80%85Division/b2da2604.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30229.%E2%80%85Land%E2%80%85Division/b2da2604.png" data-original-src="https://upload.acmicpc.net/4a3b25d4-437b-4866-aead-1e746e7c51d3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 275px; height: 160px;" /></p>

<p>Naturally, Uncle Trapezoid wants to be as fair as possible and minimize the difference in area between the smallest triangle and the largest triangle.</p>

<p>Given the length of both bases and the height of a trapezoid, determine the smallest possible difference in area between the smallest and largest triangles formed by choosing any point inside of the trapezoid to form the four triangles (one with each side of the trapezoid).</p>

<p>Note: The bases must be parallel with a distance equal to the height between the two lines the bases define. However, where the bases are located relative to each other does not affect the answer to this problem.</p>

### 입력

<p>There is only one input line; it contains three integers: b<sub>1</sub> (1 &le; b<sub>1</sub> &le; 10<sup>4</sup>), b<sub>2</sub> (1 &le; b<sub>2</sub> &lt; b<sub>1</sub>), and h (1 &le; h &le; 10<sup>4</sup>), representing the lengths of the long base, short base and height of the trapezoid, respectively.</p>

### 출력

<p>Print the smallest possible difference in area between the smallest and largest triangles that the trapezoid could be partitioned into. Any answer within an absolute or relative tolerance of 10<sup>-6</sup> will be accepted.</p>