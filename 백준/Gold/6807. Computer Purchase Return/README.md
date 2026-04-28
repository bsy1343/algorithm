# [Gold II] Computer Purchase Return - 6807

[문제 링크](https://www.acmicpc.net/problem/6807)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 14, 맞힌 사람: 11, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>After considering to buy a brand new Atari or Commodore computer (based on your extensive research in late February), you decide to get the best value for your dollar by building your own.</p>

<p>The computer that you are going to build is composed of T (1 &le; T &le; 5) different types of components. Your computer must have exactly one of each type of component.</p>

<p>Each component has an integer cost c<sub>i</sub> (1 &le; c<sub>i</sub> &le; 3, 000), an integer value v<sub>i</sub> (1 &le; v<sub>i</sub> &le; 3, 000), and type t<sub>i</sub> (1 &le; t<sub>i</sub> &le; T).</p>

<p>Your on-line computer parts store has N different components (1 &le; N &le; 1, 000) that you can select from.</p>

<p>For a given budget B (1 &le; B &le; 3, 000), maximize the total value of the components in your computer.</p>

<p>If you cannot construct such a computer, you should print &minus;1.</p>

### 입력

<p>The first line contains T, the number of types of components your computer requires. The next line contains the number N, followed by N lines of three integers, representing c<sub>i</sub>, v<sub>i</sub> and t<sub>i</sub>, each separated by one space. The last line of input is the budget B.</p>

### 출력

<p>Output the value of the maximum valued computer you can create which costs at most B, or &minus;1 if you cannot construct a computer.</p>

### 힌트

<p>Notice that picking the components with cost 11 and 5 yields a computer with value 18. No other combination of components has a higher value.</p>