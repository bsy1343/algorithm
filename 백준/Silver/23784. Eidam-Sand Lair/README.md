# [Silver V] Eidam-Sand Lair - 23784

[문제 링크](https://www.acmicpc.net/problem/23784)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 136, 정답: 40, 맞힌 사람: 38, 정답 비율: 34.234%

### 분류

수학, 많은 조건 분기

### 문제 설명

<p>In your base you have dug through sand and rock to construct a deep pit with stairs and a lift. The pit goes very deep into the ground where on various floors you leave equipment and on the deepest levels you leave cheeses to age, particularly Eidam. You often take a stroll downstairs, but wonder whether it is faster to go up to the surface by foot or take a lift for a part or all of the trip.</p>

<p>You know the position and the speed of yourself and the lift. The surface floor is numbered 0, positive numbers denote underground floors by their distance to the surface. You are alone on the Mars so only you will use the lift. Also, it takes (you and lift) almost no time to start and stop moving so you will neglect these. When the lift is called to multiple floors, it moves to them in the same order in which it was called. The lift is not very special &ndash; once you enter it, you may order it to go to an arbitrary floor. In such case, any previous calls must be processed first.</p>

### 입력

<p>The first input line contains a single integer T (1 &le; T &le; 10<sup>4</sup>), the number of test cases. Next T lines contain one test case each. Each test case is composed of four integers: Y<sub>p</sub>, L<sub>p</sub>, Y<sub>s</sub>, L<sub>s</sub> where 0 &le; Y<sub>p</sub>, L<sub>p</sub> &le; 10<sup>9</sup> are the initial floors of you and the lift, and 0 &lt; Y<sub>s</sub>, L<sub>s</sub> &le; 10<sup>6</sup> are the times it takes you and of the lift to move by one floor, respectively.</p>

### 출력

<p>For each test case, print a single integer &ndash; the minimum time it takes you to move from your initial floor to the 0-th floor.</p>

### 힌트

<p>Sample Input 1 contains two test cases. In the first one, you will rather walk to 0-th floor than to wait for the lift which is 18 floors away. In the second test case, an example of the fastest way is when you call the lift and walk 1 floor upstairs in the meantime, then you call the lift to 9-th underground floor and wait for the lift which you then take to the 0-th floor.</p>