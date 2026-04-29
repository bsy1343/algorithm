# [Platinum V] Brickwork - 35240

[문제 링크](https://www.acmicpc.net/problem/35240)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

스위핑, 정렬

### 문제 설명

<p>We are attempting to design a wall as a tessellation of 2D rectangular brick shapes, with all of the bricks having exact integer coordinates and exact integer sizes.</p>

<p>Given a description of the brickwork in this 2D wall, determine if the wall is indeed a wall---covering a perfect rectangle with no overlapping bricks and with no empty spaces in between bricks. This means that every non-integer-coordinate inside the region should be covered by exactly one brick.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35240.%E2%80%85Brickwork/690f1721.png" data-original-src="https://boja.mercury.kr/assets/problem/35240-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 100px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35240.%E2%80%85Brickwork/a97be9dd.png" data-original-src="https://boja.mercury.kr/assets/problem/35240-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 100px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35240.%E2%80%85Brickwork/8a8553f9.png" data-original-src="https://boja.mercury.kr/assets/problem/35240-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 149px; height: 100px;"></p>

<p style="text-align: center;">Figure B.1: Brickwork illustrating samples 1, 2, and 3 respectively.</p>

### 입력

<ul>
<li>One line containing the number of bricks, $n$ ($1 \le n \le 1,000,000$).</li>
<li>$n$ further lines, each containing the description of a brick as four integers $x y w h$ giving the xy-coordinates, width, and height ($0 \le x, y \le 10^8$; $1 \le w, h \le 10^8$).</li>
</ul>

### 출력

<p>Output <code>yes</code> if the bricks constitute a valid wall, <code>no</code> otherwise.</p>