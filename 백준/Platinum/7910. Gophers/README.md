# [Platinum II] Gophers - 7910

[문제 링크](https://www.acmicpc.net/problem/7910)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 98, 정답: 38, 맞힌 사람: 31, 정답 비율: 43.056%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 집합과 맵

### 문제 설명

<p>Dick Dastardly wants to bedevil poor Bytean gophers. These nice little creatures live in holes in the upper parts of High Bytemountains. Dick has found a mountain ridge with n gopher holes located along a straight line (for simplicity, we index the holes from 1 to n, from west to east). Dick plans to torture gophers using rock &amp; roll music. He has bought m CD players, put a different Bytels&rsquo; album in each of them and arranged the CD players along the ridge. The music from a CD player disturbs gophers located in holes distant by at most l meters from it.</p>

<p>Feeling troubled, the gophers asked you to check in which holes they will not be able to sleep well during this winter. But now Dick Dastardly wants to make even more mess. . .</p>

<p>He will move the CD players from time to time. The gophers were able to steal Dick&rsquo;s secret plan and now they know precisely that on the morning of the i-th day Dick will take the CD player located p<sub>i</sub> meters from the hole number 1 and will put it at a point located r<sub>i</sub> meters from that hole. Help the gophers and count the number of holes in which they will not be able to fall asleep after each such operation.</p>

### 입력

<p>The first line of input contains four integers n, m, d and l (2 &le; n, m &le; 500 000, 1 &le; d &le; 500 000, 1 &le; l &le; 10<sup>9</sup>) representing the number of gophers&rsquo; holes, the number of Dick&rsquo;s CD players, the number of days and the range of a CD player, respectively.</p>

<p>The second line of input contains n &minus; 1 integers x<sub>2</sub>, x<sub>3</sub>, ..., x<sub>n</sub> (0 &lt; x<sub>2</sub> &lt; x<sub>3</sub> &lt; ... &lt; x<sub>n</sub> &le; 10<sup>9</sup>) denoting the distances of the holes 2, 3, ..., n from the hole number 1.</p>

<p>The third line contains m integers z<sub>1</sub>, z<sub>2</sub>, ..., z<sub>m</sub> (0 &le; z<sub>1</sub> &lt; z<sub>2</sub> &lt; ... &lt; z<sub>m</sub> &le; 10<sup>9</sup>) denoting the distances of the consecutive CD players from the hole number 1. All the CD players are located to the east of this hole.</p>

<p>Next, d lines follow. The i-th of these lines contains two integers p<sub>i</sub> and r<sub>i</sub> (0 &le; p<sub>i</sub>, r<sub>i</sub> &le; 10<sup>9</sup>, p<sub>i</sub> &ne; r<sub>i</sub>) meaning that in the beginning of the i-th day Dick is going to move the CD player located pi meters from the hole number 1 to the point located ri meters to the east from that hole. You may assume that before every such operation there is a CD player at the position p<sub>i</sub> and there are no CD players at the position r<sub>i</sub>.</p>

### 출력

<p>Your program should output d + 1 lines. The line number i (for i = 1, 2, ..., d) should contain one integer representing the number of holes in which no gopher would be able to sleep well during the night before the i-th Dick&rsquo;s operation. The last line should contain this number after the last Dick&rsquo;s operation.</p>