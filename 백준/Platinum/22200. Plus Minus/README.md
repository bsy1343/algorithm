# [Platinum I] Plus Minus - 22200

[문제 링크](https://www.acmicpc.net/problem/22200)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 47, 정답: 25, 맞힌 사람: 24, 정답 비율: 54.545%

### 분류

수학, 애드 혹, 조합론

### 문제 설명

<p>Matthew the physicist studies the quantum electro-dynamics of a silicon-based rectangular microchip. The microchip consists of a very large N &times;M grid of electrons. Each electron has either positive (up) or negative (down) spin, denoted by + and &minus; respectively.</p>

<p>Matthew does not know the spin of all the electrons, but he has done K measurements. In the i-th measurement, he discovered that the electron at position (y<sub>i</sub>, x<sub>i</sub>) has a given spin s<sub>i</sub>. He also knows that in each 2 &times; 2 subgrid, there are equally many electrons with positive and negative spin. He wants to know whether he can recover the state of every electron based on his measurements. If not, he would like to know how many possible states are consistent with his measurements. For classified reasons, he wants the answer modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>The first line contain three numbers N, M and K: the height of the grid, the width of the grid and the number of measurements. The next K lines contain a spin s<sub>i</sub> where s<sub>i</sub> is either + or -, and two numbers 1 &le; y<sub>i</sub> &le; N and 1 &le; x<sub>i</sub> &le; M &ndash; the coordinates of the electron. Matthew never did two measurments at the exact same location.</p>

### 출력

<p>Output the total number of valid states consistent with Matthew&rsquo; measurements modulo 10<sup>9</sup> + 7.</p>

### 제한

<p>We always have 1 &le; N, M &le; 10<sup>9</sup> and 0 &le; K &le; 100 000. For subcases, the inputs have these further restrictions.</p>