# [Gold III] Hexagon Perplexagon - 4020

[문제 링크](https://www.acmicpc.net/problem/4020)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 63, 정답: 21, 맞힌 사람: 14, 정답 비율: 50.000%

### 분류

수학, 구현, 브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>A well known puzzle consists of 7 hexagonal pieces, each with the numbers 1 through 6 printed on the sides. Each piece has a different arrangement of the numbers on its sides, and the object is to place the 7 pieces in the arrangement shown below such that the numbers on each shared edge of the arrangement are identical. Figure (a) is an example of one solution:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4020.%E2%80%85Hexagon%E2%80%85Perplexagon/004219c2.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4020.%E2%80%85Hexagon%E2%80%85Perplexagon/004219c2.png" data-original-src="https://www.acmicpc.net/upload/images2/hex(1).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:264px; width:489px" /></p>

<p>Rotating any solution also gives another trivially identical solution. To avoid this redundancy, we will only deal with solutions which have a 1 on the uppermost edge of the central piece, as in the example.</p>

### 입력

<p>The first line of the input file will contain a single integer indicating the number of test cases. Each case will consist of a single line containing 42 integers. The first 6 represent the values on piece 0 listed in clockwise order; the second 6 represent the values on piece 1, and so on.</p>

### 출력

<p>For each test case, output the case number (using the format shown below) followed by either the phrase No solution or by a solution specification. A solution specification lists the piece numbers in the order shown in the Position Notation of Figure (b). Thus if piece 3 is in the center, a 3 is printed first; if piece 0 is at the top, 0 is printed second, and so on. Each test case is guaranteed to have at most one solution.</p>