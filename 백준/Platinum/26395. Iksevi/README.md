# [Platinum IV] Iksevi - 26395

[문제 링크](https://www.acmicpc.net/problem/26395)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 80, 정답: 25, 맞힌 사람: 21, 정답 비율: 28.767%

### 분류

유클리드 호제법, 수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>After ten years of programming, Vinko has decided to change his profession and become a ceramist. Already on the first day of his new job he got an extremely difficult task.</p>

<p>He has to pave the concert hall&rsquo;s floor with square ceramic tiles. However, he won&rsquo;t pave the floor so that the tiles are parallel with the hall&rsquo;s walls. Instead, he will rotate them so that the diagonals of the tiles are parallel to the walls.</p>

<p>Vinko has not decided which size of tiles he will use, but he knows they all have to be the same size, and that the length of their diagonals in millimeters has to be a positive even integer. He will put the first tile so that it touches the bottom and left walls, and then he will pave the others so that they share a side with some of the previously set tiles. He will repeat the procedure until he paves the whole floor, whose dimensions are 10<sup>7</sup> &times; 10<sup>7</sup> square millimeters.</p>

<p>Besides being a good programmer and ceramist, Vinko is also an excellent musician. Because of that, he knows that there are n points on the floor that are crucial for good acoustics in the hall. The hall&rsquo;s acoustics would improve significantly if a tile&rsquo;s corner is at one of the n points.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26395.%E2%80%85Iksevi/6393d0ce.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26395.%E2%80%85Iksevi/6393d0ce.png" data-original-src="https://upload.acmicpc.net/52607d33-cd75-4f4c-8967-dc65b572c28f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 491px; height: 212px;" /></p>

<p style="text-align: center;">The left image shows the paving whose tiles have a diagonal of length 4. The point (2, 4) at on the corner of a tile, and for it the acoustics are good, but for the points (4, 3) and (5, 1) are not.</p>

<p style="text-align: center;">The right image shows the paving whose tiles have a diagonal of length 2. The point (4, 3) is at the corner of a tile, while points (2, 4) and (5, 1) are not.</p>

<p>Help Vinko determine for each of the n points in how many ways can he pave the floor (that is, how many different dimensions of the tiles can he choose) so that the i-th point is at a tile corner.</p>

### 입력

<p>The first line contains the integer n (1 &le; n &le; 10<sup>6</sup>), the number of acoustic points.</p>

<p>The following n lines contain two integers x<sub>i</sub>, y<sub>i</sub> (0 &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>7</sup>), which indicates that the i-th point is x<sub>i</sub> millimeters away from the left wall, and y<sub>i</sub> millimeters away from the lower wall of the hall.</p>

### 출력

<p>In the i-th of n lines print the number from the task statement for the i-th point.</p>

### 힌트

<p>Clarification of the second example: Images from the task statement correspond to the second example</p>