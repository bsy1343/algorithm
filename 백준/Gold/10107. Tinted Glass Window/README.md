# [Gold I] Tinted Glass Window - 10107

[문제 링크](https://www.acmicpc.net/problem/10107)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 53, 정답: 30, 맞힌 사람: 22, 정답 비율: 68.750%

### 분류

누적 합, 스위핑, 값 / 좌표 압축, 차분 배열 트릭

### 문제 설명

<p>You are laying N rectangular pieces of grey-tinted glass to make a stained glass window. Each piece of glass adds an integer value &ldquo;tint-factor&rdquo;. Where two pieces of glass overlap, the tint-factor is the sum of their tint-factors.</p>

<p>You know the desired position for each piece of glass and these pieces of glass are placed such that the sides of each rectangle are parallel to either the x-axis or the y-axis (that is, there are no &ldquo;diagonal&rdquo; pieces of glass).</p>

<p>You would like to know the total area of the finished stained glass window with a tint-factor of at least T.</p>

### 입력

<p>The first line of input is the integer N (1 &le; N &le; 1000), the number of pieces of glass. The second line of input is the integer T (1 &le; T &le; 1 000 000 000), the threshold for the tint-factor. Each of the next N lines contain five integers, representing the position of the top-left and bottom-right corners of the ith piece of tinted glass followed by the tint-factor of that piece of glass. Specifically, the integers are placed in the order x<sub>l</sub> y<sub>t</sub> x<sub>r</sub> y<sub>b</sub> t<sub>i</sub>, where the top-left corner is at (x<sub>l</sub>, y<sub>t</sub>) and the bottom-right corner is at (x<sub>r</sub>, y<sub>b</sub>), and tint-factor is t<sub>i</sub>. You can assume that 1 &le; t<sub>i</sub> &le; 1 000 000. The top-most, left-most co-ordinate where glass can be placed is (0, 0) and you may assume 0 &le; x<sub>l</sub> &lt; x<sub>r</sub> &le; K and 0 &lt; y<sub>t</sub> &lt; y<sub>b</sub> &le; K,&nbsp;N &le; 1000 and K &le; 1 000 000 000.</p>

### 출력

<p>Output the total area of the finished stained glass window which has a tint-factor of at least T. All output will be less than 2<sup>64</sup>, and the output for some test cases will be larger than 2<sup>32</sup>.</p>