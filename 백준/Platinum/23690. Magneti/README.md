# [Platinum I] Magneti - 23690

[문제 링크](https://www.acmicpc.net/problem/23690)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23690.%E2%80%85Magneti/8ad6b296.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23690.%E2%80%85Magneti/8ad6b296.png" data-original-src="https://upload.acmicpc.net/a5c4fc4a-a45f-4b07-9af0-4bb04cac19f6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 88px; height: 98px; float: right;" />Little Marko is bored of playing with shady cryptocurrencies such as Shiba Inu or XRC, which is why he decided to play with magnets. He has n different magnets and a board which has l available empty slots in a row, in which the magnets can be placed. Each pair of adjacent slots is exactly one centimeter apart. Each of the n magnets has a radius of activity that is equal to r<sub>i</sub>. This means that it will attract all magnets that are located strictly less than r<sub>i</sub> centimeters away (regardless of the radius of activity of the other magnet). It is possible that some magnets have the same radius of activity, but they are considered as different magnets.</p>

<p>Marko doesn&rsquo;t like it when the magnets attract each other, so he is interested in the number of ways to place the magnets on the board so that no magnet attracts any other. All of the magnets should be placed on the board, and each empty slot may contain at most one magnet. Two ways of placing the magnets are considered different if there is magnet which is at a different position in the first way than in the second way. As the required number can be quite large, you should output it modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>The first line contains positive integers n and l, the number of magnets and the number of empty slots.</p>

<p>The second line contains n positive integers r<sub>i</sub> (1 &le; r<sub>i</sub> &le; l), the radii of activity of the n magnets.</p>

### 출력

<p>Print the required number of ways to place the magnets on the board so that no magnet attracts any other, modulo 10<sup>9</sup> + 7.</p>

### 제한

<p>In every subtask, it holds that 1 &le; n &le; 50 and n &le; l &le; 10 000.</p>

### 힌트

<p>Clarification of the second example: All permutations of the magnets are valid because no two magnets can attract each other.</p>

<p>Clarification of the third example: If we denote the magnets with <code>1</code>, <code>2</code> and <code>3</code>, and an empty slot with <code>_</code>, the possible arrangements of magnets are <code>13_2</code>, <code>31_2</code>, <code>2_13</code> and <code>2_31</code>.</p>