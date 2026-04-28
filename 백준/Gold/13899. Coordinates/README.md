# [Gold V] Coordinates - 13899

[문제 링크](https://www.acmicpc.net/problem/13899)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 189, 정답: 106, 맞힌 사람: 75, 정답 비율: 51.020%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색

### 문제 설명

<p>In this problem, you are an advisor to a galactic empire that tries to locate all the rebel bases on a planet Taboo. The map of the planet Taboo is a grid of size 10<sup>8</sup> &times;10<sup>8</sup> and a position of a rebel based can be described by coordinate (x,y) where 0 &le; x, y &lt; 10<sup>8</sup>.</p>

<p>The empire captures a number of the rebels that surrender and interrogate them about the locations of the bases. Unfortunately, each surrendered rebel can only tell how far along X axis and Y axis a pair of bases are. Your job in this problem is to help reconstructing possible coordinates of all the bases that is consistent with all the interrogations.</p>

### 입력

<p>First line consists of two integers, N and M where 1 &le; N &le; 100 000 is the number of bases and N &le; M &le; 1 000 000 is the number of captured rebels.</p>

<p>The next M lines consist of 4 integers, a<sub>i</sub>, b<sub>i</sub>, dx<sub>i</sub>, and dy<sub>i</sub> where 1 &le; a<sub>i</sub> , b<sub>i</sub> &le; N, -10<sup>8</sup> &le; dx<sub>i</sub>, dy<sub>i </sub>&le; 10<sup>8</sup> indicating that the x-coordinate of base bi subtracted with the x-coordinate of base a<sub>i</sub> is dx<sub>i</sub> and the y-coordinate of base b<sub>i</sub> subtracted with the y-coordinate of base a<sub>i</sub> is dy<sub>i</sub></p>

<p>It is guaranteed that we can always deduce the positions of the bases from the input.&nbsp;</p>

### 출력

<p>The output consists of N lines each line consists of 2 integers x<sub>j</sub> and y<sub>j</sub> indicating possible position of the j th base. You can answer any solution that is consistent with all the interrogations. Translation of map is possible to outside of [0, 10<sup>8</sup>], however, the output coordinate of each base must be between -10<sup>9</sup> to 10<sup>9</sup></p>

### 힌트

<p>This is one of the possible coordinates, assuming that the first base is at (0,0)&nbsp;</p>